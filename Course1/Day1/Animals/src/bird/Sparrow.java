package bird;

public class Sparrow {

    private String colour;
    private double speed;

    public Sparrow(String colour, double speed) {
        this.colour = colour;
        this.speed = speed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Sparrow{" +
                "colour='" + colour + '\'' +
                ", speed=" + speed +
                '}';
    }
}
