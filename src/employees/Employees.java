package employees;

import fieldLengthLimitException.FieldLengthLimitException;
import manager.Manager;

public class Employees {

    private int id;
    private String name;
    private String surname;
    private double salary;
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
        try {
           if(name.length()>7)
               throw new FieldLengthLimitException();
        }
        catch(FieldLengthLimitException e)
        {
            System.out.println("Exception: "+e.toString());
            return;
        }

            this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname)
    {
        try {
            if(surname.length()>7)
                throw new FieldLengthLimitException();
        }
        catch(FieldLengthLimitException e)
        {
            System.out.println("Exception: "+e.toString());
            return;
        }
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSalary(double salary)
    {
        try {
            if(salary<0)
                throw new FieldLengthLimitException();
        }
        catch(FieldLengthLimitException e)
        {
            System.out.println("Exception: "+e.toString());
            return;
        }

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

    public Employees() {
salary=1000;
    }

    public Employees(int id, String name, String surname, double salary)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void raiseSalary(double p)
    {
        salary = salary + (salary/100)*p;
    }

    public String getManagerName() {
        if(manager == null) {
            return "Nomanager";
        }
        return System.out.printf(manager.getName() + " " + manager.getSurname()).toString();
    }

    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("id: " + this.id + " Name: " + this.name + " Surname: " + this.surname + " Salary: " + this.salary );
        return string.toString();
    }

    public void print() {
        System.out.println(this.toString());
    }

    public Employees getTopManager(){
        if(manager == null){
            return this;
        } else {
            return getManager().getTopManager();
        }
    }
}
