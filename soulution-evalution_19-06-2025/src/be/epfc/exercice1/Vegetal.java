package be.epfc.exercice1;

import java.time.LocalDate;

public class Vegetal extends Espece {
    private String couleurDeFleur;
    private CategorieEnum categorie;

    public Vegetal(String couleur, LocalDate dateNaissance, String taille, String nom, String paysDeVie, String couleurDeFleur, CategorieEnum categorie) {
        super(couleur, dateNaissance, taille, nom, paysDeVie);

        this.setCouleurDeFleur(couleurDeFleur);
        this.setCategorie(categorie);
    }

    public String getCouleurDeFleur() {
        return couleurDeFleur;
    }

    public void setCouleurDeFleur(String couleurDeFleur) {
        this.couleurDeFleur = couleurDeFleur;
    }

    public CategorieEnum getCategorie() {
        return categorie;
    }

    public void setCategorie(CategorieEnum categorie) {
        this.categorie = categorie;
    }

    public String respirer(){
        return "Je suis "+getNom()+" et je respire la nuit";
    }

    @Override
    public String toString() {
        return super.toString()+" --> "+"Vegetal[" +
                "couleurDeFleur='" + getCouleurDeFleur() + '\'' +
                ", categorie=" + getCategorie() +
                ']';
    }
}
