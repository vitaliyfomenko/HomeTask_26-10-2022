package net.absoft.mortalcombat;

public class AgeChecker {
    private final int MIN_AGE = 21;

    public boolean canPlayGame(int age) {
        return age >= MIN_AGE;
    }
    public boolean cannotPlayGame(int trueAge){
        return trueAge < MIN_AGE;
    }
}
