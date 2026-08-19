// public class Person {
//     private String name;
//     private int age;
//     private int points;
//     private String status;
//     private double balance;

//     public Person(String name, int age, int points, String status, double balance) {
//         this.name = name;
//         this.age = age;
//         this.points = points;
//         this.status = status;
//         this.balance = balance;
//     }

//     // 1. Changes the person's name
//     public void setName(String name) {
//         this.name = name;
//     }

//     // 2. Changes the person's age
//     public void setAge(int age) {
//         this.age = age;
//     }

//     // 3. Increases age by 1
//     public void increaseAge() {
//         age++;
//     }

//     // 4. Decreases age by 1
//     public void decreaseAge() {
//         age--;
//     }

//     // 5. Adds points to the current points
//     public void addPoints(int points) {
//         this.points += points;
//     }

//     // 6. Resets points back to 0
//     public void resetPoints() {
//         points = 0;
//     }

//     // 7. Changes the person's status
//     public void changeStatus(String status) {
//         this.status = status;
//     }

//     // 8. Adds money to the balance
//     public void addBalance(double amount) {
//         balance += amount;
//     }

//     // 9. Removes money from the balance
//     public void withdraw(double amount) {
//         balance -= amount;
//     }

//     // 10. Resets all fields to their default values
//     public void clearData() {
//         name = "";
//         age = 0;
//         points = 0;
//         status = "";
//         balance = 0.0;
//     }

//     // Displays all current information
//     public void displayInfo() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Points: " + points);
//         System.out.println("Status: " + status);
//         System.out.println("Balance: " + balance);
//     }

//     public static void main(String[] args) {
//         Person person = new Person("Pat", 19, 100, "Active", 500.0);

//         System.out.println("Initial Data:");
//         person.displayInfo();

//         // Test all 10 methods
//         person.setName("Alice");
//         person.setAge(20);
//         person.increaseAge();
//         person.decreaseAge();
//         person.addPoints(50);
//         person.resetPoints();
//         person.changeStatus("Premium");
//         person.addBalance(200.0);
//         person.withdraw(100.0);
//         person.clearData();

//         System.out.println("\nFinal Data:");
//         person.displayInfo();
//     }
// }