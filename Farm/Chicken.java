package Farm;
/**
 * Package: Farm
 * class: Chicken
 * written by: Muketoi Celestino
 * date: September 30, 2022
 * version: 1.2
 *
 * Description: this Chicken class extends the FarmAnimal class and has one attribute.
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
public class Chicken extends FarmAnimal{
    private String sound;

    // Constructor
    public Chicken(String name, String gender, double weight, int age){
        super(name, gender, weight, age);
        switch (gender.toLowerCase()) {             // Switch Case that assigns a sound to the chicken based on the gender (Male or female)
            case "female":
                this.sound = "Cluck Cluck";         // Assigns "Cluck Cluck" as the sound if the chicken is female
                break;
            case "male":
                this.sound = "Cock-a-Doodle-doo";   // Assigns "Cock-a-Doodle-doo" as the sound if the chicken is Male
                break;
            default:
                this.sound = "Invalid gender input!";   // If gender is set to anything other than male or female, It will return "Invalid Gender Input!"
        }

    }

    // feedLoadingSchedule method
    @Override
    public String feedLoadingSchedule(){
        return getName() + ": 8am-4pm";
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
        return "Chicken " + sound + " [Name = " + getName() + ", Gender = " + getGender() +
                    ", Weight = " + getWeight() + ", Age = " + getAge() + "]";
    }


}

