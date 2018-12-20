import java.util.HashMap;
import java.util.Map;

public class DayTwo extends Puzzle {

    public DayTwo(String fileLocation) {
        super(fileLocation);
    }


    @Override
    protected int getResultOfPartOne() {
        int numberOfCharsAppearingTwice = 0;
        int numberOfCharsAppearingThreeTimes = 0;

        for (String line : getLines()) {
            boolean foundAlreadyANumberThatAppearedTwice = false;
            boolean foundAlreadyANumberThatAppearedThreeTimes = false;

            HashMap<Character, Integer> differentLettersInLine = new HashMap<>();
            for (int i = 0; i < line.length(); i++) {
                char currentCharacter = line.charAt(i);
                if (differentLettersInLine.containsKey(currentCharacter)) {
                    differentLettersInLine.put(currentCharacter, differentLettersInLine.get(currentCharacter) + 1);
                } else {
                    differentLettersInLine.put(currentCharacter, 1);
                }
            }

            for (Map.Entry<Character, Integer> letterThatAppearedInLine : differentLettersInLine.entrySet()) {
                if ((int) ((Map.Entry) letterThatAppearedInLine).getValue() == 2 && !foundAlreadyANumberThatAppearedTwice) {
                    numberOfCharsAppearingTwice++;
                    foundAlreadyANumberThatAppearedTwice = true;
                } else if ((int) ((Map.Entry) letterThatAppearedInLine).getValue() == 3 && !foundAlreadyANumberThatAppearedThreeTimes) {
                    numberOfCharsAppearingThreeTimes++;
                    foundAlreadyANumberThatAppearedThreeTimes = true;
                }
            }

        }
        return numberOfCharsAppearingTwice * numberOfCharsAppearingThreeTimes;
    }

    @Override
    protected int getResultOfPartTwo() {
        return 0;
    }
}
