import java.util.Scanner;

public class PrintX {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la matriz n*n: ");
        n = s.nextByte();

        String[][] matriz = new String[n][n];

        for (int i = 0; i< n; i++){
            for (int j = 0; j< n; j++){
                if (i == j || (i+j == n-1)){
                    matriz[i][j] = "X";
                }else {
                    matriz[i][j] = "_";
                }
            }
        }

        for (int i = 0; i< n; i++){
            for (int j = 0; j< n; j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
