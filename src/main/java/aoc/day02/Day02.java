package aoc.day02;

import aoc.Day;

import java.util.List;

public class Day02 extends Day {

    static {currentDay = new Day02();}

    @Override
    public String part1(List<String> input) {
        int playerTwoTotal = 0;
        for (String value : input) {
            switch (value) {
                case "A X" -> playerTwoTotal +=
                    4;
                case "B X" -> playerTwoTotal +=
                    1;
                case "C X" -> playerTwoTotal +=
                    7;
                case "A Y" -> playerTwoTotal +=
                    8;
                case "B Y" -> playerTwoTotal +=
                    5;
                case "C Y" -> playerTwoTotal +=
                    2;
                case "A Z" -> playerTwoTotal +=
                    3;
                case "B Z" -> playerTwoTotal +=
                    9;
                case "C Z" -> playerTwoTotal +=
                    6;
            }
        }
        return String.valueOf(playerTwoTotal);
    }

    @Override
    public String part2(List<String> input) {
        int playerTwoTotal = 0;
        for (String value : input) {
            switch (value) {
                case "A X" -> playerTwoTotal +=
                    3;
                case "B X" -> playerTwoTotal +=
                    1;
                case "C X" -> playerTwoTotal +=
                    2;
                case "A Y" -> playerTwoTotal +=
                    4;
                case "B Y" -> playerTwoTotal +=
                    5;
                case "C Y" -> playerTwoTotal +=
                    6;
                case "A Z" -> playerTwoTotal +=
                    8;
                case "B Z" -> playerTwoTotal +=
                    9;
                case "C Z" -> playerTwoTotal +=
                    7;
            }
        }
        return String.valueOf(playerTwoTotal);
    }
}
