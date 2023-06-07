import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Toy> toyList = new ArrayList<>();
        Shop shop =new Shop(toyList);
        Random random =new Random();

        shop.addToy(new Toy("Car",3,random.nextInt(100)));
        shop.addToy(new Toy("Plane",3,random.nextInt(100)));
        shop.addToy(new Toy("Train",2,random.nextInt(100)));
        shop.addToy(new Toy("Doll",5,random.nextInt(100)));
        shop.addToy(new Toy("Ball",3,random.nextInt(100)));
        //System.out.println(shop.toString());
        shop.lottery(10);
    }
}