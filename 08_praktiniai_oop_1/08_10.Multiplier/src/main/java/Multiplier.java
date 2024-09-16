public class Multiplier {
    private int factor;

    public Multiplier(int number) {
        this.factor = number;
    }

    public int multiply(int number) {
        return number *= this.factor;
    }
}
