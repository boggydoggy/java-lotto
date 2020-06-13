package study.step1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Numbers {
    private static final int NUMBER_ZERO = 0;

    private final List<Integer> numbers;

    public Numbers(String [] numbers){
        this(toInts(numbers));
    }

    public Numbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    private static List<Integer> toInts(String[] numbers) {
        return Stream.of(numbers)
                .map(value -> validateInputNumber(value))
                .collect(Collectors.toList());
    }

    private static int validateInputNumber(String input) {
        int result = Integer.parseInt(input);
        if (result < NUMBER_ZERO){
            throw new RuntimeException();
        }
        return result;
    }

    public int sum() {
        int result = NUMBER_ZERO;
        for (int number : numbers){
            result += number;
        }
        return result;
    }
}