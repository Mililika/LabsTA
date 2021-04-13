package Lab6;

import java.util.Random;

public class UniqueKeys {
    public int[] getKeys(){
        int i = 1;
        int[] elems = new int[1000];
        boolean flag;
        Random r = new Random();
        elems[0] = r.nextInt();
        while(i < 1000){
            flag = true;
            int rand = r.nextInt();
            for(int j = 0; j < i; j++){
                if(elems[j] == rand){
                    flag = false;
                    break;
                }
            }
            if(flag){
                elems[i] = rand;
                i++;
            }
        }
        return elems;
    }
}
