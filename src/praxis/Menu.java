package praxis;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ProductoServicio ps = ProductoServicio.getProductoServicio();

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {
            Utilidad.clearScreen();
            printMenu();

            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    ps.getListaProductos().forEach(x -> {
                        System.out.println(x.toString());
                        System.out.println("-".repeat(20));
                    });
                    break;
                case 2:
                    System.out.println("Ingrese código del producto");
                    String codigo = sc.nextLine();
                    ps.editProduct(codigo);
                    break;
                case 3:
                    ArchivoServicio.cargarDatos(ps, sc);
                    break;
                case 4:
                    System.out.println("Abandonando el sistema de clientes...");
                    Utilidad.sleep(2);
                    System.out.println("Acaba de salir del sistema");
                    Utilidad.sleep(1);
            }
        }
    }

    public static void printMenu() {
        System.out.println("1. Listar Productos");
        System.out.println("2. Editar datos");
        System.out.println("3. Importar datos");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opción: ");
    }
}