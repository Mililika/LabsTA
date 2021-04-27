package lab9;

import java.util.*;
import java.util.stream.Collectors;

public class Intersection {

    private Set<Integer> result;
    private Integer[] set1;
    private Integer[] set2;

    public Intersection(Integer[] set1, Integer[] set2) {
        this.set1 = set1;
        this.set2 = set2;
    }

    public void intersection(){
        result = Arrays.stream(set1)
                .distinct()
                .filter(Arrays.asList(set2)::contains)
                .collect(Collectors.toSet());
    }

    @Override
    public String toString() {
        return "Intersection: " + result.toString();
    }
}
