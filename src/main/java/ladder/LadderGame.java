package ladder;

import java.util.ArrayList;

public class LadderGame {
    private Ladder ladder;
    private ArrayList<String> peopleName;

    public LadderGame(ArrayList<String> peopleName, int ladderHeight) {
        this.peopleName = peopleName;
        int numberOfFoothold = peopleName.size() - 1;
        ladder = new Ladder(ladderHeight, numberOfFoothold);
    }

    public ArrayList<String> getPeopleName(){
        return this.peopleName;
    }

    public Ladder getLadder() {
        return ladder;
    }
}
