import java.util.Locale;
import java.util.Scanner;

public class Peaklass {
    //
    static void main(String[] args) {
        boolean töötab = true;
        while(töötab){
            Scanner scanner = new Scanner(System.in);

            // kasutaja sisendi alusel valitakse mis trenni ta teha tahab
            System.out.println("\nMis trenni soovid täna teha: ");
            System.out.println("Vajuta 0 - kui rohkem ei viitsi.");
            System.out.println("1 - Jooksmine ");
            System.out.println("2 - Jalutamine ");
            System.out.println("3 - Ujumine ");
            System.out.println("4 - Sõudmine ");
            System.out.println("5 - Rattasõit");

            String a = scanner.nextLine();

            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            //JOOKSMISE OSA
            if (a.equals("1")){
                //algselt false, kuna kasutaja valikust sõltub selle väärtus
                boolean kasMuusika = false;

                System.out.println("Valisid jooksmine!\n");


                System.out.println("Kui kaua plaanid joosta? (minutites)");

                String kaua = scanner.nextLine();
                int KAUA = Integer.parseInt(kaua);

                System.out.println("\nMis distantsi mõtled joosta (kilomeetrites)? nt 6.7");
                String pikkus = scanner.nextLine();
                double PIKKUS = Double.parseDouble(pikkus);


                System.out.println("\nKas mussi ka kuulame?");
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
            // kepikõnd on algselt false, sest kasutaja valib, kas ta seda soovib
            if (a.equals("2")){
                boolean kepiKÕND = false;

                System.out.println("Valisid jalutamine!\n");


                System.out.println();
                System.out.println("Mitu minutit soovid jalutada?");

                String kaua = scanner.nextLine();
                // leiab täisarvu minutid
                int KAUA = Integer.parseInt(kaua);
                // leiab double ühe komakohaga distantsi
                System.out.println("\nKui palju jalutame? (kilomeetrites)? nt 6.7");
                String pikkus = scanner.nextLine();
                double PIKKUS = Double.parseDouble(pikkus);
                // kontrrolime kas kasutaja soovib kepikõndi ning teeme tingimuse, et tähed tuleksid väikselt
                System.out.println("\nKas täna läheme kepikõnnile? :) (jah/ei)");
                String valik = scanner.nextLine().toLowerCase();

                if(valik.equals("jah")){
                    System.out.println("Valik tehtud! Täna on kepikõnni aeg!");
                    kepiKÕND = true;
                }



                Treenimine jalutus = new Jalutamine(KAUA, PIKKUS, kepiKÕND);
                System.out.println(jalutus.toString());
                jalutus.treening();
                System.out.println("Peaksid ühe kilomeetri läbima järgmise ajaga: " + jalutus.tempo() + " min/km");
            }


            //UJUMISE OSA
            if (a.equals("3")){
                System.out.println("Valisid ujumine!\n");
                boolean lestad = false;
                boolean prillid = false;

                System.out.println("Mitu minutit plaanid ujuda? ");
                String kaua = scanner.nextLine();
                int KAUA = Integer.parseInt(kaua);

                System.out.println("Mitu kilomeetrid ujume? nt 6.7");
                String pikkus = scanner.nextLine();
                double PIKKUS = Double.parseDouble(pikkus);

                System.out.println("\nKas võtame ujumisprillid ka kaasa? :) (jah/ei)");
                String valik1 = scanner.nextLine();
                valik1 = valik1.toLowerCase(Locale.ROOT);

                if(valik1.equals("jah")){
                    System.out.println("Valik tehtud! Ujumisprillid on nüüd trennikotis!");
                    prillid = true;
                }

                System.out.println("\nAga lestad? (jah/ei)");
                String valik2 = scanner.nextLine();
                valik2 = valik2.toLowerCase(Locale.ROOT);

                if(valik2.equals("jah")){
                    System.out.println("Valik tehtud! Lestad on nüüd trennikotis!");
                    lestad = true;
                }

                Treenimine ujumine = new Ujumine(KAUA, PIKKUS, lestad, prillid);

                ujumine.treening();
                System.out.println("Peaksid ühe kilomeetri läbima järgmise ajaga: " + ujumine.tempo() + " min/km");
                System.out.println(ujumine.toString());

            }

            //SÕUDMISE OSA
            if (a.equals("4")){
                boolean kaaslaneKaasas = false;

                System.out.println("Valisid sõudmise!\n");
                System.out.println();
                System.out.println("Mitu minutit soovid sõuda? ");
                String kaua = scanner.nextLine();
                int ajaline = Integer.parseInt(kaua);

                System.out.println("\nKui kaugele mõtled sõuda (kilomeetrites)? nt 6.7");
                String pikkusSõud = scanner.nextLine();
                double pikkusSõudmine = Double.parseDouble(pikkusSõud);

                System.out.println("\nKas täna võtame sõbra ka kaasa? Seltsis segasem :) (jah/ei)");
                String sõudmineValik1 = scanner.nextLine().toLowerCase();

                if (sõudmineValik1.equals("jah")) {
                    System.out.println("\n Valik tehtud! ");
                    kaaslaneKaasas = true;
                } else {
                    System.out.println("\n Olgu! Täna siis üksi. ");
                }
                Sõudmine soudmine = new Sõudmine(ajaline, pikkusSõudmine, kaaslaneKaasas);
                soudmine.toString();
                soudmine.treening();
                System.out.println("Tempo: " + soudmine.tempo() + "min/km");

            }

            if (a.equals("5")){
                boolean elektriratas = false;

                System.out.println("Valisid rattasõidu!\n");
                System.out.println();

                System.out.println("Mitu minutit soovid sõita?");
                int ajaline = Integer.parseInt(scanner.nextLine());

                System.out.println("Kui pika maa soovid sõita (kilomeetrites)? nt 6.7");
                double distants = Double.parseDouble(scanner.nextLine());

                System.out.println("Kas kasutad elektriratast? (jah/ei)");
                String rattavalik = scanner.nextLine().toLowerCase();

                if (rattavalik.equals("jah")) {
                    elektriratas = true;
                    System.out.println("\n Valik tehtud.");
                } else {
                    System.out.println("\n Valik tehtud");
                }
                Rattasõit rattasoit = new Rattasõit(ajaline, distants, elektriratas);
                rattasoit.toString();
                rattasoit.treening();
                System.out.println("Tempo: " + rattasoit.tempo() + "min/km");
            }
            if(a.equals("0")){
                töötab = false;
            }
        }
    }
}
