package Flight_Movement;
/**
 * Interface: Movement
 * written by: Muketoi Celestino
 * date: September 30, 2022
 * version: 1.2
 *
 * Description: this Movement Interface extends the Flight Interface and has two attributes.
 *              attribute/data part:
 *                  void method fly() that takes no parameters.
 *                  void method jump() that takes no parameters.
 */
public interface Movement extends Flight {
    void walk();
    void jump();
}
