//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int also = sc.nextInt();
        int felso = sc.nextInt();

        int osszeg = 0;
        for (int i = also; i <= felso; i++) {
            if (i % 2 == 0) {
                osszeg += i;
            }
        }

        System.out.println("A(z) [" + also + "; " + felso + "] intervallumba eso paros szamok osszege:" + osszeg);

    }
}