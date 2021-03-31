import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment5Q4 {
    public static List<Transaction> sortTransactions(List <Transaction> transactions) {
        return transactions.stream()
                .filter(x-> x.getYear()==2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());
    }

    public static List<Integer> transactionsValuesDelhi(List<Transaction> transactions) {
        List<Integer> values = new ArrayList<>();

        transactions.stream()
                .filter(x-> x.getTrader().getCity().equals("Delhi"))
                .forEach(x-> values.add(x.getValue()));

        return values;
    }
    public static int highestTransaction(List<Transaction> transactions){
        return transactions.stream().max(Comparator.comparingInt(Transaction::getValue)).get().getValue();
    }

    public static int smallestTransaction(List<Transaction> transactions){
        return transactions.stream().min(Comparator.comparingInt(Transaction::getValue)).get().getValue();
    }

    public static void main(String[] args) {}
}
