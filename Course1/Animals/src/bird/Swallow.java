package bird;

public class Swallow {

    private String name;
    private int length;

    public Swallow(String name, int length){
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
