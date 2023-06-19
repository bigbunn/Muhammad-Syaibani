using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CaffeePoltekSSN
{
    internal class Order
    {
        private Guid _id;
        private string _item  = string.Empty;
        private int _jumlah;
        private string _email  = string.Empty;
        private string _size = string.Empty;
        private string _iceLevel = string.Empty;
        private string _sugarLevel = string.Empty;
        private string _addons = string.Empty;
        private string _harga = string.Empty;
        private DateTime _waktu;

        public Order(Guid Id, string item, int jumlah, string email, string size, string iceLevel, string sugarLevel, string addons, string harga, DateTime waktu) { 
            this.Id = Id;
            this.Item = item;
            this.Jumlah = jumlah;
            this.Email = email;
            this.Waktu = waktu;
            this.Size = size;
            this.IceLevel = iceLevel;
            this.SugarLevel = sugarLevel;
            this.Addons = addons;
            this.Harga = harga;
        }

        public Guid Id
        {
            get { return _id; }
            set { _id = value; }
        }

        public string Item
        {
            get { return _item; }
            set { _item = value; }
        }

        public int Jumlah
        {
            get { return _jumlah; }
            set { _jumlah = value; }
        }

        public string Email
        {
            get { return _email; }
            set { _email = value; }
        }

        public string Size
        {
            get { return _size; }
            set { _size = value; }
        }

        public string SugarLevel
        {
            get { return _sugarLevel; }
            set { _sugarLevel = value; }
        }

        public string IceLevel
        {
            get { return _iceLevel; }
            set { _iceLevel = value; }
        }

        public string Addons
        {
            get { return _addons; }
            set { _addons = value; }
        }

        public string Harga
        {
            get { return _harga; }
            set { _harga = value; }
        }

        public DateTime Waktu
        {
            get { return _waktu; }
            set { _waktu = value; }
        }
    }
}
