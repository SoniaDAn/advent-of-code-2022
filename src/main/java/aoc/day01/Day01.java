package aoc.day01;

import aoc.Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day01 extends Day {

    static {
        currentDay = buildCurrentDay(new Object() {
        });
    }

    @Override
    public String part1(List<String> input) {

        int runningTotal = 0;
        int largestTotal = 0;

        for (String value : input) {
            if (!value.isEmpty()) {
                runningTotal += convertsToInt(value);
                if (runningTotal > largestTotal) {
                    largestTotal = runningTotal;
                }
            } else {
                runningTotal = 0;
            }
        }
        return String.valueOf(largestTotal);
    }

    @Override
    public String part2(List<String> input) {
        int runningTotal = 0;

        List<Integer> totals = new ArrayList<>();

        for (String value : input) {
            if (!value.isEmpty()) {
                runningTotal += convertsToInt(value);
            } else {
                totals.add(runningTotal);
                runningTotal = 0;
            }
        }

        totals.sort(Collections.reverseOrder());
        int sum = 0;

        for (int numbers = 0; numbers < 3; numbers++) {
            sum += totals.get(numbers);
        }
        return String.valueOf(sum);
    }

    public int convertsToInt(String line) {
        return Integer.parseInt(line);
    }
}
