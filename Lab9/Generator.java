package lab9;

import java.util.Random;

public class Generator {
    public int getNum(){
        Random rand = new Random();
        return rand.nextInt();
    }
}
