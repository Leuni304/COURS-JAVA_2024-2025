package be.epfc.exercice1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Espece {
    private String couleurGenerale;
    private LocalDate dateNaissance;
    private String taille;
    private String nom;
    private String paysDeVie;
    private List<Espece> jeMeNourriDe =new ArrayList<>();

    protected Espece(String couleurGenerale, LocalDate dateNaissance, String taille, String nom, String paysDeVie) {
        this.couleurGenerale = couleurGenerale;
        this.dateNaissance = dateNaissance;
        this.taille = taille;
        this.nom = nom;
        this.paysDeVie = paysDeVie;
    }

    public String getCouleurGenerale() {
        return couleurGenerale;
    }

    public void setCouleurGenerale(String couleurGenerale) {
        this.couleurGenerale = couleurGenerale;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPaysDeVie() {
        return paysDeVie;
    }

    public void setPaysDeVie(String paysDeVie) {
        this.paysDeVie = paysDeVie;
    }

    public List<Espece> getJeMeNourriDe() {
        return jeMeNourriDe;
    }

    public void seNourrir(Espece espece) {
        this.jeMeNourriDe.add(espece);
    }

    protected abstract String respirer();

    @Override
    public String toString() {
        return "Espece[" +
                "couleurGenerale='" + getCouleurGenerale() + '\'' +
                ", age='" + getDateNaissance() + '\'' +
                ", taille='" + getTaille() + '\'' +
                ", nom='" + getNom() + '\'' +
                ", paysDeVie='" + getPaysDeVie() + '\'' +
                ']';
    }
}
