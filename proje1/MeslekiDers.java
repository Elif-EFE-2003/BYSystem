class MeslekiDers extends Ders {
    public MeslekiDers(String dersAdi,String dersKodu,String donem,boolean secmeli,Akademisyen dersSorumlusu,int kredi,ogrenci ogrencilistesi){
        super(dersAdi,dersKodu,donem,secmeli,dersSorumlusu,kredi);//anasınıfın özelliklerine erişmek için
    }
    @Override
    public String notHesapla(double... notlar){
        if(notlar.length!=3){
          throw new IllegalArgumentException("Mesleki dersler için 3 not girilmelidir (Vize, Final,proje).");
        }
        double ortalama=(notlar[0]*0.3)+(notlar[1]*0.3)+(notlar[2]*0.4);
        return super.harfNotu(ortalama);
      }
      @Override
    public void notGir(Akademisyen akademisyen, ogrenci ogrenci, double... notlar) {
        if (notlar.length != 2) {
            System.out.println("Mesleki ders için 2 sınav notu girilmeli.");
            return;
        }
        ogrenci.notGir(this, notlar);
        System.out.println(akademisyen.getAd() + " tarafından " + ogrenci.getName() + " için " + getDersAdi() + " dersi notları girildi: ");
        System.out.println("1. Not: " + notlar[0]);
        System.out.println("2. Not: " + notlar[1]);
    }
    
}