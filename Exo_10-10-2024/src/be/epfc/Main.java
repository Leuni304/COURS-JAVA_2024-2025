package be.epfc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//A = (9 999 999 + 301 + 7365)
        int nombre1  = 9999999;
        int nombre2 = 301;
        int nombre3= 7365;

        int somme= nombre1 + nombre2 + nombre3;
        //Je demande à java d'afficher le texte "La somme des 3 nombres est : " en y ajoutant la valeur qui trouve dans la variable somme
        System.out.println("La somme des 3 nombres est : "+somme);

        //Exo2 Soustraction
        //Solution 1
        long soustraction =105632452-2000000000 -10000;
        System.out.println("soustraction= "+soustraction);
        //Sotution 2
        int nombre4  = 105632452;
        int nombre5 = 2000000000;
        int nombre6= 10000;
        long soustraction1 = nombre4-nombre5-nombre6;
        System.out.println("soustraction1= "+soustraction1);

        //Exo3 C = (2001 x 20 x 12)
        int multiplucation = 2001*20*12;
        System.out.println("multiplucation= "+multiplucation);

        //Exo 4 D = (726 / 15)
        double division= 726.0/15.0;
        System.out.println("division= "+division);

        //Exo5 (50 + 2 x 20 – 55 /5)
        //Solution 1: sans priorité des opératuer
        double operationMultiple = (50 + 2 * 20 -55 /5);
        System.out.println("operationMultiple= "+operationMultiple);
        //Solution 2: avec priorité dans les opérateurs
        double operationMultiple2 = (50D + (2D * 20D) -55D) /5;
        System.out.println("operationMultiple2= "+operationMultiple2);
        //Solution 3: avec autre forme de priorité dans les opérateurs
        double operationMultiple3 =  (((50 + 2) * 20) -55) /5;
        System.out.println("operationMultiple3= "+operationMultiple3);

        int numerateur = 1;
        int denominateur =4;
        int numerateur1 = 1;
        int denominateur1 = 5;

        int denominateurcommun = denominateur * denominateur1;

        int numerateur3 = (numerateur * denominateur1) + (denominateur * numerateur1);

        System.out.println("Le resultat de la fraction est : " +numerateur3+ "/" +denominateurcommun);

        String mot = "dégozard";

        System.out.println(mot.substring(0,3)+" "+mot.substring(3));

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        System.out.println("Enter a number");
       int number= myObj.nextInt();
        System.out.println("Number is: " + number);

    }
}
