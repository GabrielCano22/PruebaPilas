import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        Random rand = new Random();

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] resultado = new int[filas][columnas];

        // Llenar matrices con valores aleatorios y pintarlas
        System.out.println("Matriz 1:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = rand.nextInt(10); // Valores entre 0 y 9
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz 2:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz2[i][j] = rand.nextInt(10); // Valores entre 0 y 9
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        // Multiplicar matrices
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }

        // Llevar el resultado a una pila
        Stack<Integer> pila = new Stack<>();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                pila.push(resultado[i][j]);
            }
        }

        // Ordenar la pila de mayor a menor
        List<Integer> lista = new ArrayList<>(pila);
        Collections.sort(lista, Collections.reverseOrder());

        // Imprimir la pila de mayor a menor
        System.out.println("Pila ordenada de mayor a menor:");
        for (int valor : lista) {
            System.out.println(valor);
        }
    }
}