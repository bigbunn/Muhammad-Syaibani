// collection
// array, fixed size
string[] kota = { "JKT", "BDG", "SBY" };
int[] nums = { 1, 2, 3, 4 };
int[] nums2 = { 1, 2, 6, 7 };
/*
Console.WriteLine(kota[0]);

//loop foreach untuk collection
foreach (int i in nums)
{
    Console.WriteLine(i);
}

kota[1] = "SMG";
Console.WriteLine(kota[1]);

//LINQ method
Console.WriteLine(nums.Average());
Console.WriteLine(nums.Sum());

var a = nums.Union(nums2);
var b = nums.Except(nums2);
var c = nums.Intersect(nums2);

foreach (int i in c)
{
    Console.WriteLine(i);
} */

//List
List<int> numbers1 = new() { 1, 2, 5, 7, 8, 10, 10 };

List<string> strList = new(3);
//Mengisi List dengan collection
strList.AddRange(kota);
//Mengisi item ke list
strList.Add("ABC");
strList.Insert(1, "XYZ");
//Menghapus item
strList.Remove("ABc");
strList.RemoveAt(1);
//Count = jml elemen dalam list
Console.WriteLine(strList.Count + "" + strList.Capacity);
foreach (string i in strList)
{
    Console.WriteLine($"{i}");
}

class Buku
{
    public string Judul { get; set; } = string.Empty;

    public string Penulis { get; set; } = string.Empty;

    public decimal Harga { get; set; }

    public int Stok { get; set; }
    //constructor buku
    public Buku(string judul, string penulis, decimal harga, int stok)
    {
        Judul = judul;
        Penulis = penulis;
        Harga = harga;
        Stok = stok;
    }
}

class MyProgram
{
    List<Buku> buku = new()
    {
        new Buku("Book 1 Title", "Bob", 1000m, 10),
        new Buku("Book 2 Title", "Bob", 2000m, 5),
        new Buku("Book 3 Title", "Bob", 1000m, 10),
    };

    foreach (var buku in ListBuku)
        {
            Console.WriteLine
}
}

class Buku
{
    public string Judul { get; set; } = string.Empty;

    public string Penulis { get; set; } = string.Empty;

    public decimal Harga { get; set; }

    public int Stok { get; set; }
    //constructor buku
    public Buku(string judul, string penulis, decimal harga, int stok)
    {
        Judul = judul;
        Penulis = penulis;
        Harga = harga;
        Stok = stok;
    }
}

class Program
{
    static void Main()
    {
        List<Buku> ListBuku = new()
        {
            new Buku("Book 1 Title", "Bob", 1000m, 10),
            new Buku("Cooking", "Bob", 2000m, 5),
            new Buku("A Book 3 Title", "Bob Buds", 1000m, 10),
        };

        ListBuku.Add(new Buku("Book 4 Title", "Buds", 1000m, 18));
        //Mengurutkan
        ListBuku.Sort((x, y) => x.Judul.CompareTo(y.Judul));

        foreach (var buku in ListBuku)
        {
            Console.WriteLine($"Judul: {buku.Judul}, Penulis: {buku.Penulis}");
        }
        /*List<Buku> MyBooks = ListBuku.Where(b => b.Penulis == "Buds").ToList();*/
        //Pencarian
        List<Buku> MyBooks = ListBuku.Where(b => b.Penulis == "Buds").ToList();
        List<Buku> BobBooks = ListBuku.Where(b => b.Penulis.Contains("Bo")).ToList();
        foreach (var item in MyBooks)
        {
            Console.WriteLine($"Judul: {item.Judul}, Penulis: {item.Penulis}");
        }
        //any
        var valid = ListBuku.Any(x => x.Penulis.ToLower() == "bob");
        Console.WriteLine(valid);

        var Buku1 = ListBuku.FirstOrDefault(x => x.Judul == "Book 4 Title");
        if (Buku1 != null)
        {
            Console.WriteLine(Buku1.Judul + " " + Buku1.Penulis);
        }
        //orderby
        List<Buku> sortedBooks = ListBuku.OrderBy(b => b.Harga).ToList();
        foreach (var item in sortedBooks)
        {
            Console.WriteLine($"Judul: {item.Judul}, Harga: {item.Harga}");
        }
    }
}