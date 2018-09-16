package ladder;

import java.util.ArrayList;

public class OutputView {
    private final static String FORMAT = "%-6s";
    private Ladder ladder;
    private ArrayList<String> peopleName;

    public OutputView(Ladder ladder, ArrayList<String> peopleName) {
        this.ladder = ladder;
        this.peopleName = peopleName;
    }

    public void print() {
        printPeopleName();
        printLadder();
    }

    private void printPeopleName() {
        StringBuilder sb = new StringBuilder();
        for (String name : peopleName) {
            sb.append(String.format(FORMAT, name));
        }
        System.out.println(sb.toString());
    }

    private void printLadder() {
        System.out.println(ladder.stringifyLadder());
    }
}