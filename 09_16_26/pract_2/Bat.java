public class Bat extends Mammal implements Flyer{
    public Bat(String name)
    {
        super(name);
    }

    public String makeSound()
    {
        return "EEE";
    }

    public void fly()
    {
        System.out.printf("%s flies using echolocation.\n", getName());
    }
    
} 