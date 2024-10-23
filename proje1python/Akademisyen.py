class Akademisyen:
    def __init__(self, ad, soyad):
        self.ad = ad
        self.soyad = soyad

    def get_ad(self):
        return self.ad

    def get_soyad(self):
        return self.soyad

    def not_gir(self, ders, ogrenci, *notlar):
        if ders.ogrenci_kayitli_mi(ogrenci.get_school_number()):
            ders.not_gir(self, ogrenci, *notlar)
        else:
            print("Öğrenci bu derse kayıtlı değil.")
