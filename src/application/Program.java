package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee("Alex", 50, 20.0);
        System.out.println(emp.payment());
        Employee emp2 = new OutsourcedEmployee("Bob", 100, 15.0, 200.0);
        System.out.println(emp2.payment());
        Employee emp3 = new Employee("Maria", 60, 20.0);
        System.out.println(emp3.payment());


        sc.close();
    }
}
