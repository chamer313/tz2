import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// в этом классе реализованы все необходимые функции для работы с числами
// по названиям функций вы сможете понять, какая за что отвечает

public class Funcs {
    public static List<Integer> getNums(String fileName) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] numberStrings = line.split(" ");
                for (int i = 0; i < numberStrings.length; i++) {
                    numbers.add(Integer.parseInt(numberStrings[i]));
                }
            }
        }
        return numbers;
    }

    public static int findMin(List<Integer> numbers) {
        int min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        return min;
    }

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public static long calculateProduct(List<Integer> numbers) {
        long product = 1;
        for (int i = 0; i < numbers.size(); i++) {
            product *= numbers.get(i);
        }
        return product;
    }
}
