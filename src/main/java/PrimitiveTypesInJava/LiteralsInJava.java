package PrimitiveTypesInJava;

public class LiteralsInJava {
    public static void main(String[] args) {

        // Integer literals example
        // Binary - 0b...; Octal - 0...; Hexadecimal - 0x...
        int simpleInt = 12;
        int simpleIntWithUnderscore = 1_123_321_211;
        int intBinaryNotation = 0b1111;
        int intOctalNotation = 0123_123;
        int intHexadecimalNotation = 0x1babe;

        // Floating- Point literals example
        // Decimal - ...F; Hexadecimal - 0x...
        float simpleFloat = 2313.23F;
        float simpleFloat1 = .2123F;
        float simpleFloatWithUnderscore = 123_321_321.312F;
        float floatHexadecimalNotation = 0xfff;
        float withScientificNotation = 2e-10F;

        System.out.println(floatHexadecimalNotation);

        // Boolean true/false
        // Character:
        // 'a'
        /*EscapeSequence:
        \ b (backspace BS, Unicode \u0008)
        \ t (horizontal tab HT, Unicode \u0009)
        \ n (linefeed LF, Unicode \u000a)
        \ f (form feed FF, Unicode \u000c)
        \ r (carriage return CR, Unicode \u000d)
        \ " (double quote ", Unicode \u0022)
        \ ' (single quote ', Unicode \u0027)
        \ \ (backslash \, Unicode \u005c)
                OctalEscape (octal value, Unicode \u0000 to \u00ff)*/
    }
}
