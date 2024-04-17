package testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class test_case {

    @Test
    public void testSumEvenNumbers_WithEvenInput() {
        // Kiểm tra với n là số chẵn
        assertEquals(30, test.sumEvenNumbers(10));
        assertEquals(6, test.sumEvenNumbers(5));
        assertEquals(110, test.sumEvenNumbers(20));
    }

    @Test
    public void testSumEvenNumbers_WithOddInput() {
        // Kiểm tra với n là số lẻ
        assertEquals(30, test.sumEvenNumbers(11)); // Số chẵn từ 1 đến 10 là 30
        assertEquals(12, test.sumEvenNumbers(6));   // Số chẵn từ 1 đến 5 là 6
        assertEquals(110, test.sumEvenNumbers(21)); // Số chẵn từ 1 đến 20 là 110
    }

    @Test
    public void testSumEvenNumbers_WithZeroInput() {
        // Kiểm tra với n = 0
        assertEquals(0, test.sumEvenNumbers(0));
    }

    @Test
    public void testSumEvenNumbers_WithNegativeInput() {
        // Kiểm tra với n là số âm
        assertEquals(0, test.sumEvenNumbers(-10)); // Không có số chẵn nào từ 1 đến -10
        assertEquals(0, test.sumEvenNumbers(-5));  // Không có số chẵn nào từ 1 đến -5
    }
}
