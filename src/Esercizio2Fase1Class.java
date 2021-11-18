import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Esercizio2Fase1Class {
    public static void main(String[] args) {
        Esercizio2Fase1Class fase1 = new Esercizio2Fase1Class();
        fase1.showRettangoli();
    }

    public void showRettangoli() {
        List<Rettangli> rettangli = getFirst10DaysRettangli(getRettangli());
        for (Rettangli r : rettangli) {
            System.out.println("giorno di nascita: " + r.getBirthDay() + ", base: " + r.getBase() + ", altezza: " + r.getHeight() + ", area: " + r.getArea());
        }
    }

    public List<Rettangli> getFirst10DaysRettangli(List<Rettangli> rettangli) {
        List<Rettangli> rtn = new ArrayList<>();
        Collections.sort(rettangli, Comparator.comparing(Rettangli::getBirthDay));
        LocalDate firstDay = rettangli.get(0).getBirthDay();
        LocalDate stopDay = firstDay.plusDays(9);
        for (Rettangli r : rettangli) {
            if (r.getBirthDay().isAfter(stopDay))
                break;
            rtn.add(r);
        }
        return rtn;
    }

    public List<Rettangli> getRettangli() {
        List<Rettangli> rettangli = new ArrayList<>();
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 1), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 1), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 2), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 3), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 4), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 5), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 6), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 9), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 10), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 11), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 12), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 7), 1.0, 1.0, 2.0));
        rettangli.add(new Rettangli(LocalDate.of(2021, Month.NOVEMBER, 8), 1.0, 1.0, 2.0));
        return rettangli;
    }
}
