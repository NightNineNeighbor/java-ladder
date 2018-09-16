package ladder;

import java.util.ArrayList;

public class Line {
    private static final String VERTICAL_BAR = "|";
    private static final String HORIZONTAL_BAR = "-----";
    private static final String BLANK = "     ";
    private ArrayList<Boolean> points;

    public Line(int countOfFoothold) {
        points = new ArrayList<>();
        points.add(MyRandom.get());
        for (int i = 1; i < countOfFoothold; i++) {
            boolean prevFoothold = points.get(i - 1);
            points.add(!prevFoothold && MyRandom.get());
        }
    }

    public void stringifyLine(StringBuilder sb) {
        sb.append((VERTICAL_BAR));
        for (Boolean point : points) {
            sb.append(point ? HORIZONTAL_BAR : BLANK);
            sb.append((VERTICAL_BAR));
        }
        sb.append(System.lineSeparator());
    }
}

