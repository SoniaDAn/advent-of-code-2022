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

        for (int indexOfInput = 0; indexOfInput < input.size(); indexOfInput++) {
            runningTotal += convertsToInt(input.get(indexOfInput));
        }
        return String.valueOf(runningTotal);
        //return input.isEmpty() ? "" : input.get(0);
    }

    @Override
    public String part2(List<String> input) {
        return input.isEmpty() ? "" : input.get(0);
    }

    public int convertsToInt(String line) {
       return Integer.parseInt(line);
    }

}
