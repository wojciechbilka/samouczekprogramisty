package EnumeratedType;

public class ComputationExample {
    public static void main(String[] args) {
        double x = 23.2;
        double y = 12312.123;

        System.out.println(Computation.ADD.perform(x, y));
        System.out.println(Computation.SUBRACT.perform(x, y));
        System.out.println(Computation.MULTIPLY.perform(x, y));
        System.out.println(Computation.DIVIDE.perform(x, y));

    }
}
