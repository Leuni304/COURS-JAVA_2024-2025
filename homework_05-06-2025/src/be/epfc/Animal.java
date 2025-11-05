package be.epfc;

public abstract class Animal extends Espece {
    private String couleurDesYeux;
    private int nombreDePattes;
    private boolean estMamifere;

    protected Animal(String couleur, String age, String taille, String nom, String paysDeVie, String couleurDesYeux, int nombreDePattes, boolean estMamifere) {
        super(couleur, age, taille, nom, paysDeVie);
        this.setCouleurDesYeux(couleurDesYeux);
        this.setNombreDePattes(nombreDePattes);
        this.setEstMamifere(estMamifere);
    }

    public String getCouleurDesYeux() {
        return couleurDesYeux;
    }

    public void setCouleurDesYeux(String couleurDesYeux) {
        this.couleurDesYeux = couleurDesYeux;
    }

    public int getNombreDePattes() {
        return nombreDePattes;
    }

    public void setNombreDePattes(int nombreDePattes) {
        this.nombreDePattes = nombreDePattes;
    }

    public boolean isEstMamifere() {
        return estMamifere;
    }

    public void setEstMamifere(boolean estMamifere) {
        this.estMamifere = estMamifere;
    }

    public String mange() {
        return "Je suis " + getNom() + " et je mange ";
    }

    public String marche() {
        return "Je suis " + getNom() + " et marche avec " + nombreDePattes + " pattes";
    }

    public String respirer() {
        return "Je suis " + getNom() + " et je respire le jour";
    }

    @Override
    public String toString() {
        return super.toString()+ " --> Animal[" +
                "couleurDesYeux='" + couleurDesYeux + '\'' +
                ", nombreDePattes=" + nombreDePattes +
                ", estMamifere=" + estMamifere +
                ']';
    }
}
