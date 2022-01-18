package uri1174arrayselection1;

import java.util.Scanner;

public class URI1174ArraySelection1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float A[] = new float[10];

        for (int i = 0; i < A.length; i++) {
            A[i] = entrada.nextFloat();
        }
        for (int i = 0; i < A.length; i++) {

            if (A[i] <= 10) {
                System.out.print("A [" + i + "] = ");
                System.out.printf("%.1f", A[i]);
                System.out.println();
            }
        }
    }

}
