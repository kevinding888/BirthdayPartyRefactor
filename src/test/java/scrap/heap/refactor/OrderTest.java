package scrap.heap.refactor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderTest {
    @Test
    public void testOrderBalloon() {
        Order order = new Order();
        order.orderBalloon("red", "leather", 5);
        assertEquals(1, order.getBalloons().size());
        order.orderBalloon("blue", "cloth", 4);
        assertEquals(2, order.getBalloons().size());
    }

    @Test
    public void testOrderCake() {
        Order order = new Order();
        order.orderCake("vanilla", "vanilla", "round", "small", "green");
        order.orderCake("vanilla", "chocolate", "square", "large", "red");
        order.orderBalloon("blue", "cloth", 4);
        assertEquals(2, order.getCakes().size());
    }

    @Test
    public void testOrderBalloonOrderCake() {
        Order order = new Order();
        order.orderBalloon("red", "leather", 5);
        order.orderCake("vanilla", "vanilla", "round", "small", "green");
        order.orderCake("vanilla", "chocolate", "square", "large", "red");
        assertEquals(1, order.getBalloons().size());;
        assertEquals(2, order.getCakes().size());
    }

    @Test
    public void testCheckout() {
        Order order = new Order();
        order.orderBalloon("red", "leather", 5);
        order.orderCake("vanilla", "vanilla", "round", "small", "green");
        // not much to test other than make sure checkout runs to print stuff.
        order.checkOut();

        // making sure balloons and cakes lists are reset after checkout.
        assertEquals(0, order.getBalloons().size());;
        assertEquals(0, order.getCakes().size());
    }
}
