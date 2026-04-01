import java.util.Locale;
import java.util.Scanner;

public class Peaklass {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mis trenni soovid täna teha: ");
        System.out.println("1 - Jooksmine ");
        System.out.println("2 - Jalutamine ");
        System.out.println("3 - Ujumine ");
        System.out.println("4 - Sõudmine ");
        System.out.println("5 - Rattasõit");

        String a = scanner.nextLine();

        if (a.equals("1")){
            System.out.println("Valisid jooksmine!");
        }
        if (a.equals("2")){
            boolean kepiKÕND = false;

            System.out.println("Valisid jalutamine!");
            System.out.println();
            System.out.println("Mitu minutit soovid jalutada?");

            String kaua = scanner.nextLine();
            int KAUA = Integer.parseInt(kaua);

            System.out.println("Kas täna läheme kepikõnnile? :) (jah/ei)");
            String valik = scanner.nextLine();
            valik = valik.toLowerCase(Locale.ROOT);

            if(valik.equals("jah")){
                System.out.println("Valik tehtud! Täna on kepikõnni aeg!");
                kepiKÕND = true;
            }else kepiKÕND = false;


            Treenimine jalutus = new Jalutamine(KAUA, kepiKÕND);
        }
        if (a.equals("3")){
            System.out.println("Valisid ujumine!");
        }
        if (a.equals("4")){
            System.out.println("Valisid Sõudmise!");
        }
        if (a.equals("5")){
            System.out.println("Valisid rattasõidu!");
        }
    }
}
