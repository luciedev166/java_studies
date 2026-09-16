public class Duck extends Animal implements Swimmer, Walker
{
    public Duck(String name)
    {
        super(name);
    }

    public String makeSound()
    {
        return "Quack";
    }

    public void swim()
    {
        System.out.printf("%s paddles through the water.\n", getName());
    }

    public void walk()
    {
        System.out.printf("%s waddles on land\n", getName());
    }

    
}