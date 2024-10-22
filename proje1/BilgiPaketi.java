import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BilgiPaketi{
    private List<Ders> tumDersler;
    public BilgiPaketi(){
        tumDersler=new ArrayList<>();
    }
    public void DersEkle(Ders ders){
           tumDersler.add(ders);
    }
    public void transkriptSorgula(ogrenci Ogrenci) {
        System.out.println(Ogrenci.getName() + " adlı öğrencinin transkripti:");
        
        // Öğrencinin tüm ders ve notlarını almak
        Map<Ders, double[]> ogrenciDersNotlari = Ogrenci.getDersNotlari();
        
        for (Ders ders : tumDersler) {
            // Eğer öğrenci bu derse kayıtlıysa ve notları varsa
            if (ogrenciDersNotlari.containsKey(ders)) {
                double[] notlar = ogrenciDersNotlari.get(ders);  // Öğrencinin derse ait notları
                String harfNotu = ders.notHesapla(notlar);       // Dersin not hesaplama fonksiyonu kullanılarak harf notu hesaplanır
    
                System.out.println("Ders: " + ders.getDersAdi());
                System.out.println("Dersin Kredisi: " + ders.kredi);
                System.out.println("Harf Notu: " + harfNotu);
            }
        }
    }
    
}