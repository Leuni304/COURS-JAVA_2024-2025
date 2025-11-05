import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExoA {
    public static void main(String arg[]) {
       /* a.	Mettre dans une collection tous les nombres de 0 à 100, puis les afficher à l’écran dans l’ordre inversé de l’ajout.
                Puis supprimer dans votre collection le nombre 10, 50 et 80.
        Afficher à l’écran l’indice de chaque nombre supprimé. Affiche aussi à l’écran le contenu de votre collection sans les nombres supprimés.*/

        List<Integer> mesNombres = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            mesNombres.add(i);
        }

        System.out.println("Affichage normal:");
        System.out.println(mesNombres);
        System.out.println();

        System.out.println("Affichage dans l’ordre inversé de l’ajout:");
        Collections.reverse(mesNombres);
        System.out.println(mesNombres);
        System.out.println();

        System.out.println("Affichage des nombres supprimés :");
        Integer indice10 = mesNombres.indexOf(10);
        Integer indice50 = mesNombres.indexOf(50);
        Integer indice80 = mesNombres.indexOf(80);
        System.out.println("indice10="+indice10+ ", indice50="+indice50+ ", indice80="+indice80);
        System.out.println();

        System.out.println("Contenu de votre collection sans les nombres supprimés");
        mesNombres.remove(10);
        mesNombres.remove(50);
        mesNombres.remove(80);
        System.out.println(mesNombres);
    }
}
