/** A sloth eats and sleeps. */
public class SlothCritter extends Critter // TODO: your code goes here
{
   // TODO: your code goes here
   private String currentActivity;

   public SlothCritter()
   {
      // TODO: your code goes here
      this.currentActivity = "eat";

   }
   // TODO: your code goes here (override the act() method)
   public void act(){
      addHistory(currentActivity);
      String lastElement = getHistory().get(getHistory().size() - 1);
      if (lastElement.equals("eat")){
         currentActivity = "sleep";
      }
      else{
         currentActivity = "eat";
      }
   }

   @Override
   public String toString() {
      return getClass().getSimpleName() + " (pos: " + getPosition() + ")";
   }

   // simulation testing code for the sloth, uncomment when ready to test

    public static void main(String[] args) {
        Critter sloth = new SlothCritter();
        sloth.act();
        System.out.println(sloth.getHistory());
        System.out.println("Expected: [eat]");
        sloth.act();
        System.out.println(sloth.getHistory());
        System.out.println("Expected: [eat, sleep]");
        sloth.act();
        System.out.println(sloth.getHistory());
        System.out.println("Expected: [eat, sleep, eat]");
        sloth.act();
        System.out.println(sloth.getHistory());
        System.out.println("Expected: [eat, sleep, eat, sleep]");
    }
}