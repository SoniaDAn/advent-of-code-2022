package aoc.day03;

import aoc.day02.Day02;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Day03Test {

    @Test
    void part1() {
    }

    @Test
    void splitStringInHalf_dividesStringInTwo() {
        // Given
        String line = "vJrwpWtwJgWrhcsFMMfFFhFp";

        // When
        String result = new Day03().firstHalfofString(line);

        // Then
        assertThat(result).isEqualTo("vJrwpWtwJgWr");


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
