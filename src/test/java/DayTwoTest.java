import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class DayTwoTest {

    @Test
    public void getResultOfPartOne_return0_containsNoLettersThatAppearExactlyTwoOrThreeTimes() {
        //arrange
        int expectedResult = 0;

        List<String> input = new ArrayList<>(Arrays.asList("abcdef", "cabdeeeef"));

        DayTwo dayTwo = new DayTwo("/home/andi/IdeaProjects/AdventOfCode2018/src/main/resources/fileDayTwo.txt");
        dayTwo.setLines(input);

        //act
        int actualResult = Integer.parseInt(dayTwo.getResult().getSolutionOfA());


        //assert
        assertThat("should return 0 for list without strings that appear exactly two or three times", actualResult,
                CoreMatchers.equalTo(expectedResult));
    }

    @Test
    public void getResultOfPartOne_return12_contains4LettersAppearingTwiceThreeContainALetterAppearingThreeTimes() {
        //arrange
        int expectedResult = 12;

        List<String> input = new ArrayList<>(Arrays.asList("abcdef", "bababc", "abbcde", "abcccd", "aabcdd",
                "abcdee", "ababab"));

        DayTwo dayTwo = new DayTwo("/home/andi/IdeaProjects/AdventOfCode2018/src/main/resources/fileDayTwo.txt");
        dayTwo.setLines(input);

        //act
        int actualResult = Integer.parseInt(dayTwo.getResult().getSolutionOfA());

        //assert
        assertThat("should return 12 for list which contains 4 Letters appearing twice " +
                        "three contain a letter appearing three times",
                actualResult,
                CoreMatchers.equalTo(expectedResult));
    }
}
