// todo: define class here (make it extend Critter)
public class AnxiousCritter extends Critter{

    @Override
    public void act() {
        if (super.getPosition() == 0){
            super.move(1);
        }
        else{
            super.move(-1);
        }
    }

   // Some simulation testing code (uncomment when ready to see if it works)
   public static void main(String[] args) {
      Critter critter1 = new AnxiousCritter();
      critter1.act();
      System.out.println(critter1.getHistory());
      System.out.println("Expected: [move to 1]");
      critter1.act();
      System.out.println(critter1.getHistory());
      System.out.println("Expected: [move to 1, move to 0]");
      critter1.act();
      System.out.println(critter1.getHistory());
      System.out.println("Expected: [move to 1, move to 0, move to 1]");
      critter1.act();
      System.out.println(critter1.getHistory());
      System.out.println("Expected: [move to 1, move to 0, move to 1, move to 0]");
   }
}
