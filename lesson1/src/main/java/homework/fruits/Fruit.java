package homework.fruits;

public abstract class Fruit {
    protected double weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
