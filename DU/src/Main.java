import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vyber si co chceš dělat BMI(pro výpočet BMI které znázorňuje vaši tělesnou kondici.) a nebo posloupnost(Posloupnost čísel a jeich součet)");
        String s = input.nextLine();
        if(s.equalsIgnoreCase("BMI")){
            double vyska;
            double  vaha;
            double BMI;
            System.out.println("Jak2á je tvá výška v metrech?");
            vyska = input.nextDouble();
            System.out.println("Jaká je tvoje váha?");
            vaha = input.nextDouble();
            BMI = vaha / (vyska * vyska);
            boolean a = BMI <= 18.5;
            boolean b = 18.5 < BMI;
            boolean c = BMI <=24.9;
            boolean d = 25 < BMI ;
            boolean e = BMI <=29.9;
            boolean f = 30 < BMI ;
            boolean g = BMI <=34.9;
            boolean h = 35 < BMI ;
            boolean ch = BMI <=39.9;

            if (a == true){
                System.out.println("Máte podváhu a zdravotní riziko je vysoké. Vaše BMI= " + BMI);
            }
            if (b == true && c == true){
                System.out.println("Máte nadváhu a zdravotní riziko je nízké až lehce vyšší. Vaše BMI= " + BMI );
            }
            if (d == true && e == true){
                System.out.println("Máte obezitu 1. stupně a zdravotní riziko je zvýšené. Vaše BMI= " + BMI );
            }
            if (f == true && g == true){
                System.out.println("Máte obezita 2. stupně a zdravotní riziko je vysoké. Vaše BMI= " + BMI );
            }
            if (h == true && ch == true){
                System.out.println("Máte obezitu 3. stupně a zdravotní riziko je velmi vysoké Vaše BMI= " + BMI );
            }
        }else if(s.equalsIgnoreCase("posloupnost")){
            System.out.println("posloupnost:");
            double p = 0;
            for (int i = 1; i<1000; i++){
                p += 1/(double)(i*2);
            }
            System.out.println(p);
        }else if (s.equalsIgnoreCase("dělitelnost")){
            System.out.println("Vyber si číslo u kterého budeme zjišťovat jeho dělitele.");
            int x = input.nextInt();
            for (int z = 1; z <= 1000; z++) {
                if (x % z == 0) {
                    System.out.println("Číslo: " + x + " je dělitelné číslem " + z);
                }
            }
        } else if (s.equalsIgnoreCase("nadruhou")) {
            double u = 0;
            for (int i = 1; i<=1000; i++ ){
                u += 1/(double)(i*i);
            }
            System.out.println(u);
        }

    }
    }

