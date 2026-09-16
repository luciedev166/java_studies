public class Manager extends Employee{
    private double baseSalary;
    private double bonus;
    
    public Manager(String name, int age, String id, double baseSalary, double bonus)
    {
        super(name, age, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }
    
    public double calculateSalary()
    {
        return baseSalary + bonus;
    }
    
    
    public String toString()
    {
        return "Manager | " + super.toString() + ", Salary: " + calculateSalary(); //wanna try turning to to a .2 decimal
    }
    
    
}