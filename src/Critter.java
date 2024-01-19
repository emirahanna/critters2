import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** A simulated critter. */
public abstract class Critter implements Comparable<Critter> {
    private int position;
    private ArrayList<String> history;

    // default ctor (constructor)
    public Critter() {
        this.position = 0;
        this.history = new ArrayList<>();
    }

    private void setPos(int x) {
        this.position = x;
    }

    /** Returns the history of activity for this critter. */
    public List<String> getHistory() {
        return history;
    }

    public int getPosition() {
        return position;
    }

    public void addHistory(String event) {
        history.add(event);
    }

    public void move(int numSteps) {
        position = position + numSteps;
        addHistory("move to " + position);
    }

    // critters are naturally ordered according to their position
    @Override public int compareTo(Critter o) {
        /*if (this.position < o.position) {
            return -1;
        } else if (this.position > o.position) {
            return 1;
        } else {
            return 0;
        }*/
        // can also just write:
        return this.position - o.position;
    }

    public abstract void act();

    @Override public String toString() {
        return String.format("%s (pos: %d)",
                getClass().getSimpleName(), getPosition());
    }

   public static void main(String[] args) {

       Critter c1 = new ForgetfulCritter();
       c1.setPos(20);
       Critter c2 = new AnxiousCritter();
       c2.setPos(1);
       Critter c3 = new FastCritter();
       c3.setPos(8);
       Critter c4 = new SlothCritter();
       c4.setPos(3);

      ArrayList<Critter> critters = new ArrayList<>();
      critters.add(c1);
      critters.add(c2);
      critters.add(c3);
      critters.add(c4);

      System.out.println("before sorting: ");
      for (Critter c : critters) {
          System.out.println(c);
      }

      Collections.sort(critters);
      System.out.println("----");
      System.out.println("after sorting: ");

      for (Critter c : critters) {
          System.out.println(c);
      }
   }

}