import java.time.LocalDate;

public class Poligoni {

    public Poligoni() {
        this.birthDay = LocalDate.now();
        this.base = 1.0;
        this.height = 1.0;
        this.area = 1.0;
    }

    public Poligoni(LocalDate birthDay, Double base, Double height, Double area) {
        this(birthDay, base, height);
        this.area = area;
    }

    public Poligoni(LocalDate birthDay, Double base, Double height) {
        this(birthDay, base);
        this.height = height;
    }

    public Poligoni(LocalDate birthDay, Double base) {
        this(birthDay);
        this.base = base;
    }

    public Poligoni(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    private LocalDate birthDay;
    private Double base;
    private Double height;
    private Double area;

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
}
