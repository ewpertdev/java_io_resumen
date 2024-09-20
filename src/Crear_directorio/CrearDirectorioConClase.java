package Crear_directorio;

import java.io.*;

class CrearDirectorioConClase {
    public static void main(String[] args) {
        File testing = new File(".\\testing\\");
        try {
            if(testing.mkdirs()) {
                System.out.println("Directorio creado. " + testing.getAbsolutePath());
            } else
                System.out.println("Directorio no ha sido creado porque ya existe");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
