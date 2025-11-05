import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EpfcCollection {
    public static void main(String args[]) {
    /*Voici des nombres 7.23, 12, 20.19, 12, 4.2, 1.55, 7. Fait une collection
    qui contient ces nombres puis les afficher à l’écran dans l’ordre inversé de l’ajout.*/

        List<Double> maList = new ArrayList();
        maList.add(7.23);
        maList.add(12.0);
        maList.add(20.19);
        maList.add(12.0);
        maList.add(4.2);
        maList.add(1.55);
        maList.add(7.0);

        for (Double element : maList) {
            System.out.println(element);
        }

        //Ou
        System.out.println(maList);

        //Affichage inversé
        Collections.reverse(maList);
        System.out.println(maList);
    }




}
