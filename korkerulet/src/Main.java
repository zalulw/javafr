import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A kör sugara:");
        double r = sc.nextDouble();

        if(r > 0) {
            double terulet = Math.sqrt(r) * Math.PI;
            System.out.println("a kor terulete = " + terulet);
        } else {
            System.out.println("hibas bemenet");
        }
    }
}