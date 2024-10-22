using System;
using System.Collections.Generic;


public class BilgiPaketi
{
    private List<Ders> tumDersler;

    public BilgiPaketi()
    {
        tumDersler = new List<Ders>();
    }

    public void DersEkle(Ders ders)
    {
        tumDersler.Add(ders);
    }

    public void TranskriptSorgula(Ogrenci ogrenci)
    {
        Console.WriteLine($"{ogrenci.Name} adli öğrencinin transkripti:");

        Dictionary<Ders, double[]> ogrenciDersNotlari = ogrenci.GetDersNotlari();

        foreach (var ders in tumDersler)
        {
            if (ogrenciDersNotlari.ContainsKey(ders))
            {
                double[] notlar = ogrenciDersNotlari[ders];  
                string harfNotu = ders.NotHesapla(notlar);  

                Console.WriteLine($"Ders: {ders.GetDersAdi}");
                Console.WriteLine($"Dersin Kredisi: {ders.Kredi}");
                Console.WriteLine($"Harf Notu: {harfNotu}");
            }
        }
    }
}
