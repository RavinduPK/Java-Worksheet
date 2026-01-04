package LW_06.Q3;

public class Dog extends Pet {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double dogWeight) {
        weight = dogWeight;
    }

    @Override
    public String speak() {
        return "";
    }
}
