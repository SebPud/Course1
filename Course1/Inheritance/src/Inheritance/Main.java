package Inheritance;

public class Main {

    public static void main(String[] args) {

        Animal human = new Human();
        Animal goldfish = new Goldfish();
        Fish fish = new Goldfish();
        Fish fish2 = new Fish();

        System.out.println(human);
        System.out.println(goldfish);
        System.out.println(fish);
        System.out.println(fish2);

    }
}
