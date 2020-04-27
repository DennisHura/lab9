package com.company;

import employees.Employees;
import manager.Manager;

public class Main {

    public static void main(String[] args) {

        Manager manager1 = null;
        manager1.topManager(10001, "Oleg", "Stranniy", 25000,6000);
        Manager manager2 = new Manager(20002, "Viktor", "Kravchuk", 23000, manager1,400);
        Manager manager3 = null;
        manager3.topManager(20003, "Oleg", "Box", 30000, 5000);
        Manager manager4 = new Manager(20004,"Vlad","Lisuy", 2500000, manager3,4000);
        Manager manager5 = new Manager(20005, "Vadim", "Bylochka", 20000, manager4, 3000);
        Manager manager6 = new Manager(20006, "Volodya","Pirigok", 19000, manager5,2000);

        Employees employee1 = new Employees(10001, "Max", "Manko", 15000, manager2 );
        Employees employee2 = new Employees(10002, "Denys", "Krok", 15000, manager2);
        Employees employee3 = new Employees(10003, "Dima", "Skok", 16000, manager1);
        Employees employee4 = new Employees(10004, "Nikolay", "Tut", 15000, manager6);


    }
}
