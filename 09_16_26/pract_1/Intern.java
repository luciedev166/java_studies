public class Intern extends Employee
{
    public Intern(String name, int age, String id)
    {
        super(name, age, id);
    }

    public double calculateSalary()
    {
        return 5000;
    }

    public String toString()
    {
        return "Intern | " + super.toString() + ", Salary: " + calculateSalary();
    }


}