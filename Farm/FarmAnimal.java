package Farm;
/**
 * Package: Farm
 * class: FarmAnimal
 * written by: Muketoi Celestino
 * date: September 30, 2022
 * version: 1.2
 *
 * Description: this FarmAnimal abstract class has four attributes
 *              attribute/data part:
 *                  name of Animal
 *                  Gender of Animal
 *                  Weight of Animal.
 *                  Animal's age
 *
 *           constructors
 *              (1) constructor takes all attributes
 *
 *           methods
 *              getters, setters, toString, abstract method
 *                  - toString method to display information about the Farm Animal  in a nice format.
 *                  - abstract method (feedLoadSchedule) that does not have any parameters and returns a string. It returns the time(s) to load feeds each day
 *
 */

public abstract class FarmAnimal {
    // Attributes
    private String name;
    private String gender;
    private double weight;
    private int age;

    // Constructor
    public FarmAnimal(String name, String gender, double weight, int age){
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    // Getters and Setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight){
        this.weight= weight;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    // toString Method
    @Override
        public String toString(){
        return "Animal name: " + name + "\nGender: " + gender + "\nWeight: " + weight + "\nAge: " + age;
    }

    // feedLoadingSchedule method
    public abstract String feedLoadingSchedule();
}
