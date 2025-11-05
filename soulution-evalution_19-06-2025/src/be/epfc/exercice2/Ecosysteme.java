package be.epfc.exercice2;

import be.epfc.exercice1.Espece;

import java.util.ArrayList;
import java.util.List;

public class Ecosysteme {
    private String numero;
    private String nom;
    private List<Espece>especeList= new ArrayList<>();

    public Ecosysteme(String numero, String nom) {
        this.setNumero(numero);
        this.setNom(nom);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void ajouterEspece(Espece espece){
        this.especeList.add(espece);
    }

    public List<Espece> getEspeceList(){
        return this.especeList;
    }
}
