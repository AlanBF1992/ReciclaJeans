package praxis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ArchivoServicio {
    public static void cargarDatos(ProductoServicio ps, Scanner sc) {
        System.out.println("Cargar Datos");

        System.out.println("Ingresa la ruta en donde se encuentra el archivo");
        System.out.println("ProductosImportados.csv");
        String directorio = sc.nextLine();

        File archivo = new File(directorio,"ProductosImportados.csv");
        ArrayList<Producto> lista = new ArrayList<>();
        try {
            if (!archivo.exists()) {
                System.out.println("El archivo no existe en el directorio indicado");
                return;
            }
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            br.lines().forEach(x -> lista.add(new Producto(x.split(","))));

            ps.setListaProductos(lista);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
