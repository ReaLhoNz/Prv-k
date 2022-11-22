public class Auto {
    private String color;
    private String model;
    private String brand;
    private int speed;

    public Auto() {

    }

    public void setSpeed(int setSpeed){
        speed = setSpeed;

    }
    public int getSpeed(){
        return speed;
    }
    public Auto(int speed,String color, String model,String brand){
        this.speed = speed;
        this.brand = brand;
        this.color = color;
        this.model = model;

        String značka = model;


    }

    public static void Car(){
        System.out.println("Brno je na piču");
    }
}
