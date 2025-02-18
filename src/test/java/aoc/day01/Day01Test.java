package aoc.day01;


import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class Day01Test {

    @Test
    public void testPart2(){
        // Given
        List<String> input = Collections.singletonList("test");

        // When
        String result = new Day01().part2(input);

        // Then
        assertThat(result).isEqualTo(input.get(0));
    }

    @Test
    public void convertsToInt_convertsStringToInteger() {
        // Given
        String line = "1234";

        // When
        int result = new Day01().convertsToInt(line);

        // Then
        assertThat(result).isEqualTo(1234);
    }

    @Test
    public void part1_addsTwoNumbers() {
        // Given
        String line1 = "20";
        String line2 = "10";

        // When
        String result = new Day01().part1(List.of(line1, line2));

        // Then
        assertThat(result).isEqualTo("30");
    }

}
