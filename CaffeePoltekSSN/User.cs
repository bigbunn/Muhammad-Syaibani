using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CaffeePoltekSSN
{
    internal class User
    {



        public User(string username, string password, string rule)
        {
            this.Username = username;
            this.Password = password;
            this.Rule = rule;

        }

        private string _username = String.Empty;
        private string _password = String.Empty;
        private string _rule = String.Empty;

        public string Username
        {
            get { return _username; }
            set { _username = value; }
        }

        public string Password
        {
            get { return _password; }
            set { _password = value; }
        }

        public string Rule
        {
            get { return _rule; }
            set { _rule = value; }
        }
    }
}
