public class TripleTacoBox implements TacoBox {

    private int tacos;

    public TripleTacoBox() {
        tacos = 3;
    }

    @Override
    public void eat() {
        if (tacos > 0) {
            tacos--;
        }
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }
}
