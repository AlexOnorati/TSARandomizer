package net.greenriver.ontopgames.tsarandomizer;

import java.util.Random;

/**
 * Created by alexo on 4/11/2016.
 */
public class Randomizer {

    public static int LEFT_ARROW = 5;

    private Random randDirection;

    public Randomizer(){
        randDirection = new Random();
    }

    public int GetRandomDirection(){
        return randDirection.nextInt(10) + 1;
    }


}