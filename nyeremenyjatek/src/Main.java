import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a csoki gyartasi szamat:");

        int szam = scanner.nextInt();

        if(szam % 1 == 0 && szam % szam == 0) {
            System.out.println("Gratulalok nyertel!");
        } else {
            System.out.println("Nem nyert");
        }
    }
}