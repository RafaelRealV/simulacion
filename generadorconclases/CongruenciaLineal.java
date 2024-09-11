package generadorconclases;
import java.util.Scanner;

public class CongruenciaLineal {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa semilla: ");
        int x0 = sc.nextInt();

        System.out.print("ingresa valor a: ");
        int a = sc.nextInt();

        System.out.print("Ingresa valor c: ");
        int c = sc.nextInt();

        System.out.print("Ingresa valor m: ");
        int m = sc.nextInt();

        System.out.print("Ingresa cantidad de numeros a generar: ");
        int n = sc.nextInt();

        metodos.congruenciaLineal(x0, a, c, m, n);
        metodos.clases(n);

    }
}
