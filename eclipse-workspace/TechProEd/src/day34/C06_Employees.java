package day34;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class C06_Employees {
    /* TODO
    Burada iki adet class vardýr. Biri Main diðeri ise Employees,
    Employees(Çalýþanlar) class'ýnda;
    Bu variable'larý oluþturunuz;
    private String name,
    private int salary,
    private String dob (date of birth) (Doðum tarihi)
    getter ve setter oluþturunuz.
 Main class'ýn içinde; kullanicidan name dob ve slary bilgilerini alip
    Eðer employee 18 yaþýnda büyükse, Welcome to our company Fernando your salary is 80000. yazdýrýnýz.
    Eðer Fernando 18 yaþýndan küçükse, come back when you are 18 years old. yazdýrýnýz.
    Eðer Fernando 18 yaþýndaysa,  we can have inter with you after that you can have a 80000 salary yazdýrýnýz.
  Örnek:
    Name is Fernando
    dob is 11/23/2000
    Salary is 80000
todo  ageCalculator isminde bir method oluþturunuz. Þuanki tarih - doðum yýlý = employee age
*/
    
    private String name;
    private int salary;
    private String dob ;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    
    
    public int yasHesapla(String dob) {
         String strDate=dob;//"12/23/1999"
            
            LocalDate bugun=LocalDate.now();
            DateTimeFormatter format= DateTimeFormatter.ofPattern("MM/dd/yyyy");
            
            LocalDate dTarihi=LocalDate.parse(strDate,format);//kullaýnýcýn strig girdigi MM/dd/yyyy formata gore parcala 
            
            
            int age=bugun.getYear()-dTarihi.getYear();//bugun - kullanýcý dTarihi= yas
            
        return age;
    }    
}