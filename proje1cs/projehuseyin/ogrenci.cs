using System;
using System.Collections.Generic;

public class Ogrenci
{
    public string Name { get; }
    public string Surname { get; }
    public int SchoolNumber { get; }
    public string Department { get; }
    public string Faculty { get; }
    public int Year { get; }
    public int Sinif { get; }

    private Dictionary<Ders, double[]> dersNotlari;

    public Ogrenci(string name, string surname, int schoolNumber, string department, string faculty, int year, int sinif)
    {
        Name = name;
        Surname = surname;
        SchoolNumber = schoolNumber;
        Department = department;
        Faculty = faculty;
        Year = year;
        Sinif = sinif;
        dersNotlari = new Dictionary<Ders, double[]>();
    }

    public void DersEkle(Ders ders)
    {
        dersNotlari[ders] = new double[0]; 
    }

    public void NotGir(Ders ders, params double[] notlar)
    {
        dersNotlari[ders] = notlar; 
    }

    public Dictionary<Ders, double[]> GetDersNotlari()
    {
        return dersNotlari; 
    }

}
