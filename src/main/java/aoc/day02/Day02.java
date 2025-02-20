package aoc.day02;

import aoc.Day;

import java.util.List;

public class Day02 extends Day {

    static {currentDay = new Day02();}

    @Override
    public String part1(List<String> input) {
        int playerTwoTotal = 0;
        for (String value : input) {
            if (value.equals("A X")) {
                playerTwoTotal += 4;
            } else if (value.equals("B X")) {
                playerTwoTotal += 1;
            } else if (value.equals("C X")) {
                playerTwoTotal += 7;
            } else if (value.equals("A Y")) {
                playerTwoTotal += 8;
            } else if (value.equals("B Y")) {
                playerTwoTotal += 5;
            } else if (value.equals("C Y")) {
                playerTwoTotal += 2;
            } else if (value.equals("A Z")) {
                playerTwoTotal += 3;
            } else if (value.equals("B Z")) {
                playerTwoTotal += 9;
            } else if (value.equals("C Z")) {
                playerTwoTotal += 6;
            }
        }
        return String.valueOf(playerTwoTotal);
    }

    @Override
    public String part2(List<String> input) {
        return "";
    }
}
