class BilgiPaketi:
    def __init__(self):
        self.tum_dersler = []  

    def ders_ekle(self, ders):
        self.tum_dersler.append(ders)  

    def transkript_sorgula(self, ogrenci):
        print(f"{ogrenci.get_name()} adli ogrencinin transkripti:")

        ogrenci_ders_notlari = ogrenci.get_ders_notlari()

        for ders in self.tum_dersler:
            
            if ders in ogrenci_ders_notlari:
                notlar = ogrenci_ders_notlari[ders]  
                harf_notu = ders.not_hesapla(*notlar)  

                print(f"Ders: {ders.get_ders_adi()}")
                print(f"Dersin Kredisi: {ders.kredi}")
                print(f"Harf Notu: {harf_notu}")
