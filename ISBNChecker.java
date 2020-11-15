import java.util.StringTokenizer;
import java.util.Scanner;

public class ISBNChecker{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Polynomial Evaluator program!\n");
        System.out.println("Please enter a polynomial.\n");
        StringTokenizer value = new StringTokenizer(keyboard.nextLine(), " ");
        System.out.println("Enter a x-value.\n");
        double x = keyboard.nextDouble();
        double total = 0;
        
        search:
        while (value.hasMoreTokens()) {
            String v = value.nextToken();
            if (v.contains("=") || v.contains("f")) {
                continue search;
            }
            if (v.contains("x") && v.contains("^")) {
                double coef = Double.parseDouble(v.substring(0, v.indexOf("x")));
                int expo = Integer.parseInt(v.substring(v.indexOf("^") + 1));
                total += coef * Math.pow(x, expo);
            } else if (!v.contains("x") && v.contains("^")) {
                total += Math.pow(x, Integer.parseInt(v.substring(v.indexOf("^") + 1)));
            } else if (v.contains("x") && !v.contains("^")) {
                total += x * Double.parseDouble(v.substring(0, v.indexOf("x")));
            } else {
                total += Integer.parseInt(v);
            }
        }
        System.out.println("f(" + x + ") is" + total);
        keyboard.close();
    }
}