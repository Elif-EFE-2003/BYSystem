using System;
using System.Collections.Generic;

public abstract class Ders
{
    protected string dersAdi;
    protected string dersKodu;
    protected string donem;
    protected bool secmeli;
    protected Akademisyen dersSorumlusu;
    protected int kredi;
    private List<Ogrenci> ogrenciListesi;

    public object Kredi { get; internal set; }

    public Ders(string dersAdi, string dersKodu, string donem, bool secmeli, Akademisyen dersSorumlusu, int kredi)
    {
        this.dersAdi = dersAdi;
        this.dersKodu = dersKodu;
        this.donem = donem;
        this.secmeli = secmeli;
        this.dersSorumlusu = dersSorumlusu;
        this.kredi = kredi;
        ogrenciListesi = new List<Ogrenci>();
    }

    public string GetDersAdi()
    {
        return dersAdi;
    }

    public abstract string NotHesapla(params double[] notlar);
    public abstract void NotGir(Akademisyen akademisyen, Ogrenci ogrenci, params double[] notlar);

    protected string HarfNotu(double ortalama)
    {
        if (ortalama >= 90) return "AA";
        else if (ortalama >= 80) return "BA";
        else if (ortalama >= 70) return "BB";
        else if (ortalama >= 60) return "CB";
        else if (ortalama >= 50) return "CC";
        else if (ortalama >= 40) return "DC";
        else if (ortalama >= 30) return "DD";
        else return "FF";
    }

    public void DerseYazilim(Ogrenci ogrenci)
    {
        ogrenciListesi.Add(ogrenci);
    }

    public bool OgrenciKayitliMi(int numara)
    {
        foreach (var ogrenci in ogrenciListesi)
        {
            if (ogrenci.SchoolNumber == numara)
            {
                return true;
            }
        }
        return false;
    }

    public override string ToString()
    {
        return $"Ders: {dersAdi}, Kod: {dersKodu}, Secmeli: {(secmeli ? "Evet" : "Hayır")}, Kredi: {kredi}";
    }

    public void ListeyiYazdir()
    {
        Console.WriteLine($"{dersAdi} Ogrenci Listesi:");
        foreach (var ogrenci in ogrenciListesi)
        {
            Console.WriteLine(ogrenci.Name);
        }
    }
}
