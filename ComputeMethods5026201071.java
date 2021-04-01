import java.util.Random;

public class ComputeMethods5026201071 {

    public double fToC(double degreesF) {
        return 5.0/9 * (degreesF-32);
    }

    public double hypotenuse(int a, int b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

    public int roll() {
        Random randomDice = new Random();
        return randomDice.nextInt(11)+2;
    }
}