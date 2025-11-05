package be.epfc.exercice1;

import java.time.LocalDate;

public class Carnassier extends Animal {
    private DentitionPrincipal dentitionPrincipal;
    public Carnassier(String couleur, LocalDate dateNaissance, String taille, String nom, String paysDeVie, String couleurDesYeux, int nombreDePattes, boolean estMamifere, DentitionPrincipal dentitionPrincipal) {
        super(couleur, dateNaissance, taille, nom, paysDeVie, couleurDesYeux, nombreDePattes, estMamifere);
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
        return super.mange()+"uniquement de la viande fraiche";
    }

    @Override
    public String toString() {
        return super.toString()+" --> "+getDentitionPrincipal().toString();
    }
}
