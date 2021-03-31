public class ArmstrongOrNot {
    public boolean armstrongCheck(int num) {
        int sum = 0, digit, temp=num;

        while(num>0){
            digit = num%10;
            num /= 10;
            sum += digit * digit * digit;
        }

        return temp == sum;
    }
}
