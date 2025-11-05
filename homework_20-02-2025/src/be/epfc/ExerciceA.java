package be.epfc;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class ExerciceA {

    public static void main(String[] args) {
	/*A.	Écrire un programme qui tire au hasard 60 dates entre le premier jour de l’année précédant celle en cours et le dernier jour de la même
	année, puis les met dans une Map. Il ne doit pas avoir de doublon parmi les dates tirées. Les dates ayant le même mois sont mises ensemble.
	On affichera à l’utilisateur les dates mois par mois et dans chaque mois les dates sont triées de manière décroissante.
    NB : les dates doivent être  sous le format dd/MM/yyyy
    */

        Map<Integer, List<String>> integerSetDatesMap = createMapOfDates();

        System.out.println("Months     The dates of each month ");

        for (Integer month : integerSetDatesMap.keySet()) {
            System.out.println(month + "--------->" + integerSetDatesMap.get(month));
        }
    }

    private static Map<Integer, List<String>> createMapOfDates() {
        //Initialization of our Map
        //We choose a List to maintain order and facilitate sorting
        //If we choose a Set, we automatically handle duplicate dates but we cannot maintain order when we will sort the dates
        Map<Integer, List<String>> integerSetDatesMap = new HashMap<>();

        int previousYear = LocalDate.now().getYear() - 1;

        //LocalDate firstDayOfYear = LocalDate.of(currentYear, 1, 1);
        LocalDate lastDayOfPreviousYear = LocalDate.of(previousYear, 12, 31);
       // System.out.println("lastDayOfPreviousYear--->" + lastDayOfPreviousYear);
        Random random = new Random();

        //Definition of date format in french language
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.FRENCH);

        int numberOfDate = 0;

        while (numberOfDate < 60) {
            //We randomly draw a number of days of the year (between 0 and 366)
            int randomDateOfYear = random.nextInt(lastDayOfPreviousYear.getDayOfYear());
            //System.out.println("randomDateOfYear---->" + randomDateOfYear);

            if (randomDateOfYear > 0) {
                //Creation of my new date
                LocalDate newDate = LocalDate.ofYearDay(previousYear, randomDateOfYear);

                //We call the function to format the my new date
                String dateOnCorrectFormat = formatLocalDateToString(newDate, dateTimeFormatter);

                //If the month  of the date already exist in the Map
                if (integerSetDatesMap.containsKey(newDate.getMonthValue()) == true) {

                    //If my new date isn't in the list
                    if (integerSetDatesMap.get(newDate.getMonthValue()).contains(dateOnCorrectFormat) == false) {
                        //We take the month in the map and  we add it the new date
                        integerSetDatesMap.get(newDate.getMonthValue()).add(dateOnCorrectFormat);
                        numberOfDate++;

                        //We call the procedure to sort a list of dates in descending oder
                        sortedDates(integerSetDatesMap, newDate, dateTimeFormatter);
                    }
                } else {
                    //Else we add my new in my Map via a new List
                    List<String> collectionOfMothDate = new ArrayList<>();
                    collectionOfMothDate.add(dateOnCorrectFormat);

                    integerSetDatesMap.put(newDate.getMonthValue(), collectionOfMothDate);

                    numberOfDate ++;
                }
            }
        }

        return integerSetDatesMap;
    }

    private static void sortedDates(Map<Integer, List<String>> integerSetDatesMap, LocalDate myNewDate, DateTimeFormatter dateFormatter) {
        //We  sort a list of dates in descending oder
        integerSetDatesMap.get(myNewDate.getMonthValue()).sort((dateStr1, dateStr2) -> {
            //To facilitate the comparison, we convert string date to LocalDate
            LocalDate date1 = formatStringToLocalDate(dateStr1,dateFormatter);
            LocalDate date2 = formatStringToLocalDate(dateStr2, dateFormatter);

            if (date1.isEqual(date2)) {
                return 0;
            }
            if (date1.isAfter(date2)) {
                return -1;
            }
            return 1;
        });
    }

    private static String formatLocalDateToString(LocalDate myDate, DateTimeFormatter dateTimeFormatter ) {
        //Formatage de ma date en String d'abord
        String myDateStr = myDate.format(dateTimeFormatter);

        return myDateStr;
    }

    private static LocalDate formatStringToLocalDate(String myDateStr, DateTimeFormatter dateTimeFormatter ) {
        //Definition of date format in french language
        //DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.FRANCE);

        //Next, we format in type LocalDate
        LocalDate dateFormated = LocalDate.parse(myDateStr, dateTimeFormatter);

        return dateFormated;
    }
}
