package pro.house;

public class Door {
// lets do some work here too
    //lets state that the door have only a few properties that we have to deal with like color width and length
    //if u want to add some property with tis u have to use the simple classes like for numbers int and for text String

    private int height;

    private int width;

    private String color;

    //lets do the same with the windows

// as u can see u just generated the getter method so u can acess the properties but u can never set them :) yes
    //generate the setter too ok
//great :) do the house :D

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }
}
