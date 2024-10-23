class Ogrenci:
    def __init__(self, name, surname, school_number, department, faculty, year, sinif):
        self.name = name
        self.surname = surname
        self.school_number = school_number
        self.department = department
        self.faculty = faculty
        self.year = year
        self.sinif = sinif
        self.ders_notlari = {}  

    def ders_ekle(self, ders):
        self.ders_notlari[ders] = []  

    def not_gir(self, ders, *notlar):
        self.ders_notlari[ders] = notlar  

    def get_ders_notlari(self):
        return self.ders_notlari

    def get_name(self):
        return self.name

    def get_surname(self):
        return self.surname

    def get_school_number(self):
        return self.school_number

    def get_department(self):
        return self.department

    def get_faculty(self):
        return self.faculty

    def get_year(self):
        return self.year

    def get_sinif(self):
        return self.sinif
