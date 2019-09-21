package scrap.heap.refactor;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Balloon> balloons;
    List<Cake> cakes;

    List<Balloon> getBalloons() {
        return balloons;
    }

    List<Cake> getCakes() {
        return cakes;
    }

    public Order(){
        balloons = new ArrayList<>();
        cakes = new ArrayList<>();
    }

    public Order orderBalloon(String color, String material, int num){
        Balloon balloon = new Balloon(color, material, num);
        balloons.add(balloon);
        return this;
    }

    /*
    May be a better idea to user enums to represent flavor, shape, color, etc., to avoid confusion about parameters.
     */
    public Order orderCake(String flavor, String frostingFlavor, String shape, String size, String color){
        Cake cake = new Cake(flavor, frostingFlavor, shape, size, color);
        cakes.add(cake);
        return this;
    }

    /*
      This will simulate the process of checking out ordered goods. Each checkout call indicates the completion of
      an order. Note that multiple balloons and cakes can be taken in one order.
     */
    public void checkOut(){
        System.out.println("Balloons ordered:");
        for(Balloon balloon:balloons) {
            System.out.println(balloon.color+", " + balloon.material + ", " + balloon.number);
        }

        System.out.println("Cakes ordered:");
        for(Cake cake:cakes) {
            System.out.println(cake.flavor + ", " + cake.frostingFlavor + ", " + cake.shape + ", " + cake.size + ", " + cake.color);
        }

        // every checkout resets items in order.
        balloons.clear();
        cakes.clear();
    }
}
