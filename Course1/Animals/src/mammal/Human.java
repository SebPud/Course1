package mammal;

public class Human {

    private String colour;
    private double weight;

    public Human(String colour, double weight) {
        this.colour = colour;
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "colour='" + colour + '\'' +
                ", weight=" + weight +
                '}';
    }
}
