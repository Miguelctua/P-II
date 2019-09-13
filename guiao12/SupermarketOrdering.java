import p2.utils.*;
public class SupermarketOrdering{
    private int numOrders = 0;
    private Queue<Order> orders = new Queue<>();
    private Hashtable<Integer> products = new Hashtable<>(10);

    public void enterOrder(Order order){
        orders.in(order);
        numOrders++;
        if(!products.contains(order.prodName)){
            products.set(order.prodName,order.quantity); 
        }
        else{
            products.set(order.prodName,products.get(order.prodName) + order.quantity);
        }
    }

    public int numOrders(){
        return this.numOrders;
    }

    public Order serverOrder(){
        Order order = orders.peek();
    }
}