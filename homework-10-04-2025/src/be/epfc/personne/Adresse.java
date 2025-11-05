package be.epfc.personne;

import java.util.HashSet;
import java.util.Set;

public class Adresse {
    private String nomRue;
    private String numeroRue;
    private String codePostal;
    private String nomDeLaCommune;
    private String ville;
    private String pays;

    Set<Personne> personneSet = new HashSet<>();

    public Adresse() {

    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public String getNumeroRue() {
        return numeroRue;
    }

    public void setNumeroRue(String numeroRue) {
        this.numeroRue = numeroRue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getNomDeLaCommune() {
        return nomDeLaCommune;
    }

    public void setNomDeLaCommune(String nomDeLaCommune) {
        this.nomDeLaCommune = nomDeLaCommune;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Set<Personne> getPersonneSet() {
        return personneSet;
    }

    public void addPersonne(Personne personne) {
        this.personneSet.add(personne);
    }
}
