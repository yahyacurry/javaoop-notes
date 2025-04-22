package Lamp;

import java.util.Scanner;
//Problem: Create a Lamp class with methods
// to turn it ON and OFF. Also add a display
// method to show whether the lamp is on or off.
// Demonstrate via main method to create an object
// of Lamp class, turn it on and off and display
// the state on every on and off change.
public class Lamp {
    Scanner scanner = new Scanner(System.in);
String lamp = "lamp is off";
    public  Lamp(String lamp){
        this.lamp = lamp;
    }
    public String ask(){
        System.out.println("Would you like to turn on the lamp?");
        String input = scanner.nextLine();
        if (input.equals("Yes") || input.equals("yes")){
            lamp = "lamp is on";
        }
        else{
            lamp = "lamp is off";
        }

        return lamp;
    }

    public static void main(String[] args) {
        String lamp = "";
        Lamp obj1 = new Lamp(lamp);
        System.out.println(obj1.ask());
    }
}
