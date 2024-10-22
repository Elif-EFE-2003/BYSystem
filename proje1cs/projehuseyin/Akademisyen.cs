public class Akademisyen
{
    private string ad;
    private string soyad;

    public Akademisyen(string ad, string soyad)
    {
        this.ad = ad;
        this.soyad = soyad;
    }

    public string Ad
    {
        get { return ad; }
    }

    public string Soyad
    {
        get { return soyad; }
    }

    public void NotGir(Ders ders, Ogrenci ogrenci, params double[] notlar)
    {
        if (ders.OgrenciKayitliMi(ogrenci.SchoolNumber))
        {
            ders.NotGir(this, ogrenci, notlar);
        }
        else
        {
            Console.WriteLine("Öğrenci bu derse kayitli degil.");
        }
    }
}
