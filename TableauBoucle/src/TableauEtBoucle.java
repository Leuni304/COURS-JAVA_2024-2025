import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.OptionalDouble;

public class TableauEtBoucle {
    public static void main(String arg[]) {
        //chaque mot de la phrase

        String phrase = "les élections communales 2024 sont terminée. Nous avons votés, maintenant nous laissons la place à la mafia des coalitions";
        String phraseTableau[] = phrase.split(" ");

        // version avec foreach
        System.out.println("Les mots de la phrase sont-------->version avec foreach:");
        for (String mot : phraseTableau) {
            System.out.println(mot);
        }

        // version avec for
        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("Les mots de la phrase sont---->version avec for:");
        for (int i = 0; i < phraseTableau.length; i++) {
            System.out.println(phraseTableau[i]);
        }

        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("Les mots de la phrase sont ------>version avec while:");
        int i = 0;
        while (i < phraseTableau.length) {
            System.out.println(phraseTableau[i]);
            i++;
        }

        //Exo multiplication
        double mesNombres[] = {7.23, 12, 20.19, 4.2, 1.55, 7};
        double produit = 1;
        double somme = 0;
        //foreach
        for (double nombre: mesNombres) {
            produit *= nombre;
            somme = somme + nombre;
        }

        double quotientLastFirst = mesNombres[mesNombres.length-1]/mesNombres[0];

        System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("Exo multiplication ");

        //Défini un format de nombres avec 3 chiffres apprès la virgule
        DecimalFormat decimalFormat = new DecimalFormat( "#.###" );

        System.out.println(produit);
        System.out.println("Le produit des nombres du tableau est: "+decimalFormat.format(produit));
        System.out.println("Le somme des nombres du tableau est: "+somme);
        System.out.println("Le quotient du dernier nombre du tableau par le premier est: "+decimalFormat.format(quotientLastFirst));

        double sum = Arrays.stream(mesNombres).reduce(0, (acc, val) -> acc + val);
        System.out.println("sum: "+sum);

        double produit2 = Arrays.stream(mesNombres).reduce(1, (acc, val) -> acc * val);
        //Affiche le nombre avec 2 chiqffres apprès la virgule
        System.out.printf("produit2: %.2f", produit2);
    }
}
