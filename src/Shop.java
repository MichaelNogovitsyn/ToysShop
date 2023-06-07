import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class Shop {
    List<Toy> toyList = new ArrayList<>();
    IdGenerator idGenerator = new IdGenerator();
    PriorityQueue<Toy> queue = new PriorityQueue<>();
    Toy prize;

    public Shop(List<Toy> toyList) {
        this.toyList = toyList;
    }

    public void addToy(Toy newToy) {
        this.toyList.add(newToy);
        newToy.setId(idGenerator.getId());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (toyList != null) {
            for (Toy toy : toyList) {
                sb.append(toy.toString());
            }
            return sb.toString();
        } else return "Магазин пустой";
    }

    public void lottery(int count) {
        int i = 0;
        if (count>0) System.out.println("Будут разыграны следующие призы");
        while (i < count) {
            Random random = new Random();
            int x = random.nextInt(toyList.size());
            System.out.println(toyList.get(x).toString());

            //проверка зарезервированного количества
            if (toyList.get(x).getRezerv() > 0) {
                toyList.get(x).setRezerv(-1);
                queue.add(toyList.get(x));
            } else i--;
            i++;
        }
    }
    public Toy getPrize()
    {
        prize=queue.poll();
        if (prize!=null)
        {
            // уменьшим кол-во игрушки в магазине
            toyList.get(prize.getId()).setQuantity(-1);
            return prize;
        }else return null;
    }
    public int totalQuntity()
    {
        int total=0;
        for (Toy toy : toyList
        ) {
            total += toy.getQuantity();
        }
        return total;
    }
}
