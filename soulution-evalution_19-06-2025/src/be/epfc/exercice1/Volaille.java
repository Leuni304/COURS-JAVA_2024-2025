package be.epfc.exercice1;

import java.time.LocalDate;

public class Volaille extends Animal {
    private String coleurDePlume;


    public Volaille(String couleur, LocalDate dateNaissance, String taille, String nom, String paysDeVie, String couleurDesYeux, boolean estMamifere, String coleurDePlume) {
        super(couleur, dateNaissance, taille, nom, paysDeVie, couleurDesYeux, 2, estMamifere);

        this.setColeurDePlume(coleurDePlume);
    }

    public String getColeurDePlume() {
        return coleurDePlume;
    }

    public void setColeurDePlume(String coleurDePlume) {
        this.coleurDePlume = coleurDePlume;
    }

    public String vole(double hauteur) {
        return "Je suis " + getNom() + " et je vole à une hauteur de " + hauteur + " mètre(s)";
    }

    @Override
    public String mange() {
       return super.mange()+ "uniquement de la graine et des végétaux";
    }

    @Override
    public String toString() {
        return super.toString() + " --> " + "Volaille[" +
                "coleurDePlume='" + getColeurDePlume() + '\'' +
                ']';
    }
}
