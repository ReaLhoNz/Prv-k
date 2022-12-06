import java.util.ArrayList;
import java.util.Scanner;


class Method {
    Scanner input = new Scanner(System.in);
        int i;
        int z;
        int u;
        int c = 0;
        double calorie = 0;
        public void Method(){

            //Specifikuje počet lidí
            System.out.println("Zadejte počet elfů");
            int elves = 0;
            elves += input.nextInt();
            ArrayList<Double> calories = new ArrayList<>();

            for (z = 0;z<elves;z++ ) {
                System.out.println("Zadejte počet jídel co člověk nese");
                int numberoffood = input.nextInt();
                //Počítá clekový počet kalorii co elf nese
                for (i = 1; i <= numberoffood; i++) {
                    System.out.println("Zadejte po jendom počet kalorii");
                    calorie += input.nextInt();
                }
                //Přidává kalorie za jednoho člověka
                calories.add(z, calorie);
                calorie = 0;
            }
            //Vybere maximální hodnotu kalorii
            Double maximum = calories.get(0);

            for (u = 1; u < calories.size(); u++) {
                if (maximum < calories.get(u)){
                    maximum = calories.get(u);
                    c++;
                }
            }
            c = c +1;
            System.out.println("elf on position: " + c + " is holding most calories: "
                    + maximum);

        }
    }
