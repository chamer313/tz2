package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

// в этом классе реализованы все необходимые функции для работы с числами
// по названиям функций вы сможете понять, какая за что отвечает

public class Funcs {
    public static List<BigInteger> getNums(String fileName) throws IOException {
        List<BigInteger> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] numberStrings = line.split(" ");
                for (int i = 0; i < numberStrings.length; i++) {
                    numbers.add(new BigInteger(numberStrings[i]));
                }
            }
        }
        return numbers;
    }

    public static BigInteger findMin(List<BigInteger> numbers) {
        BigInteger min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).compareTo(min) < 0) {
                min = numbers.get(i);
            }
        }
        return min;
    }

    public static BigInteger findMax(List<BigInteger> numbers) {
        BigInteger max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i).compareTo(max) > 0) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static BigInteger calculateSum(List<BigInteger> numbers) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum.add(numbers.get(i));
        }
        return sum;
    }

    public static BigInteger calculateProduct(List<BigInteger> numbers) {
        BigInteger product = BigInteger.ONE;
        for (int i = 0; i < numbers.size(); i++) {
            product = product.multiply(numbers.get(i));
        }
        return product;
    }
}
