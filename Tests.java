import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;

// прогоняем тесты для базового файла с числами от 1 до 15

public class Tests {
    private static List<Integer> numbers;

    @BeforeAll
    public static void setUp() throws IOException {
        numbers = Funcs.getNums("num.txt");
    }

    @Test
    public void testFunctions() {
        int min = Funcs.findMin(numbers);
        Assertions.assertEquals(1, min);

        int max = Funcs.findMax(numbers);
        Assertions.assertEquals(15, max);

        int sum = Funcs.calculateSum(numbers);
        Assertions.assertEquals(120, sum);

        long prod = Funcs.calculateProduct(numbers);
        Assertions.assertEquals(1307674368000L, prod);

        Assertions.assertTimeoutPreemptively(java.time.Duration.ofMillis(1), () -> {
            Funcs.calculateSum(numbers);
        });
    }
}
