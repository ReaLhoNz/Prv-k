

public class Main {
    public static void main(String[] args) {
        System.out.println("Jakou operaci chete použít.");
        String odpoved = MatFce.input.nextLine();

        if(odpoved.equalsIgnoreCase("%")) {
            MatFce.Modulo();
        } else if (odpoved.equalsIgnoreCase("*")) {
            MatFce.nasobeni();
        } else if (odpoved.equalsIgnoreCase("/")) {
            System.out.println(MatFce.děleni());
        } else if (odpoved.equalsIgnoreCase("+")) {
            MatFce.scitani();
        } else if (odpoved.equalsIgnoreCase("-")) {
            MatFce.odcitani();
        } else if (odpoved.equalsIgnoreCase("factorial")) {
            MatFce.fact();

        }
    }
}