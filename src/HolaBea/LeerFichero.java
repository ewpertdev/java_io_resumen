package HolaBea;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
    public static void Lectura(File fichero) {
        char[] texto = new char[100];
        try {
            FileReader salida = new FileReader(fichero);
            System.out.println("La codificación es: " + salida.getEncoding());
            System.out.println("La salida es: " + salida.read());
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
            public static void main (String[]args){
                // String ruta="\"";
                String ruta = "Fichero.txt";
                File fichero = new File(ruta);


                if (fichero.exists()) {
                    System.out.println("Leyendo..");
                    // Llamamos a la función de lectura
                    Lectura(fichero);

                } else {
                    System.out.println("no existe el fichero" + fichero.getAbsolutePath());
                    try {
                        if (fichero.createNewFile()) {
                            System.out.println("Fichero creado: " + fichero.getAbsolutePath());

                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

