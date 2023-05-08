using System;
using System.Collections.Generic;

delegate bool Filter(User user, string value);

class Program
{
    static void Main(string[] args)
    {
        List<User> users = new List<User>();

        while (true)
        {
            Console.WriteLine("Program Manajemen User");
            Console.WriteLine("=======================");
            Console.WriteLine("1. Registrasi");
            Console.WriteLine("2. Login");
            Console.WriteLine("3. Cari");
            Console.WriteLine("4. Exit");
            Console.Write("Pilih Menu (1-4): ");

            int pilihan = int.Parse(Console.ReadLine());

            switch (pilihan)
            {
                case 1:
                    RegisterUser(users);
                    Console.WriteLine();
                    break;

                case 2:
                    LoginUser(users);
                    Console.WriteLine();
                    break;

                case 3:
                    SearchUser(users);
                    Console.WriteLine();
                    break;

                case 4:
                    Console.WriteLine("Terima kasih telah menggunakan program ini!");
                    return;

                default:
                    Console.WriteLine("Pilihan tidak valid!");
                    Console.WriteLine();
                    break;
            }
        }
    }

    static void RegisterUser(List<User> users)
    {
        Console.Write("Nama: ");
        string name = Console.ReadLine();
        Console.Write("Username: ");
        string username = Console.ReadLine();
        Console.Write("Password: ");
        string password = Console.ReadLine();

        users.Add(new User(name, username, password));
        Console.WriteLine("User berhasil diregistrasi!");
    }

    static void LoginUser(List<User> users)
    {
        Console.Write("Username: ");
        string loginUsername = Console.ReadLine();
        Console.Write("Password: ");
        string loginPassword = Console.ReadLine();

        User loginUser = users.Find(user => user.Username == loginUsername && user.Password == loginPassword);
        if (loginUser != null)
        {
            Console.WriteLine($"Selamat datang, {loginUser.Name}!");
        }
        else
        {
            Console.WriteLine("Username atau password salah!");
        }
    }

    static void SearchUser(List<User> users)
    {
        Console.Write("Nama: ");
        string searchName = Console.ReadLine();

        Filter filter = (user, value) => user.Name == value;

        List<User> searchUsers = users.FindAll(user => filter(user, searchName));
        if (searchUsers.Count > 0)
        {
            Console.WriteLine($"{searchUsers.Count} user ditemukan:");
            foreach (User user in searchUsers)
            {
                Console.WriteLine($"- {user.Name} ({user.Username})");
            }
        }
        else
        {
            Console.WriteLine("User tidak ditemukan!");
        }
    }
}

class User
{
    public string Name { get; set; }
    public string Username { get; set; }
    public string Password { get; set; }

    public User(string name, string username, string password)
    {
        Name = name;
        Username = username;
        Password = password;
    }
}