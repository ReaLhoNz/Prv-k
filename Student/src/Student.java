import java.time.LocalDate;
import java.util.Arrays;

public class Student {
    private String name;
    private String obor;
    private String predmety;
    private String trida;
    private LocalDate datumNarození;


    public Student(LocalDate datumNarození, String trida, Predmet[] predmety, String obor, String name) {
        this.datumNarození = datumNarození;
        this.name = name;
        this.obor = obor;
        this.trida = trida;
        this.predmety = Arrays.toString(predmety);
    }
}
