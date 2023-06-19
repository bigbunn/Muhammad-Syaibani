using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CaffeePoltekSSN
{
    internal class Product
    {
        private int _id;
        private string _name;
        private int _price;
        private List<ProductSize> _size;
        private List<string> _sugarLevel;
        private List<string> _iceLevel;
        private List<AddOn> _addOns;

        public Product(int id, string name, int price, List<ProductSize> size, List<string> sugarLevel, List<string> iceLevel, List<AddOn> addOns) 
        { 
            this.Id = id;
            this.Name = name;
            this.Price = price;
            this.Size = size;
            this.SugarLevel = sugarLevel;
            this.IceLevel = iceLevel;
            this.AddOns = addOns;
        }


        public int Id { get { return _id; } set { _id = value; } }

        public string Name { get { return _name; } set { _name = value; } }

        public int Price { get { return _price; } set { _price = value; } }

        public List<ProductSize> Size { get { return _size; } set { _size = value;} }

        public List<string> SugarLevel { get { return _sugarLevel; }
            set
            {
                _sugarLevel = value;
            } }

        public List<string> IceLevel { get { return _iceLevel; }
            set
            {
                _iceLevel = value;
            } }

        public List<AddOn> AddOns { get { return _addOns; }
            set
            {
                _addOns = value;
            } }
    }
}
