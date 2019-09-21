package scrap.heap.refactor;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

         //Place birthday party orders
        Order order = new Order();
        order.orderBalloon("red", "mylar", 4).
                orderCake("chocolate", "chocolate", "circle", "large", "brown").
                checkOut();

        order.orderBalloon("blue", "latex", 7).
                orderCake("chocolate", "Vanilla", "square", "med", "brown").
                checkOut();

        order.orderBalloon("yellow", "mylar", 4).
                orderCake("vanilla", "vanilla", "square", "small", "yellow").
                checkOut();
        }
}
