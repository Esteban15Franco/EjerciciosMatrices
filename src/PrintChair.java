import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintChair {
    public static void main(String[] args) {
        int n = 0;
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Ingrese el tamaño de la matriz n*n: ");
            n = s.nextByte();

        }catch (InputMismatchException e){
            main(args);
            System.exit(0);
        }

        if (n == 0){
            System.err.println("No se puede crear una matriz 0*0...");
            System.exit(1);
        }

        String[][] matriz = new String[n][n];

        for (int i = 0; i< n; i++){
            for (int j = 0; j< n; j++){
                if (j == 0 || (i== n/2) || (j ==n-1 && i > n/2 )){
                    matriz[i][j] = "1";
                }else {
                    matriz[i][j] = "0";
                }
            }
        }

        for (int i = 0; i< n; i++){
            for (int j = 0; j< n; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }

    }
}
