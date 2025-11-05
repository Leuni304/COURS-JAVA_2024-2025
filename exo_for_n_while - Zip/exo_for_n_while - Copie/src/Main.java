//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//Exercice : for
        int i;
        for (i = 0; i < 19 ; ++i) ;

        System.out.print("Les ");
        ++i;
        System.out.print("élections ");
        ++i;
        System.out.print("communales ");
        ++i;
        System.out.print("2024 ");
        ++i;
        System.out.print("sont ");
        ++i;
        System.out.print("terminée.");
        ++i;
        System.out.print(" Nous ");
        ++i;
        System.out.print("avons ");
        ++i;
        System.out.print("votés,");
        ++i;
        System.out.print(" maintenant ");
        ++i;
        System.out.print("nous ");
        ++i;
        System.out.print("laissons ");
        ++i;
        System.out.print("la ");
        ++i;
        System.out.print("place ");
        ++i;
        System.out.print("à ");
        ++i;
        System.out.print("la ");
        ++i;
        System.out.print("mafia ");
        ++i;
        System.out.print("des ");
        ++i;
        System.out.print("coalitions.");

System.out.println();

//Exercice tableau
//Addition
        double[] tableau = {7.23, 12, 20.19, 4.2, 1.55, 7};
        for (int i1 = 0; i1 < 1; i1++) {


            double sommeTableau = 0;
            for (double tableau1 : tableau) {
                sommeTableau += tableau1;
            }
            double resultat_tableau_somme = sommeTableau;
            System.out.println("La somme du tableau est : " + resultat_tableau_somme);
        }

//Multiplication
        double[] tableau2 = {7.23, 12, 20.19, 4.2, 1.55, 7};
        for (int i1 = 0; i1 < 1; i1++) {


            double multiplicationTableau = 1;
            for (double tableau3 : tableau2) {
                multiplicationTableau *= tableau3;
            }
            double resultat_tableau_multi = multiplicationTableau;
            System.out.println("Le coefficient du tableau est : " + resultat_tableau_multi);
        }
    }
}