import java.util.Scanner;
// Importamos la clase Scanner de java.util.
// Scanner sirve para leer datos introducidos por teclado.
// En este programa se utiliza para pedir al usuario un número.

public class Main {
    // Declaramos la clase principal llamada Main.
    // En Java, todo el código debe estar dentro de una clase.

    public static void  main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {

            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    validarNumero();
                    break;
                case 2:
                    contarConFor();
                    break;
                case 0:
                    System.out.println("Saliendo de programa...");
                    break;
                default:
                    System.out.println("No es una opción válida");
            }


        } while (opcion != 0);
    }

    public static void mostrarMenu(){
        System.out.println("\n---MENÚ---");
        System.out.println("1. Validar Número ");
        System.out.println("2. Prueba de For ");
        System.out.println("0. Salir ");
        System.out.println("Elige una opción:");
    }

    public static void validarNumero() {
        // Este método se encarga de pedir un número al usuario
        // y repetir la petición mientras el número no sea positivo.

        Scanner sc = new Scanner(System.in);
        // Creamos un objeto Scanner llamado "sc".
        // System.in representa la entrada estándar, es decir, el teclado.
        // Gracias a esto podemos leer lo que el usuario escribe.

        int numero;
        // Declaramos una variable entera llamada "numero".
        // Se usará para guardar el valor introducido por el usuario.

        System.out.println("\nIntroduce un número positivo:");
        // Mostramos un mensaje en pantalla pidiendo un número positivo.
        // "\n" añade un salto de línea antes del texto.

        numero = sc.nextInt();
        // Leemos el número entero que escribe el usuario
        // y lo guardamos en la variable "numero".

        while (numero <= 0) {
            // Este bucle while se ejecuta MIENTRAS el número sea menor o igual que 0.
            // Es decir, mientras el número no sea positivo.
            // Si el usuario introduce 0 o un número negativo, seguirá entrando aquí.

            System.out.println("Error , tiene que ser positivo:");
            // Avisamos al usuario de que el valor introducido no es válido.

            numero = sc.nextInt();
            // Volvemos a pedir otro número y sobrescribimos el valor anterior.
        }

        System.out.println("Numero: " + numero);
        // Cuando el número ya es positivo, salimos del while
        // y mostramos el valor correcto introducido.

    }

    public static void contarConFor() {
        // Este método contiene varios ejemplos de conteo usando bucles.
        // Aunque el nombre dice "ConFor", también incluye un ejemplo con while.

        // secuencia conteo del 1 al 10
        System.out.println("\n\tContando de 1 a 10:");
        // Mostramos un título por pantalla.
        // "\n" inserta una línea en blanco antes.
        // "\t" inserta una tabulación.

        int n = 1;
        // Declaramos una variable entera "n" e inicializamos su valor a 1.
        // Será el contador del bucle while.

        while (n <= 10) {
            // Este bucle while se repite mientras n sea menor o igual que 10.
            // Empieza en 1 y termina en 10.

            System.out.println(n + " ");
            // Imprime el valor actual de n seguido de un espacio.
            // Como usamos println, cada número saldrá en una línea distinta.

            n++;
            // Incrementamos n en 1.
            // Equivale a: n = n + 1;
        }

        for (int i = 1; i <= 10; i++) {
            // Bucle for que cuenta de 1 a 10.
            // int i = 1    -> inicializa el contador en 1
            // i <= 10      -> condición para seguir repitiendo
            // i++          -> aumenta el contador en 1 en cada vuelta

            System.out.print(i + " ");
            // Imprime cada número en la misma línea, separado por espacios.
            // print no hace salto de línea.
        }

        for (int i = 10; i > 0; i--) {
            // Este for cuenta hacia atrás desde 10 hasta 1.
            // int i = 10   -> empieza en 10
            // i > 0        -> sigue mientras sea mayor que 0
            // i--          -> decrementa 1 en cada iteración

            System.out.print(i + " ");
            // Imprime los números descendentes en la misma línea.
        }

        System.out.println();
        // Hace un salto de línea para que la siguiente salida no quede pegada.

        for (int i = 0; i <= 10; i += 2) {
            // Este for muestra números pares desde 0 hasta 10.
            // i empieza en 0.
            // i <= 10 indica el límite.
            // i += 2 significa que va sumando 2 cada vez.
            // Así recorre: 0, 2, 4, 6, 8, 10.

            System.out.print(i + " ");
            // Imprime los números pares.
        }

        System.out.println();
        // Salto de línea.

        for (int i = 0; i <= 10; i++) {
            // Este bucle recorre todos los números del 0 al 10.

            if (i % 2 != 0) {
                // i % 2 obtiene el resto de dividir i entre 2.
                // Si el resto NO es 0, significa que el número es impar.

                System.out.print("Impar :" + i + " ");
                // Mostramos que el número es impar.
            } else {
                // Si no entra en el if, significa que el resto es 0,
                // por tanto el número es par.

                System.out.print("Par :" + i + " ");
                // Mostramos que el número es par.
            }
        }

        System.out.println();
        // Salto de línea al terminar la secuencia de pares e impares.

        System.out.println("\nTabla simple: ");
        // Mostramos un título para una pequeña tabla de multiplicar.

        for (int i = 1; i <= 3; i++) {
            // Este bucle exterior controla la tabla que estamos mostrando.
            // i toma los valores 1, 2 y 3.
            // Así se mostrarán las tablas del 1, del 2 y del 3.

            for (int j = 1; j <= 10; j++) {
                // Este bucle interior recorre del 1 al 10.
                // Para cada valor de i, multiplica i por j.
                // Por ejemplo, si i = 2, genera:
                // 2x1=2, 2x2=4, 2x3=6... hasta 2x10=20

                System.out.print(i + "x" + j + "=" + (i * j) + " ");
                // Construimos y mostramos cada operación:
                // por ejemplo: 3x4=12
                // (i * j) calcula el resultado de la multiplicación.
            }

            System.out.println();
            // Cuando termina la fila de una tabla, hacemos un salto de línea
            // para pasar a la siguiente tabla.
        }
    }
}