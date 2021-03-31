import java.util.ArrayList;

public class Assignment2Q2 {
    int salary = 10000;

    public int getSalary(int salary){
        return salary;
    }

    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
        int total =0;
        for(Integer employeeSalary: employeeSalaries){
            total += employeeSalary;
        }
        return total;
    }

    public static void main(String[] args) {}
}
