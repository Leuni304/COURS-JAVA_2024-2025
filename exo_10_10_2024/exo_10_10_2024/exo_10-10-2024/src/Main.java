import org.w3c.dom.CDATASection;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.util.Calendar;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
       /* //A =(9 999 999 + 361 + 7365)
        int nombre1 = 99999999;
        int nombre2 = 301;
        int nombre3 = 7365;

        int somme = nombre1 + nombre2 + nombre3;
        //Je demande à java d'afficher le texte "la somme des 3 nombres est : " en y ajoutant la valeur qui se trouve dans la variable somme
        System.out.println("la somme des 3 nombres est: " + somme);

        //B = (105632452 - 2000000000 - 10000)
        long nombre4 = 105632452;
        long nombre5 = 2000000000;
        long nombre6 = 10000;

        long Resultat = nombre4 - nombre5 - nombre6;
        System.out.println("la soustraction des 3 nombres est : " + Resultat);

        //C = (2001 x 20 x 12 )
        int nombre7 = 2001;
        int nombre8 = 20;
        int nombre9 = 12;

        int Final = nombre7 * nombre8 * nombre9;
        System.out.println(" La multiplication des 3 nombres est :" + Final);

        //D = ( 726 / 15 )
        double nombre10 = 726D;
        double nombre11 = 15D;


        double end = nombre10 / nombre11;
        System.out.println(" la division des 2 nombres est: " + end);

        //E (50 + 2 x 20 - 55 / 5 )
        //solution 1: sans priorité dans les opérateurs
        double nombre12 = 50;
        double nombre13 = 2;
        double nombre14 = 20;
        double nombre15 = 55;
        double nombre16 = 5;

        double calcul = (nombre12 + nombre13 * nombre14 - nombre15 / nombre16);
        System.out.println("le résultat final de ce calcul est: " + calcul);

        //F = ( 1/4 + 1/5 )
        double nombre17 = 0.25;
        double nombre18 = 0.2;


        double last = (nombre17 + nombre18);
        System.out.println("le résultat final de ce calcul est: " + last);

        double x;
        double nombre19 = 5;
        double nombre20 = 20;

        x = nombre20 - nombre19;
        System.out.println("le résultat de cette équation est de:" + x);

        int nar1 = 1;
        int den1 = 4;
        int nar2 = 1;
        int den2 = 5;

        int DenSo = den1 * den2;
        int NarSo = nar1 * den2 + nar2 * den1;
        System.out.println("la somme de cette fraction est: " + NarSo + "/" + DenSo);

        double y2;
        double nombre21 = 4;
        double nombre22 = 0;

        y2 = nombre19;
        *//* Avant d'être milliardaires, monsieur FOTSO Victor vendait de la cola dans
        les années 1940. Une cola coûtait 10 francs CFA et en une journée il vendait
        en moyenne 1000 cola. Le prix d'achat d'un sac de cola d'une capacité de 500
        cola était de 200 francs CFA. Le prix de transport par jour d'un sac de cola était
        de 25 francs CFA. Sa dépense en nutrition par jour était de 50 francs CFA. L'emballage lui coûtait 10 francs CFA par jour.
        Monsieur FOTSO te contacte pour que tu l'aide à calculer son chiffre d'affaires et son bénéfice
        moyen annuel, puis écrire un programme informatique pour rendre tout cela
        automatique.f
        -Exemple de langage *//*

        int PCola = 10;
        int Pcola1day = 1000;

        int Psac500 = 200;
        int Psac1000 = 400;
        int PtranspSac1day = 25;
        int PtranspSac2day = 50;
        int Nutr1day = 50;
        int Embal1day = 10;
        int JourAnnée = 365;

        int CA = (Pcola1day * PCola * JourAnnée);
        int DépensesAnnuel = ((Psac1000 + PtranspSac2day + Nutr1day + Embal1day) * JourAnnée);
        int Bénéfice = CA - DépensesAnnuel;

        System.out.println(" Le chiffre d'affaire annuel de M Fotso est de: " + CA + " Shiba et le bénéfice annuel de M Fotso est de: " + Bénéfice + " Shiba");


        String Z = "Zohir";
        String Z2 = "Imrane";
        String Z3 = "Naomi";

        Date aujourdhui = new Date();
        DateFormatSymbols monDFS = new DateFormatSymbols();
        String[] joursCourts = new String[]{
                "",
                "Di",
                "Lu",
                "Ma",
                "Me",
                "Je",
                "Ve",
                "Sa"};
        monDFS.setShortWeekdays(joursCourts);
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "EEE dd MMM yyyy HH:mm:ss",
                monDFS);
        System.out.println(dateFormat.format(aujourdhui));

        String pere = "Papa";
        String mere = "Maman";
        int enfants = 6;

        System.out.println(pere + " et " + mere + " ont " + enfants + " enfants ");

        String text1 = "j'aime programmer en langage java ";
        String texteSansEspaces = text1.replace(" ", "");
        System.out.println(texteSansEspaces);

        String text2 = " les élections communales 2024 sont terminée. Nous avons votés, maintenant nous laissons la place à la mafia des coalitions";
        String TexteReplace = text2.replaceAll("é", "o");
        System.out.println(TexteReplace);

        // exercice 1

        dateFormat = new SimpleDateFormat("EEEE, d MMM yyyy");
        System.out.println(dateFormat.format(aujourdhui));

        //exercice 2
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(aujourdhui));

        //Exercice 3
        dateFormat = new SimpleDateFormat(" dd/MM/yyyy HH:mm");
        System.out.println(dateFormat.format(aujourdhui));

*/
        //Optimisation

        // Exercice 1
        // STOCKAGE des informations :
        String nom = "Selmani";
        String prénom = "Imrane";
        double noteProg = 12, noteMa = 13, noteChi = 14, notePhy = 17;
        double creditProg = 15, creditMa = 12, creditChi = 8, creditPhy = 8;

        // Affichage des informations personnelles et des notes :
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prénom + "\n");

        // Affichage des notes et crédits pour chaque matière
        System.out.println("Note en informatique : " + noteProg + " Nombre de crédits en informatique : " + creditProg);
        System.out.println("Note en mathématiques : " + noteMa + " Nombre de crédits en mathématiques : " + creditMa);
        System.out.println("Note en chimie : " + noteChi + " Nombre de crédits en chimie : " + creditChi);
        System.out.println("Note en physique : " + notePhy + " Nombre de crédits en physique : " + creditPhy + "\n");

        // Calcul de la moyenne pondérée
        double sommeNotesPondérées = (noteProg * creditProg) + (noteMa * creditMa) + (noteChi * creditChi) + (notePhy * creditPhy);
        double sommeCrédits = creditProg + creditMa + creditChi + creditPhy;
        double moyennePondérée = sommeNotesPondérées / sommeCrédits;

        // Affichage de la moyenne pondérée
        System.out.println("Moyenne pondérée : " + moyennePondérée);

        //Calcul de la moyenne arithmétique

        double sommeNotes = (noteProg + noteMa + noteChi + notePhy);
        int sommedesvaleurs = 4;
        double moyennearithmétique = sommeNotes / sommedesvaleurs;

        //Affichage de la moyenne arithmétique
        System.out.println("Moyenne arithmétique : " + moyennearithmétique);

        BigDecimal bigDecimal = new BigDecimal(12.4);

        long aLong = bigDecimal.longValue();
        Integer integer = bigDecimal.intValue();

        bigDecimal.divide(new BigDecimal(100));

        bigDecimal.add(new BigDecimal(10)).add(new BigDecimal(20)).min(new BigDecimal(10));


        /*switch (true) {
            case (moyennearithmétique >= 18):
                System.out.println("Excell ent");
                break;
            case (moyennearithmétique < 18 && moyennearithmétique > 16):
                System.out.println("Très bien");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + true);
        }*/

        if (moyennearithmétique == moyennearithmétique) {
            System.out.println("Les 2 moyennes sont égales ");
        }

        String imran = new String("Imran");
        String zohir = new String("Zohir");

        if (imran.equals(zohir)) {

        }

        if (imran.compareTo(zohir) == 0) {

        }

        double max = Double.max(moyennearithmétique, moyennePondérée);


        //Exercice 2
/*
        String text3 = "exemple";
        String texteAvecEspace = text3.replace("em", "e m");
        System.out.println(texteAvecEspace);
        */

        String text4 = "exemple";
        String troisPC = text4.substring(0, 3);
        System.out.println(troisPC + " " + text4.substring(3, 7));


        System.out.println(troisPC + " " + text4.substring(3));

        int tailleString = text4.length();
        System.out.println(troisPC + " " + text4.substring(3, tailleString));

        int a =50, b = 12, c = 400, d = 1500;

        if (a >= b && a >= c & a >= d) {
            if (b >= c && b >= d) {
                if (c >= d) {
                    System.out.println("L'ordre est :" + a + " " + b + " " + c + " " + d);
                }else {
                    System.out.println("L'ordre est :" + a + " " + b + " " + d + " " + c);
                }
            }else if (c >= b && c >= d) {
                if (b >= d) {
                    System.out.println("L'ordre est :" + a + " " + c + " " + b + " " + d);
                }else {
                    System.out.println("L'ordre est :" + a + " " + c + " " + d + " " + b);
                }
            }else if (d >= c && d >= b) {
                if (b >= c) {
                    System.out.println("L'ordre est :" + a + " " + d + " " + b + " " + c);
                }else {
                    System.out.println("L'ordre est :" + a + " " + d + " " + c + " " + d);
                }
            }
        } else if (b >= a && b >= c && b >= d) {
            if (a >= c && a >= d) {
                if (c >= d) {
                    System.out.println("L'ordre est :" + b + " " + a + " " + c + " " + d);
                }else {
                    System.out.println("L'ordre est :" + b + " " + a + " " + d + " " + c);
                }
            }else if (c >= a && c >= d) {
                if (a >= d) {
                    System.out.println("L'ordre est :" + b + " " + c + " " + a + " " + d);
                } else {
                    System.out.println("L'ordre est :" + b + " " + c + " " + d + " " + a);
                }
            }else if (d >= a && d >= c) {
                if (a >= c) {
                    System.out.println("L'ordre est :" + b + " " + d + " " + a + " " + c);
                } else {
                    System.out.println("L'ordre est :" + b + " " + d + " " + c + " " + a);
                }
            }
        } else if (c >= a && c >= b && c >= d) {
            if (a >= b && a >= d) {
                if (b >= d) {
                    System.out.println("L'ordre est :" + c + " " + a + " " + b + " " + d);
                } else {
                    System.out.println("L'ordre est :" + c + " " + a + " " + d + " " + b);
                }
            } else if (b >= a && b >= d) {
                if (a >= d) {
                    System.out.println("L'ordre est :" + c + " " + b + " " + a + " " + d);
                } else {
                    System.out.println("L'ordre est :" + c + " " + b + " " + d + " " + a);
                }
            } else if (d >= a && b >= b) {
                if (a >= b) {
                    System.out.println("L'ordre est :" + c + " " + d + " " + a + " " + b);
                } else {
                    System.out.println("L'ordre est :" + c + " " + d + " " + b + " " + a);
                }
            }
        } else if (d >= a && d >= b && d >= c) {
            if (a >= c && a >= b) {
                if (c >= b) {
                    System.out.println("L'ordre est :" + d + " " + a + " " + c + " " + b);
                } else {
                    System.out.println("L'ordre est :" + d + " " + a + " " + b + " " + c);
                }
            } else if (b >= a && b >= c) {
                if (c >= a) {
                    System.out.println("L'ordre est :" + d + " " + b + " " + c + " " + a);
                } else {
                    System.out.println("L'ordre est :" + d + " " + b + " " + a + " " + c);
                }
            } else if (c >= a && c >= b) {
                if (a >= b) {
                    System.out.println("L'ordre est :" + d + " " + c + " " + a + " " + b);
                } else {
                    System.out.println("L'ordre est :" + d + " " + c + " " + b + " " + a);
                }
            }
        }
    }

}