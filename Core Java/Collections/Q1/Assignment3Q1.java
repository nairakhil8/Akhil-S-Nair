import java.util.Set;
import java.util.TreeSet;

public class Assignment3Q1 {
    public static void main(String[] args){
        Person person1 = new Person("vamsi",160,60);
        Person person2 = new Person("amit",170,55);
        Person person3 = new Person("mohit",165,55);
        Person person4 = new Person("rohit",180,45);

        Set<Person> treeSet = new TreeSet<>();
        treeSet.add(person1);
        treeSet.add(person2);
        treeSet.add(person3);
        treeSet.add(person4);

        for(Person person:treeSet){
            System.out.println(person);
        }
    }
}
