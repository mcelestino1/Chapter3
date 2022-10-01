package Flight_Movement;
/**
 * class: Bird
 * written by: Muketoi Celestino
 * date: September 30, 2022
 * version: 1.2
 *
 * Description: this Bird class extends the Flight Interface and has one attribute.
 *              attribute/data part:
 *                  type of Bird
 *
 *           constructors
 *              (1) constructor that takes in all attributes
 *
 *           methods
 *              getter, setter, toString, fly method
 *                  - toString method to display information about the Bird  in a nice format.
 *                  - fly method which implements Flight Interface  and shows how the Object flies.
 *
 */
public class Bird implements Flight{

    // Attributes
    private String type;

    //Constructor
    public Bird(String type){
        this.type = type;
    }

    // Getter and Setter
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Implementation of fly method from Flight Interface
    @Override
    public void fly(){
        System.out.print("I'm a bird who flaps my wings to fly.\n");
    }

    // toString() Method
    @Override
    public String toString(){
        return "Bird [Type = " + type + "] : ";
    }
}
