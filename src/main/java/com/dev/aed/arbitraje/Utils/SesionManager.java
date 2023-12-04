/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dev.aed.arbitraje.Utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 *
 * @author ccastro
 */
public class SesionManager {
    
      public static void guardarSesion(String clave, String valor) {
        Properties properties = new Properties();
        properties.setProperty(clave, valor);

        try (OutputStream output = new FileOutputStream("sesion.properties")) {
            properties.store(output, "Sesión guardada");
        } catch (IOException e) {
            e.printStackTrace();
            // Manejar el error según tus necesidades
        }
    }
      
      public static String cargarSesion(String clave) {
        Properties properties = new Properties();

        try (InputStream input = new FileInputStream("sesion.properties")) {
            properties.load(input);
            return properties.getProperty(clave);
        } catch (IOException e) {
            e.printStackTrace();
            // Manejar el error según tus necesidades
            return null;
        }
    }
    
}
