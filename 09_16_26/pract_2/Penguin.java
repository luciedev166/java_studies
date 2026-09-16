public class Penguin extends Bird implements Swimmer
{
    public Penguin(String name)
    {
        super(name);
    }

    public String makeSound()
    {
        return "Honk";
    }

    public void swim()
    {
        System.out.printf("%s waddles then swims gracefully in icy water.\n", getName());
    }


}