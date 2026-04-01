import java.util.Scanner;

public class Peaklass {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mis trenni soovid täna teha: ");
        String a = scanner.nextLine();

        if (a.equals("Ujuda")){
            System.out.println("söö vähem paksu!");
        }
    }
}
