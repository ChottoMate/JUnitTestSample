public class Bank {
    Money reduce(Expression source, String to) {
//        if (source instanceof Money) {
//            return ((Money) source).reduce(to);
//        }
//        Sum sum = (Sum) source;
        return source.reduce(to);
//        int amount = sum.augend.amount + sum.addend.amount;
//        return new Money(amount, to);
    }
}
