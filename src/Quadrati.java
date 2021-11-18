import java.time.LocalDate;

public class Quadrati extends Poligoni{
    public Quadrati() {
    }

    public Quadrati(LocalDate birthDay, Double base, Double height, Double area) {
        super(birthDay, base, height);
        setArea(area);
    }

    public Quadrati(LocalDate birthDay, Double base, Double height) {
        super(birthDay, base);
        setHeight(height);
    }

    public Quadrati(LocalDate birthDay, Double base) {
        super(birthDay);
        setBase(base);
    }

    public Quadrati(LocalDate birthDay) {
        setBirthDay(birthDay);
    }

}
