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
    public partial class Form4 : Form
    {
        private string username;
        public Form4(string username)
        {
            InitializeComponent();
            this.username = username;   
        }

        private void label4_Click(object sender, EventArgs e)
        {

        }

        private void toolStripButton1_Click(object sender, EventArgs e)
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
    }
}
