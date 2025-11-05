package be.epfc;

public class Carnivore extends Animal {
    private DentitionPrincipal dentitionPrincipal;
    protected Carnivore(String couleur, String age, String taille, String nom, String paysDeVie, String couleurDesYeux, int nombreDePattes, boolean estMamifere, DentitionPrincipal dentitionPrincipal) {
        super(couleur, age, taille, nom, paysDeVie, couleurDesYeux, nombreDePattes, estMamifere);

        this.setDentitionPrincipal(dentitionPrincipal);
    }

    public DentitionPrincipal getDentitionPrincipal() {
        return dentitionPrincipal;
    }

    public void setDentitionPrincipal(DentitionPrincipal dentitionPrincipal) {
        this.dentitionPrincipal = dentitionPrincipal;
    }

    @Override
    public String mange(){
        return super.mange()+"plus de la viande";
    }

    @Override
    public String toString() {
        return super.toString()+" --> "+dentitionPrincipal.toString();
    }
}
