public class OrderCalculator {
    public double OrderCalculateFinalprice(Order order, DiscountStrategy strategy) {
        return strategy.applyDiscount(order);
    }
}
