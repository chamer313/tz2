import java.io.IOException;
import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

// замеряем время с помощью Instant и Duration и выводим его для каждой функции

public class Timer {
    public static void main(String[] args) throws IOException {
        List<BigInteger> nums = Funcs.getNums("num.txt");

        Instant start = Instant.now();
        BigInteger min = Funcs.findMin(nums);
        Instant end = Instant.now();
        long res = Duration.between(start, end).toNanos();
        System.out.println("findMin: " + res + " наносек");

        start = Instant.now();
        BigInteger max = Funcs.findMax(nums);
        end = Instant.now();
        res = Duration.between(start, end).toNanos();
        System.out.println("findMax: " + res + " наносек");

        start = Instant.now();
        BigInteger sum = Funcs.calculateSum(nums);
        end = Instant.now();
        res = Duration.between(start, end).toNanos();
        System.out.println("calculateSum: " + res + " наносек");

        start = Instant.now();
        BigInteger prod = Funcs.calculateProduct(nums);
        end = Instant.now();
        res = Duration.between(start, end).toNanos();
        System.out.println("calculateProduct: " + res + " наносек");
    }
}
