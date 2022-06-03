import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<Pair, Integer> rates = new HashMap<>();

    Money reduce(Expression source, String to) {
//        if (source instanceof Money) {
//            return ((Money) source).reduce(to);
//        }
//        Sum sum = (Sum) source;
        return source.reduce(this, to);
//        int amount = sum.augend.amount + sum.addend.amount;
//        return new Money(amount, to);
    }

    void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }
    int rate(String from, String to) {
        if (from.equals(to)) return 1;
        int rate = rates.get(new Pair(from, to));
        return rate;
    }
}
