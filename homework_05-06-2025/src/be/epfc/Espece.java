package be.epfc;

public abstract class Espece {
    private String couleurGenerale;
    private String age;
    private String taille;
    private String nom;
    private String paysDeVie;

    protected Espece(String couleurGenerale, String age, String taille, String nom, String paysDeVie) {
        this.couleurGenerale = couleurGenerale;
        this.age = age;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
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

    protected abstract String respirer();

    @Override
    public String toString() {
        return "Espece[" +
                "couleurGenerale='" + couleurGenerale + '\'' +
                ", age='" + age + '\'' +
                ", taille='" + taille + '\'' +
                ", nom='" + nom + '\'' +
                ", paysDeVie='" + paysDeVie + '\'' +
                ']';
    }
}
