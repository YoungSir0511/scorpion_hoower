package pro.house;

public class Main {


    public static void main(String[] args) {
        // so now we have the main class too
        //the main class what start when u run a program, game ...etc
        // so now we told what a house a door etc but we havent created one yet

        //to create a NEW object u have to use the new keyword
        House stivenHouse = new House();
        //so now we created your house :)
        House johnHouse = new House();
        // so we tell that we want an object with the type House first
        //then we tell how we want to call that object
        // with the = equal sign we can assign a value to that aboject
        // new House() is called the constructor. its create the object four you its inside ur class but hidden if u
        //just want to use the basic wan then its okay later we will create one


        // now the house havent got any other object so we want to get in so we may want to create a door
        //as u remember we created the setters for the house so we can set the object there
        Door frontDoor = new Door();
        //we can do the same with door because we have other properties there
        frontDoor.setColor("BROWN");
        frontDoor.setHeight(200);
        frontDoor.setWidth(90);

        stivenHouse.setDoor(frontDoor);

     //   now your turn
        Window frontWindow = new Window();
        frontWindow.setColor("white");
        frontWindow.setHeight(80);
        frontWindow.setWeidth(80);

        johnHouse.setWindow(frontWindow);


        // :) u get it i like it
        //see that why i like clean code because this way its just like simple writing and reading and understanding
        //yeeeeyyyyy.
        // i know its a kind of booring example but if u understand that u can create an object inside an object inside an object ... then its great
        //a lot of people have problem to understand this part
        // to be honest i will have to do series of practice on this again tomorrow but i am sure that i will try my best
        //if i have any issue, you got me hehe..... :)
        // i give u some homework then :) ju
        //just create 3 other obejct with sub objects in different packages



    }



}
