import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println(factorial(5)); // 120
        System.out.println(factorial(10)); // 3628800
        System.out.println(factorial(-2)); // 0
        System.out.println(fibonacci(-3)); // 0
        System.out.println(fibonacci(5)); // 5
        System.out.println(fibonacci(8)); // 21
        ArrayList<Double> listA = new ArrayList<>();
        listA.add(5.17);
        listA.add(2.22);
        listA.add(3.46);
        System.out.println(getSumOfList(listA)); // 10.85
        System.out.println(getProductOfList(listA)); // 39.711804
        System.out.println(countdown(5));
        /**
         * 5
         * 4
         * 3
         * 2
         * 1
         * Blastoff!
         * */
    }

    public static long factorial(int n){
        // Base Case
        if (n == 0 || n == 1){
            return 1;
        }
        // Return 0 in case n is negative
        else if (n < 0){
            return 0;
        }
        else{
            // factorial(n) = n * (n - 1) * (n - 2) * ...... * 3 * 2 * 1
            return n * factorial(n - 1);
        }
    }

    public static long fibonacci(int n){
        // Base Case
        if (n == 0 || n == 1){
            return n;
        }
        // Return 0 in case n is negative
        else if (n < 0){
            return 0;
        }
        else{
            return fibonacci(n - 1) + fibonacci( n - 2); // sum of the last two numbers
        }
    }

    public static double getSumOfList(List<Double> aList){
        // Base Case
        if (aList.size() == 0){
            return 0;
        }
        // If the list only has one element
        else if (aList.size() == 1){
            return aList.get(0);
        }
        else{
            // Get the sum of the first element and the elements in the rest of the list
            return aList.get(0) + getSumOfList(aList.subList(1, aList.size()));
        }
    }

    public static double getProductOfList(List<Double> aList){
        // Base Case
        if (aList.size() == 0){
            return 0;
        }
        // If the list only has one element
        else if (aList.size() == 1){
            return aList.get(0);
        }
        else{
            // Get the product of the first element and the elements in the rest of the list
            return aList.get(0) * getProductOfList(aList.subList(1, aList.size()));
        }
    }

    public static String countdown(int n){
        // Base Case
        if (n == 0){
            return "Blastoff!";
        }
        else{
            // Countdown till zero!
            return n + "\n" + countdown(n - 1);
        }
    }
}
