package HolaBea;

import java.io.*;

public class LeerFichero {
    public static void LecturaBuffer(File fichero) {
        try {
            FileReader salida = new FileReader(fichero);
            BufferedReader buffer = new BufferedReader(salida);
            String texto="";

//            while((texto=buffer.readLine()!=null)){
//                System.out.println(texto);
//            }
            while(texto!=null){
                texto=buffer.readLine();
                System.out.println(texto);
            }

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void Escritura (String ruta){
        try{
            FileWriter fichero = new FileWriter(ruta);
            PrintWriter pw = new PrintWriter(fichero);

            for(int i=0; i<10;i++) {
                pw.write("numero \n"+"\n"+i);
            }
            fichero.close();
        } catch(Exception e) {
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
//                    Lectura(fichero);
                    LecturaBuffer(fichero);
                    Escritura(ruta);

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

