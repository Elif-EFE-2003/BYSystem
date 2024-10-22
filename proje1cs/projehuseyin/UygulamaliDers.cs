using System;

class UygulamaliDers : Ders
{
    public UygulamaliDers(string dersAdi, string dersKodu, string donem, bool secmeli, Akademisyen dersSorumlusu, int kredi)
        : base(dersAdi, dersKodu, donem, secmeli, dersSorumlusu, kredi){}


    public override string NotHesapla(params double[] notlar)
    {
        if (notlar.Length != 2)
        {
            throw new ArgumentException("Uygulama dersleri için 2 not girilmelidir (Vize, Proje).");
        }
        double ortalama = (notlar[0] * 0.4) + (notlar[1] * 0.6);
        return HarfNotu(ortalama);  
    }

    public override void NotGir(Akademisyen akademisyen, Ogrenci ogrenci, params double[] notlar)
    {
        if (notlar.Length != 2)
        {
            Console.WriteLine("Uygulamali ders için 2 sinav notu girilmeli.");
            return;
        }
        
        ogrenci.NotGir(this, notlar);  
        Console.WriteLine($"{akademisyen.Ad} tarafindan {ogrenci.Name} için {GetDersAdi()} dersi notlari girildi:");
        Console.WriteLine("1. Not: " + notlar[0]);
        Console.WriteLine("2. Not: " + notlar[1]);
    }
}
