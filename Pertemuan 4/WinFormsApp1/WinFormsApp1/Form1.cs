using System.Diagnostics;

namespace WinFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            //MessageBox.Show("Selamat Datang");
            // checkBox1.Checked = true;
            /*foreach (var item in checkedListBox1.CheckedItems)
            {
                MessageBox.Show("Umur Kamu " + item.ToString());
            }*/

            //MessageBox.Show("Kamu adalah " + comboBox1.Text);

            //MessageBox.Show("Kamu lahir pada " + dateTimePicker1.Text);
            //label1.Text = "Ulang tahun kamu sudah terpilih";

            MessageBox.Show(maskedTextBox1.Text);
        }

        private void checkedListBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void linkLabel1_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            Process.Start(new ProcessStartInfo
            {
                FileName = "http://google.com",
                UseShellExecute = true
            });
            /*try
            {
                VisitLink();
            }
            catch (Exception ex)
            {
                MessageBox.Show("Unable to open link that was clicked." + ex);
            }*/
        }

        /*private void VisitLink()
        {
            // Change the color of the link text by setting LinkVisited
            // to true.
            linkLabel1.LinkVisited = true;
            //Call the Process.Start method to open the default browser
            //with a URL:
            System.Diagnostics.Process.Start("https://www.google.com");
        }*/

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void toolTip1_Popup(object sender, PopupEventArgs e)
        {

        }

        private void progressBar1_Click(object sender, EventArgs e)
        {
            progressBar1.Value += 10;
            if(progressBar1.Value ==100) {
                MessageBox.Show("FINISH");
            }
        }
    }
}