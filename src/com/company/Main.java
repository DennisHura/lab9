package com.company;

import employees.Employees;
import manager.Manager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Manager manager1 = new Manager(20001, "Oleg", "Stranniy", 25000,6000);
        Manager manager2 = new Manager(20002, "Viktor", "Kravchuk", 23000, 400);
        manager2.setManager(manager1);
        Manager manager3 = new Manager(20003, "Oleg", "Box", 30000, 5000);
        Manager manager4 = new Manager(20004,"Vlad","Lisuy", 2500000, 4000);
        manager4.setManager(manager3);
        Manager manager5 = new Manager(20005, "Vadim", "Bylochka", 20000,  3000);
        manager5.setManager(manager4);
        Manager manager6 = new Manager(20006, "Volodya","Pirigok", 19000, 2000);
        manager6.setManager(manager5);

        Employees employee1 = new Employees(10001, "Max", "Manko", 15000);
        employee1.setManager(manager2);
        Employees employee2 = new Employees(10002, "Denys", "Krok", 17000 );
        employee2.setManager(manager2);
        Employees employee3 = new Employees(10003, "Dima", "Skok", 16000);
        employee3.setManager(manager1);
        Employees employee4 = new Employees(10004, "Nikolay", "Tut", 15000);
        employee4.setManager(manager6);

        manager1.print();
        manager2.print();
        manager3.print();
        manager4.print();
        manager5.print();
        manager6.print();
        employee1.print();
        employee2.print();
        employee3.print();
        employee4.print();


        System.out.println(manager2.getManagerName() + "is manager for " + manager2.getName() + " " + manager2.getSurname());
        System.out.println("Manager for " + manager1.getName() + " " + manager1.getSurname() + " is " + manager1.getManagerName());

        Employees employee5 = new Employees();
        employee5.print();

        System.out.println("TOP Manager for " + employee1.getName() + " is " + manager1.getTopManager().getName());
        employee1.getTopManager();


        Scanner in = new Scanner(System.in);
        Employees employee8 = new Employees();
        System.out.println("Please enter name : ");
        employee8.setName(in.nextLine());
        System.out.println("Please enter surname : ");
        employee8.setSurname(in.nextLine());
        System.out.println("Please enter salary : ");
        employee8.setSalary(in.nextDouble());

        employee8.print();




    }
}
