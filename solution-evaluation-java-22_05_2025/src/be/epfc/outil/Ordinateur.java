package be.epfc.outil;

import java.time.LocalDate;

public class Ordinateur {
    private String numero, marque, capaciteDisqueDure, capaciteRam, capaciteProcesseur, couleur;
    private LocalDate dateFabrication;

    public Ordinateur(String numero, String marque, String capaciteDisqueDure, String capaciteRam, String capaciteProcesseur, String couleur, LocalDate dateFabrication) {
        this.numero = numero;
        this.marque = marque;
        this.capaciteDisqueDure = capaciteDisqueDure;
        this.capaciteRam = capaciteRam;
        this.capaciteProcesseur = capaciteProcesseur;
        this.couleur = couleur;
        this.dateFabrication = dateFabrication;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCapaciteDisqueDure() {
        return capaciteDisqueDure;
    }

    public void setCapaciteDisqueDure(String capaciteDisqueDure) {
        this.capaciteDisqueDure = capaciteDisqueDure;
    }

    public String getCapaciteRam() {
        return capaciteRam;
    }

    public void setCapaciteRam(String capaciteRam) {
        this.capaciteRam = capaciteRam;
    }

    public String getCapaciteProcesseur() {
        return capaciteProcesseur;
    }

    public void setCapaciteProcesseur(String capaciteProcesseur) {
        this.capaciteProcesseur = capaciteProcesseur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public LocalDate getDateFabrication() {
        return dateFabrication;
    }

    public void setDateFabrication(LocalDate dateFabrication) {
        this.dateFabrication = dateFabrication;
    }

    @Override
    public String toString() {
        return "Ordinateur[" +
                "numero='" + numero + '\'' +
                ", marque='" + marque + '\'' +
                ", capaciteDisqueDure='" + capaciteDisqueDure + '\'' +
                ", capaciteRam='" + capaciteRam + '\'' +
                ", capaciteProcesseur='" + capaciteProcesseur + '\'' +
                ", couleur='" + couleur + '\'' +
                ", dateConstruction=" + dateFabrication +
                ']';
    }
}
