import java.util.Scanner;

public class Person{
    private String name;
    private int age;
    private int points;
    private String status;
    private double balance; 

    public Person(String name,int age,int points, String status,double balance){
        this.name = name;
        this.age = age;
        this.points = points;
        this.status = status;
        this.balance = balance;
    }

    public void setName(String newName){
        this.name = newName;
        System.out.printf("Name changed to %s\n", name);
        
    }
    public void setAge(int newAge){
        this.age = newAge;
        System.out.printf("Age changed to %d\n", age);
        
    }
    public void addAge(){
        age++;
        System.out.printf("Age chaged to %d\n", age);
    }

    public void minusAge(){
        age--;
        System.out.printf("Age chaged to %d\n", age);
    }

    public void addPoints(int pts)
    {
        points += pts;
        System.out.printf("Points changed to %d\n", points);
    }

    public void resetPoints(){
        points = 0;
        System.out.printf("Points changed to %d\n", points);
    }

    public void changeStatus(String newStatus){
        status = newStatus;
        System.out.printf("Status changed to %s\n", status);
    }

    public void withdraw(int out)
    {
        balance -= out;
        System.out.printf("Withdre: %d, Current Balance: %.2f\n", out, balance);
    }

    public void clear(){
        name = "";
        age = 0;
        points = 0; 
        status = "";
        balance = 0.0;
    }

    public void display()
    {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Points: %d\n", points);
        System.out.printf("Status: %s\n", status);
        System.out.printf("Balance: %.2f\n", balance);
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your points: ");
        int points = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your status: ");
        String status = sc.nextLine();

        System.out.print("Enter your balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();

        Person p = new Person(name, age, points, status, balance);

        //void methods
        System.out.print("Change name to: ");
        String newName = sc.nextLine();
        p.setName(newName);

        System.out.print("Change age to: ");
        int newAge = sc.nextInt();
        sc.nextLine();
        p.setAge(newAge);

        p.addAge();

        p.minusAge();

        System.out.print("Add points: ");
        int newPoints = sc.nextInt();
        sc.nextLine();        
        p.addPoints(newPoints);

        p.resetPoints();

        System.out.print("New Status: ");
        String newStatus = sc.nextLine();    
        p.changeStatus(newStatus);

        System.out.print("Withdraw: ");
        int out = sc.nextInt();
        sc.nextLine();        

        p.withdraw(out);

        p.clear();

        p.display();




        sc.close();

    }
}