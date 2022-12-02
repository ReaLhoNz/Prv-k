import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i;
        int z;
        int u;
        int c = 0;
        double calorie = 0;


        System.out.println("Zadejte počet elfů");
        int elves = 0;
        elves += input.nextInt();

        //Počítá clekový počet kalorii co elf nese
        ArrayList<Double> calories = new ArrayList<>(10);
        for (z = 0;z<elves;z++ ) {
            System.out.println("Zadejtep čoet jídel co elf nese");
            int numberoffood = input.nextInt();
            for (i = 1; i <= numberoffood; i++) {
                System.out.println("Add by one callories of your food");
                calorie += input.nextInt();
                System.out.println(calorie);
            }


                calories.add(z, calorie);
                calorie = 0;
        }
        Double maximum = calories.get(0);

        for (u = 1; u < calories.size(); u++) {
            if (maximum < calories.get(u)) {
                maximum = calories.get(u);
                c++;
            }

        }
        c = c +1;
        System.out.println("elf on position: " + c + " is holding most calories: "
                + maximum);


        }
    }




