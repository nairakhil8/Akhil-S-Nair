import java.util.Arrays;

public class Assignment1Q8 {
    public static void main(String args[]) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(arr)));
    }
}
