package EnumeratedType;

public class Human {
    // Napisz klasę Human, która będzie reprezentowała człowieka. Niech klasa ta posiada atrybuty takie jak imię, wiek, kolor oczu, kolor włosów.
    // Niech te dwa ostatnie atrybuty będą typami wyliczeniowymi. Stwórz instancję takiej klasy.

    private String name;
    private int age;
    private HairColor hair;
    private EyesColor eyes;

    public Human(String name, int age, HairColor hair, EyesColor eyes) {
        this.name = name;
        this.age = age;
        this.hair = hair;
        this.eyes = eyes;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hair=" + hair +
                ", eyes=" + eyes +
                '}';
    }

    public static void main(String... args) {
        Human humanObj = new Human("John", 23, HairColor.BLOND, EyesColor.BLUE);
        System.out.println(humanObj);
    }
}
