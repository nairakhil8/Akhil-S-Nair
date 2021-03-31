@FunctionalInterface
interface Math{
    double calculate(int num1,int num2);
}
public class Assignment4Q1 {
    public double addition(int num1,int num2){
        Math m = (int x, int y)->x+y;
        return m.calculate(num1,num2);
    }
    public double subtraction(int num1,int num2){
        Math m = (int x, int y)->x-y;
        return m.calculate(num1,num2);
    }
    public double multiplication(int num1,int num2){
        Math m = (int x, int y)->x*y;
        return m.calculate(num1,num2);
    }
    public double division(int num1,int num2){
        Math m = (int x, int y)->(double)x/y;
        return m.calculate(num1,num2);
    }
    public static void main(String[] args) {
        Assignment4Q1 a = new Assignment4Q1();
        System.out.println(a.addition(1,2));
    }
}

