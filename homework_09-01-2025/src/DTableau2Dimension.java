public class DTableau2Dimension {

    public static void main (String arg[]){
        /*d)	Exercices pratiques sur les tableaux à 2 dimensions.
                Écrire un programme qui affiche le tableau suivant dans cet ordre.*/

        int [][] tableau2Dimenssion = {{18,28,18,28},{45,90,45,0}};


        for (int ligne = 0; ligne< tableau2Dimenssion.length; ligne++) {
            System.out.print("|");
            for (int colonne = 0; colonne < tableau2Dimenssion[ligne].length; colonne++) {
                System.out.print(tableau2Dimenssion[ligne][colonne]+"|");
            }
            System.out.println("\n-------------------------------");
        }
    }
}
