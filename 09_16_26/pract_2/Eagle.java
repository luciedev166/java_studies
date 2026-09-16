public class Eagle extends Bird implements Flyer
{
    public Eagle(String name)
    {
        super(name);
    }

    public String makeSound()
    {
        return "Screech";
    }
    public void fly()
    {
        System.out.printf("%s soars high in the sky.\n", getName());
    }
}