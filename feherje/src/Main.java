import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double napifeherlye;

        System.out.println("Add meg a testsulyodat (kg): ");
        double suly = sc.nextDouble();

        System.out.println("milyen magas az akitiviatsi szinted? 1- atlagos, 2 - magas, 3 - extrém");
        int input = sc.nextInt();

        if(input == 1) {
            napifeherlye = suly * 0.8;
            System.out.println("a napifeherlye szuksegleted"  + napifeherlye + "g");
        } else if (input == 2) {
            napifeherlye = suly * 1.2;
            System.out.println("a napifeherlye szuksegleted"  + napifeherlye + "g");
        } else if (input == 3) {
            napifeherlye = suly * 2.0;
            System.out.println("a napifeherlye szuksegleted"  + napifeherlye + "g");
        } else {
            System.out.println("ervenytelen bemenet.");
        }
    }
}