import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Exercice 1

       int nbr1 = 9999999;
       int nbr2 = 301;
       int nbr3 = 7365;

       int somme = nbr1 + nbr2 + nbr3;
       System.out.println("la somme des 3 nombres est:" +somme);

       //Exercice 2

        int nbr4 = 105632452;
        int nbr5 = 2000000000;
        int nbr6 = 10000;

        int soustraction = nbr4 - nbr5 - nbr6;
        System.out.println("la soustraction des 3 nombres est:" +soustraction);

        //Exercice 3

        int nbr7 = 2001;
        int nbr8 = 20;
        int nbr9 = 12;

        int multiplication = nbr7 * nbr8 * nbr9;
        System.out.println("la multiplication des 3 nombres est:" +multiplication);

        //Exercice 4

        int nbr10 = 726;
        int nbr11 = 15;

        int division = nbr10 / nbr11;
        System.out.println("la division des 2 nombres est:" +division);

        //Exercice 5

        int nbr12 = 50;
        int nbr13 = 2;
        int nbr14 = 20;
        int nbr15 = 55;
        int nbr16 = 5;

        int mul = nbr13 * nbr14;
        int div = nbr15 / nbr16;

        System.out.println();


        //Exercice FOTSO

        int colaCFA = 10;
        int colajournalierCFA = 1000;
        int colatotaljournalierCFA = colaCFA*colajournalierCFA;

        int transportjournalierparsacCFA = 50;
        int nutritionjournalièreCFA = 50;
        int emballagejournalierCFA = 10;
        int prixachatde500colaCFA = 400;
        int nbrJourAnnuel = 365;

        int transportannuelCFA = transportjournalierparsacCFA * nbrJourAnnuel;
        int nutritionannuelleCFA = nutritionjournalièreCFA * nbrJourAnnuel;
        int emballageannuelCFA = emballagejournalierCFA * nbrJourAnnuel;
        int prixAchat500ColaAnnuelCFA = prixachatde500colaCFA * nbrJourAnnuel;

        int DepsensesAnnuel = transportannuelCFA + nutritionannuelleCFA + emballageannuelCFA + prixAchat500ColaAnnuelCFA;


        int CA = colatotaljournalierCFA * nbrJourAnnuel;
        int B = CA - DepsensesAnnuel;

        System.out.println("le résultat du CA est: "+CA);
        System.out.println("le résultat du B est: "+B);

        //Welcome to EPFC

     String papa = "papa";
     String maman = "maman";
     String et = "et";
     String ont = "ont";
     int six = 6;
     String enfants = "enfants";

     System.out.println(papa+" " + et+" " + maman+" " + ont + " "+ six +" " +enfants);

     String texte = "j'aime programmer en langage java";
     //String phrasesansespace =

     //EXERCICE PRATIQUE SUR LES DATES

     //Ex 1
     //SimpleDateFormat sdf=new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm");
     SimpleDateFormat sdf=new SimpleDateFormat("EEEE dd MMMM yyyy, HH:mm");

             System.out.println("on est le " +sdf.format(new Date()));

             //Ex2
     sdf=new SimpleDateFormat(" dd/MM/yyyy ");

     System.out.println( sdf.format(new Date()));

     //Ex3

     sdf=new SimpleDateFormat(" dd/MM/yyyy HH:mm ");

     System.out.println( sdf.format(new Date()));


     LocalDateTime ldt = LocalDateTime.now();
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy HH:mm");
     System.out.println(ldt.format(dtf));

     //HOMEWORK

     String nom = "Khalid";
     String prenom = "El Hakym";
     int noteProgrammationInformatique= 17;
     int noteMathematique= 14;
     int noteChimie= 16;
     int notePhysique= 13;

     int creditProgrammationInformatique= 9;
     int creditMathematique= 7;
     int creditChimie= 6;
     int creditPhysique= 5;

     System.out.println("Bonjour Khalid, voici vos notes avec le nombre de crédit");
     System.out.println("-------------------------------------------------------------");
     System.out.println("+ Matiere                     +   Note     + Credit         +");
     System.out.println("-------------------------------------------------------------");
     System.out.println("+ Programmation informatique  +   "+noteProgrammationInformatique+"       + "+creditProgrammationInformatique+"              + ");
     System.out.println("-------------------------------------------------------------");
     System.out.println("+ Mathematique                +   "+noteMathematique+"       + "+creditMathematique+"              + ");
     System.out.println("-------------------------------------------------------------");
     System.out.println("+ Chimie                      +   "+noteChimie+"       + "+creditChimie+"              + ");
     System.out.println("-------------------------------------------------------------");
     System.out.println("+ Physique                    +   "+notePhysique+"       + "+creditPhysique+"              + ");
     System.out.println("-------------------------------------------------------------");
     System.out.println("+ Moyenne                     +   "+((noteProgrammationInformatique*creditProgrammationInformatique)+(noteMathematique*creditMathematique)+(noteChimie*creditChimie)+(notePhysique*creditPhysique))/(creditProgrammationInformatique+creditMathematique+creditChimie+creditPhysique)+"                        + ");
     System.out.println("-------------------------------------------------------------");
     System.out.println( "Ce calcul est fait le "+sdf.format(new Date()));

     /*Scanner scanner =new Scanner(System.in);
     System.out.println ("veuillez entrer votre nom");
     nom=scanner.nextLine();
     System.out.println ("veuillez entrer votre prenom");
     prenom=scanner.nextLine();


     System.out.println ("Quelle est votre note pour la programmation informatique");
     noteProgrammationInformatique= Integer.parseInt(scanner.nextLine());
     System.out.println ("Quelle est votre credit pour la programmation informatique");
     creditProgrammationInformatique= Integer.parseInt(scanner.nextLine());
     System.out.println ("Quelle est votre note pour la ");
     noteProgrammation= Integer.parseInt(scanner.nextLine());
     System.out.println ("Quelle est votre credit pour la programmation");
     creditProgrammation= Integer.parseInt(scanner.nextLine());*/

















    }
}