class TemelDers extends Ders {
    public TemelDers(String dersAdi,String dersKodu,String donem,boolean secmeli,Akademisyen dersSorumlusu,int kredi){
        super(dersAdi,dersKodu,donem,secmeli,dersSorumlusu,kredi);//anasınıfın özelliklerine erişmek için
    }

    @Override
    public String notHesapla(double... notlar){
      if(notlar.length!=3){
        throw new IllegalArgumentException("Temel dersler için 3 notgirilmelidir (Vize, Final, Proje).");
      }
      double ortalama=(notlar[0]*0.3)+(notlar[1]*0.5)+(notlar[2]*0.2);
      return super.harfNotu(ortalama);
    }
    @Override
    public void notGir(Akademisyen akademisyen, ogrenci ogrenci, double... notlar) {
        if (notlar.length != 3) {
            System.out.println("Temel ders için 3 not girilmeli.");
            return;
        }
        ogrenci.notGir(this, notlar);
        System.out.println(akademisyen.getAd() + " tarafından " + ogrenci.getName() + " için " + getDersAdi() + " dersi notları girildi: ");
        System.out.println("1. Not: " + notlar[0]);
        System.out.println("2. Not: " + notlar[1]);
        System.out.println("3. Not: " + notlar[2]);
    }
}
