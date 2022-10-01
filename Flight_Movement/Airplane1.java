package Flight_Movement;
/**
 * class: Airplane1
 * written by: Muketoi Celestino
 * date: September 30, 2022
 * version: 1.2
 *
 * Description: this Airplane class type extends the Movement Interface and has two attributes.
 *              attribute/data part:
 *                  model
 *                  year Built
 *
 *           constructors
 *              (1) constructor that takes in all attributes
 *
 *           methods
 *              getters, setters, toString, fly() method, walk() method, jump() method
 *                  - toString method to display information about the Airplane  in a nice format.
 *                  - fly method which implements Flight Interface and shows how the Object flies.
 *                  - walk method which implements Movement Interface and shows how the Object walks.
 *                  - jump method which implements Movement Interface and shows how the Object jumps.
 *
 */
public class Airplane1 implements Movement {

    // Attributes
    private String model;
    private int yearBuilt;

    // Constructor
    public Airplane1(String model, int yearBuilt){
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    // Getters and Setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    // Implementation of fly method from Flight Interface
    @Override
    public void fly() {
        System.out.print("I rely on an engine to fly.\n");
    }

    // Implementation of walk method from Movement Interface
    @Override
    public void walk(){
        System.out.println("I tax on my wheels.");
    }

    // Implementation of jump method from Movement Interface
    @Override
    public void jump(){
        System.out.println("I cannot jump.");
    }

    // toString() Method
    @Override
    public String toString(){
        return "Airplane [Model = " + model + ", Year Built = " + yearBuilt + "] : " ;
    }
}
