using System;

class TemelDers : Ders
{
    public TemelDers(string dersAdi, string dersKodu, string donem, bool secmeli, Akademisyen dersSorumlusu, int kredi)
        : base(dersAdi, dersKodu, donem, secmeli, dersSorumlusu, kredi){}
   

    public override string NotHesapla(params double[] notlar)
    {
        if (notlar.Length != 3)
        {
            throw new ArgumentException("Temel dersler için 3 not girilmelidir (Vize, Final, Proje).");
        }
        double ortalama = (notlar[0] * 0.3) + (notlar[1] * 0.5) + (notlar[2] * 0.2);
        return HarfNotu(ortalama); 
    }

    public override void NotGir(Akademisyen akademisyen, Ogrenci ogrenci, params double[] notlar)
    {
        if (notlar.Length != 3)
        {
            Console.WriteLine("Temel ders için 3 not girilmeli.");
            return;
        }
        
        ogrenci.NotGir(this, notlar); 
        Console.WriteLine($"{akademisyen.Ad} tarafindan {ogrenci.Name} için {GetDersAdi()} dersi notlari girildi:");
        Console.WriteLine("1. Not: " + notlar[0]);
        Console.WriteLine("2. Not: " + notlar[1]);
        Console.WriteLine("3. Not: " + notlar[2]);
    }
}
