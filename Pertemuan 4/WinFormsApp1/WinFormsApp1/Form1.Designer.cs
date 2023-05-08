namespace WinFormsApp1
{
    partial class Form1
    {
        /// <summary>
        ///  Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        ///  Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        ///  Required method for Designer support - do not modify
        ///  the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            components = new System.ComponentModel.Container();
            ListViewItem listViewItem10 = new ListViewItem("Satu");
            ListViewItem listViewItem11 = new ListViewItem("Dua");
            ListViewItem listViewItem12 = new ListViewItem("Tiga");
            button2 = new Button();
            checkBox1 = new CheckBox();
            checkedListBox1 = new CheckedListBox();
            comboBox1 = new ComboBox();
            dateTimePicker1 = new DateTimePicker();
            label1 = new Label();
            linkLabel1 = new LinkLabel();
            listBox1 = new ListBox();
            listView1 = new ListView();
            columnHeader1 = new ColumnHeader();
            maskedTextBox1 = new MaskedTextBox();
            monthCalendar1 = new MonthCalendar();
            progressBar1 = new ProgressBar();
            toolTip1 = new ToolTip(components);
            SuspendLayout();
            // 
            // button2
            // 
            button2.Font = new Font("Century", 9F, FontStyle.Bold, GraphicsUnit.Point);
            button2.Location = new Point(540, 372);
            button2.Name = "button2";
            button2.Size = new Size(95, 26);
            button2.TabIndex = 1;
            button2.Text = "Click Here";
            button2.UseVisualStyleBackColor = true;
            button2.Click += button2_Click;
            // 
            // checkBox1
            // 
            checkBox1.AutoSize = true;
            checkBox1.Location = new Point(492, 347);
            checkBox1.Name = "checkBox1";
            checkBox1.Size = new Size(197, 19);
            checkBox1.TabIndex = 2;
            checkBox1.Text = "Saya sudah membaca ketentuan";
            checkBox1.UseVisualStyleBackColor = true;
            // 
            // checkedListBox1
            // 
            checkedListBox1.FormattingEnabled = true;
            checkedListBox1.Items.AddRange(new object[] { "<10", "10<umur<20", ">20" });
            checkedListBox1.Location = new Point(525, 247);
            checkedListBox1.Name = "checkedListBox1";
            checkedListBox1.Size = new Size(120, 94);
            checkedListBox1.TabIndex = 3;
            checkedListBox1.SelectedIndexChanged += checkedListBox1_SelectedIndexChanged;
            // 
            // comboBox1
            // 
            comboBox1.FormattingEnabled = true;
            comboBox1.Items.AddRange(new object[] { "Laki-laki", "Perempuan" });
            comboBox1.Location = new Point(524, 204);
            comboBox1.Name = "comboBox1";
            comboBox1.Size = new Size(121, 23);
            comboBox1.TabIndex = 4;
            // 
            // dateTimePicker1
            // 
            dateTimePicker1.Location = new Point(489, 175);
            dateTimePicker1.Name = "dateTimePicker1";
            dateTimePicker1.Size = new Size(200, 23);
            dateTimePicker1.TabIndex = 5;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.Location = new Point(524, 145);
            label1.Name = "label1";
            label1.Size = new Size(133, 15);
            label1.TabIndex = 6;
            label1.Text = "Pilih Ulang Tahun Kamu";
            label1.TextAlign = ContentAlignment.MiddleCenter;
            label1.Click += label1_Click;
            // 
            // linkLabel1
            // 
            linkLabel1.AutoSize = true;
            linkLabel1.Location = new Point(541, 401);
            linkLabel1.Name = "linkLabel1";
            linkLabel1.Size = new Size(94, 15);
            linkLabel1.TabIndex = 7;
            linkLabel1.TabStop = true;
            linkLabel1.Text = "Check in Google";
            linkLabel1.LinkClicked += linkLabel1_LinkClicked;
            // 
            // listBox1
            // 
            listBox1.FormattingEnabled = true;
            listBox1.ItemHeight = 15;
            listBox1.Items.AddRange(new object[] { "1", "2", "3", "4", "5" });
            listBox1.Location = new Point(382, 247);
            listBox1.Name = "listBox1";
            listBox1.Size = new Size(120, 94);
            listBox1.TabIndex = 8;
            listBox1.SelectedIndexChanged += listBox1_SelectedIndexChanged;
            // 
            // listView1
            // 
            listView1.Columns.AddRange(new ColumnHeader[] { columnHeader1 });
            listViewItem10.Tag = "Satu";
            listView1.Items.AddRange(new ListViewItem[] { listViewItem10, listViewItem11, listViewItem12 });
            listView1.Location = new Point(692, 244);
            listView1.Name = "listView1";
            listView1.Size = new Size(326, 122);
            listView1.TabIndex = 9;
            listView1.UseCompatibleStateImageBehavior = false;
            listView1.View = View.Details;
            // 
            // columnHeader1
            // 
            columnHeader1.Tag = "Angka";
            columnHeader1.Text = "Angka";
            // 
            // maskedTextBox1
            // 
            maskedTextBox1.Location = new Point(535, 119);
            maskedTextBox1.Mask = "(999) 000-0000";
            maskedTextBox1.Name = "maskedTextBox1";
            maskedTextBox1.Size = new Size(100, 23);
            maskedTextBox1.TabIndex = 10;
            // 
            // monthCalendar1
            // 
            monthCalendar1.Location = new Point(18, 36);
            monthCalendar1.Name = "monthCalendar1";
            monthCalendar1.TabIndex = 11;
            // 
            // progressBar1
            // 
            progressBar1.Location = new Point(535, 430);
            progressBar1.Name = "progressBar1";
            progressBar1.Size = new Size(100, 23);
            progressBar1.TabIndex = 12;
            progressBar1.Click += progressBar1_Click;
            // 
            // toolTip1
            // 
            toolTip1.Popup += toolTip1_Popup;
            // 
            // Form1
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            ClientSize = new Size(1192, 639);
            Controls.Add(progressBar1);
            Controls.Add(monthCalendar1);
            Controls.Add(maskedTextBox1);
            Controls.Add(listView1);
            Controls.Add(listBox1);
            Controls.Add(linkLabel1);
            Controls.Add(label1);
            Controls.Add(dateTimePicker1);
            Controls.Add(comboBox1);
            Controls.Add(checkedListBox1);
            Controls.Add(checkBox1);
            Controls.Add(button2);
            Name = "Form1";
            Text = "Form1";
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Button button2;
        private CheckBox checkBox1;
        private CheckedListBox checkedListBox1;
        private ComboBox comboBox1;
        private DateTimePicker dateTimePicker1;
        private Label label1;
        private LinkLabel linkLabel1;
        private ListBox listBox1;
        private ListView listView1;
        private ColumnHeader columnHeader1;
        private MaskedTextBox maskedTextBox1;
        private MonthCalendar monthCalendar1;
        private ProgressBar progressBar1;
        private ToolTip toolTip1;
    }
}