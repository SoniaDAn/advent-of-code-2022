package aoc.day01;

import aoc.Day;

import java.util.List;

public class Day01 extends Day {

    static {
        currentDay = buildCurrentDay(new Object() {});
    }

    @Override
    public String part1(List<String> input) {

        int runningTotal = 0;
        int largestTotal = 0;

        for (String line : input) {
            if (line.isEmpty()) {
                return String.valueOf(runningTotal);
            }
            runningTotal += convertsToInt(line);
            //largestTotal = runningTotal;
        }
        if (runningTotal > largestTotal) {
            largestTotal = runningTotal;
        }

        return String.valueOf(largestTotal);
    }

    @Override
    public String part2(List<String> input) {
        return input.isEmpty() ? "" : input.get(0);
    }

    public int convertsToInt(String line) {
       return Integer.parseInt(line);
    }

}
