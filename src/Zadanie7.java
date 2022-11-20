import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String fName=sc.nextLine();
        System.out.println("twoje imię to "+ fName);
        if (fName.equals("John Wick")) {
            System.out.println("Widzę, że znów pracujesz John");
        }else{
            System.out.println("Witaj, "+fName);
        }
    }
}
