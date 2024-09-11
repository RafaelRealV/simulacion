
import java.util.ArrayList;

public class GeneradorNumerosAleatorios {

    public static void generarNumerosAleatorios(int semilla, int a, int c, int m) {
        int x = semilla;
        ArrayList<Integer> numerosGenerados = new ArrayList<>(); // Lista para almacenar números generados

        while (true) {
            x = (a * x + c) % m;
            System.out.println("Número generado: " + x);

            if (numerosGenerados.contains(x)) { // Verificar si el número ya fue generado
                System.out.println("Número repetido encontrado, deteniendo...");
                break;
            }

            numerosGenerados.add(x); // Añadir el número generado a la lista
        }
    }

    public static void main(String[] args) {
        int semilla = 4;
        int a = 1;
        int c = 3;
        int m = 5;

        generarNumerosAleatorios(semilla, a, c, m);
    }
}
