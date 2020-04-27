package manager;

import employees.Employees;

public class Manager extends Employees {

    private double bonus;



    public Manager(int id, String name, String surname, double salary, Manager manager, double bonus) {
        super(id, name, surname, salary, manager);
        this.bonus = bonus;
    }

    public void topManager(int id, String name, String surname, double salary, double bonus)
    {
       this.id= id;
       this.name = name;
       this.surname = surname;
       this.salary = salary;
        this.bonus = bonus;
    }


    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return this.getSalary();
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append(" Bonus: " + this.bonus);
        return string.toString();
    }
}
