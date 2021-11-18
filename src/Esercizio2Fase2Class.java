import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Esercizio2Fase2Class {
    public static void main(String[] args) {
        Esercizio2Fase1Class fase1 = new Esercizio2Fase1Class();
        Esercizio2Fase2Class fase2 = new Esercizio2Fase2Class();
        List<Poligoni> poligoni = new ArrayList<>();
        poligoni.addAll(fase1.getRettangli());
        poligoni.addAll(fase2.getQuadrati());
    }

    public List<Quadrati> getFirst10DaysQuadrati(List<Quadrati> quadrati) {
        List<Quadrati> rtn = new ArrayList<>();
        Collections.sort(quadrati, Comparator.comparing(Quadrati::getBirthDay));
        LocalDate firstDay = quadrati.get(0).getBirthDay();
        LocalDate stopDay = firstDay.plusDays(9);
        for (Quadrati r : quadrati) {
            if (r.getBirthDay().isAfter(stopDay))
                break;
            rtn.add(r);
        }
        return rtn;
    }

    public List<Quadrati> getQuadrati() {
        List<Quadrati> quadrati = new ArrayList<>();
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 1), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 1), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 2), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 3), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 4), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 5), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 6), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 9), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 10), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 11), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 12), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        quadrati.add(new Quadrati(LocalDate.of(2021, Month.NOVEMBER, 8), 1.0, 1.0, 2.0));
        return quadrati;
    }
}
