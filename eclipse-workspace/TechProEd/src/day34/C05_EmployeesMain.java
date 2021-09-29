package day34;
import java.util.Scanner;
public class C05_EmployeesMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("adýnýzý giriniz  : ");
        String name = scan.nextLine();
        
        System.out.print("dogum tarihini MM/dd/yyyy  giriniz  : ");
        String dob = scan.nextLine();
        
        System.out.print("talep ettiginiz maas giriniz  : ");
        int salary = scan.nextInt();
        
         C06_Employees calisan =new  C06_Employees();
        
        calisan.setDob(dob);
        calisan.setName(name);
        calisan.setSalary(salary);
        int calisanYas=calisan.yasHesapla(dob);
        
        
        if (calisanYas>18) {
            
            System.out.println("Welcome to our company "+name+" your salary is: "+salary);
        }else if (calisanYas<18) {
            
            System.out.println("come back when you are 18 years old.");
        }else if (calisanYas==18) {
            System.out.println("we can have inter with you after that you can have a "+salary+" salary");
        }
        
    }
}