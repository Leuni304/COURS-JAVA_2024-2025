package be.epfc.maison;

import java.time.LocalDate;
import java.util.List;

public class Immeuble {
    private String nom;
    private LocalDate dateConstruction;
    private Adresse adresse;
    private List<Etage> etageList;

    public Immeuble(){
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setDateConstruction(LocalDate dateConstruction) {
        this.dateConstruction = dateConstruction;
    }
    public LocalDate getDateConstruction() {
        return dateConstruction;
    }

    public List<Etage> getEtageList() {
        return etageList;
    }

    public void setEtageList(List<Etage> etageList) {
        this.etageList = etageList;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Immeuble[" +
                "nom='" + nom + '\'' +
                ", dateConstruction=" + dateConstruction +
                ']';
    }
}
