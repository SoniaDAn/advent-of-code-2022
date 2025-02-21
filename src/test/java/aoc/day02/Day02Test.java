package aoc.day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Day02Test {

    @Test
    public void part1_scoreTwoIfRockChosenByBothPlayers() {
        // Given
        String line = "A X";

        // When
        String result = new Day02().part1(List.of(line));

        // Then
        assertThat(result).isEqualTo("4");
    }

    @Test
    public void part1_scoreTwoIfPlayerTwoRockPlayerOnePaper() {
        // Given
        String line = "B X";

        // When
        String result = new Day02().part1(List.of(line));

        // Then
        assertThat(result).isEqualTo("1");
    }

    @Test
    public void part1_scoreSevenIfPlayerTwoRockPlayerOneScissors() {
        // Given
        String line = "C X";

        // When
        String result = new Day02().part1(List.of(line));

        // Then
        assertThat(result).isEqualTo("7");
    }


    @Test
    void part2_scoreThreeIfPlayerTwoLosesPlayerOneRock() {
            // Given
            String line = "A X";

            // When
            String result = new Day02().part2(List.of(line));

            // Then
            assertThat(result).isEqualTo("3");
    }
}
