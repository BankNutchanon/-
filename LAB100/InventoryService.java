public class InventoryService implements OrderObserver{
    @Override
    public void update(Order order) {
        System.out.println("[inventory Service] Stock has been update for order: " + order.orderId());
    }
}