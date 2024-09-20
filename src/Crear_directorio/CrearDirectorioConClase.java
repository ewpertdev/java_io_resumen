package Crear_directorio;

import java.io.*;

class CrearDirectorioConClase {
    public static void main(String[] args) {
        // Creamos un directorio usando un path relativo
        // que se encuentra dentro del proyecto
        File testing = new File(".\\testing\\");
        try {
            if (testing.mkdirs()) {
                System.out.println("Directorio creado");
            } else
                System.out.println("Directorio no ha sido creado porque ya existe");

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("El directorio se encuentra en: " + testing.getAbsolutePath());
    }

}
