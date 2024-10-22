import java.util.ArrayList;
import java.util.List;

abstract class Ders {
    protected  String dersAdi;
    protected  String dersKodu;
    protected String donem;
    protected boolean secmeli;
    protected Akademisyen dersSorumlusu;
    protected int kredi;
    private List<ogrenci> ogrenciListesi;

    public Ders(String dersAdi,String dersKodu,String donem,boolean secmeli,Akademisyen dersSorumlusu,int kredi){
    this.dersAdi=dersAdi;
    this.dersKodu=dersKodu;
    this.donem=donem;
    this.secmeli=secmeli;
    this.dersSorumlusu=dersSorumlusu;
    this.kredi=kredi;
    ogrenciListesi=new ArrayList<>();
    }
    public String getDersAdi() {
        return dersAdi;
    }

    public abstract String notHesapla(double... notlar);
    public abstract void notGir(Akademisyen akademisyen, ogrenci ogrenci, double... notlar);
    protected String harfNotu(double ortalama){
        if(ortalama>=90) return "AA";
        else if(ortalama>=80) return "BA";
        else if(ortalama>=70) return "BB";
        else if(ortalama>=60) return "CB";
        else if(ortalama>=50) return "CC";
        else if(ortalama>=40) return "DC";
        else if(ortalama>=30) return "DD";
        else return "FF";

    }
    public void derseYazilim(ogrenci ogrenci){
        ogrenciListesi.add(ogrenci);
    }
    public boolean ogrenciKayitliMi(int numara) {
        for (ogrenci ogrenci_ : ogrenciListesi) {
            if (ogrenci_.getSchoolNumber() == numara) {
                return true;  
            }
        }
        return false;  
    }
    @Override
    public String toString(){
        return "Ders: "+dersAdi+", Kod: "+dersKodu+", Secmeli: "+(secmeli?"Evet":"Hayır"+" , Kredi: "+kredi);
    }
    public void listeyiYazdir(){
        System.out.println(dersAdi+"Ogrenci Listesi: ");
        for(ogrenci ogrenci:ogrenciListesi){
            System.out.println(ogrenci.getName());

        }
    }
    



}
