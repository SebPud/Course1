package Enum;

public class Human {

    private String name;
    private int age;
    private HairColour hairColour;
    private EyesColour eyesColour;


    public Human(String name, int age, HairColour hairColour, EyesColour eyesColour) {
        this.name = name;
        this.age = age;
        this.hairColour = hairColour;
        this.eyesColour = eyesColour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HairColour getHairColour(){
        return hairColour;
    }

    public EyesColour getEyesColourColour(){
        return eyesColour;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hairColour=" + hairColour +
                ", eyesColour=" + eyesColour +
                '}';
    }
}
