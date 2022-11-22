
import java.util.Scanner;

class matika {
    public void prumer(){
        Scanner input = new Scanner(System.in);
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
}
