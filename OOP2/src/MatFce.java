import java.util.Scanner;

class MatFce {
    static Scanner input = new Scanner(System.in);

   static int c;
    static void Modulo(){

        System.out.println("Zadejte par. A");
        int a = input.nextInt();
        System.out.println("Zadejte par. B");
        int b = input.nextInt();
        int c ;
        c = a%b;
        System.out.println(c);

    }
    static void nasobeni(){
        System.out.println("Zadejte par. A");
        int a = input.nextInt();
        System.out.println("Zadejte par. B");
        int b = input.nextInt();
        c = a*b;
        System.out.println(c);
    }
    static void scitani(){
        System.out.println("Zadejte par. A");
        int a = input.nextInt();
        System.out.println("Zadejte par. B");
        int b = input.nextInt();
        c = a+b;
        System.out.println(c);
    }
    static  void odcitani(){
        System.out.println("Zadejte par. A");
        int a = input.nextInt();
        System.out.println("Zadejte par. B");
        int b = input.nextInt();
        c = a-b;
        System.out.println(c);
    }
    static double děleni(){
        System.out.println("Zadejte par. A");
        double a = input.nextInt();
        System.out.println("Zadejte par. B");
        double b = input.nextInt();
        return a/b;
    }
    static double fact(){
        double n =input.nextDouble();
        if (n<0){
            return -1;
        }else{
        for (int i = 1; i<=n; i++) {
            double c = n * i;
            System.out.println(c);

            }
        }
return c;
    }
}
