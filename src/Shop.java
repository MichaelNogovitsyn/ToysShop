import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Toy> toyList = new ArrayList<>();
    IdGenerator idGenerator = new IdGenerator();

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
}
