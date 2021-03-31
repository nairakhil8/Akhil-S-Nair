import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumBetweenRange {
    public int[] armstrongNumbersInRange(int min , int max){
        int i,temp;
        List<Integer> arrayOfArmStrongNumbers = new ArrayList<>();
        for(i=min+1; i<max; i++){
            int sum = 0, digit, original=i;
            temp = i;

            while(temp>0){
                digit = temp%10;
                temp /= 10;
                sum += digit * digit * digit;
            }

            if(sum==original){
                arrayOfArmStrongNumbers.add(original);
            }
        }

        int[] arr = arrayOfArmStrongNumbers.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return arr;
    }
}
