package study.step1.domain;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumbers {
    private final List<PositiveNumber> positiveNumberList;

    public PositiveNumbers(String[] stringNumbers) {
        positiveNumberList = parsePositiveNumbers(stringNumbers);
    }

    private List<PositiveNumber> parsePositiveNumbers(String[] stringNumbers) {
        List<PositiveNumber> numbers = new ArrayList<>();
        for(String number : stringNumbers) {
            numbers.add(new PositiveNumber(number));
        }
        return numbers;
    }

    public int sum() {
        return positiveNumberList.stream().mapToInt(PositiveNumber::getNumber).sum();
    }
}
