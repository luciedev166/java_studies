public class ZooKeeper
{
    public void inspect(Animal a)
    {
        a.toString();
        if(a instanceof Swimmer)
        {
            ((Swimmer)a).swim();
        }
        if(a instanceof Walker)
        {
        ((Walker)a).walk();
        }
    }
}