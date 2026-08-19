import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name? ");
        String name = sc.nextLine();

        System.out.printf("Hello %s!", name);
        sc.close();
    }

}