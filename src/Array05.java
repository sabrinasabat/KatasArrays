public class Array05 {
    public static void main(String[] args) {
        char[] caracter = new char[6];

        caracter[0] = 'R';
        caracter[1] = '%';
        caracter[2] = '&';
        caracter[3] = '+';
        caracter[4] = 'A';
        caracter[5] = '2';

        System.out.println("El array caracter contien los siguientes elementos: ");

        for (int i=0; i<6; i++){
            System.out.println(caracter[i]);
        }
    }
}

