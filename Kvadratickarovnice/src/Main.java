import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x1;
        double x2;
        double a;
        double b;
        double c;
        double d;

        Scanner s = new Scanner(System.in);

        System.out.println("Zadejte parametr A");
         a = s.nextDouble();
        System.out.println("Zadejte paramet B");
         b = s.nextDouble();
        System.out.println("Zadejte parametr C");
         c = s.nextDouble();

         d = b*b-4*a*c;
        System.out.println("d = " + d);

        if (d == 0){

            x1 = -b / (2*a);
            System.out.println(x1);
        }

        else if(d > 0){
            System.out.println("ahoj");
            x1 = (-b+Math.sqrt(d) )/ (2*a);
            x2 = (-b-Math.sqrt(d)) / (2*a);
            System.out.println(x1);
            System.out.print(x2);
        } else{
            System.out.println("nelze v R vyřešit");
        }

    }
}