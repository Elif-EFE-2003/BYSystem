class UygulamaliDers extends Ders {
    public UygulamaliDers(String dersAdi,String dersKodu,String donem,boolean secmeli,Akademisyen dersSorumlusu,int kredi){
        super(dersAdi,dersKodu,donem,secmeli,dersSorumlusu,kredi);//anasınıfın özelliklerine erişmek için
    }
    @Override
    public String notHesapla(double... notlar) {
        if(notlar.length!=2){
            throw new IllegalArgumentException("Uygulama dersleri için 2 not girilmelidir (Vize,Proje).");
          }
          double ortalama=(notlar[0]*0.4)+(notlar[1]*0.6);
        return super.harfNotu(ortalama);       
    }
    @Override
    public void notGir(Akademisyen akademisyen, ogrenci ogrenci, double... notlar) {
        if (notlar.length != 2) {
            System.out.println("Uygulamalı ders için 2 sınav notu girilmeli.");
            return;
        }
        ogrenci.notGir(this, notlar);
        System.out.println(akademisyen.getAd() + " tarafından " + ogrenci.getName() + " için " + getDersAdi() + " dersi notları girildi: ");
        System.out.println("1. Not: " + notlar[0]);
        System.out.println("2. Not: " + notlar[1]);
    }
}
