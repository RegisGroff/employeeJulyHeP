package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++){
            System.out.println("Employee #" + i + " data");
            System.out.print("Outsourced (y/n)? ");
            char outSourced = sc.next().charAt(0);

            if (outSourced == 'y'){
                System.out.print("Name: ");
                sc.nextLine();
                String name = sc.nextLine();
                System.out.print("Hours: ");
                int hours = sc.nextInt();
                System.out.print("Value per hour: ");
                double valuePerHour = sc.nextDouble();
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }

                else {
                    System.out.print("Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Hours: ");
                    int hours = sc.nextInt();
                    System.out.print("Value per hour: ");
                    double valuePerHour = sc.nextDouble();

                    list.add(new Employee(name, hours, valuePerHour));
                }
        }

        System.out.println();
        System.out.println("PAYMENTS:");

        for (Employee x : list){
            System.out.println(x.getName() + " - $ " + String.format("%.2f", x.payment()));
        }

        sc.close();
    }
}
