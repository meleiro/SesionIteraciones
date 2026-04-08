import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //contarConFor();
        validarNumero();

    }

    public static void validarNumero(){
        Scanner sc = new Scanner (System.in);
        int numero;
        System.out.println("\nIntroduce un número positivo:");
        numero = sc.nextInt();

        while (numero <= 0) {
            System.out.println("Error , tiene que ser positivo:");
            numero = sc.nextInt();
        }

        System.out.println("Numero: " + numero);


    }

    public static void contarConFor() {

        //secuencia conteo del 1 al 10
        System.out.println("\n\tContando de 1 a 10:");

        int n = 1;
        while (n <= 10){
            System.out.println(n + " ");
            n++;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }


        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            if( i%2 != 0 ) {
                System.out.print("Impar :" + i + " ");
            } else {
                System.out.print("Par :" + i + " ");
            }

        }

        System.out.println();
        System.out.println("\nTabla simple: ");
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 10; j++){
                System.out.print(i + "x" + j + "=" + (i * j) + " " );
            }
            System.out.println();
        }




    }

}
