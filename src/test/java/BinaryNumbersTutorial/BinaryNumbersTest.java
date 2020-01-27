package BinaryNumbersTutorial;

import BinaryNumbersTutorial.BinaryNumbers;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryNumbersTest {
    @Test
    public void isConvertDecimalMethodWorkingForPositiveIntegerNumbers() {
        //given
        int two = 2;
        int bigNumber = 1231444;

        //when
        String binaryTwo = BinaryNumbers.convertDecimal(two);
        String binaryBigNumber = BinaryNumbers.convertDecimal(bigNumber);

        //then
        assertEquals(binaryTwo, "10");
        assertEquals(binaryBigNumber, "100101100101001010100");
    }

    @Test
    public void isConvertDecimalMethodWorkingForZeroArgument() {
        //given
        int zero = 0;

        //when
        String binaryZero = BinaryNumbers.convertDecimal(zero);

        //then
        assertEquals(binaryZero, "0");
    }

    @Test
    public void isConvertDecimalMethodThrowingExceptionForNegativeIntegers() {
        //given
        int negativeNumber = -10;

        //when & then
        assertThrows(IllegalArgumentException.class, () -> BinaryNumbers.convertDecimal(negativeNumber));
    }
    @Test
    public void isConvertDecimalMethodWorkingForFractionalNumbers() {
        //given
        double fractionalNumber = 0.1;

        //when
        String binaryFractionalNumber = BinaryNumbers.convertDecimal(fractionalNumber);

        //then
        assertEquals(binaryFractionalNumber, "0,0(0011)");

    }
}
