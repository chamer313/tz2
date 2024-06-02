package test;

import main.Funcs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;

// прогоняем тесты для базового файла с числами от 1 до 15

public class Tests {
    private static List<BigInteger> numbers;

    @BeforeAll
    public static void setUp() throws IOException {
        numbers = Funcs.getNums("num.txt");
    }

    @Test
    public void testFindMin() {
        BigInteger min = Funcs.findMin(numbers);
        Assertions.assertEquals(BigInteger.ONE, min);
        System.out.println("Тест пройден успешно");
    }

    @Test
    public void testFindMax() {
        BigInteger max = Funcs.findMax(numbers);
        Assertions.assertEquals(new BigInteger("15"), max);
        System.out.println("Тест пройден успешно");
    }

    @Test
    public void testCalculateSum() {
        BigInteger sum = Funcs.calculateSum(numbers);
        Assertions.assertEquals(new BigInteger("120"), sum);
        System.out.println("Тест пройден успешно");
    }

    @Test
    public void testCalculateProduct() {
        BigInteger product = Funcs.calculateProduct(numbers);
        Assertions.assertEquals(new BigInteger("1307674368000"), product);
        System.out.println("Тест пройден успешно");
    }

    @Test
    public void testTimeout() {
        Assertions.assertTimeoutPreemptively(java.time.Duration.ofMillis(1), () -> {
            Funcs.calculateSum(numbers);
        });
        System.out.println("Тест пройден успешно");
    }
}
