package aoc.day03;

import aoc.Day;

import java.util.List;

public class Day03 extends Day {
    static {currentDay = new Day03();}

    @Override
    public String part1(List<String> input) {
        return "";
    }

    @Override
    public String part2(List<String> input) {
        return "";
    }

    public String firstHalf(String input) {
       return input.substring(0, (input.length()/2));
    }

    public String secondHalf(String input) {
        return input.substring(input.length()/2);
    }
}

