public class Shark extends Animal implements Swimmer
{
    public Shark(String name)
    {
        super(name);
    }

    public String makeSound()
    {
        return "...";
    }

    public void swim()
    {
        System.out.printf("%s glides silently through the deep.\n", getName());
    }

}