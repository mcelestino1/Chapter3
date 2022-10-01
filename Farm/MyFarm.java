package Farm;
/**
 * Package: Farm
 * class: MyFarm
 * written by: Muketoi Celestino
 * date: September 30, 2022
 * version: 1.2
 *
 * Description: this class is the Farm Package's application Program.
 *              It creates an array of the farm animal objects and iterates through them
 *              printing out their details and feed loading schedules.
 */

public class MyFarm {
    public static void main(String[] args) {
        FarmAnimal[] animals = new FarmAnimal[6];                   // Creates a new array "animals" with 6 FarmAnimal Objects

        // Adding animals to the array "animals"
        animals[0] = new Duck("Donald", "Male", 3.2, 5);
        animals[1] = new Duck("Cheese", "Female", 3.6, 5);
        animals[2] = new Cow("Molly", "Female", 1600.0, 3);
        animals[3] = new Chicken("Albert", "Male", 1.6, 2);
        animals[4] = new Chicken("Amelia", "Female", 1.8, 4);
        animals[5] = new Chicken("Dixie", "Female", 1.7, 4);

        // Iterates through the array "animals" printing out each animal's details
        for (FarmAnimal a: animals){
            System.out.println(a);
        }

        // Iterates through the array "animals' printing out each animal's feed Loading schedule
        for (FarmAnimal a: animals){
            System.out.println(a.feedLoadingSchedule());
        }
    }
}
