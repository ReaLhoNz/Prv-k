public class Main {
    static double vysledek;
    static double kmvysledek;
    static double milesvysledek;
    public static void main(String[] args) {
        Mathematic obj = new Mathematic();
        obj.input();
        obj.rychlost();
        System.out.println("Rychlost v m/s je " + vysledek + " v km/h " + (vysledek * 60 * 60 / 1000)+ " vzdálenost v mílích " + milesvysledek );

    }
}