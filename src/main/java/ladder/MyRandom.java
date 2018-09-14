package ladder;

import java.util.Random;

public class MyRandom {
    private static Random rnd = new Random();

    public static boolean get(){
        return rnd.nextInt(10) > 4;
    }
}
