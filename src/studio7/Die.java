package studio7;

import java.util.Random;

public class Die {
    private int sides;
    private Random random;

    public Die(int sides) {
        if (sides < 1) {
            throw new IllegalArgumentException("A die must have at least one side");
        }
        this.sides = sides;
        this.random = new Random();
    }

    public int roll() {
        return random.nextInt(sides) + 1;
    }

    public String toString() {
        return "Die [sides=" + sides + "]";
    }

    public static void main(String[] args) {
        Die sixSidedDie = new Die(6);
        System.out.println(sixSidedDie);
        System.out.println("Rolling the die: " + sixSidedDie.roll());
    }
}
