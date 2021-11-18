import java.util.*;
import java.util.stream.Collectors;

public class Esercizio1Class {

    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("MNO");
        originalList.add("DEF");
        originalList.add("YZ");
        originalList.add("GHI");
        originalList.add("JKL");
        originalList.add("PQR");
        originalList.add("ABC");
        originalList.add("STU");
        originalList.add("VWX");

        List<String> sortedList = new ArrayList<>(originalList);
        Collections.sort(sortedList, Collections.reverseOrder());
        Map<String, String> map = sortedList.stream().collect(Collectors.toMap(key -> key.substring(0,1), item -> item.toString()));

        System.out.println("original list: "+originalList);
        System.out.println("map sorted: "+map);
    }
}
