package be.epfc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExerciceC {
    private static final String PALINDROME = "palindromes";
    private static final String PAIRE = "nombres paires";
    private static final String IMPAIRE = "nombres impaires";
    private static final String PREMIER = "nombres premiers";
    private static final String NON_PALINDROME = "non palindromes";

    public static void main(String[] args) {
        /*C.	Hashing : Écrire un programme qui construit et affiche le tableau suivant  tel que vous le voyez:
            Fosto	20	5	Leuni
            15	Obaida	31	Rayzy
            Martine	59	radar	14
            Ésosé	ici	 29	reifier
            Par la suite, classe et affiche les palindromes, les nombres paires, les nombres impaires, les nombres premiers et les non palindromes.
        */

        String dataTab[][] = {{"Fosto", "20", "5", "Leuni"}, {"15",	"Obaida","31", "Rayzy"}, {"Martine", "59", "radar", "14"}, {"Ésosé", "ici", "29", "reifier"}};

        showData(dataTab);

        Map<String, List<String>> classifyDataReturn = classifyData(dataTab);

        System.out.println();

        showDataMap(classifyDataReturn);
    }

    public static void showData(String dataTab[][]) {
        System.out.println("This is the contain of your data base: element by element");
        for (int row = 0; row < dataTab.length; row++) {
            for (int col = 0; col < dataTab[row].length; col++) {
                System.out.print(" |" + dataTab[row][col] );
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public static Map<String, List<String>> classifyData(String[][] tabData) {
        Map<String, List<String>> classementMap = new HashMap<>();
        classementMap.put(PALINDROME, new ArrayList<>());
        classementMap.put(PAIRE, new ArrayList<>());
        classementMap.put(IMPAIRE, new ArrayList<>());
        classementMap.put(PREMIER, new ArrayList<>());
        classementMap.put(NON_PALINDROME, new ArrayList<>());

        for (int row = 0; row < tabData.length; row++) {
            for (int col = 0; col < tabData[row].length; col++) {
                if (!isNumber(tabData[row][col])) {
                    if (isPalindrome(tabData[row][col])) {
                        classementMap.get(PALINDROME).add(tabData[row][col]);
                    } else {
                        classementMap.get(NON_PALINDROME).add(tabData[row][col]);
                    }
                } else {
                    double myNumber = Double.parseDouble(tabData[row][col]);

                    if (isEvenNumber(myNumber) == true) {
                        classementMap.get(PAIRE).add(tabData[row][col]);
                    } else {
                        classementMap.get(IMPAIRE).add(tabData[row][col]);
                    }

                    if (isPrimeNumbers(myNumber)) {
                        classementMap.get(PREMIER).add(tabData[row][col]);
                    }
                }
            }
        }
        return classementMap;
    }

    public static boolean isNumber(String text) {
        if (text == null || text.trim() == "") {
            return false;
        }
        if (text.startsWith("0") || text.startsWith("1") || text.startsWith("2") || text.startsWith("3") || text.startsWith("4") || text.startsWith("5")
                || text.startsWith("6") || text.startsWith("7") || text.startsWith("8") || text.startsWith("9")) {
            return true;
        }

        return false;
    }

    public static boolean isPalindrome(String text) {
        int index = 0;
        for (int indexInverse = text.length() - 1; indexInverse >= text.length() / 2; indexInverse--) {

            if (text.toLowerCase().charAt(index) != text.toLowerCase().charAt(indexInverse)) {
                return false;
            }

            index++;
        }
        return true;
    }

    public static boolean isEvenNumber(double number) {
        return number % 2 == 0.0;
    }

    public static boolean isPrimeNumbers(double number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void showDataMap(Map<String, List<String>> classifyData) {
        System.out.println("This is the contain of your data base: classification");
        for (String key: classifyData.keySet()) {
                System.out.println(key+" ----> "+classifyData.get(key));
        }
    }
}
