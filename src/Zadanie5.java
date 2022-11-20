import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj perwszą liczbę całkowitą");
        int a=sc.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą");
        int b=sc.nextInt();

        System.out.println("a= "+a+", b= "+b+", wynik to "+(a+b));
        System.out.println("a= "+a+", b= "+b+", wynik to "+(a-b));
        System.out.println("a= "+a+", b= "+b+", wynik to "+(a*b));
        System.out.println("a= "+a+", b= "+b+", wynik to "+(a/b));
        System.out.println("a= "+a+", podniesione do potęgi "+b+", daje nam "+(Math.pow(a, b)));
    }
}
