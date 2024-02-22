import java.util.Scanner;

public class Array04 {
    public static void main(String[] args) {
        double[] nota = new double[4];

        System.out.println("Para calcular la nota media necesito saber la nota de cada uno de tus exámenes.");
        Scanner s = new Scanner(System.in);
        for (int i=0; i<4; i++){
            System.out.println("Nota do examen nº " + (i + 1) + ": ");
            nota[i] = Double.parseDouble(s.nextLine());
        }
        System.out.println("Sus notas son: ");
        double suma = 0;

        for (int i=0; i<4; i++){
            System.out.println(nota[i] + " ");
            suma = suma + nota[i];
        }
        System.out.println("\nLa media es " + suma/4);
    }
}
