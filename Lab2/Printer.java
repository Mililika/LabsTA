package Lab2;

public class Printer implements Print{

    @Override
    public void print(boolean flag){
        if(flag){
            System.out.println("YES!");
        }
        else System.out.println("NO!");
    }

    @Override
    public void print(long factorial) {
        System.out.println("Отримана кількість біноміальних коефіцієнтів: " + factorial);
    }
}
