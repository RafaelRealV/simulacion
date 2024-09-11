package generadorconclases;
public class Metodos {
    public void congruenciaLineal(int x0, int a, int c, int m, int n){
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;

        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            x0 = (a * x0 + c) % m;
            double aleatorio = (double) x0 / m;
            System.out.println("Numero: " + x0);
            System.out.println("Aleatorio: " + aleatorio);

            if (aleatorio >= 0 && aleatorio < 0.2){
                cont1++;
            } else if (aleatorio >= 0.2 && aleatorio <= 0.4) {
                cont2++;
            } else if (aleatorio > 0.4 && aleatorio <= 0.6) {
                cont3++;
            } else if (aleatorio > 0.6 && aleatorio <= 0.8) {
                cont4++;
            } else if (aleatorio > 0.8 && aleatorio <= 1) {
                cont5++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Cantidad en [0, 0.2): " + cont1);
        System.out.println("Cantidad en [0.2, 0.4]: " + cont2);
        System.out.println("Cantidad en (0.4, 0.6]: " + cont3);
        System.out.println("Cantidad en (0.6, 0.8]: " + cont4);
        System.out.println("Cantidad en (0.8, 1.0]: " + cont5);

        int total = cont1 + cont2 + cont3 + cont4 + cont5;
        System.out.println("Suma total de números: " + total);

        if (total == n) {
            System.out.println("La suma total es correcta.");
        } else {
            System.out.println("La suma total no coincide con la cantidad esperada.");
        }
    }

    public void clases(int n){
        int clases = (int) Math.sqrt((double)n);
        System.out.println("Numero de clases es: "+ clases);
    }
}
