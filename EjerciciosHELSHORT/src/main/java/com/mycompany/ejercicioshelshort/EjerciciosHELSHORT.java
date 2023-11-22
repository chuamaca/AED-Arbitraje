/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioshelshort;

import static com.mycompany.ejercicioshelshort.ShellSortDatabase.getConexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chuamani
 */
public class EjerciciosHELSHORT {

    public static void main(String[] args) {
       
        
       List<String> datosDesdeBD = obtenerDatosDesdeBaseDeDatos();
        System.out.println("Datos desde la base de datos:");
        printList(datosDesdeBD);

        // Aplicar el algoritmo de Shell Sort a la lista de datos
        shellSort(datosDesdeBD);

        System.out.println("Datos ordenados:");
        printList(datosDesdeBD);

    }
    
      public static List<String> obtenerDatosDesdeBaseDeDatos() {
        List<String> datos = new ArrayList<>();

        try (Connection connection = getConexion();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT ubigeo FROM USR_UBIGEO")) {

            while (resultSet.next()) {
                String valor = resultSet.getString("ubigeo");
                datos.add(valor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return datos;
    }
    
 
        public static <T extends Comparable<T>> void shellSort(List<T> list) {
        int n = list.size();

        // Inicializamos el espacio entre los elementos (gap)
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Realizamos el ordenamiento por inserción con el gap actual
            for (int i = gap; i < n; i++) {
                T temp = list.get(i);
                int j;

                // Desplazamos los elementos que son mayores que temp hacia adelante
                for (j = i; j >= gap && list.get(j - gap).compareTo(temp) > 0; j -= gap) {
                    list.set(j, list.get(j - gap));
                }

                // Colocamos temp en su posición correcta
                list.set(j, temp);
            }
        }
    }
        
          public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
