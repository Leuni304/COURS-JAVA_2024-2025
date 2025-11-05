import java.math.BigDecimal;

public class CBigDecimal {

    public static void main(String arg[]) {
       /* c)	Voici un tableau de BigDecimal  [-5.1, 4.7, 23, 1, 3, -3.4, 11]. Écrire un préprogramme qui calcule et affiche la somme,
       le produit de tous ces nombres (résultat avec 2 chiffres après la virgule).  Le même programme  doit aussi afficher le plus grand et
       le plus petit de  tous ces nombres.*/

        BigDecimal[] bigDecimalTab = {
                BigDecimal.valueOf(-5.1),
                BigDecimal.valueOf(4.7),
                BigDecimal.valueOf(23),
                BigDecimal.valueOf(1),
                BigDecimal.valueOf(3),
                BigDecimal.valueOf(-3.4),
                BigDecimal.valueOf(11)
        };

        BigDecimal somme = BigDecimal.valueOf(0);
        BigDecimal produit = BigDecimal.valueOf(1);

        double max = 0;
        double min = 0;

        for (BigDecimal nombre : bigDecimalTab) {
            somme = somme.add(nombre);
            produit = produit.multiply(nombre);

            if (nombre.doubleValue() >= max) {
                max = nombre.doubleValue();
            }

            if (nombre.doubleValue() <= min) {
                min = nombre.doubleValue();
            }
        }

        System.out.println("La somme des nombres est : "+somme.setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("Le produit des nombres est : "+produit.setScale(2, BigDecimal.ROUND_HALF_UP));
        System.out.println("Le plus grand des nombres est : "+max);
        System.out.println("La plus petit des nombre est : "+min);
    }
}
