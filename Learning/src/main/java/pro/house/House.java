package pro.house;

public class House {
    /*
    so the house is created now but its tooooootal empty
    so we need to describe the objects that its going to contain first like the door
    pls create a door object like i created the house object
     */

    //coool :) so the door now exist in our codebase we can add it to the house object

    //so the private word means that you cannot acess this object itself outside from this class
    // Door its the type itself
    //door is the name of the object and we can use this during programming
    private Door door;


    //now pls add a new object to the house like Window
    private Window window;
    // sorry for interuptin you
   // as u can see on the side now the windows class have an arrow becauzse the class name and the filename have to be the same
    // thats why u cant find it now in the dropdown list because its different
    //okay now its working
    //THANKS...


    //cooooooooooooooooooooooooooooooooooooooool :D
    //One big mistake if u create an obejct you should start its name with CapitalLetter also in this ide u just cant simply rename it u have to refactor it
    // so right click on the window class Refactor->rename


    public Door getDoor() {
        return door;
    }

    public Window getWindow() {
        return window;
    }


    public void setDoor(Door door) {
        this.door = door;
    }

    public void setWindow(Window window) {
        this.window = window;
    }
}
