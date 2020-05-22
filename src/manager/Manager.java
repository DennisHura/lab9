package manager;

import employees.Employees;

public class Manager extends Employees {

    private double bonus;

    public Manager(int id, String name, String surname, double salary, double bonus) {
        super(id, name, surname, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

   // @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("id: " + getId() + " name: " + getName() + " surname: " + getSurname() + " salary: " + getSalary() + " bonus: " + bonus + " manager: " + getManager());
        return string.toString();
    }
}
