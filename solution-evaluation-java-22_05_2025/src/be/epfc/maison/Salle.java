package be.epfc.maison;

import be.epfc.outil.Chaise;
import be.epfc.outil.Ordinateur;

import java.util.Set;

public class Salle {
    private int numero;
    private String nom;
    private Set<Ordinateur>ordinateurSet;
    private Set<Chaise> chaiseSet;

    public Salle (){

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Set<Ordinateur> getOrdinateurSet() {
        return ordinateurSet;
    }

    public void setOrdinateurSet(Set<Ordinateur> ordinateurSet) {
        this.ordinateurSet = ordinateurSet;
    }

    public Set<Chaise> getChaiseSet() {
        return chaiseSet;
    }

    public void setChaiseSet(Set<Chaise> chaiseSet) {
        this.chaiseSet = chaiseSet;
    }

    @Override
    public String toString() {
        return "Salle[" +
                "numero=" + numero +
                ", nom='" + nom + '\'' +
                ']';
    }
}
