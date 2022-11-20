import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Proszę podć hasło");
        String password=sc.nextLine();
        System.out.println("Podane hasło to "+password);
        if (password.equals("secret")) {
            System.out.println("Witaj w tajnym miejscu");
        }
    }
}
