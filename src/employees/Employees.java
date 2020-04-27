package employees;

import manager.Manager;

public class Employees {

    protected int id;
    protected String name;
    protected String surname;
    protected double salary;
    private Manager manager;

    public final void setId(int id)
    {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String Surname)
    {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSalary(double Salary)
    {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setManager(Manager manager)
    {
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public Employees(int id, String name, String surname, double salary, Manager manager)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.manager = manager;
    }

    public void raiseSalary(double p)
    {
        salary = salary + (salary/100)*p;
    }


    public String toString() {
        StringBuilder string = new StringBuilder();

        string.append("id: " + this.id + " Name: " + this.name + " Surname: " + this.surname + " Salary: " + this.salary + " Manager: " + this.manager);

        return string.toString();
    }


}
