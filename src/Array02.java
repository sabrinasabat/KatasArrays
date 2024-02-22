import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        //definicion del array y reserva de memoria en la misma linea
        int[] x = new int[5];

        x[0] = 8;
        x[1] = 33;
        x[2] = 200;
        x[3] = 150;
        x[4] = 11;

        Scanner s = new Scanner(System.in);

        System.out.println("El array x tiene 5 elementos ¿Cuál de ellos quiere ver?");
        System.out.println("Introduzca un número de 0 al 4: ");
        int indice = Integer.parseInt(s.nextLine());

        System.out.println("El elemento que se encuentra en la posicion " + indice);
        System.out.println(" es el: " + x[indice]);

    }





}