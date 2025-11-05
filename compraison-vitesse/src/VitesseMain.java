/**
 * Homework du 14/11/2024
 */
public class VitesseMain {
    public static void main(String args[]){
        //Voici la solution avec les variables primitives
        //TODO A toi de faire une solution avec la variable de référence BigDecimal
        //TODO A toi de faire une autre solution avec une variable de référence autre que BigDecimal

        //considérons les vitesses suivantes;
        double a =-50, b = 12, c = 400, d = 1500;

        if (a >= b && a >= c & a >= d) {
            if (b >= c && b >= d) {
                if (c >= d) {
                    System.out.println("L'ordre est :" + a + " " + b + " " + c + " " + d);
                }else {
                    System.out.println("L'ordre est :" + a + " " + b + " " + d + " " + c);
                }
            }else if (c >= b && c >= d) {
                if (b >= d) {
                    System.out.println("L'ordre est :" + a + " " + c + " " + b + " " + d);
                }else {
                    System.out.println("L'ordre est :" + a + " " + c + " " + d + " " + b);
                }
            }else if (d >= c && d >= b) {
                if (b >= c) {
                    System.out.println("L'ordre est :" + a + " " + d + " " + b + " " + c);
                }else {
                    System.out.println("L'ordre est :" + a + " " + d + " " + c + " " + d);
                }
            }
        } else if (b >= a && b >= c && b >= d) {
            if (a >= c && a >= d) {
                if (c >= d) {
                    System.out.println("L'ordre est :" + b + " " + a + " " + c + " " + d);
                }else {
                    System.out.println("L'ordre est :" + b + " " + a + " " + d + " " + c);
                }
            }else if (c >= a && c >= d) {
                if (a >= d) {
                    System.out.println("L'ordre est :" + b + " " + c + " " + a + " " + d);
                } else {
                    System.out.println("L'ordre est :" + b + " " + c + " " + d + " " + a);
                }
            }else if (d >= a && d >= c) {
                if (a >= c) {
                    System.out.println("L'ordre est :" + b + " " + d + " " + a + " " + c);
                } else {
                    System.out.println("L'ordre est :" + b + " " + d + " " + c + " " + a);
                }
            }
        } else if (c >= a && c >= b && c >= d) {
            if (a >= b && a >= d) {
                if (b >= d) {
                    System.out.println("L'ordre est :" + c + " " + a + " " + b + " " + d);
                } else {
                    System.out.println("L'ordre est :" + c + " " + a + " " + d + " " + b);
                }
            } else if (b >= a && b >= d) {
                if (a >= d) {
                    System.out.println("L'ordre est :" + c + " " + b + " " + a + " " + d);
                } else {
                    System.out.println("L'ordre est :" + c + " " + b + " " + d + " " + a);
                }
            } else if (d >= a && b >= b) {
                if (a >= b) {
                    System.out.println("L'ordre est :" + c + " " + d + " " + a + " " + b);
                } else {
                    System.out.println("L'ordre est :" + c + " " + d + " " + b + " " + a);
                }
            }
        } else if (d >= a && d >= b && d >= c) {
            if (a >= c && a >= b) {
                if (c >= b) {
                    System.out.println("L'ordre est :" + d + " " + a + " " + c + " " + b);
                } else {
                    System.out.println("L'ordre est :" + d + " " + a + " " + b + " " + c);
                }
            } else if (b >= a && b >= c) {
                if (c >= a) {
                    System.out.println("L'ordre est :" + d + " " + b + " " + c + " " + a);
                } else {
                    System.out.println("L'ordre est :" + d + " " + b + " " + a + " " + c);
                }
            } else if (c >= a && c >= b) {
                if (a >= b) {
                    System.out.println("L'ordre est :" + d + " " + c + " " + a + " " + b);
                } else {
                    System.out.println("L'ordre est :" + d + " " + c + " " + b + " " + a);
                }
            }
        }
    }
}
