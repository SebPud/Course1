package Equal;

import java.util.Objects;

public class Human {

    private String name;
    private String surName;
    private Integer pesel;

    public Human(String name, String surName, Integer pesel) {
        this.name = name;
        this.surName = surName;
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(surName, human.surName) &&
                Objects.equals(pesel, human.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, pesel);
    }

    public static void main(String[] args) {
        Human human1 = new Human("Seba", "Jeden",123456789);
        Human human2 = new Human("Seba", "Dwa",123456789);
        Human human3 = new Human("Seba", "Jeden",111111111);
        Human human4 = new Human("Seba", "Jeden",111111111);

        System.out.println(human1.equals(human2));
        System.out.println(human1.equals(human3));
        System.out.println(human2.equals(human3));
        System.out.println(human3.equals(human4));

        System.out.println(human1.hashCode());
        System.out.println(human2.hashCode());
        System.out.println(human3.hashCode());
        System.out.println(human4.hashCode());

    }
}
