package be.epfc.maison;

import java.util.HashSet;
import java.util.Set;

public class Adresse {
    private String nomRue;
    private String numeroRue;
    private String codePostal;
    private String nomDeLaCommune;
    private String ville;
    private String pays;



    public Adresse() {

    }

    public Adresse(String nomRue, String numeroRue, String codePostal, String nomDeLaCommune, String ville, String pays) {
        this.nomRue = nomRue;
        this.numeroRue = numeroRue;
        this.codePostal = codePostal;
        this.nomDeLaCommune = nomDeLaCommune;
        this.ville = ville;
        this.pays = pays;
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

    @Override
    public String toString() {
        return "Adresse[" +
                "nomRue='" + nomRue + '\'' +
                ", numeroRue='" + numeroRue + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", nomDeLaCommune='" + nomDeLaCommune + '\'' +
                ", ville='" + ville + '\'' +
                ", pays='" + pays + '\'' +
                ']';
    }
}
