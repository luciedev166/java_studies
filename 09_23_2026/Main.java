import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String []args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1); 

        for(int i : numbers)
        {
            System.out.print(i + " ");
        }
        Collections.sort(numbers); //default way
        System.out.println();
        for(int i : numbers)
        {
            System.out.print(i + " ");
        }
        System.out.printf("\nSORTING BASED ON HOW CLOSE TO 10 \n");

        //wtf even is happening here??
        // numbers.sort((o1, o2) -> 0); // in codechum cant use lambda helper so i must learn how to not rely on this
        // numbers.sort(new Comparator<Integer> () { //brute forced 10 for now
        //     @Override
        //     public int compare(Integer o1, Integer o2) // what does this even do?
        //     {
        //         int dist_o1 = Math.abs(10 - o1);
        //         int dist_o2 = Math.abs(10 - o2);
                
        //         //sorted by increasing number of distances
        //         return Integer.compare(dist_o1, dist_o2);

        //     } // kinda lost dont even know why were comparing 2?

        // });

        // shorter codechum way:
        numbers.sort((o1, o2) -> { //lambda custom way
                int dist_o1 = Math.abs(10 - o1);
                int dist_o2 = Math.abs(10 - o2);
                
                return Integer.compare(dist_o1, dist_o2);   
        });
        for(int i : numbers)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        //codechum, no longer allowed to modify main so not allowed to use lambda, have to create own java class in activity:
        //closetoNcomparator
        
        System.out.printf("\nSORTING BASED ON HOW CLOSE TO N BUT THROUGH THE USE OF A OWN CLASS\n");
        numbers.sort(new CloseToNComparator(10));
        
        for(int i : numbers)
        {
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.println();
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Kitkat",3));
        animals.add(new Animal.Fish("Dory",2));
        animals.add(new Bird("Berd",1));

        //new implementation
        animals.add(new Cat("Catty",6));
        animals.add(new Animal.Fish("Fishy",5));
        animals.add(new Bird("Bord",4));

        //custom way to sort animals, animal have another static class
        // difference between comparator and comparable help im so cooked


        for(Animal a: animals)
        {
            System.out.println(a + " ");
        }
        
        System.out.printf("\nAFTER SORTING BY AGE\n");
        Collections.sort(animals); //default
        for(Animal a: animals)
        {   
            System.out.println(a + " ");
        }
        // sorting by name:
        // compareTo default way, but what if we want more ways to sort animals, but cant have more than one compareTo method
        
        System.out.printf("\nAFTER SORTING BY NAME\n");
        animals.sort(new Animal.NameComparator()); // so confused how come this one is now calling sort?? did animals even have the sort func??
        for(Animal a: animals)
        {   
            System.out.println(a + " ");
        }

        // commented out since the prev version of just type got revised, but i just commented that out back in the Animal.java
        // System.out.printf("\nAFTER SORTING BY TYPE THEN NAME\n"); //idk how it sorted by name but it just did
        // animals.sort(new Animal.TypeComparator()); 
        // for(Animal a: animals)
        // {   
        //     System.out.println(a + " ");
        // }

        System.out.printf("\nAFTER SORTING BY TYPE THEN AGE\n"); 
        animals.sort(new Animal.TypeComparator()); 
        for(Animal a: animals)
        {   
            System.out.println(a + " ");
        }
        // achieving sorting within sorting

    }
}
