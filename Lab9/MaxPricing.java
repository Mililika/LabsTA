package lab9;

import java.util.ArrayList;

public class MaxPricing {
    public Integer[] maxPrices(int[] s, int[] p, int S){
        int[] s1 = s.clone(), p1 = p.clone();

        for(int j = 0; j < p1.length; j++)
            for(int i = j + 1; i < p1.length; i++){
                if(p1[j] < p1[i]){
                    int tmpP = p1[j], tmpS = s1[j];
                    p1[j] = p1[i];
                    s1[j] = s1[i];
                    p1[i] = tmpP;
                    s1[i] = tmpS;
                }
            }

        ArrayList<Integer> things = new ArrayList<>();

        int tmpS = 0;
        for(int j = 0; j < p1.length; j++){
            for (int i = 0; i < p1.length; i++) {
                if ((tmpS + s1[i]) <= S && !things.contains(s[i])) {
                    tmpS += s1[i];
                    things.add(s1[i]);
                }
            }
        }

//        for(int i = 0; i < p1.length; i++){
//            System.out.println(s1[i] + " - " + p1[i]);
//        }

        Integer[] arr = new Integer[things.size()];
        return things.toArray(arr);
    }
}
