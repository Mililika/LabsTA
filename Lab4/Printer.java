public class Printer {

    public void print(double time, int[] arr, char s) {
        int len = arr.length;

        if (s == 's') {
            System.out.println("For " + len + " sorted elements it takes " + time + " seconds to sort an array");
        } else {
            System.out.println("For " + len + " random elements it takes " + time + " seconds to sort an array");
        }
    }

    public void printName(Sort sort) {
        String name = sort.getClass().getSimpleName();
        System.out.println("-------------------------- " + name + " --------------------------");
    }
}
