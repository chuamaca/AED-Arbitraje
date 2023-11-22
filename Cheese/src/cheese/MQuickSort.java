/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cheese;

/**
 *
 * @author CJesusAc
 */
public class MQuickSort {
    public static void main(String[] args) {
        int[] arreglo = {2, 9, 23, 5, 1000, -12, 0, 11, -1};
        
        // Arreglo Inicial
        System.out.println("Arreglo inicial:");
        imprimirArreglo(arreglo);
        
        // Invocar método
        quicksort(arreglo, 0, arreglo.length - 1);
        
        // Arreglo final
        System.out.println("\nArreglo final:");
        imprimirArreglo(arreglo);
    }
    
    public static void quicksort(int[] arreglo, int izquierda, int derecha) {
        int pivote = arreglo[izquierda];
        int i = derecha;
        int j = izquierda;
        int aux;

        while (j < i) {
            while (arreglo[j] <= pivote && j < i) {
                j++;
            }
            while (arreglo[i] > pivote) {
                i--;
            }
            if (j < i) {
                // Intercambio
                aux = arreglo[j];
                arreglo[j] = arreglo[i];
                arreglo[i] = aux;

                imprimirArreglo(arreglo);
            }
        }
        // Ubicar el pivote en su posición final
        arreglo[izquierda] = arreglo[i];
        arreglo[i] = pivote;
        
        // Llamadas recursivas
        if (izquierda < i - 1) {
            quicksort(arreglo, izquierda, i - 1);
        }
        if (i + 1 < derecha) {
            quicksort(arreglo, i + 1, derecha);
        }
    }
    
    public static void imprimirArreglo(int[] arreglo) {
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println("\n----------");
    }
}
