import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExoB {
    public static void main(String arg[]) {
/*2)Écrire un programme qui tire au hasard des nombres
        entre 1 et 100 pour remplir un tableau. Le tirage s’arrête dès
        qu’on a tiré un nombre  dont sa partie entière est un nombre premier. Dans un premier temps, affiche à
        l’utilisateur ces nombres dans l’ordre où ils ont été tirés.
        Dans un deuxième temps, affiche à l’utilisateur ces nombres dans
        l’ordre trié, du plus grand au plus petit.
        NB : les nombres ne doivent pas avoir plus de 2 chiffres après la virgule.
*/

        System.out.println("Ce programme tire au hasard des nombres entre 1 et 100 pour remplir un tableau et s'arrête dès qu'il a tiré un nombre premier.\n Puis affiche le tableau trié dans l'orde décrossant.\n");

        boolean estPremier = false;
        List<BigDecimal> tableauDeNombre = new ArrayList<>();
        int indixeTab = 0;
        int min = 1;
        int max = 100;

        while (!estPremier) {
            double nombre = (Math.random() * (max - min)) + min;
            BigDecimal nombreTire = BigDecimal.valueOf(nombre).setScale(2, BigDecimal.ROUND_HALF_UP);


            tableauDeNombre.add(nombreTire);
            int partieEntiere = nombreTire.intValue();
            estPremier =true;

            for (int i = 2; i <= Math.sqrt(partieEntiere); i++) {
                if (partieEntiere % i == 0) {
                    estPremier = false;
                    break;
                }
            }
        }


        /*String affichageNonTrie = "";
        tableauDeNombre.forEach(element -> {
                affichageNonTrie += element + "  ";
        });*/
        System.out.println("Nombre tiré: " + tableauDeNombre + "\n");

       Collections.sort(tableauDeNombre);

       Collections.reverse(tableauDeNombre);

        System.out.println("Nombre ordonnés: " + tableauDeNombre);

        System.out.println("Max tiré: "+tableauDeNombre.get(0)+" Min tiré: "+tableauDeNombre.get(tableauDeNombre.size()-1));

        /*console.log("Nombre tiré: "+tableauDeNombre+"\n"
            +"\n"
            +"Nombre ordonnés: "+tableauDeNombre.sort().reverse()
        );*/

    }
}
