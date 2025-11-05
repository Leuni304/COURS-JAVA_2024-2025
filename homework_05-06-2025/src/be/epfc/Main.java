package be.epfc;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> especeList = new ArrayList<>();

        DentitionPrincipal dentitionCarnivore = new DentitionPrincipal(8, 4, 8);
        Carnivore carnivore1 = new Carnivore("noire",
                "5 ans",
                "0,9 mètre", "Chien", "Belgique", "Bleu", 4, true, dentitionCarnivore
        );

        Carnivore carnivore2 = new Carnivore("grise",
                "1 ans",
                "0,5 mètre", "Chat", "Maroc", "Rouge", 4, true, dentitionCarnivore
        );

        especeList.add(carnivore1);
        especeList.add(carnivore2);

        DentitionPrincipal dentitionHerbivore = new DentitionPrincipal(8, 10, 2);

        Herbivore herbivore1 = new Herbivore("grise foncée",
                "1 ans",
                "1,5 mètre", "Hippopotame", "Cameroun", "Noire", 4, true, dentitionHerbivore, 4
        );

        Herbivore herbivore2 = new Herbivore("maronne",
                "30 ans",
                "12 mètres", "Girafe", "Congo RDC", "Noire", 4, true, dentitionHerbivore, 12
        );

        especeList.add(herbivore1);
        especeList.add(herbivore2);

        DentitionPrincipal dentitionOmnivore = new DentitionPrincipal(9, 8, 10);

        Omnivore omnivore1 = new Omnivore("Noire",
                "60 ans",
                "1,80 mètre", "Humain", "Allemand", "Noire", 4, true, dentitionOmnivore
        );
        Omnivore omnivore2 = new Omnivore("Blanche",
                "60 ans",
                "1,1 mètre", "Porc", "Cameroun - Dschang", "Noire", 4, true, dentitionOmnivore
        );

        especeList.add(omnivore1);
        especeList.add(omnivore2);

        DentitionPrincipal dentitionCarnassier = new DentitionPrincipal(7, 12, 4);

        Carnassier carnassier1 = new Carnassier("Brune",
                "15 ans",
                "1 mètre", "Lion", "Tchad", "Noire", 4, true, dentitionCarnassier
        );

        Carnassier carnassier2 = new Carnassier("Noire",
                "8 ans",
                "7 mètres", "Anaconda", "Brésil", "Verte", 0, false, dentitionCarnassier
        );

        especeList.add(carnassier1);
        especeList.add(carnassier2);

        Volaille volaille1 = new Volaille("Noire",
                "3 ans",
                "0.2 mètre", "Corbeau", "Norvège", "Noire",false, "multicolor"
        );

        Volaille volaille2 = new Volaille("Rouge",
                "2,3 ans",
                "0.35 mètre", "Hibou", "Afrique du sud",
                "Blanche cassée",false, "blanche et grise"
        );

        especeList.add(volaille1);
        especeList.add(volaille2);

        for (Animal animal : especeList) {
            if (animal instanceof Herbivore){
                System.out.println("Un herbivore");
            }else if (animal instanceof  Omnivore){
                System.out.println("Un omnivore");
            }else if (animal instanceof  Carnivore){
                System.out.println("Un carnivore");
            }else if (animal instanceof  Carnassier){
                System.out.println("Un carnassier");
            }else if (animal instanceof  Volaille){
                System.out.println("Un volaille");
            }
            
            System.out.println(animal.mange());
            System.out.println(animal.marche());

            if (animal instanceof Volaille) {
                if (animal.getNom() == "Hybou") {
                    System.out.println(((Volaille) animal).vole(1000));
                } else if (animal.getNom() == "Corbeau") {
                    System.out.println(((Volaille) animal).vole(30));
                }
            }

            System.out.println(animal.toString()+"\n");
        }

        System.out.println("Les végétaux");
        Vegetal vegetal1 = new Vegetal("Verte", "10 ans", "20 metres", "Barbadine", "Cameroun", "Violette", CategorieEnum.LIANE);
        System.out.println(vegetal1.toString() );

        Vegetal vegetal2 = new Vegetal("Ombragée", "100 ans", "180 metres", "Bubinga", "Argentine", "Rose", CategorieEnum.ARBRE);
        System.out.println(vegetal2.toString() );
    }
}
