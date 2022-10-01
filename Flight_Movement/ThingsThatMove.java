package Flight_Movement;
/**
 * class: ThingsThatMove
 * written by: Muketoi Celestino
 * date: September 30, 2022
 * version: 1.2
 *
 * Description: this class is the Movement Interface/Classes application Program.
 *              It creates an array of the things That Move called (tTMove) and iterates through them
 *              printing out their details and methods.
 */
public class ThingsThatMove {
    public static void main(String[] args) {
        Object[] tTMove = new Object[3];            // Creates an array of Objects called "tTMove" - Things That Move

        // Adding Objects to the array "tTMove"
        tTMove[0] = new Airplane1("Boeing 747", 2016);      // Creates new Airplane
        tTMove[1] = new Bird1("Eagle");                              // Creates new Bird
        tTMove[2] = new Bird1("HummingBird");                       // Creates new Bird

        // Iterating through the array "tTMove"
        for(Object t: tTMove){                          // For each Object "t" in the array "tTMove":
            System.out.println(t.toString());           // Print out t's toString method Showing the Object's details
            ((Flight)t).fly();                          // Down casting of t to allow the Object to access the fly() method from the Flight Interface
            ((Movement)t).walk();                       // Down casting of t to allow the Object to access the walk() method from the Movement Interface
            ((Movement)t).jump();                       // Down casting of t to allow the Object to access the jump() method from the Movement Interface

            System.out.println();           // Just to create a space/empty line between each object's output
        }
    }
}
