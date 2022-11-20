import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj wartość temperatury");
        double a=sc.nextDouble();
        double q=a*1.8+32;
        System.out.println("C do F "+q);
        double w=a-32/1.8;
        System.out.println("F do C "+w);
        double e=a+273.15;
        System.out.println("C do K "+e);
        double r=a-273.15;
        System.out.println("K do C "+r);
        double t=(a-273.15)*1.8+32;
        System.out.println("K do F "+t);
        double y=((a-32/1.8)+273.15);
        System.out.println("F do K "+y);
    }
}
