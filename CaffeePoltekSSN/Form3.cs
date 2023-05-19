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
    public partial class Form3 : Form
    {
        private string username;
        public Form3(string username)
        {
            InitializeComponent();
            this.username = username;
            if (username == "Admin")
            {
                adminToolStripMenuItem.Visible = true;
            }
            else if (username == "Kasir")
            {
                adminToolStripMenuItem.Visible = false;
            }
            else
            {
                logout();
            }
        }

        public Form3()
        {
            InitializeComponent();
        }

        private void adminToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form4 form4 = new Form4(username);
            form4.FormClosed += Form_Closed;
            form4.Show();
            this.Hide();
        }


        private void Form_Closed(object sender, FormClosedEventArgs e)
        {
            this.Close();
        }

        private void kasirToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form1 form1 = new Form1(username);
            form1.FormClosed += Form_Closed;
            form1.Show();
            this.Hide();
        }

        private void logout()
        {
            Form2 form2 = new Form2();
            form2.FormClosed += Form_Closed;    
            form2.Show();
            this.Hide();
        }

        private void logoutToolStripMenuItem_Click(object sender, EventArgs e)
        {
            logout();
        }
    }
}
