public class Toy {
    String name;
    private int id;
    private int quantity;
    private int weight;

    public Toy(String name,int quantity,int weight)
    {
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
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
        sb.append(id);
        sb.append(", ");
        sb.append(name);
        sb.append(", ");
        sb.append(quantity);
        sb.append(", ");
        sb.append(weight);
        return sb.toString();
    }
}
