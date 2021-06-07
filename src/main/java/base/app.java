package base;

import java.util.Scanner;

public class app {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n");



        System.out.print("Your choice:");
        String input0 = in.nextLine();

        if(input0.equalsIgnoreCase("c")){

            System.out.print("Please enter the temperature in Fahrenheit: ");
            String cfaren = in.nextLine();
            int cfar = Integer.parseInt(cfaren);

            int celsius = (cfar - 32) * 5 / 9;

            System.out.println("The temperature in Celsius is " + celsius);

        }

        if(input0.equalsIgnoreCase("f")){
            System.out.print("Please enter the temperature in Celsius: ");
            String fcelsiu = in.nextLine();
            int fcel = Integer.parseInt(fcelsiu);

            int fahrenheit = (fcel - 32) * 5 / 9;

            System.out.println("The temperature in Fahrenheit is " + fahrenheit);

        }



    }
}
