import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ExoC {
    public static void main(String arg[]) {
/* 3)	c.	Écrire un programme qui tire au hasard 50 dates différentes, entre le premier jour de l’année en cours et
le dernier jour de la même année, puis classe ces dates dans l’ordre croissant.  On affichera à l’utilisateur les dates
 dans l’ordre où elles ont été tirées et  dans l’ordre trié. Affiche aussi la date
 la plus ancienne et celle la plus récente.
 NB : les dates doivent être  sous le format année-mois-jour.
*/

        List<LocalDate> monTableuDeDates = new ArrayList<>();

        int currentYear = LocalDate.now().getYear();

        //LocalDate firstDayOfYear = LocalDate.of(currentYear, 1, 1);
        LocalDate lastDayOfYear = LocalDate.of(currentYear, 12, 31);

        Random random = new Random();

        while (monTableuDeDates.size() < 50) {
            //On tire au hasard un nombre de jour de l'année (entre 0 et 366)
            int randomDateOfYear = random.nextInt(lastDayOfYear.getDayOfYear());

            LocalDate newDate = LocalDate.ofYearDay(currentYear, randomDateOfYear);
            monTableuDeDates.add(newDate);
        }

        System.out.println("Affichage des dates dans l'ordre tiré:");
        System.out.println(monTableuDeDates);
        System.out.println();

        System.out.println("Affichage des dates dans l'ordre trié:");
        monTableuDeDates.sort(Comparator.comparingInt(LocalDate::getDayOfYear));
        System.out.println(monTableuDeDates);
        System.out.println();

        System.out.println("Affichage de la date la plus ancienne:");
        System.out.println(monTableuDeDates.get(0));
        System.out.println();

        System.out.println("Affichage de la date la plus récente:");
        System.out.println(monTableuDeDates.get(monTableuDeDates.size()-1));

    }
}
