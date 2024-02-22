import java.util.Scanner;

public class Array06 {
    public static void main(String[] args) {
        int[] x = new int[5];

        x[0] = 77;
        x[1] = 25;
        x[2] = 59;
        x[3] = 10;
        x[4] = 43;

        System.out.println("Digite un número de 0 hasta 4 para saber qual es el número de esta posición: ");
        Scanner s = new Scanner(System.in);
        int indice = Integer.parseInt(s.nextLine());

        System.out.println("El elemento de la posicion " + indice + " es: ");
        System.out.println(x[indice]);

        System.out.println("Digite dos números para saber la suma de estas posiciones: ");
        int n1 = Integer.parseInt(s.nextLine());
        int n2= Integer.parseInt(s.nextLine());

        System.out.println(x[n1] + x[n2]);
    }
}
