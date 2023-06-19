using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CaffeePoltekSSN
{
    internal class AddOn
    {
        private int _id;
        private string _name;
        private int _price;

        public AddOn(int id, string name, int price)
        {
            this.Id = id;
            this.Name = name;
            this.Price = price;
        }

        public int Id { get { return _id; } set { _id = value; } }

        public string Name { get { return _name; } set { _name = value; } }

        public int Price { get { return _price; } set { _price = value; } }
    }
}
