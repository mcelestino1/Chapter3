package Farm;
/**
 * Package: Farm
 * class: Cow
 * written by: Muketoi Celestino
 * date: September 30, 2022
 * version: 1.2
 *
 * Description: this Cow class extends the FarmAnimal class and has one attribute.
 *              attribute/data part:
 *                  Sound that the animal makes
 *
 *           constructors
 *              (1) constructor that calls on the superclass
 *
 *           methods
 *              getters, setters, toString, feedLoadingSchedule method
 *                  - toString method to display information about the Farm Animal  in a nice format.
 *                  - feedLoadingSchedule method that returns the time(s) to load feeds each day
 *
 */
public class Cow extends FarmAnimal{
    private String sound;

    // Constructor
    public Cow(String name, String gender, double weight, int age) {
        super(name, gender, weight,age);
        this.sound = "Moo Moo";
    }

    // feedLoadingSchedule method
    @Override
    public String feedLoadingSchedule(){
        return getName() + ": 6am-4pm";
    }

    //Getter and Setter for Sound method()
    public void setSound(String sound){
        this.sound = sound;
    }

    public String getSound(){
        return sound;
    }

    // toString Method
    @Override
    public String toString(){
        return "Cow " + sound + " [Name = " + getName() + ", Gender = " + getGender() +
                ", Weight = " + getWeight() + ", Age = " + getAge() + "]";
    }
}
