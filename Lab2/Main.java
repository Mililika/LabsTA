package Lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Rozrahunok rozrahunok = new Rozrahunok(new Task1Method1(), new Task2(), new Printer());
            System.out.print("Введіть число на перевірку степені двійки: ");
            rozrahunok.solve(Vvod());
            System.out.print("Введіть числа для підрахування біномальних коефіцієнтів: ");
            rozrahunok.BinomCofRoz(Vvod(), Vvod());
        }
        catch (IllegalArgumentException ex){
            System.out.println("Не натуральне число!");
        }
        finally{
            System.out.println("Гарного дня!");
        }

    }
    public static int Vvod(){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x <= 0) {
            throw new IllegalArgumentException();
        }
        return x;
    }
}
