import org.hyperskill.hstest.testcase.CheckResult;
import org.hyperskill.hstest.stage.StageTest;
import org.hyperskill.hstest.testcase.TestCase;

import java.util.List;


public class Tests extends StageTest {

    @Override
    public List<TestCase> generate() {
        return List.of(
            new TestCase<>()
        );
    }

    @Override
    public CheckResult check(String reply, Object clue) {

        String[] lines = reply.trim().split("\n");

        if (lines.length != 2) {
            return CheckResult.wrong(
                "You should output exactly 2 lines!\n" +
                    "Lines found: " + lines.length
            );
        }

        String secondLine = lines[1];

        if (!secondLine.matches(".*\\d.*")) {
            return CheckResult.wrong(
                "The second line should contain a year!\n" +
                    "Your second line: \"" + secondLine + "\""
            );
        }

        return CheckResult.correct();
    }
}
