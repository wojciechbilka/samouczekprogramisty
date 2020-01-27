package BinaryNumbersTutorial;

public class FloatBinaryRepresentation implements StandardIEEE754Number {

    private float number = 0.0f;
    private String sign;
    private String exponent;
    private String mantissa;

    public FloatBinaryRepresentation() {
        sign = "0";
        exponent = "00000000";
        mantissa = "00000000000000000000000";
    }

    private void convertToBinary(float number) {
        sign = (number < 0.0f) ? "1" : "0";

        int exponentDecimalValue = 127;
        String simpleBinaryRepresentation = BinaryNumbers.convertDecimal(number);
        StringBuilder simpleBinaryRepresentationBuilder = new StringBuilder(simpleBinaryRepresentation);

        while(simpleBinaryRepresentationBuilder.indexOf(",") > 1) {
            int commaTempIndex = simpleBinaryRepresentationBuilder.indexOf(",");
            char tempChar = simpleBinaryRepresentationBuilder.charAt(commaTempIndex - 1);
            simpleBinaryRepresentationBuilder.setCharAt(commaTempIndex - 1, ',');
            simpleBinaryRepresentationBuilder.setCharAt(commaTempIndex, tempChar);
            exponentDecimalValue++;
            System.out.println("First Loop");
            System.out.println(simpleBinaryRepresentationBuilder);
        }
        while(simpleBinaryRepresentationBuilder.indexOf(",") == 1 && simpleBinaryRepresentationBuilder.charAt(0) == 0) {
            simpleBinaryRepresentationBuilder.replace(0, 2, "0,");
            exponentDecimalValue--;
            System.out.println("Second Loop");
        }

        simpleBinaryRepresentation = simpleBinaryRepresentationBuilder.toString();

        exponent = BinaryNumbers.convertDecimal(exponentDecimalValue);
        exponent = fillWithZeros(exponent, 8);

        mantissa = simpleBinaryRepresentation.substring(2);
        mantissa = fillWithZeros(mantissa, 23);
    }

    private static String fillWithZeros(String stringOfChars, int targetLength) {
        StringBuilder stringBuilder = new StringBuilder(stringOfChars);
        while(stringBuilder.length() < targetLength) {
            stringBuilder.append("0");
        }
        return stringBuilder.toString();
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
        convertToBinary(number);
    }

    @Override
    public String getSign() {
        return sign;
    }

    @Override
    public String getExponent() {
        return exponent;
    }

    @Override
    public String getMantissa() {
        return mantissa;
    }

    @Override
    public String showBinaryRepresentation() {
        return sign + " " + exponent + " " + mantissa;
    }
}
