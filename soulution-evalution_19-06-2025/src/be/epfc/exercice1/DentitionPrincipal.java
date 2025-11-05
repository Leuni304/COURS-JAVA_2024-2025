package be.epfc.exercice1;

public class DentitionPrincipal {
    private int incisives, canines, premolaires;

    public DentitionPrincipal(int incisives, int canines, int premolaires) {
        this.setIncisives(incisives);
        this.setCanines(canines);
        this.setPremolaires(premolaires);
    }

    public int getIncisives() {
        return incisives;
    }

    public void setIncisives(int incisives) {
        this.incisives = incisives;
    }

    public int getCanines() {
        return canines;
    }

    public void setCanines(int canines) {
        this.canines = canines;
    }

    public int getPremolaires() {
        return premolaires;
    }

    public void setPremolaires(int premolaires) {
        this.premolaires = premolaires;
    }


    @Override
    public String toString() {
        return "DentitionPrincipal[" +
                "incisives=" + getIncisives() +
                ", canines=" + getCanines() +
                ", premolaires=" + getPremolaires() +
                ']';
    }
}

