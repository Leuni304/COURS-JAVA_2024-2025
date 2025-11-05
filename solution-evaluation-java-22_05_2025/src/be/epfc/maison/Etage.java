package be.epfc.maison;

import java.util.Set;

public class Etage {
    private int numero;
    private String couleur;
    private Set<Salle> salleSet;

    public Etage(){

     }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Set<Salle> getSalleSet() {
        return salleSet;
    }

    public void setSalleSet(Set<Salle> salleSet) {
        this.salleSet = salleSet;
    }

    @Override
    public String toString() {
        return "Etage[" +
                "numero=" + numero +
                ", couleur='" + couleur + '\'' +
                ']';
    }
}
