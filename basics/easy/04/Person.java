import java.util.Scanner;

public class Person{
    private String name;
    private int age;
    private int points;
    private String Status;
    private double balance;

    public Person(String name, int age, int points, String status, double balance)
    {
        this.name = name;
        this.age = age;
        this.points = points;
        this.status = status;
        this.balance = balance;
    }

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public int getPoints()
    {
        return points;
    }
    public double getBalance()
    {
        return balance;
    }
    public boolean isdult()
    {
        return age >= 18;
    }
    public int calculatePoints(int bonus)
    {
        return points + bonus;
    }
    public string getInfo()
    {
        return "Name: " + name +
        ", Age: " + age +
        ", Points: " + points +
        ", Status: " + status;
    }
    public double calculateDiscount()
    {
         return price * 0.90;
    }
    public double calculateSquareRoot()
    {
        return Math.sqrt(number);
    }
    public double calculatePower(double base, double exponent)
    {
        return Math.pow(base, exponent);
    }
    public boolean hasEnoughBalance(double amount)
    {
        return balance >= amount;
    }

    public static void main(String[] args)
    {
        Scanner sc = Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter points: ");
        int points = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter status ");
        String status = sc.nextLine();
        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();

        Person p = new Person(name, age, points, status, balance);

        // methods with return values:
        System.out.println("\n===== RESULTS =====");

        System.out.println("Name: " + person.getName());

        System.out.println("Age: " + person.getAge());

        System.out.println("Points: " + person.getPoints());

        System.out.println("Balance: " + person.getBalance());

        System.out.println("Adult: " + person.isAdult());

        System.out.println("Points + 50: " + person.calculatePoints(50));

        System.out.println("Info: " + person.getInfo());

        System.out.println("Price after discount: "
                + person.calculateDiscount(1000));

        System.out.println("Square root of 25: "
                + person.calculateSquareRoot(25));

        System.out.println("2^3: "
                + person.calculatePower(2, 3));

        System.out.println("Enough balance for 500: "
                + person.hasEnoughBalance(500));

        System.out.println("Final score with 20 bonus: "
                + person.calculateFinalScore(20));


        sc.close();

    }
}