package ladder;

public class Ladder {
    private boolean[][] ladder;
    private int ladderHeight;
    private int numberOfFoothold;

    public Ladder(int ladderHeight, int numberOfFoothold) {
        ladder = new boolean[ladderHeight][numberOfFoothold];
        this.ladderHeight = ladderHeight;
        this.numberOfFoothold = numberOfFoothold;
    }

    public int getLadderHeight() {
        return ladderHeight;
    }

    public int getNumberOfFoothold() {
        return numberOfFoothold;
    }

    public boolean isFoothold(int height, int NumberOfFoothold) {
        return ladder[height][NumberOfFoothold];
    }

    public void makeLadder() {
        makeFirstLineFoothold();
        makeExtraFoothold();
    }

    private void makeFirstLineFoothold() {
        for (int i = 0; i < ladderHeight; i++) {
            ladder[i][0] = MyRandom.get();
        }
    }

    private void makeExtraFoothold() {
        for (int w = 1; w < numberOfFoothold; w++) {
            makeAFoothold(w);
        }
    }

    private void makeAFoothold(int w) {
        for (int h = 0; h < ladderHeight; h++) {
            ladder[h][w] = !ladder[h][w - 1] && MyRandom.get();
        }
    }
}
