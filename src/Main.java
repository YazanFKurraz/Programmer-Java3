
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jit
 */
public class Main {

    private static void showData(Employee[] employees){
     System.out.println("==================");
        System.out.printf("%-10s%-10s%-13s\n","Name","Department","Salary");
        for(Employee employee:employees)
            System.out.printf("%-10s%-10s%-10.2f\n",
                    employee.getName(),
                    employee.getDepartment(),employee.getSalary());
}
    
    public static void main(String[] args) {

        Employee[] employee = new Employee[2];

        for (int i = 0; i < employee.length; i++) {
             
            System.out.println("Enter data");
            Employee e = new Employee();
            e.setName(JOptionPane.
                    showInputDialog(null, "Name", "Employee" + i , JOptionPane.INFORMATION_MESSAGE));
            e.setDepartment(JOptionPane.
                    showInputDialog(null, "Department", "Employee" + i , JOptionPane.INFORMATION_MESSAGE));
            e.setSalary(Double.parseDouble(JOptionPane.
                    showInputDialog(null, "Salary", "Employee" + i  , JOptionPane.INFORMATION_MESSAGE)));
            e.setBounas(Double.parseDouble(JOptionPane.
                    showInputDialog(null, "Bounas", "Employee" + i  , JOptionPane.INFORMATION_MESSAGE)));
            employee[i] = e;
        }
        
       //////  ممكن حذف هذا الكود 
       System.out.println("Nmae" + "   " + "Department" + "  " +  "salary"  );
        
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getName() + "         " + employee[i].getDepartment() + "         " + employee[i].getSalary());
            
        }
        /////

        showData(employee);
        System.out.println("\n" + " The Number Employee : " + Employee.count);
    }

}
