import java.time.LocalDate;
import java.util.Date;

public class Rettangli extends Poligoni{
    public Rettangli() {
    }

    public Rettangli(LocalDate birthDay, Double base, Double height, Double area) {
        super(birthDay, base, height);
        setArea(area);
    }

    public Rettangli(LocalDate birthDay, Double base, Double height) {
        super(birthDay, base);
        setHeight(height);
    }

    public Rettangli(LocalDate birthDay, Double base) {
        super(birthDay);
        setBase(base);
    }

    public Rettangli(LocalDate birthDay) {
        setBirthDay(birthDay);
    }
}
