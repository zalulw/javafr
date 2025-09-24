import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("kerem a megtett tavolsagot(km): ");
        int km = sc.nextInt();

        System.out.println("kerem a fogyasztott uzemanyagot(l): ");
        double l = sc.nextDouble();

        if(km > 0 && l > 0){
            double fogyasztas = (l/km) * 100;
            System.out.println("az atlagos fogyasztas = " + fogyasztas + "l/100km");
        } else {
            System.out.println("hibas bemenet");
        }
    }
}