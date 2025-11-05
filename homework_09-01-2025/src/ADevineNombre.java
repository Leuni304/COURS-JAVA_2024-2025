import java.util.Scanner;

public class ADevineNombre {

    public static void main(String arg[]) {
        /*a)	Écrire un programme qui demande à votre voisin de gauche un nombre entre 0 et 10. Puis demande à votre voisin de droite de deviner
        ce nombre. S’il trouve tu affiches « trouvé », s’il se trompe tu lui donnes une indication "plus" ou "moins" pour
        l'orienter vers la bonne réponse. S’il rate 3 fois tu lui affiches la bonne réponse*/

        Scanner scanner = new Scanner(System.in);

        String voisinGauche = "Voisin de gauche";

        double nombreADeviner = -10;
        int nombreEssaiGauche = 1;

        while (nombreEssaiGauche <= 3) {
            System.out.println(voisinGauche + ", entrez un nombre entre 0 et 10");
            nombreADeviner = scanner.nextDouble();

            if (nombreADeviner >= 0 && nombreADeviner <= 10) {
                break;
            } else {
                System.out.println(voisinGauche + ", Erreur! Saisissez obligatoirement un nombre entre 0 et 10. Vous avez déjà fait " + (nombreEssaiGauche) + " essaie sur 3");
            }

            nombreEssaiGauche++;
        }

        if (nombreEssaiGauche > 3) {
            System.out.println(voisinGauche + ", vos essaies sont terminés.\n\nVotre dernier nombre saisi est " + nombreADeviner + ", et il n'est pas entre 0 et 10 comme demandé.");
        } else {
            int nombreEssaiDroite = 0;
            String voisinDroite = "Voisin de droite";

            do {
                System.out.println(voisinDroite + ", vous avez déjà effectué " + (nombreEssaiDroite) + " sur 3 tentatives.");

                System.out.println(voisinDroite + ", devinez le nombre saisi par le voisin de gauche (entre 0 et 10)");
                double nombreEntreDroite = scanner.nextDouble();

                if (nombreEntreDroite == nombreADeviner) {
                    System.out.println(voisinDroite + ", Bravo CHAMPION!!!!!! Vous avez trouvé");
                    break;
                } else if (nombreEntreDroite > nombreADeviner) {
                    System.out.println(voisinDroite + ", le nombre que vous avez saisi est plus grand que le nombre à deviner.");
                } else {
                    System.out.println(voisinDroite + ", le nombre que vous avez saisi est plus petit que le nombre à deviner.");
                }

                nombreEssaiDroite++;
            } while (nombreEssaiDroite < 3);

            if (nombreEssaiDroite == 3) {
                System.out.println("Vos nombres d'éssai sont terminés, le resultat est: " + nombreADeviner);
            }
        }
    }
}
