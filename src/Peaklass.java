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

        //JOOKSMISE OSA
        if (a.equals("1")){
            boolean kasMuusika = false;

            System.out.println("Valisid jooksmine!");


            System.out.println();
            System.out.println("Kui kaua plaanid joosta? (minutites)");

            String kaua = scanner.nextLine();
            int KAUA = Integer.parseInt(kaua);

            System.out.println("Mis distantsi mõtled joosta (kilomeetrites)? nt 6.7");
            String pikkus = scanner.nextLine();
            double PIKKUS = Double.parseDouble(pikkus);


            System.out.println("Kas mussi ka kuulame?");
            String valik = scanner.nextLine();
            valik = valik.toLowerCase(Locale.ROOT);

            if(valik.equals("jah")){
                System.out.println("Õige valik. Naudime nüüd!");
                kasMuusika = true;
            }


            Treenimine jooks = new Jooks(KAUA, PIKKUS, kasMuusika);
            jooks.treening();
            System.out.println("Peaksid ühe kilomeetri läbima järgmise ajaga: " + jooks.tempo() + " min/km");
        }


        //JALUTAMISE OSA
        if (a.equals("2")){
            boolean kepiKÕND = false;

            System.out.println("Valisid jalutamine!");


            System.out.println();
            System.out.println("Mitu minutit soovid jalutada?");

            String kaua = scanner.nextLine();
            int KAUA = Integer.parseInt(kaua);

            System.out.println("Kui kaugele mõtled jalutada (kilomeetrites)? nt 6.7");
            String pikkus = scanner.nextLine();
            double PIKKUS = Double.parseDouble(pikkus);

            System.out.println("Kas täna läheme kepikõnnile? :) (jah/ei)");
            String valik = scanner.nextLine();
            valik = valik.toLowerCase(Locale.ROOT);

            if(valik.equals("jah")){
                System.out.println("Valik tehtud! Täna on kepikõnni aeg!");
                kepiKÕND = true;
            }



            Treenimine jalutus = new Jalutamine(KAUA, PIKKUS, kepiKÕND);
            System.out.println(jalutus.toString());
            jalutus.treening();
            System.out.println("Peaksid ühe kilomeetri läbima järgmise ajaga: " + jalutus.tempo() + " min/km");
        }
        if (a.equals("3")){
            System.out.println("Valisid ujumine!");
        }
        if (a.equals("4")){
            System.out.println("Valisid sõudmise!");
        }
        if (a.equals("5")){
            System.out.println("Valisid rattasõidu!");
        }


    }
}
