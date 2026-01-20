import java.util.*;

public class OnlineOrder {
    public static void main(String[] args) {
        /*
            Q. Online Order Processing System
            Each Order has:
                int orderId
                String customerName
                double orderAmount
                int itemCount
                long orderTime

            Write a Java program to sort orders using Comparator based on:
                Higher orderAmount first
                If amount same → fewer itemCount first
                If itemCount same → earlier orderTime first
                If orderTime same → customerName in ascending order
                If customerName same → orderId in ascending order
        */

            List<Order> arr = new ArrayList<>();
            arr.add(new Order(1, "Yash", 1000.1, 2, 1));
            arr.add(new Order(3, "Avi", 100.5, 9, 5));
            arr.add(new Order(4, "Ankit", 5000.9, 5, 2));
            arr.add(new Order(2, "Sky", 8000.85, 3, 7));

            Collections.sort(arr, new OrderComprator());
            for (Order it : arr) System.out.println(it);
            
            
    }
}
class Order{
    int orderId;
    String customerName;
    double orderAmount;
    int itemCount;
    long orderTime;

    public Order(int orderId,String customerName,double orderAmount,int itemCount,long orderTime){
        this.orderId = orderId;
        this.customerName= customerName;
        this.orderAmount = orderAmount;
        this.itemCount=itemCount;
        this.orderTime = orderTime;
    }

    public String toString() {
        return orderId + " " + customerName + " " + orderAmount + " " + itemCount + " " + orderTime;
    }
}

class OrderComprator implements Comparator<Order>{
    public int compare(Order o1,Order o2){
        int c;

        c = Double.compare(o2.orderAmount, o1.orderAmount);
        if (c != 0) return c;

        c = Integer.compare(o1.itemCount, o2.itemCount);
        if (c != 0) return c;

        c = Long.compare(o1.orderTime, o2.orderTime);
        if (c != 0) return c;

        c = o1.customerName.compareTo(o2.customerName);
        if (c != 0) return c;

        return Integer.compare(o1.orderId, o2.orderId);
    }
}
