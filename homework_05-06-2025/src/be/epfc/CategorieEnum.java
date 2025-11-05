package be.epfc;

public enum CategorieEnum {
    LIANE("Végétal en liane"),
    PLANTE("Végétal en plante"),
    ARBRE("Végétal en arbre");

    CategorieEnum(String nom) {
        this.nom = nom;
    }

    private String nom;
}
