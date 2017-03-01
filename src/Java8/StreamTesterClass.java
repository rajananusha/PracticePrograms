package Java8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anusha on 12/10/16.
 */
public class StreamTesterClass {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Anusha");
        names.add("Akriti");
        names.add("Bhakti");
        names.add("Parneet");

        names.stream().forEach( name -> System.out.println(name));
        names.parallelStream().filter(name -> name.equals("Anusha")).forEach( name -> System.out.println(name));
    }
}
