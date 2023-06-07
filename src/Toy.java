import java.util.Comparator;

public class Toy implements Comparable<Toy> {
    private String name;
    private int id;
    private int quantity;
    private int rezerv;
    private int weight;

    public Toy(String name,int quantity,int weight)
    {
        this.name = name;
        this.quantity = quantity;
        this.rezerv = quantity;
        this.weight = weight;
    }

    public int getRezerv() {
        return rezerv;
    }

    public void setRezerv(int x) {
        this.rezerv += x;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id:"+id+", ");
        sb.append("name:"+name + ", ");
        sb.append("quantity:" + quantity+", ");
        sb.append("weight:"+weight+"\n");
        return sb.toString();
    }

    @Override
    public int compareTo(Toy other) {
        if (other == null) {
            return -1; // this < other
        }
        int delta = this.weight - other.weight;
        if (delta != 0) {
            return - delta;
        }
        return this.name.compareTo(other.name);

    }

}
