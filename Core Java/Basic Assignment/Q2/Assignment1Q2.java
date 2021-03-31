

public class Assignment1Q2 {
    public static void main (String [] args) {

        int min = 100;int max = 999;

        ArmstrongNumBetweenRange armstrongNumBetweenRange = new ArmstrongNumBetweenRange();
        int [] arr = armstrongNumBetweenRange.armstrongNumbersInRange(min,max);

        for(int number:arr){
            System.out.print(number + "  ");
        }

    }
}
