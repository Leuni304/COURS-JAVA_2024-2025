import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BCalculAge {
    public static void main (String args[]){
        /*b)	Écrire un programme qui demande à l’utilisateur son nom, sa date de naissance puis calcule  son âge et lui affiche son nom suivie de son âge.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel est votre nom?");
        String nom = scanner.nextLine();

        System.out.println("Quelle est votre date de naissince (sous le format dd/MM/yyyy) ?");
        String dateNaissanceStr = scanner.nextLine();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dateNaissance =LocalDate.parse(dateNaissanceStr, dateTimeFormatter);

        LocalDate dateDuJour = LocalDate.now();

        Period period = Period.between(dateNaissance, dateDuJour);

        System.out.println(nom+", vous avez "+period.getYears()+" an(s) "+ period.getMonths()+" mois "+period.getDays()+" jour(s)");
    }
}
