import java.util.*;

public class ComputerTesting {
    public static void main(String[] args)
    {
        Computer comp2 = new Computer("Apple", "Air", 64, 1998.99);
        Computer comp3 = new Computer("Apple", "MacBook Pro", 64, 2998.99);
        Computer comp4 = new Computer("HP", "Envy", 32, 898.99);

        TreeSet<Computer> computers = new TreeSet<>();
        computers.add(new Computer("Dell", "Inspiron", 32, 998.99));
        computers.add(comp2);
        computers.add(comp3);
        computers.add(comp4);

        for (Computer computer:computers)
            System.out.println(computer);

        List<Computer> computerList = new ArrayList<>();

        computerList.add(comp4);
        computerList.add(comp3);
        computerList.add(comp2);

        System.out.println("\nComputers in the ArrayList");
        for (Computer computer:computerList)
            System.out.println(computer);

        //this will sort based on the rules in the compareTo method for the Computer
        //class
        Collections.sort(computerList);

        System.out.println("\nAfter sorting with the compareTo method");
        for (Computer computer:computerList)
            System.out.println(computer);

        //Creating our own custom sorting method
        Collections.sort(computerList, (a,b) ->  (a.getPrice()>b.getPrice())?1:-1);

        System.out.println("\nAfter sorting with the custom lambda on price");
        for (Computer computer:computerList)
            System.out.println(computer);


    }
}
