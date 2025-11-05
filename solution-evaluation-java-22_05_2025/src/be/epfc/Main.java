package be.epfc;

import be.epfc.maison.Adresse;
import be.epfc.maison.Etage;
import be.epfc.maison.Immeuble;
import be.epfc.maison.Salle;
import be.epfc.outil.Chaise;
import be.epfc.outil.Ordinateur;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
/*
        Monsieur KAMTO Maurice qui a des immeubles te contacte pour une informatisation. Dans un immeuble (qui a une seule adresse) il y a plusieurs étages,
         à chaque étage y a plusieurs salles et dans chaque salle il peut y avoir des ordinateurs ou  des chaises. Commence par modéliser ces informations
         via un diagramme de classe. Puis dans le package ayant pour nom « maison », créer la classe Immeuble (nom, date de construction),
         la classe Étage (numéro, couleur), la classe Salle (numéro, nom), la classe Adresse (nom de la rue, numéro rue, code postal, nom de la commune, ville, pays).
         Dans un autre package ayant pour nom « outil », créer la classe Ordinateur (numéro, marque, date de fabrication, capacité disque dur,
         capacité de la ram, capacité du processeur, couleur), la classe Chaise (numéro, couleur).
*/

        Immeuble immeuble1 = new Immeuble();
        immeuble1.setNom("epfc");
        immeuble1.setDateConstruction(LocalDate.of(2012, 12, 12));
        immeuble1.setEtageList(new ArrayList<>());

        Adresse adresse1 = new Adresse(
                "Avenue de l'Astronomie",
                "19",
                "1210",
                "Saint-Josse-ten-Noode",
                "Bruxelles",
                "Belgique"
        );

        immeuble1.setAdresse(adresse1);

        //Création des étages
        Etage etage_2 = new Etage();
        etage_2.setNumero(-2);
        etage_2.setCouleur("grise");
        etage_2.setSalleSet(new HashSet<>());
        immeuble1.getEtageList().add(etage_2);

        Etage etage_1 = new Etage();
        etage_1.setNumero(-1);
        etage_1.setCouleur("blanche");
        etage_1.setSalleSet(new HashSet<>());
        immeuble1.getEtageList().add(etage_1);

        Etage etage0 = new Etage();
        etage0.setNumero(0);
        etage0.setCouleur("noire");
        etage0.setSalleSet(new HashSet<>());
        immeuble1.getEtageList().add(etage0);

        Etage etage1 = new Etage();
        etage1.setNumero(1);
        etage1.setCouleur("verte");
        etage1.setSalleSet(new HashSet<>());
        immeuble1.getEtageList().add(etage1);

        Etage etage2 = new Etage();
        etage2.setNumero(2);
        etage2.setCouleur("rouge");
        etage2.setSalleSet(new HashSet<>());
        immeuble1.getEtageList().add(etage2);

        Etage etage3 = new Etage();
        etage3.setNumero(3);
        etage3.setCouleur("verte");
        etage3.setSalleSet(new HashSet<>());
        immeuble1.getEtageList().add(etage3);

        Etage etage4 = new Etage();
        etage4.setNumero(4);
        etage4.setCouleur("jaune");
        etage4.setSalleSet(new HashSet<>());
        immeuble1.getEtageList().add(etage4);

        Etage etage5 = new Etage();
        etage5.setNumero(5);
        etage5.setCouleur("bordeaux");
        etage5.setSalleSet(new HashSet<>());
        immeuble1.getEtageList().add(etage5);

        Etage etage6 = new Etage();
        etage6.setNumero(6);
        etage6.setCouleur("bleu");
        etage6.setSalleSet(new HashSet<>());
        immeuble1.getEtageList().add(etage6);

        Etage etage7 = new Etage();
        etage7.setNumero(7);
        etage7.setCouleur("orange");
        etage7.setSalleSet(new HashSet<>());
        immeuble1.getEtageList().add(etage7);

        Etage etage8 = new Etage();
        etage8.setNumero(8);
        etage8.setCouleur("bordeaux");
        etage8.setSalleSet(new HashSet<>());
        immeuble1.getEtageList().add(etage8);

        //Création des salles
        Salle salle1 = new Salle();
        salle1.setNumero(1);
        salle1.setNom("Fotso Victor");
        salle1.setChaiseSet(new HashSet<>());
        salle1.setOrdinateurSet(new HashSet<>());
        etage_2.getSalleSet().add(salle1);

        Salle salle2 = new Salle();
        salle2.setNumero(2);
        salle2.setNom("KAMTO Maurice");
        salle2.setChaiseSet(new HashSet<>());
        salle2.setOrdinateurSet(new HashSet<>());
        etage0.getSalleSet().add(salle2);

        Salle salle3 = new Salle();
        salle3.setNumero(3);
        salle3.setNom("Ngouchinghe  Sylvestre");
        salle3.setChaiseSet(new HashSet<>());
        salle3.setOrdinateurSet(new HashSet<>());
        etage1.getSalleSet().add(salle3);

        Salle salle4 = new Salle();
        salle4.setNumero(4);
        salle4.setNom("Um Nyobè");
        salle4.setChaiseSet(new HashSet<>());
        salle4.setOrdinateurSet(new HashSet<>());
        etage2.getSalleSet().add(salle4);

        Salle salle5 = new Salle();
        salle5.setNumero(5);
        salle5.setNom("Dangoté Aliko ");
        salle5.setChaiseSet(new HashSet<>());
        salle5.setOrdinateurSet(new HashSet<>());
        etage3.getSalleSet().add(salle5);

        Salle salle6 = new Salle();
        salle6.setNumero(6);
        salle6.setNom("Bona Richard");
        salle6.setChaiseSet(new HashSet<>());
        salle6.setOrdinateurSet(new HashSet<>());
        etage4.getSalleSet().add(salle6);

        Salle salle7 = new Salle();
        salle7.setNumero(7);
        salle7.setNom("Rolihlahla Mandela");
        salle7.setChaiseSet(new HashSet<>());
        salle7.setOrdinateurSet(new HashSet<>());
        etage5.getSalleSet().add(salle7);

        Salle salle8 = new Salle();
        salle8.setNumero(8);
        salle8.setNom("Soundjata Keïta");
        salle8.setChaiseSet(new HashSet<>());
        salle8.setOrdinateurSet(new HashSet<>());
        etage8.getSalleSet().add(salle8);

        Salle salle9 = new Salle();
        salle9.setNumero(9);
        salle9.setNom("Haïlé Sélassié");
        salle9.setChaiseSet(new HashSet<>());
        salle9.setOrdinateurSet(new HashSet<>());
        etage8.getSalleSet().add(salle9);

        Salle salle10 = new Salle();
        salle10.setNumero(10);
        salle10.setNom("Tombouctou");
        salle10.setChaiseSet(new HashSet<>());
        salle10.setOrdinateurSet(new HashSet<>());
        etage8.getSalleSet().add(salle10);

        //Création des Chaises
        Chaise chaise1 = new Chaise();
        chaise1.setNumero(1);
        chaise1.setCouleur("verte");
        salle10.getChaiseSet().add(chaise1);

        Chaise chaise2 = new Chaise();
        chaise2.setNumero(2);
        chaise2.setCouleur("rose");
        salle10.getChaiseSet().add(chaise2);

        Chaise chaise3 = new Chaise();
        chaise3.setNumero(3);
        chaise3.setCouleur("grise");
        salle1.getChaiseSet().add(chaise3);

        Chaise chaise4 = new Chaise();
        chaise4.setNumero(4);
        chaise4.setCouleur("maronne");
        salle7.getChaiseSet().add(chaise4);

        Chaise chaise5 = new Chaise();
        chaise5.setNumero(5);
        chaise5.setCouleur("violette");
        salle4.getChaiseSet().add(chaise5);

        //Création des ordinateurs
        Ordinateur ordi1 = new Ordinateur("1",
                "Hp",
                "500 GO",
                "4 GO",
                "Core i5",
                "noire",
                LocalDate.of(2012, 12, 12)
        );

        salle10.getOrdinateurSet().add(ordi1);

        Ordinateur ordi2 = new Ordinateur("2",
                "Asus ",
                "1 TO",
                "8 GO",
                "Core i3",
                "blanche",
                LocalDate.of(2025, 05, 22)
        );

        salle8.getOrdinateurSet().add(ordi2);

        Ordinateur ordi3 = new Ordinateur("2",
                "Iiyama ",
                "256 GO",
                "16 GO",
                "AMD Ryzen 9",
                "bleu",
                LocalDate.of(2022, 12, 29)
        );

        salle1.getOrdinateurSet().add(ordi3);

        Ordinateur ordi4 = new Ordinateur("4",
                "Del",
                "320 GO",
                "32 GO",
                "AMD Ryzen 5",
                "rouge",
                LocalDate.of(2012, 12, 12)
        );

        salle2.getOrdinateurSet().add(ordi4);

        Ordinateur ordi5 = new Ordinateur("5",
                "Lenovo",
                "500 GO",
                "64 GO",
                "Core Ultra 9",
                "grise",
                LocalDate.of(2020, 10, 30)
        );

        salle3.getOrdinateurSet().add(ordi5);

        Ordinateur ordi6 = new Ordinateur("6",
                "Acer ",
                "820 GO",
                "16 GO",
                "Core i7",
                "beige",
                LocalDate.of(2001, 9, 11)
        );

        salle4.getOrdinateurSet().add(ordi6);

        System.out.println("A.Affiche le nombre d’étages et nombre de salles que contient l’immeuble");
        afficheNbEtageEbSalle(immeuble1);
        System.out.println();


        System.out.println("B.Affiche chaque étage et son nombre total de salles (trier par ordre décroissant de nombre de salles");
        afficheNbSalleEtage(immeuble1);
        System.out.println();

        System.out.println(" C. Affiche la liste les ordinateurs dont la date de fabrication est la même que la date de construction de l’immeuble.");
        afficheOrdinateurDateEgalDateImmeuble(immeuble1);
        System.out.println();

        System.out.println(" D. Affiche la liste des chaises dont la couleur est la même que la couleur de l’étage");
        afficheChaiseCouleurEqualCouleurImmeuble(immeuble1);
    }

    /**
     * A.	Affiche le nombre d’étages et nombre de salles que contient l’immeuble
     */
    private static void afficheNbEtageEbSalle(Immeuble immeuble) {
        System.out.println("Le nombre total d'étage de l'immeuble est: " + immeuble.getEtageList().size());

        int nombreDeSalle = 0;

        for (Etage etage : immeuble.getEtageList()) {
            nombreDeSalle += etage.getSalleSet().size();
        }

        System.out.println("Le nombre total de salles de l'immeuble est: " + nombreDeSalle);
    }

    /**
     * B.	Affiche chaque étage et son nombre total de salles (trier par ordre décroissant de nombre de salles).
     */
    private static void afficheNbSalleEtage(Immeuble immeuble) {
        immeuble.getEtageList().sort((etage1, etage2) -> etage2.getSalleSet().size() - etage1.getSalleSet().size());

        for (Etage etage : immeuble.getEtageList()   ) {
            System.out.println(etage.toString()+" Tatal salles: "+etage.getSalleSet().size());
        }
    }

    /**
     * C.	Affiche la liste les ordinateurs dont la date de fabrication est la même que la date de construction de l’immeuble.
     */
    private static void afficheOrdinateurDateEgalDateImmeuble(Immeuble immeuble) {
        for (Etage etage:immeuble.getEtageList()) {
            for (Salle salle : etage.getSalleSet()) {
                for (Ordinateur ordinateur : salle.getOrdinateurSet()) {
                        if(immeuble.getDateConstruction().equals(ordinateur.getDateFabrication())){
                            System.out.println(ordinateur.toString());
                        }
                }
            }
        }

    }

    /**
     * D.	Affiche la liste des chaises dont la couleur est la même que la couleur de l’étage
     */
    private static void afficheChaiseCouleurEqualCouleurImmeuble(Immeuble immeuble) {
        for (Etage etage:immeuble.getEtageList()) {
            for (Salle salle : etage.getSalleSet()) {
                for (Chaise chaise : salle.getChaiseSet()) {
                    if(etage.getCouleur().equals(chaise.getCouleur())){
                        System.out.println(chaise.toString());
                    }
                }
            }
        }
    }
}
