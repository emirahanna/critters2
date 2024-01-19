// TODO: define fast critter here
public class FastCritter extends Critter {
    public void act() {
        if (getHistory().size() > 2) {
            addHistory("resting...");
        }
    }

    @Override
    public void move(int numSteps) {
        super.move(numSteps * 2);
    }

    // some simulation testing code
    public static void main(String[] args) {
        Critter speedy = new FastCritter();
        speedy.move(10);
        System.out.println(speedy.getHistory());
        System.out.println("Expected: [move to 20]");
        speedy.move(-1);
        System.out.println(speedy.getHistory());
        System.out.println("Expected: [move to 20, move to 18]");
        speedy.move(4);
        speedy.act();
        System.out.println(speedy.getHistory());
        System.out.println("Expected: [move to 20, move to 18, move to 26, resting...]");
    }
}
