package mammal;

public class Dolphin {

    private int length;
    private int age;

    public Dolphin(int length, int age){
        this.age = age;
        this.length = length;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "length=" + length +
                ", age=" + age +
                '}';
    }
}
