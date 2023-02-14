
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Predmet[] myObj1 = new Predmet[]{new Predmet("IT", "Ppeik", (short) 12, new short[]{1, 2, 3, 32, 32, 1})};
        Student myObj = new Student(LocalDate.of(1,1,2), "1.d", new Predmet[]{myObj1[0]}, "it", "Supernova");
        System.out.println(myObj);
    }

}