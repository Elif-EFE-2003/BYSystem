using System;

class MeslekiDers : Ders
{
    public MeslekiDers(string dersAdi, string dersKodu, string donem, bool secmeli, Akademisyen dersSorumlusu, int kredi)
        : base(dersAdi, dersKodu, donem, secmeli, dersSorumlusu, kredi)
    {
        
    }

    public override string NotHesapla(params double[] notlar)
    {
        if (notlar.Length != 3)
        {
            throw new ArgumentException("Mesleki dersler için 3 not girilmelidir (Vize, Final, Proje).");
        }
        double ortalama = (notlar[0] * 0.3) + (notlar[1] * 0.3) + (notlar[2] * 0.4);
        return HarfNotu(ortalama);  
    }

    public override void NotGir(Akademisyen akademisyen, Ogrenci ogrenci, params double[] notlar)
    {
        if (notlar.Length != 2)
        {
            Console.WriteLine("Mesleki ders için 2 sinav notu girilmeli.");
            return;
        }

        ogrenci.NotGir(this, notlar);  
        Console.WriteLine($"{akademisyen.Ad} tarafindan {ogrenci.Name} için {GetDersAdi()} dersi notlari girildi:");
        Console.WriteLine("1. Not: " + notlar[0]);
        Console.WriteLine("2. Not: " + notlar[1]);
    }
}
