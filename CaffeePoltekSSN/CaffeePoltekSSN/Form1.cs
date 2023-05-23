using iTextSharp.text;
using iTextSharp.text.pdf;
using System.Drawing.Printing;
using System.Windows.Forms;
using DrawingFont = System.Drawing.Font;

namespace CaffeePoltekSSN
{
    public partial class Form1 : Form
    {
        private string rule, txtJudul, txtMenu, txtSize, txtHarga, txtSugLev, txtIceLev, txtAddons;

        public Form1(string rule)
        {
            InitializeComponent();
            this.rule = rule;
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

            label7.Text = this.txtJudul = "Pesanan Anda Telah Selesai";
            label8.Text = this.txtMenu = "Menu : " + comboBox1.Text;
            label9.Text = this.txtSize = "Size : " + comboBox2.Text;
            label10.Text = this.txtSugLev = "Sugar Level : " + comboBox3.Text;
            label11.Text = this.txtIceLev = "Ice Level : " + comboBox4.Text;
            label12.Text = this.txtAddons = "Add-Ons : " + addon;
            label13.Text = this.txtHarga = "Rp." + harga;
            if (button2.Visible == false)
            {
                button2.Visible = true;
                button3.Visible = true;
                button4.Visible = true;
                button5.Visible = true;
            }
        }

        private void label10_Click(object sender, EventArgs e)
        {

        }

        private void toolStripButton1_Click(object sender, EventArgs e)
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

        private void button2_Click(object sender, EventArgs e)
        {
            printDialog1.Document = printDocument1;
            printDocument1.PrintController = new StandardPrintController();
            printDialog1.PrintToFile.ToString();
            if(printDialog1.ShowDialog()==DialogResult.OK)
            {
                printDocument1.Print();
            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            printPreviewDialog1.ShowDialog();
        }

        private void printDocument1_PrintPage(object sender, System.Drawing.Printing.PrintPageEventArgs e)
        {
            DrawingFont fontJudul = new DrawingFont("Arial", 18, FontStyle.Bold);
            DrawingFont fontText = new DrawingFont("Arial", 18, FontStyle.Regular);
            e.Graphics.DrawString(txtJudul, fontJudul, Brushes.Black, new PointF(240, 10));
            e.Graphics.DrawString(txtMenu, fontText , Brushes.Black, new PointF(10, 40));
            e.Graphics.DrawString(txtSize, fontText, Brushes.Black, new PointF(10, 70));
            e.Graphics.DrawString(txtSugLev, fontText, Brushes.Black, new PointF(10, 100));
            e.Graphics.DrawString(txtIceLev, fontText, Brushes.Black, new PointF(10, 130));
            e.Graphics.DrawString(txtAddons, fontText, Brushes.Black, new PointF(10, 160));
            e.Graphics.DrawString(txtHarga, fontJudul, Brushes.Black, new PointF(320, 200));
        }

        private void button4_Click(object sender, EventArgs e)
        {
            if (printPreviewControl1.Visible == false)
            {
                printPreviewControl1.Visible = true;
            }
            printPreviewControl1.Document = printDocument1;
        }

        private void button5_Click(object sender, EventArgs e)
        {
            saveFileDialog1.InitialDirectory = @"D:\";
            saveFileDialog1.Title = "Save File";

            saveFileDialog1.DefaultExt = "pdf";
            saveFileDialog1.FileName = "Bills.pdf";
            saveFileDialog1.Filter = "PDF files (*.pdf)|*.pdf|All files (*.*)|*.*";

            if (saveFileDialog1.ShowDialog() == DialogResult.OK)
            {
                string filePath = saveFileDialog1.FileName;

                printPreviewControl1.Visible = true;
                printPreviewControl1.Document = printDocument1;
                using (Document document = new Document())
                {
                    PdfWriter writer = PdfWriter.GetInstance(document, new FileStream(filePath, FileMode.Create));
                    document.Open();
                    string content = "               " + txtJudul + "\r\n" + txtMenu + "\r\n" + txtSize + "\r\n" + txtSugLev + "\r\n" + txtIceLev + "\r\n" + txtAddons + "\r\n             " + txtHarga;
                    Paragraph paragraph = new Paragraph(content);
                    document.Add(paragraph);
                    document.Close();
                }
                label2.Text += "File tersimpan di : " + filePath;
                
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}