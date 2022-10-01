package Flight_Movement;
/**
 * class: Bird1
 * written by: Muketoi Celestino
 * date: September 30, 2022
 * version: 1.2
 *
 * Description: this Bird class type extends the Movement Interface and has one attribute.
 *              attribute/data part:
 *                  type of Bird
 *
 *           constructors
 *              (1) constructor that takes in all attributes
 *
 *           methods
 *              getters, setters, toString, fly method
 *                  - toString method to display information about the Bird  in a nice format.
 *                  - fly method which implements Flight Interface and shows how the Object flies.
 *                  - walk method which implements Movement Interface and shows how the Object walks.
 *                  - jump method which implements Movement Interface and shows how the Object jumps.
 *
 */
public class Bird1 implements Movement{
    // Attributes
    private String type;

    public Bird1(String type){
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
        System.out.print("I flap my wings to fly.\n");
    }

    // Implementation of walk method from Movement Interface
    @Override
    public void walk(){
        System.out.println("I walk on my feet.");
    }

    // Implementation of jump method from Movement Interface
    @Override
    public void jump(){
        System.out.println("I jump by leaping on my feet.");
    }

    // toString() Method
    @Override
    public String toString(){
        return "Bird [Type = " + type + "] : ";
    }
}
