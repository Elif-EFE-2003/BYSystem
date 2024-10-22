using System;

public class Main
{
    public static void Main(string[] args)
    {
        
        Ogrenci ogrenci1 = new Ogrenci("Elif", "EFE", 427639, "YazilimMuhendisligi", "KTU", 2021, 3);
        Ogrenci ogrenci2 = new Ogrenci("Yunus", "Kayaoglu", 427640, "YazilimMuhendisligi", "KTU", 2021, 3);
        Ogrenci ogrenci3 = new Ogrenci("Emre", "Kayaoglu", 427635, "YazilimMuhendisligi", "KTU", 2021, 3);

        
        Akademisyen akademisyen1 = new Akademisyen("Hakan", "AYDIN");
        Akademisyen akademisyen2 = new Akademisyen("Ozge", "ÖZARAS");

    
        BilgiPaketi bilgiPaketi = new BilgiPaketi();

        
        TemelDers ders1 = new TemelDers("Veri", "001", "1", true, akademisyen1, 3);
        UygulamaliDers lab1 = new UygulamaliDers("YTM", "007", "2", false, akademisyen2, 5);

        
        bilgiPaketi.DersEkle(ders1);
        bilgiPaketi.DersEkle(lab1);

        ders1.DerseYazilim(ogrenci1);
        ders1.DerseYazilim(ogrenci2);
        lab1.DerseYazilim(ogrenci3);
        lab1.DerseYazilim(ogrenci2);
        lab1.DerseYazilim(ogrenci1);

        ders1.ListeyiYazdir();

        akademisyen1.NotGir(ders1, ogrenci2, 30, 40, 50);
        akademisyen2.NotGir(lab1, ogrenci3, 60, 70);

        bilgiPaketi.TranskriptSorgula(ogrenci3);
        bilgiPaketi.TranskriptSorgula(ogrenci2);
    }
}
