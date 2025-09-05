
public class FixedDiscount implements DiscountStrategy{
         private final double amount;

     public FixedDiscount(double amount) {
        this.amount = amount;
    }
    @Override
    public double applyDiscount(Order order) {
         return order.getTotalPrice() - this.amount;
    }
    
}
