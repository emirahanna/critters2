// TODO: define forgetful critter subclass here
public class ForgetfulCritter extends Critter {
    public void act() {
        move(10);
    }
    @Override
    public void addHistory(String event) {
        super.addHistory("?");
    }

// some simulation testing code for the forgetful critter (uncomment when ready to test)

    public static void main(String[] args) {
        Critter dopey = new ForgetfulCritter();
        dopey.addHistory("eat");
        System.out.println(dopey.getHistory());
        System.out.println("Expected: [?]");
        dopey.act();
        System.out.println(dopey.getHistory());
        System.out.println("Expected: [?, ?]");
        dopey.move(30);
        System.out.println(dopey.getHistory());
        System.out.println("Expected: [?, ?, ?]");
    }
}