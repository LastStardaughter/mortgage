package mortgage;

import java.util.Scanner;

public class Console {
    //There must be a way to combine these methods, but templates don't work on primitives... will look into it later
    public static int queryInt(String message, int lower, int upper, String error){
        //Can I safely make scanner a shared field in console? Things to check later.
        Scanner scanner = new Scanner(System.in);
        int input;
        //I originally used while input==0, but this is more flexible, allowing 0 to be valid.
        while(true) {
            System.out.print(message);
            try {
                input = Integer.parseInt(scanner.nextLine());
                if (input>=lower && input <= upper){
                    return input;
                }
            } catch(Error e) {
            }
            System.out.println(error);
        }
    }

    //Might want to have this take doubles for the bounds instead so the call doesn't need the fs appended.
    public static float queryFloat(String message, float lower, float upper, String error){
        Scanner scanner = new Scanner(System.in);
        float input;
        while(true) {
            System.out.print(message);
            try {
                input = Float.parseFloat(scanner.nextLine());
                if (input>=lower && input <= upper){
                    return input;
                }
            } catch(Error e) {
            }
            System.out.println(error);
        }
    }
}
