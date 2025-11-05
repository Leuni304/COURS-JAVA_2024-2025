package be.epfc;

public class TacheMaison {
    public static void main(String []param) {
        //appeler de procédure Faisal pour preparer le repas
        preparerRepas();
        
        //appeler de fonction pour preparer le repas un tasse de citronnelle
        String monRepas = preparerRepas("Citronnelle", "Miel", "Croissant au chocolat");
        System.out.println(monRepas);

        String monRepasChezTakeAway= TakeAway.livrerRepas(2,"chaussée de gand 5", "Le boss","256214851");

        System.out.println(monRepasChezTakeAway);
    }

    public static void preparerRepas() {
        System.out.println("Le haricot rouge avec du riz fait par Faisal");
    }

    public static String preparerRepas(String ingredient1, String ingredient2, String ingredient3) {
        String repas ="Tisane de "+ingredient1 +" " +ingredient2 +" "+ ingredient3;
        return repas;
    }
}
