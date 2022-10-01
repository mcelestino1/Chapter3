package Flight_Movement;
/**
 * class: Airplane
 * written by: Muketoi Celestino
 * date: September 30, 2022
 * version: 1.2
 *
 * Description: this Airplane class extends the Flight Interface and has two attributes.
 *              attribute/data part:
 *                  model
 *                  year Built
 *
 *           constructors
 *              (1) constructor that takes in all attributes
 *
 *           methods
 *              getters, setters, toString, fly method
 *                  - toString method to display information about the Airplane  in a nice format.
 *                  - fly method which implements Flight Interface and shows how the Object flies.
 *
 */
public class Airplane implements Flight {
    // Attributes
    private String model;
    private int yearBuilt;

    // Constructor
    public Airplane(String model, int yearBuilt){
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
        System.out.print("I'm an Airplane that relies on an engine to fly.\n");
    }

    // toString() Method
    @Override
    public String toString(){
        return "Airplane [Model = " + model + ", Year Built = " + yearBuilt + "] : " ;
    }
}
