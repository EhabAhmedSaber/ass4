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
public class doctor implements staff {
    
    private double salary;
    private int yearsOfWorks;
    
     @Override
    public double getSalary() {
        return salary;
    }


    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void setYearsOfWorks(int yearsOfWorks) {
        this.yearsOfWorks = yearsOfWorks;
    }

    @Override
    public int getYearsOfWorks() {
        return yearsOfWorks;
    }

}
