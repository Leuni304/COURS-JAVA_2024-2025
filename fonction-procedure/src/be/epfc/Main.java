package be.epfc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	/*Voici des nombres 7.23, 12, 20.19, 12, 4.2, 1.55, 7. Fait une collection
    qui contient ces nombres puis les afficher à l’écran dans l’ordre inversé de l’ajout.*/

        List<Double> uneListe = remplirCollection();

        for (Double element : uneListe) {
            System.out.println(element);
        }

        inversionDeList(uneListe);
        //Ou
        System.out.println(uneListe);
    }

    public static List<Double> remplirCollection(){
        List<Double> maList = new ArrayList();
        maList.add(7.23);
        maList.add(12.0);
        maList.add(20.19);
        maList.add(12.0);
        maList.add(4.2);
        maList.add(1.55);
        maList.add(7.0);
        return maList;
    }

        public static void inversionDeList(List<Double> doubleList){
        //Affichage inversé
        Collections.reverse(doubleList);
        System.out.println(doubleList);
    }
}
