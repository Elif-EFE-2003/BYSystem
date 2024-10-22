public class Akademisyen {
    private String ad;
    private String soyad;

    public Akademisyen(String ad,String soyad){
        this.ad=ad;
        this.soyad=soyad;
    }
    public String getAd(){
        return ad;
    }
    public String getSoyad(){
        return soyad;
    }   
    public void notGir(Ders ders, ogrenci ogrenci, double... notlar) {
        if (ders.ogrenciKayitliMi(ogrenci.getSchoolNumber())) {
            ders.notGir(this, ogrenci, notlar);
        } else {
            System.out.println("Öğrenci bu derse kayitli değil.");
        }
    }
    
}
