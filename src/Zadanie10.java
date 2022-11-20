import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ile komunikatów wyświetlić?");
        int i=sc.nextInt();
        for(int j = 1; j<i+1; j++){
            System.out.println("To jest " + j + " komunikat w pętli");
        }
    }
}
