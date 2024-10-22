public class Main {
    public static void main(String[] args){
       ogrenci ogrenci1=new ogrenci("Elif","EFE",427639,"YazilimMuhendisligi","KTU",2021,3);
       ogrenci ogrenci2=new ogrenci("Yunus","Kayaoglu",427640,"YazilimMuhendisligi","KTU",2021,3);
       ogrenci ogrenci3=new ogrenci("Emre","Kayaoglu",427635,"YazilimMuhendisligi","KTU",2021,3);
       Akademisyen akademisyen1=new Akademisyen("Hakan","AYDIN");
       Akademisyen akademisyen2=new Akademisyen("Ozge","ÖZARAS");
       BilgiPaketi bilgiPaketi=new BilgiPaketi();
       TemelDers ders1=new TemelDers("Veri","001", "1", true, akademisyen1, 3);
       UygulamaliDers lab1=new UygulamaliDers("YTM", "007", "2", false, akademisyen2, 5);
       bilgiPaketi.DersEkle(ders1);
       bilgiPaketi.DersEkle(lab1);
       ders1.derseYazilim(ogrenci1);
       ders1.derseYazilim(ogrenci2);
       lab1.derseYazilim(ogrenci3);
       lab1.derseYazilim(ogrenci2);
       lab1.derseYazilim(ogrenci1);
       ders1.listeyiYazdir();
       akademisyen1.notGir(ders1, ogrenci2, 30,40,50);
       akademisyen2.notGir(lab1, ogrenci3, 60,70);
       bilgiPaketi.transkriptSorgula(ogrenci3);
       bilgiPaketi.transkriptSorgula(ogrenci2);
       
    }    
}
