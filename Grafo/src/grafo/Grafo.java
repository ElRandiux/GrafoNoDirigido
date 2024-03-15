package grafo;

/**
 *
 * @author randal
 */
public class Grafo {
    private int V; //
    private int[][] matriz; //

    public Grafo(int vertices) {
        this.V = vertices;
        matriz = new int[V][V];
    }

    public void agregarArista(int origen, int destino) {
        matriz[origen][destino] = 1;
        matriz[destino][origen] = 1;
    }

    public void imprimirMatriz() {
        System.out.println("Matriz:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 5; 
        Grafo grafo = new Grafo(V);

        
        grafo.agregarArista(0, 4);
        grafo.agregarArista(1, 1);
        grafo.agregarArista(3, 2);
        grafo.agregarArista(2, 3);
        grafo.agregarArista(1, 4);
        grafo.agregarArista(2, 3);
        grafo.agregarArista(3, 4);

        grafo.imprimirMatriz();
    }
}