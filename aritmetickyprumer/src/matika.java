
import java.util.ArrayList;
import java.util.Scanner;

class matika {
    Scanner input = new Scanner(System.in);
    public void prumer(){
        System.out.println("Zadejte počet číslic");

        double[] pole = new double[input.nextInt() + 1];
        int c = pole.length - 1;
        double cislo = 0;
        int i;

        do {
            for (i = 1; i < pole.length; ++i){

              pole[i] = input.nextDouble();
              cislo += pole[i];
                if(i == c) {
                    cislo =cislo / i;
                    System.out.println("Aritmetický průměr těchto čísel je: " + cislo);
                    break;
                }
            }

        }while (pole.length != i);
    }
    public void delitelnost(){
        ArrayList<Double> vysledky = new ArrayList<Double>();
        System.out.println("Zadejte číslo u kterého chcete zjístit dělitelnost.");
        double x = input.nextDouble();
        for (double i =  0; i <= x; i++){
            if(x%i == 0){
                vysledky.add(i);
            }
        }
        System.out.println(vysledky);
    }
}
