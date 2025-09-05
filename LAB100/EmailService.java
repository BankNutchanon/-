public class EmailService implements OrderObserver{
    @Override
    public void update(Order order) {
        System.out.println("[Email Service] Confireation email sent to" + order.customerEmail() + "for order:" +order.orderId());
    }
}
