package be.epfc.outil;

public class Chaise {
    private int numero;
    private String couleur;

    public Chaise(){

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

    @Override
    public String toString() {
        return "Chaise[" +
                "numero=" + numero +
                ", couleur='" + couleur + '\'' +
                ']';
    }
}
