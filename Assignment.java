/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Ehab Elsheikh
 */
import java.util.Scanner;
public class Assignment {

   
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Name: ");
        String nameOfstaff=input.nextLine();
        System.out.println("Enter salary:");
        double salary = input.nextDouble();
        System.out.println("Enter yoears of works:");
        int years = input.nextInt();
        memberFactory m= new memberFactory();
        staff s = m.getStaff(nameOfstaff);
        s.setSalary(salary);
        s.setYearsOfWorks(years);
        System.out.println("Salary is: " + s.getSalary());
        System.out.println("Years of works is: " + s.getYearsOfWorks());
    }
    
}
