import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable member : herd) {
            member.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder herdMember = new StringBuilder();
        for (Movable animal : herd) {
            herdMember.append(animal.toString()).append("\n");
        }
        return herdMember.toString();
    }
}
