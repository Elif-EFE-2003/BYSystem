import java.util.HashMap;
import java.util.Map;


public class ogrenci{
    private final  String name;
    private final  String surname;
    private final  int schoolNumber;
    private final  String departmant;
    private final  String faculty;
    private final  int year;
    private final  int sinif;
    private Map<Ders, double[]> dersNotlari;
public ogrenci(String name,String surname,int schoolNumber,String departmant,String faculty,int year,int sinif){
    this.name=name;
    this.surname=surname;
    this.schoolNumber=schoolNumber;
    this.departmant=departmant;
    this.faculty=faculty;
    this.year=year;
    this.sinif=sinif;
    dersNotlari = new HashMap<>();
    
}
public void dersEkle(Ders ders) {
    dersNotlari.put(ders, new double[0]); 
}
public void notGir(Ders ders, double... notlar) {
    dersNotlari.put(ders, notlar);
}
public Map<Ders, double[]> getDersNotlari() {
    return dersNotlari;
}
public String getName(){
    return name;
}
public String getSurname(){
    return surname;
}
public int getSchoolNumber(){
    return schoolNumber;
}
public String getDepartment(){
    return departmant;
}
public String getFaculty(){
    return faculty;
}
public int getYear(){
    return year;
}
public int getSinif(){
    return sinif;
}
//setter yazılamaz çünkü final değişkenler sadece o an atanır ve sonrasında değiştirilemez


 
}