import java.util.HashSet;
import java.util.List;

public class DayOne extends Puzzle{

    public DayOne (String fileLocation) {
        super(fileLocation);
    }

    public int getResultOfPartOne() {
        return sumUpElementsOfList(getLines());
    }

    public int getResultOfPartTwo() {
        HashSet<Integer> reachedFrequencies = new HashSet<>();

        int result = 0;
        while (true) {
            for (String line : getLines()) {
                result += Integer.parseInt(line);
                if (!reachedFrequencies.add(result)) {
                    return result;
                }
            }
        }
    }

    private int sumUpElementsOfList(List<String> lines) {
        int result = 0;
        for (String line : lines) {
            result += Integer.parseInt(line);
        }
        return result;
    }


}