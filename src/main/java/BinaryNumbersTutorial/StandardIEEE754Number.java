package BinaryNumbersTutorial;

public interface StandardIEEE754Number {
    // Czy get powinny być w interfejsie?
    String getSign();
    String getExponent();
    String getMantissa();

    String showBinaryRepresentation();
}
