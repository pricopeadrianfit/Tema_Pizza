/**
 * Created by ADI on 1/8/2016.
 */
/*import java.util.Scanner;
class BMICalculator {

    private BMI(int BMIresult){
    int weight;
    double height,BMInumber;
    Scanner keyboard = new Scanner(System.in);


    System.out.print("How tall you are? (meters)");
    height = keyboard.nextDouble();

    System.out.print("What is your weight? (kilograms)");
    weight = keyboard.nextInt();
    {
        BMInumber = weight / (height * height);
        if (BMInumber < 18.5) {
            BMIresult = 1;
        } else if (BMInumber >= 18.5 || BMInumber <= 24.9){
                BMIresult = 2;
                 }else if (BMInumber >= 25 || BMInumber <= 29.9) {
                      BMIresult = 3;
                      }
                     else
                        BMIresult = 4;
        }
return BMIresult;
    }

    public static void main(String args[]) {
        char BMIresult = 1;
       new BMICalculator();
switch (BMIresult){
    case 1:
        System.out.println("You are underweight! Go home and eat!");
        break;
    case 2:
        System.out.println("You have a normal weight. ");
        break;
    case 3:
        System.out.println("You are overweight! Go to the gym!");
        break;
    case 4:
        System.out.println("You are obese! Go to the Doctor!");
        break;
    default:
        System.out.println("Sorry,I just can't decide ");
    break;
        }
    }
}*/
import java.util.Scanner;
class BMI {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int weight;
        double height, BMInumber;

        System.out.print("How tall you are? (meters)");
        height = keyboard.nextDouble();

        System.out.print("What is your weight? (kilograms)");
        weight = keyboard.nextInt();
        {
            BMInumber = weight / (height * height);

            if (BMInumber < 18.5) {
                System.out.println("BMI= " + BMInumber + "  You are underweight! Go home and eat!");
            }
            else if (BMInumber >= 18.5 && BMInumber <= 24.9) {
                System.out.println("BMI= "+ BMInumber + "  You have a normal weight. ");
                } else if (BMInumber >= 25 && BMInumber <= 29.9) {
                     System.out.println("BMI= "+ BMInumber + "  You are overweight! Go to the gym!");
                    } else System.out.println("BMI= "+ BMInumber + "  You are obese! Go to the nutritionist!");
        }
    }
}
