import java.io.*;

class CrearFicheroConClase {
    public static void main(String[]args){
        File testing = new File("testing.txt");

        try {
            if(testing.createNewFile()) {
                System.out.println("Fichero creado: " + testing.getName());
            } else {
                System.out.println("Fichero no creado porque ya existe");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}