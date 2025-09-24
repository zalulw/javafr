import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A teglalap egyik oldala:");
        double a = sc.nextDouble();
        System.out.println("A teglalap masik oldala:");
        double b = sc.nextDouble();

        if(a > 0 && b > 0) {
            double terulet = (a * b);
            double kerulet = 2*(a+b);

            System.out.println("A teglalap terulete: "+terulet);
            System.out.println("A teglalap kerulete: "+kerulet);
        } else {
            System.out.println("hibas bemenet");
        }
    }
}