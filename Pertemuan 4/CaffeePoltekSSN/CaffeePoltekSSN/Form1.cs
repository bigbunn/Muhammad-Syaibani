namespace CaffeePoltekSSN
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            int harga = 0;
            if (comboBox1.Text == "Espresso - Rp10.000")
            {
                harga += 10000;
            }
            else if (comboBox1.Text == "Latte - Rp15.000")
            {
                harga += 15000;
            }
            else if (comboBox1.Text == "Cappucino - Rp12.000")
            {
                harga += 12000;
            }
            else
            {
                harga = 0;
            }


            if (comboBox2.Text == "Large - Rp3.000")
            {
                harga += 3000;
            }
            String addon = "";
            foreach (var item in checkedListBox1.CheckedItems)
            {
                if (item == "Bubble - Rp3.000")
                {
                    harga += 3000;
                    addon += "Bubble";
                }
                else if (item == "Grass Jelly - Rp3.500")
                {
                    harga += 3500;
                    addon += " Grass Jelly";
                }
                else if (item == "Nata de coco - Rp2.500")
                {
                    harga += 2500;
                    addon += " Nata de coco";
                }
                else if (item == "WhippedCream - Rp.1000")
                {
                    harga += 1000;
                    addon += " WhippedCream";
                }
                else if (item == "ChocoChip - Rp1.500")
                {
                    harga += 1500;
                    addon += " ChocoChip";
                }
                else if (item == "Oreo - Rp.2.000")
                {
                    harga += 2000;
                    addon += " Oreo";
                }
            }

            label7.Text = "Pesanan Anda Telah Selesai";
            label8.Text = "Menu : " + comboBox1.Text;
            label9.Text = "Size : " + comboBox2.Text;
            label10.Text = "Sugar Level : " + comboBox3.Text;
            label11.Text = "Ice Level : " + comboBox4.Text;
            label12.Text = "Add-Ons : " + addon;
            label13.Text = "Rp." + harga;
        }

        private void label10_Click(object sender, EventArgs e)
        {

        }
    }
}