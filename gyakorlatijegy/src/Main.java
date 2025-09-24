import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A pontszamod: ");
        int pont = sc.nextInt();

        if(0 < pont && pont < 40) {
            System.out.println("Elégtelen! (1)");
        } else if(40 < pont && pont < 55) {
            System.out.println("Elégséges! (2)");
        }else if(54 < pont && pont < 70) {
            System.out.println("Közepes! (3)");
        }else if(70 < pont && pont < 88) {
            System.out.println("Jó! (4)");
        }else if(88 < pont && pont <= 100) {
            System.out.println("Kiváló! (5)");
        }

    }
}