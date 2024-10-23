from Ders import Ders
class UygulamaliDers(Ders):
    def __init__(self, ders_adi, ders_kodu, donem, secmeli, ders_sorumlusu, kredi):
        super().__init__(ders_adi, ders_kodu, donem, secmeli, ders_sorumlusu, kredi)

    def not_hesapla(self, *notlar):
        if len(notlar) != 2:
            raise ValueError("Uygulama dersleri için 2 not girilmelidir (Vize, Proje).")
        ortalama = (notlar[0] * 0.4) + (notlar[1] * 0.6)
        return super().harf_notu(ortalama)

    def not_gir(self, akademisyen, ogrenci, *notlar):
        if len(notlar) != 2:
            print("Uygulamalı ders için 2 sınav notu girilmeli.")
            return
        ogrenci.not_gir(self, notlar)
        print(f"{akademisyen.get_ad()} tarafından {ogrenci.get_name()} için {self.get_ders_adi()} dersi notları girildi:")
        print(f"1. Not: {notlar[0]}")
        print(f"2. Not: {notlar[1]}")


