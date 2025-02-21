package aoc.day03;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class Day03Test {

    @Test
    void part1() {
    }

    @Test
    void firstHalf_returnsFirstHalfOfString() {
        // Given
        String line = "vJrwpWtwJgWrhcsFMMfFFhFp";

        // When
        String result = new Day03().firstHalf(line);

        // Then
        assertThat(result).isEqualTo("vJrwpWtwJgWr");
    }

    @Test
    void secondHalf_returnsSecondHalfOfString() {
        // Given
        String line = "vJrwpWtwJgWrhcsFMMfFFhFp";

        // When
        String result = new Day03().secondHalf(line);

        // Then
        assertThat(result).isEqualTo("hcsFMMfFFhFp");
    }


    /*@Test
    void part1_output16WhenLowerCasePPresentTwice() {
        // Given
        String line = "vJrwpWtwJgWrhcsFMMfFFhFp";

        // When
        String result = new Day03().part1(List.of(line));

        // Then
        assertThat(result).isEqualTo("16");
    }*/

    @Test
    void part2() {
    }
}
