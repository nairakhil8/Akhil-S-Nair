import java.util.Hashtable;

public class Assignment3Q5 {
    public static void main(String[] args) {
        Hashtable<Employee,String> hashtable = new Hashtable<>();
        Employee employee1 = new Employee("amit",1);
        Employee employee2 = new Employee("sumit",2);
        hashtable.put(employee1,"amit");
        hashtable.put(employee2,"sumit");

        System.out.println(hashtable.get(employee1));
    }
}
