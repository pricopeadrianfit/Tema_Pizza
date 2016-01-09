/**
 * Created by ADI on 1/8/2016.
 */
import java.util.Scanner;
class PizzaSlice {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int guests,sliceperone,sliceperpizza, pizzas;
        int leftovers;
        System.out.print
                ("How many guests?");
        guests = keyboard.nextInt();

        System.out.print
                ("How many pizzas?");
        pizzas = keyboard.nextInt();

        System.out.print
                ("How many slice per one pizza?");
        sliceperpizza = keyboard.nextInt();

        sliceperone = (pizzas * sliceperpizza) / guests;
        leftovers = (sliceperpizza * pizzas)-(guests * sliceperone);

        System.out.print("Each guest gets ");
        System.out.print(sliceperone);
        System.out.println(" slices.");
        System.out.print("You will be left with  " + leftovers + "  slices of pizza.");
        keyboard.close();
    }
}