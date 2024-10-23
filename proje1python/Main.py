from Akademisyen import Akademisyen
from BilgiPaketi import BilgiPaketi
from Ders import Ders
from TemelDers import TemelDers
from UygulamaliDers import UygulamaliDers
from ogrenci import Ogrenci
from MeslekiDers import MeslekiDers
class Main:
    def main(self):

        ogrenci1 = Ogrenci("Elif", "EFE", 427639, "YazilimMuhendisligi", "KTU", 2021, 3)
        ogrenci2 = Ogrenci("Yunus", "Kayaoglu", 427640, "YazilimMuhendisligi", "KTU", 2021, 3)
        ogrenci3 = Ogrenci("Emre", "Kayaoglu", 427635, "YazilimMuhendisligi", "KTU", 2021, 3)

        akademisyen1 = Akademisyen("Hakan", "AYDIN")
        akademisyen2 = Akademisyen("Ozge", "ÖZARAS")

    
        bilgiPaketi = BilgiPaketi()

        
        ders1 = TemelDers("Veri", "001", "1", True, akademisyen1, 3)
        lab1 = UygulamaliDers("YTM", "007", "2", False, akademisyen2, 5)

        
        bilgiPaketi.ders_ekle(ders1)
        bilgiPaketi.ders_ekle(lab1)

        
        ders1.derse_yazilim(ogrenci1)
        ders1.derse_yazilim(ogrenci2)
        lab1.derse_yazilim(ogrenci3)
        lab1.derse_yazilim(ogrenci2)
        lab1.derse_yazilim(ogrenci1)

        
        ders1.listeyi_yazdir()

        
        akademisyen1.not_gir(ders1, ogrenci2, 30, 40, 50)
        akademisyen2.not_gir(lab1, ogrenci3, 60, 70)

        
        bilgiPaketi.transkript_sorgula(ogrenci3)
        bilgiPaketi.transkript_sorgula(ogrenci2)


if __name__ == "__main__":
    main_instance = Main()
    main_instance.main()
