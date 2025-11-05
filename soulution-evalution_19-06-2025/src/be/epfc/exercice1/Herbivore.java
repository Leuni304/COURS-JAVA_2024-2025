package be.epfc.exercice1;

import java.time.LocalDate;

public class Herbivore extends Animal {
    private int molaires;
    private DentitionPrincipal dentitionPrincipal;

    public Herbivore(String couleur, LocalDate dateNaissance, String taille, String nom, String paysDeVie, String couleurDesYeux, int nombreDePattes, boolean estMamifere, DentitionPrincipal dentitionPrincipal, int molaires ) {
        super(couleur, dateNaissance, taille, nom, paysDeVie, couleurDesYeux, nombreDePattes, estMamifere);
        this.setMolaires(molaires);
        this.setDentitionPrincipal(dentitionPrincipal);
    }

    public DentitionPrincipal getDentitionPrincipal() {
        return dentitionPrincipal;
    }

    public void setDentitionPrincipal(DentitionPrincipal dentitionPrincipal) {
        this.dentitionPrincipal = dentitionPrincipal;
    }

    public int getMolaires() {
        return molaires;
    }

    public void setMolaires(int molaires) {
        this.molaires = molaires;
    }

    @Override
    public String mange(){
        return super.mange()+"que des herbes";
    }

    @Override
    public String toString() {
        return super.toString()+" --> "+"Herbivore[" +
                "molaires=" + getMolaires() +
                ", dentitionPrincipal=" + getDentitionPrincipal().toString() +
                ']';
    }
}
