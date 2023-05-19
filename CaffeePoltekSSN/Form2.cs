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
            string username = textBox1.Text;
            string password = textBox2.Text;

            if (username != null || password != null)
            {
                if (username == "Admin" && password == "Admin123")
                {
                    login(username);
                }
                else if (username == "Kasir" && password == "Kasir123")
                {
                    login(username);
                }
                else
                {
                    MessageBox.Show("Username atau Password salah");
                    clearAll();
                }
            }
            else
            {
                MessageBox.Show("Username/Password kosong");
                clearAll();
            }
        }

        private void login(string username)
        {
            Form3 form3 = new Form3(username);
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
    }
}
