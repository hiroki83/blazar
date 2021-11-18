import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Esercizio2Fase2Class {
    public static void main(String[] args) {
        Esercizio2Fase1Class fase1 = new Esercizio2Fase1Class();
        Esercizio2Fase2Class fase2 = new Esercizio2Fase2Class();
        List<Poligoni> poligoni = new ArrayList<>();
        poligoni.addAll(fase1.getRettangli());
        poligoni.addAll(fase2.getQuadrati());

        List<Poligoni> poligoniSorted = fase2.getFirst10DaysPoligoni(poligoni);



    }

    public void showPoligoni(List<Poligoni> poligoniSorted) {
        List<Poligoni> rettangli = getNewPoligoni(poligoniSorted);
        for (Poligoni r : rettangli) {
            System.out.println("giorno di nascita: " + r.getBirthDay() + ", base: " + r.getBase() + ", altezza: " + r.getHeight() + ", area: " + r.getArea());
        }
    }

    public Map<Long, List<Poligoni>> getGroupByDay(List<Poligoni> poligoniSorted) {
        Map<Long, List<Poligoni>> poligoniGroupedByDay = new HashMap<>();
        for (Poligoni p : poligoniSorted) {
        }
        return poligoniGroupedByDay;
    }

    public List<Poligoni> getNewPoligoni(List<Poligoni> poligoniSorted) {
        List<Poligoni> rtn = new ArrayList<>();
        double sumBaseRettangoli = 0.0;
        double sumHeightRettangoli = 0.0;
        double sumBaseQuadrati = 0.0;
        double sumHeightQuadrati = 0.0;
        for (int i = 0; i < poligoniSorted.size(); i++) {
            Poligoni p = poligoniSorted.get(i);
            if (poligoniSorted.get(i) instanceof Rettangli) {
                sumBaseRettangoli += p.getBase();
                sumHeightRettangoli += p.getHeight();
            } else if (poligoniSorted.get(i) instanceof Quadrati) {
                sumBaseQuadrati += p.getBase();
                sumHeightQuadrati += p.getHeight();
            }
        }
        return rtn;
    }

    public List<Poligoni> getFirst10DaysPoligoni(List<Poligoni> poligoni) {
        List<Poligoni> rtn = new ArrayList<>();
        Collections.sort(poligoni, Comparator.comparing(Poligoni::getBirthDay));
        LocalDate firstDay = poligoni.get(0).getBirthDay();
        LocalDate stopDay = firstDay.plusDays(9);
        for (Poligoni r : poligoni) {
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
