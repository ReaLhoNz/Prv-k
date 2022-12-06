import java.util.Scanner;

class Methods {
    public static int day(){
        int den;

        System.out.println("Write an number of day in week");
        Scanner sc = new Scanner(System.in);
        den = sc.nextInt();
        return den;
    }
    static void obal(){
        switch (day()){
            case 1:
                System.out.println("Monday - měsíční den");
                break;
            case 2:
                System.out.println("Tuesday - tyrův den");
                break;
            case  3:
                System.out.println("Wednesday - Wotanův den");
                break;
            case 4:
                System.out.println("Thursday = Thoruv den");
                break;
            case 5:
                System.out.println("Friday - Freyin den");
                break;
            case 6:
                System.out.println("Saturday - Saturnův den");
                break;
            case 7:
                System.out.println("Sun day - Den slunce");
                break;
        }
    }

}
