package be.epfc;

public class Vegetal extends Espece {
    private String couleurDeFleur;
    private CategorieEnum categorie;

    protected Vegetal(String couleur, String age, String taille, String nom, String paysDeVie, String couleurDeFleur, CategorieEnum categorie) {
        super(couleur, age, taille, nom, paysDeVie);

        this.setCouleurDeFleur(couleurDeFleur);
        this.setCategorie(categorie);
    }

    public String getCouleurDeFleur() {
        return couleurDeFleur;
    }

    public void setCouleurDeFleur(String couleurDeFleur) {
        this.couleurDeFleur = couleurDeFleur;
    }

    public CategorieEnum getCategorie() {
        return categorie;
    }

    public void setCategorie(CategorieEnum categorie) {
        this.categorie = categorie;
    }

    public String respirer(){
        return "Je respire la nuit";
    }

    @Override
    public String toString() {
        return super.toString()+" --> "+"Vegetal[" +
                "couleurDeFleur='" + couleurDeFleur + '\'' +
                ", categorie=" + categorie +
                ']';
    }
}
