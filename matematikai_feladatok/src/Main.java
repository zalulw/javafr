import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //haromszog egyenlotleseg

        //a+b>c | a+c>b | b+c>a


        Scanner sc = new Scanner(System.in);

        System.out.println("add meg az elso oldal hosszat:");
        double a = sc.nextDouble();

        System.out.println("add meg a masodik oldal hosszat:");
        double b = sc.nextDouble();

        System.out.println("add meg a harmadik oldal hosszat:");
        double c = sc.nextDouble();

        if(a > 0 && b > 0 && c > 0) {
            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("a megadott szakaszok alkothatnak ervenyes haromszoget");
            } else {
                System.out.println("a megadott szakaszok nem alkothatnak ervenyes haromszoget");
            }
        }else{
            System.out.println("ervenytelen adat");
        }


    }
}