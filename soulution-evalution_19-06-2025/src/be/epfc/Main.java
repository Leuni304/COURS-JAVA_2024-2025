package be.epfc;

import be.epfc.exercice1.*;
import be.epfc.exercice2.Ecosysteme;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Ecosysteme ecosysteme1 = new Ecosysteme("1", "Bona Richard");
        Ecosysteme ecosysteme2 = new Ecosysteme("2", "KAMTO Maurice");

        List<Animal> animalList = new ArrayList<>();

        DentitionPrincipal dentitionHerbivore = new DentitionPrincipal(8, 10, 2);

        Herbivore herbivore1 = new Herbivore("grise foncée",
                LocalDate.of(2010, 10, 10),
                "1,5 mètre", "Hippopotame", "Cameroun", "Noire", 4, true, dentitionHerbivore, 4
        );

        Herbivore herbivore2 = new Herbivore("maronne",
                LocalDate.of(1995, 1, 1),
                "12 mètres", "Girafe", "Congo RDC", "Noire", 4, true, dentitionHerbivore, 12
        );

        animalList.add(herbivore1);
        animalList.add(herbivore2);


        DentitionPrincipal dentitionCarnassier = new DentitionPrincipal(7, 12, 4);

        Carnassier carnassier1 = new Carnassier("Brune",
                LocalDate.of(2012, 12, 12),
                "1 mètre", "Lion", "Tchad", "Noire", 4, true, dentitionCarnassier
        );

        Carnassier carnassier2 = new Carnassier("Noire",
                LocalDate.of(1997, 1, 1),
                "7 mètres", "Anaconda", "Brésil", "Verte", 0, false, dentitionCarnassier
        );

        animalList.add(carnassier1);
        animalList.add(carnassier2);

        Volaille volaille1 = new Volaille("Noire",
                LocalDate.of(2022, 10, 12),
                "0.2 mètre", "Corbeau", "Norvège", "Noire", false, "multicolor"
        );

        Volaille volaille2 = new Volaille("Rouge",
                LocalDate.of(1995, 1, 1),
                "0.35 mètre", "Hibou", "Afrique du sud",
                "Blanche cassée", false, "blanche et grise"
        );

        animalList.add(volaille1);
        animalList.add(volaille2);

        List<Vegetal> vegetalList = new ArrayList<>();

        Vegetal vegetal1 = new Vegetal("Verte", LocalDate.of(2015, 11, 3), "20 metres", "Barbadine", "Cameroun", "Violette", CategorieEnum.LIANE);
        vegetalList.add(vegetal1);

        Vegetal vegetal2 = new Vegetal("Ombragée", LocalDate.of(1905, 1, 1), "180 metres", "Bubinga", "Argentine", "Rose", CategorieEnum.ARBRE);
        vegetalList.add(vegetal2);

        carnassier1.seNourrir(herbivore2);
        ecosysteme1.ajouterEspece(carnassier1);

        carnassier2.seNourrir(herbivore1);
        ecosysteme2.ajouterEspece(carnassier2);

        herbivore1.seNourrir(vegetal1);
        ecosysteme2.ajouterEspece(herbivore1);

        herbivore2.seNourrir(vegetal2);
        ecosysteme1.ajouterEspece(herbivore2);

        volaille1.seNourrir(herbivore1);
        volaille1.seNourrir(carnassier2);
        ecosysteme1.ajouterEspece(volaille1);

        volaille2.seNourrir(herbivore2);
        volaille2.seNourrir(carnassier1);
        ecosysteme2.ajouterEspece(volaille2);

        vegetal1.seNourrir(carnassier1);
        vegetal1.seNourrir(volaille1);
        vegetal1.seNourrir(herbivore1);
        ecosysteme1.ajouterEspece(vegetal1);

        vegetal2.seNourrir(carnassier1);
        vegetal2.seNourrir(carnassier2);
        vegetal2.seNourrir(volaille2);
        vegetal2.seNourrir(herbivore2);
        ecosysteme2.ajouterEspece(vegetal2);

        afficheAction(animalList, vegetalList);

        calculAge(ecosysteme1, ecosysteme2);

        ecosystemeAndEspece(ecosysteme1, ecosysteme2);

        sortEspeces(ecosysteme1, ecosysteme2);

        afficheAttributs(animalList, vegetalList);
    }

    //1.	Dans la classe Main faire manger, marcher, voler vos animaux
    public static void afficheAction(List<Animal> especeList, List<Vegetal> vegetalList) {
        System.out.println("\nB1)");
        System.out.println("----Les animaux----");
        for (Animal animal : especeList) {
            if (animal instanceof Herbivore) {
                System.out.println("Un herbivore");
            } else if (animal instanceof Carnassier) {
                System.out.println("Un carnassier");
            } else if (animal instanceof Volaille) {
                System.out.println("Un volaille");
            }

            System.out.println(animal.mange());
            System.out.println(animal.marche());
            System.out.println(animal.respirer());

            if (animal instanceof Volaille) {
                if (animal.getNom() == "Hibou") {
                    System.out.println(((Volaille) animal).vole(1000));
                } else if (animal.getNom() == "Corbeau") {
                    System.out.println(((Volaille) animal).vole(30));
                }
            }
            System.out.println();
        }

        System.out.println("----Les végétaux----");

        for (Vegetal vegetal : vegetalList){
            System.out.println(vegetal.respirer());
        }
    }

    //2.	Calculer et afficher l’âge de chaque espèce
    public static void calculAge(Ecosysteme ecosysteme1, Ecosysteme ecosysteme2) {
        System.out.println("\nB2)");
        System.out.println("Calcul des ages");
        LocalDate today = LocalDate.now();

        ecosysteme1.getEspeceList().forEach(espece -> {
            Period age = Period.between(espece.getDateNaissance(), today);
            System.out.println("\tNon de l'espèce: [" + espece.getNom() + "] Age: [" + age.getYears() + "ans " + age.getMonths() + "mois " + age.getDays() + "jours]");
        });

        ecosysteme2.getEspeceList().forEach(espece -> {
            Period age = Period.between(espece.getDateNaissance(), today);
            System.out.println("\tNon de l'espèce: [" + espece.getNom() + "] Age: [" + age.getYears() + "ans " + age.getMonths() + "mois " + age.getDays() + "jours]");
        });
    }

    //3.	Afficher chaque écosystème et l’ensemble de ses espèces
    public static void ecosystemeAndEspece(Ecosysteme ecosysteme1, Ecosysteme ecosysteme2) {
        System.out.println("\nB3)");
        System.out.println("Ecosystème et l’ensemble de ses espèces");
        System.out.println("\t---["+ecosysteme1.getNumero()+" : "+ecosysteme1.getNom()+"]---");
        ecosysteme1.getEspeceList().forEach(espece -> System.out.println("\t"+espece.toString()));

        System.out.println("\n\t---["+ecosysteme2.getNumero()+" : "+ecosysteme2.getNom()+"]---");
        ecosysteme2.getEspeceList().forEach(espece -> System.out.println("\t"+espece.toString()));

    }

    //4.	Afficher la liste de ce que mange chaque espèce en les classant  par ordre décroissant du nombre total de ce qu’il se nourrit.
    public static void sortEspeces(Ecosysteme ecosysteme1, Ecosysteme ecosysteme2){
        System.out.println("\nB4)");
        System.out.println("Classement pas ordre décroissant");
        List<Espece> allEspeces = new ArrayList<> (ecosysteme1.getEspeceList());
        allEspeces.addAll(ecosysteme2.getEspeceList());

        allEspeces.sort((espece1, espece2) -> espece2.getJeMeNourriDe().size() - espece1.getJeMeNourriDe().size());

        for (Espece espece: allEspeces) {
            System.out.println("\t"+espece.getNom()+" ---> Nombre total d'espèces mangé ["+espece.getJeMeNourriDe().size()+"]");
        }
    }

    //5.	Afficher tous les attributs de chaque espèce (utilise la méthode toString())
    public static void afficheAttributs(List<Animal> especeList, List<Vegetal> vegetalList) {
        System.out.println("\nB5)");
        System.out.println("Les animaux");
        for (Animal animal : especeList) {
            System.out.println("Attributs: " + animal.toString());
        }

        System.out.println("\nLes végataux");
        for (Vegetal vegetal : vegetalList) {
            System.out.println("Attributs: " + vegetal.toString());
        }
    }
}
