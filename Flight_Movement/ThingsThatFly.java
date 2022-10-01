package Flight_Movement;

/**
 * class: ThingsThatFly
 * written by: Muketoi Celestino
 * date: September 30, 2022
 * version: 1.2
 *
 * Description: this class is the Flight Interface/Classes application Program.
 *              It creates an array of the things That Fly called (tTFly) and iterates through them
 *              printing out their details and methods
 */
public class ThingsThatFly {
    public static void main(String[] args) {
        Object[] tTFly = new Object[3]; // Creates an array of Objects called "tTFly" - Things That fly

        // Adding Objects to the array "tTFly"
        tTFly[0] = new Airplane("Boeing 747", 2016);        // Creates new Airplane
        tTFly[1] = new Bird("Eagle");                                // Creates new Bird
        tTFly[2] = new Bird("HummingBird");                         // Creates new Bird

        // Iterating through the array "tTFly"
        for(Object t: tTFly){                       // For each Object "t" in the array "tTFly":
            System.out.print(t.toString());         // Print out t's toString method Showing the Object's details
            ((Flight)t).fly();                      // Down casting of t to allow the Object to access the fly() method from the Flight Interface
        }

    }
}
