/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jit
 */
public class Employee {

    private String name;
    private String department;
    private double salary;
    private double bounas;
    public static int count = 0 ;

    public Employee() {
        ++count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return this.salary + getBounas();
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * @return the bounas
     */
    public double getBounas() {
        return  (this.salary * this.bounas)/100;
    }

    /**
     * @param bounas the bounas to set
     */
    public void setBounas(double bounas) {
        this.bounas = bounas;
    }

}

