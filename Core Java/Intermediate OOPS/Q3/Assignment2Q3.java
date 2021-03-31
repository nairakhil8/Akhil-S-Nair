import java.util.ArrayList;

public class Assignment2Q3 {
    private int totalCash = 0;
    public int totalCashInBank(ArrayList<Integer> cash){
        int total = 0;
        for(Integer cashList:cash){
            total += cashList;
        }
        totalCash = total;

        return total;
    }
    public int getCash(){
        return totalCash;
    }
    public static void main(String[] args) {}
}
