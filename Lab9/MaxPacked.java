package lab9;

import java.util.ArrayList;

public class MaxPacked {
    public Integer[] maxThings(int[] s, int S){
        boolean[][] d = new boolean[s.length + 1][S + 1];
        d[0][0] = true;
        for(int i = 1; i <= s.length; i++){
            for(int j = 0; j <= S; j++){
                d[i][j] = d[i - 1][j];
                if(j - s[i-1] >= 0){
                    d[i][j] |= d[i-1][j - s[i-1]];
                }
            }
        }

        ArrayList<Integer> things = new ArrayList<>();
        int tempS = 0;

        for(int i = S; i >= 0; i--){
            if(d[s.length][i]){
                things.add(s[s.length - 1]);
                tempS += s[s.length - 1];
                for (int j = s.length - 2; j >= 0; j--){
                    for(int k = i; k > 0; k--){
                        if(s[j] == k && (tempS + s[j] <= S)){
                            things.add(s[j]);
                            tempS += s[j];
                            //System.out.println(tempS);
                        }
                    }
                }
                break;
            }
        }

        Integer[] arr = new Integer[things.size()];
        return things.toArray(arr);
    }
}
