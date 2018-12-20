import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;

public class DayOne {
    private List<String> lines;

    public DayOne (String fileLocation) {
        try {
            lines = readFileToList(fileLocation);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getResultOfPartOne() {
        return sumUpElementsOfList(lines);
    }

    public int getResultOfPartTwo() {
        HashSet<Integer> reachedFrequencies = new HashSet<>();

        int result = 0;
        while (true) {
            for (String line : lines) {
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

    private List<String> readFileToList(String fileLocation) throws IOException {
        return Files.readAllLines(Paths.get(fileLocation));
    }
}
