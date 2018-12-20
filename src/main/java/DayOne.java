import java.util.HashSet;

public class DayOne extends Puzzle{

    public DayOne (String fileLocation) {
        super(fileLocation);
    }

    @Override
    protected int getResultOfPartOne() {
        return getLines().stream().mapToInt(Integer::parseInt).sum();
    }

    @Override
    protected int getResultOfPartTwo() {
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
}
