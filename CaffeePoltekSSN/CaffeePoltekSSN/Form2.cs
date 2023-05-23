using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CaffeePoltekSSN
{

    public partial class Form2 : Form
    {
        private List<User> _userlist = new();
        public Form2()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            submitForm();
        }

        private void submitForm()
        {
            string uname = textBox1.Text;
            string pass = textBox2.Text;

            var result = _userlist.FirstOrDefault(x => x.Username == uname);
            if (result != null)
            {
                if (result.Password == pass)
                {
                    login(result.Rule);
                }
                else
                {
                    MessageBox.Show("Password Salah");
                    clearAll();
                }
            }
            else
            {
                MessageBox.Show("User tidak ditemukan!");
                clearAll();
            }
        }

        private void login(string rule)
        {
            Form3 form3 = new Form3(rule);
            form3.FormClosed += Form_Closed;
            form3.Show();
            this.Hide();
        }

        private void Form_Closed(object sender, FormClosedEventArgs e)
        {
            this.Close();
        }

        private void clearAll()
        {
            textBox1.Clear();
            textBox2.Clear();
            textBox1.Focus();

        }

        private void Form2_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (e.KeyChar == (char)Keys.Enter)
            {
                submitForm();
            }
        }

        private void textBox1_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (e.KeyChar == (char)Keys.Enter)
            {
                submitForm();
            }
        }

        private void textBox2_KeyPress(object sender, KeyPressEventArgs e)
        {
            if (e.KeyChar == (char)Keys.Enter)
            {
                submitForm();
            }
        }

        private void Form2_Load(object sender, EventArgs e)
        {


        }

        private void Form2_Load_1(object sender, EventArgs e)
        {
            textBox1.Focus();
            _userlist.Add(new User("admin", "pass", "admin"));
            _userlist.Add(new User("kasir", "1234", "kasir"));
        }
    }
}
