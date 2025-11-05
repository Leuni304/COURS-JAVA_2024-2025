package be.epfc;

public class TakeAway {

    public static String livrerRepas(double prixRepas, String adresse, String nom, String telephone){
         if(prixRepas<5){
             return "Pas de repas à livrer pour moins de 5 euros";
         }

        if(adresse==null || adresse==""){
            return "Pas de repas à livrer sans adresse";
        }

        if(nom==null || nom==""){
            return "Pas de repas à livrer sans nom";
        }

        if(telephone==null || telephone==""){
            return "Pas de repas à livrer sans téléphone";
        }
        return "Le repas à livrer est le  NDOLET";
    }
}
