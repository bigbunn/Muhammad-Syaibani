using CsvHelper;
using CsvHelper.Configuration;
using iTextSharp.text;
using iTextSharp.text.pdf;
//using iTextSharp.text.pdf.qrcode;
using System.Drawing.Printing;
using System.Globalization;
//using System.Windows.Forms;
using DrawingFont = System.Drawing.Font;
using QRCoder;
using SendGrid;
using SendGrid.Helpers.Mail;


namespace CaffeePoltekSSN
{
    public partial class Form1 : Form
    {
        private string csvPath = "D:/Orders.csv";

        private Product productTemp;
        private string? rule, txtJudul, txtMenu, txtSize, txtHarga, txtSugLev, txtIceLev, txtAddons, txtJumlah, txtEmail;
        private int hargaProduct, hargaSize, hargaAddon, jumlahTemp;
        
        private Bitmap qrCodeImage;
        private List<Product> productList;
        private iTextSharp.text.Image image;
        public Form1(string rule)
        {
            InitializeComponent();
            this.rule = rule;
            //comboBox1.SelectedIndex = -1;
            productList = new List<Product>();
            initializeProduct();
            initializeMenu();

        }

        private void initializeMenu()
        {
            comboBox1.DataSource = productList.ToArray();
            comboBox1.DisplayMember = "Name";
            comboBox1.SelectedIndex = -1;
            hargaProduct = 0; hargaSize = 0; hargaAddon = 0;
            showHargaTemp();
        }

        private void initializeProduct()
        {
            ProductSize size1 = new ProductSize(1, "Small", 5000);
            ProductSize size2 = new ProductSize(2, "Medium", 7000);
            ProductSize size3 = new ProductSize(3, "Large", 10000);

            // Membuat beberapa objek AddOn
            AddOn addon1 = new AddOn(1, "Whipped Cream", 2000);
            AddOn addon2 = new AddOn(2, "Caramel Drizzle", 1000);

            // Membuat objek Product dan menambahkannya ke productList
            Product product1 = new Product(1, "Coffee", 13000, new List<ProductSize> { size1, size2, size3 }, new List<string> { "Low Sugar", "Medium Sugar", "High Sugar" }, new List<string> { "No Ice", "Less Ice", "Normal Ice" }, new List<AddOn> { addon1, addon2 });
            Product product2 = new Product(2, "Tea", 12000, new List<ProductSize> { size1, size2 }, new List<string> { "Low Sugar", "Medium Sugar" }, new List<string> { "No Ice", "Less Ice", "Normal Ice" }, new List<AddOn> { addon1 });
            Product product3 = new Product(3, "Smoothie", 14000, new List<ProductSize> { size1, size3 }, new List<string> { "No Sugar", "Low Sugar", "Medium Sugar" }, new List<string> { "No Ice", "Normal Ice" }, new List<AddOn> { addon2 });

            productList.Add(product1);
            productList.Add(product2);
            productList.Add(product3);
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }


        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {

            int index = comboBox1.SelectedIndex;
            Product selectedProduct = productList[index];
            int harga = selectedProduct.Price;

            string? menu = selectedProduct.Name;


            int indexSize = comboBox2.SelectedIndex;
            ProductSize selectedSize = selectedProduct.Size[indexSize];
            string? size = selectedSize.Name;
            harga += selectedSize.Price;

            string? sugarLevel = comboBox3.SelectedItem.ToString();
            string? iceLevel = comboBox4.SelectedItem.ToString();

            var AddOns = checkedListBox1.CheckedItems;
            string addonStr = "";
            int i = 0;
            foreach (var addon in AddOns)
            {
                int indexAddon = checkedListBox1.Items.IndexOf(addon);
                AddOn selectedAddon = selectedProduct.AddOns[indexAddon];
                harga += selectedAddon.Price;
                if (i > 0)
                {
                    addonStr += ", ";
                }
                addonStr += selectedAddon.Name;
                i++;
            }

            int jumlah = Convert.ToInt16(numericUpDown1.Value);
            harga *= jumlah;
            string email = textBox1.Text;

            label7.Text = this.txtJudul = "Pesanan Anda Telah Selesai";
            label8.Text = this.txtMenu = "Menu : " + menu;
            label9.Text = this.txtSize = "Size : " + size;
            label10.Text = this.txtSugLev = "Sugar Level : " + sugarLevel;
            label11.Text = this.txtIceLev = "Ice Level : " + iceLevel;
            label12.Text = this.txtAddons = "Add-Ons : " + addonStr;
            labelJumlah.Text = this.txtJumlah = "Jumlah : " + jumlah;
            label13.Text = this.txtHarga = "Rp." + harga;
            label15.Text = this.txtEmail = "Email : " + textBox1.Text;
            if (button2.Visible == false)
            {
                button2.Visible = true;
                button3.Visible = true;
                button4.Visible = true;
                button5.Visible = true;
            }
            Create_Order(email, menu, size, sugarLevel, iceLevel, addonStr, jumlah, "Rp " + harga.ToString());
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
            if (printDialog1.ShowDialog() == DialogResult.OK)
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
            Bitmap resizedQrCodeImage = new Bitmap(200, 200);

            using (Graphics graphics = Graphics.FromImage(resizedQrCodeImage))
            {
                graphics.DrawImage(qrCodeImage, 0, 0, 200, 150);
            }
            DrawingFont fontJudul = new DrawingFont("Arial", 18, FontStyle.Bold);
            DrawingFont fontText = new DrawingFont("Arial", 18, FontStyle.Regular);
            e.Graphics.DrawString(txtJudul, fontJudul, Brushes.Black, new PointF(240, 10));
            e.Graphics.DrawString(txtMenu, fontText, Brushes.Black, new PointF(10, 40));
            e.Graphics.DrawString(txtSize, fontText, Brushes.Black, new PointF(10, 70));
            e.Graphics.DrawString(txtSugLev, fontText, Brushes.Black, new PointF(10, 100));
            e.Graphics.DrawString(txtIceLev, fontText, Brushes.Black, new PointF(10, 130));
            e.Graphics.DrawString(txtAddons, fontText, Brushes.Black, new PointF(10, 160));
            e.Graphics.DrawString(txtJumlah, fontText, Brushes.Black, new PointF(10, 190));
            e.Graphics.DrawString(txtEmail, fontText, Brushes.Black, new PointF(10, 220));
            e.Graphics.DrawString(txtHarga, fontJudul, Brushes.Black, new PointF(320, 260));
            e.Graphics.DrawImage(resizedQrCodeImage, new PointF(340, 900));
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
                    string content = "               " + txtJudul + "\r\n" + txtMenu + "\r\n" + txtSize + "\r\n" + txtSugLev + "\r\n" + txtIceLev + "\r\n" + txtAddons + "\r\n" + txtJumlah + "\r\n" + txtEmail + "\r\n             " + txtHarga;
                    Paragraph paragraph = new Paragraph(content);
                    document.Add(paragraph);

                    
                    document.Add(image);

                    document.Close();
                }
                label2.Text += "File tersimpan di : " + filePath;

            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void Create_Order(string email, string item, string size, string iceLevel, string sugarLevel, string addons, int jumlah, string harga)
        {
            DateTime waktu1 = DateTime.Now;
            var guid = Guid.NewGuid();
            var config = new CsvConfiguration(CultureInfo.InvariantCulture)
            {
                HasHeaderRecord = false,

            };

            var orders = new List<Order>
            {
                new Order(guid, item, jumlah, email, size, iceLevel, sugarLevel, addons, harga, waktu1)
            };

            using var writer = new StreamWriter(csvPath, append: true);
            using var csv = new CsvWriter(writer, config);
            csv.WriteRecords(orders);

            QRCodeGenerator qrGenerator = new();
            QRCodeData qrCodeData = qrGenerator.CreateQrCode(guid.ToString(), QRCodeGenerator.ECCLevel.Q);
            QRCoder.QRCode qrCode = new(qrCodeData);
            qrCodeImage = qrCode.GetGraphic(20);
            pictureBox1.Image = qrCodeImage;

            image = iTextSharp.text.Image.GetInstance(qrCodeImage, System.Drawing.Imaging.ImageFormat.Jpeg);
            image.ScaleToFit(200f, 200f);
            _ = SendEmail(email, qrCodeImage);


        }

        private async Task SendEmail(string email, Bitmap qrCodeImage)
        {
            try
            {

                var apiKey = "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";
                var client = new SendGridClient(apiKey);
                var from = new EmailAddress("syaibani4@gmail.com", "Syaibani");
                var to = new EmailAddress(email, "Recipient Name");
                var subject = "Order Recipe";
                var plainTextContent = "This is your recipe for order in Caffee PoltekSSN";
                var htmlContent = "<strong>Recipe</strong>";

                var message = MailHelper.CreateSingleEmail(from, to, subject, plainTextContent, htmlContent);

                ImageConverter converter = new ImageConverter();

                byte[] fileBytes = converter.ConvertBitmapToByteArray(qrCodeImage);
                var fileBase64 = Convert.ToBase64String(fileBytes);

                var attachment = new Attachment
                {
                    Content = fileBase64,
                    Filename = "QrCode",
                    Type = "image/png", // Set the appropriate MIME type for your image
                    Disposition = "attachment"
                };

                message.AddAttachment(attachment);

                var response = await client.SendEmailAsync(message);
                if (response.StatusCode == System.Net.HttpStatusCode.Accepted)
                {
                    MessageBox.Show("Email berhasil terkirim ke " + email);
                }
                else
                {
                    MessageBox.Show("Gagal Mengirim Email. Kode Status Respons: " + response.StatusCode);
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("Error mengirim email : " + ex.Message);
            }
        }

        public class ImageConverter
        {
            public byte[] ConvertBitmapToByteArray(Bitmap bitmap)
            {
                using (MemoryStream stream = new MemoryStream())
                {
                    bitmap.Save(stream, System.Drawing.Imaging.ImageFormat.Png);
                    return stream.ToArray();
                }
            }
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (comboBox1.SelectedIndex >= 0)
            {

                int selected = comboBox1.SelectedIndex;
                Product selectedProduct = productTemp = productList[selected];
                this.hargaProduct = selectedProduct.Price;
                numericUpDown1.Value = 1;


                // Mengisi ComboBox2 dengan ukuran produk terpilih
                List<ProductSize> productSize = selectedProduct.Size;
                comboBox2.DataSource = productSize;
                comboBox2.DisplayMember = "Name";
                comboBox2.SelectedIndex = -1;

                // Mengisi ComboBox3 dengan tingkat gula produk terpilih
                comboBox3.DataSource = selectedProduct.SugarLevel;
                comboBox3.DisplayMember = "SugarLevel";
                comboBox3.SelectedIndex = -1;

                comboBox4.DataSource = selectedProduct.IceLevel;
                comboBox4.DisplayMember = "IceLevel";
                comboBox4.SelectedIndex = -1;

                List<AddOn> productAddons = selectedProduct.AddOns;
                checkedListBox1.DataSource = productAddons;
                checkedListBox1.DisplayMember = "Name";

                hargaSize = 0;
                hargaAddon = 0;

                showHargaTemp();

            }
        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            int selected = comboBox2.SelectedIndex;
            if (selected >= 0)
            {
                ProductSize selectedSize = productTemp.Size[selected];
                hargaSize = selectedSize.Price;
                showHargaTemp();
            }

        }

        private void checkedListBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            var AddOns = checkedListBox1.CheckedItems;
            int hargaShow = 0;
            foreach (var addon in AddOns)
            {
                int indexAddon = checkedListBox1.Items.IndexOf(addon);
                AddOn selectedAddon = productTemp.AddOns[indexAddon];
                hargaShow += selectedAddon.Price;

            }
            hargaAddon = hargaShow;
            showHargaTemp();
        }

        private void showHargaTemp()
        {
            int harga = (hargaProduct + hargaSize + hargaAddon) * jumlahTemp;

            string hargaFormatted = harga.ToString("NO");
            labelHargaTemp.Text = "Rp. " + harga;
        }

        private void numericUpDown1_ValueChanged(object sender, EventArgs e)
        {
            int jumlah = Convert.ToInt16(numericUpDown1.Value);
            jumlahTemp = jumlah;
            showHargaTemp();

        }
    }
}