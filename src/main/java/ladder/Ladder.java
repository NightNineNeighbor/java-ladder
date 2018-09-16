package ladder;

import java.util.ArrayList;

public class Ladder {
    private ArrayList<Line> ladder;

    public Ladder(int ladderHeight, int countOfFoothold) {
        ladder = new ArrayList<>();
        for (int i = 0; i < ladderHeight; i++) {
            ladder.add(new Line(countOfFoothold));
        }
    }

    public String stringifyLadder(){
        StringBuilder sb = new StringBuilder();
        for (Line l : ladder) {
            l.stringifyLine(sb);
        }
        return sb.toString();
    }
}
