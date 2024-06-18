package praxis;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class ProductoServicio {
    private static ProductoServicio instance;

    private ArrayList<Producto> listaProductos;

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    private ProductoServicio() {
        this.listaProductos = new ArrayList<>();
    }

    public static ProductoServicio getProductoServicio() {
        if (instance == null) {
            instance = new ProductoServicio();
        }
        return instance;
    }

    public void editProduct(String codigo){
        Optional<Producto> opr = instance.getListaProductos().stream().filter(x -> x.getCodigo().equals(codigo)).findFirst();
        if (opr.isEmpty()){
            System.out.println("El código no está en la base de datos");
            return;
        }

        Producto pr = opr.get();
        int index = instance.getListaProductos().indexOf(pr);

        System.out.printf("1. El nombre del artículo actual es: %s\n", pr.getArticulo());
        System.out.printf("2. El código del producto: %s\n", pr.getCodigo());
        System.out.printf("3. El color del producto: %s\n", pr.getColor());
        System.out.printf("4. La descripción del producto: %s\n", pr.getDescripcion());
        System.out.printf("5. La marca del producto: %s\n", pr.getMarca());
        System.out.printf("6. El precio del producto: %s\n", pr.getPrecio());
        System.out.printf("7. La talla del producto: %s\n", pr.getTalla());

        System.out.println("Ingrese la opción a editar de los datos del producto");

        Scanner sc = new Scanner(System.in);

        int opcion = Integer.parseInt(sc.nextLine());

        switch (opcion){
            case 1:
                System.out.println("Ingrese el nuevo nombre del producto:");
                break;
            case 2:
                System.out.println("Ingrese el nuevo código del producto:");
                break;
            case 3:
                System.out.println("Ingrese el nuevo color del producto:");
                break;
            case 4:
                System.out.println("Ingrese la nueva descripción del producto:");
                break;
            case 5:
                System.out.println("Ingrese la nueva marca del producto:");
                break;
            case 6:
                System.out.println("Ingrese el nuevo precio del producto:");
                break;
            case 7:
                System.out.println("Ingrese la nueva talla del producto:");
                break;
        }

        String valor = sc.nextLine();

        switch (opcion){
            case 1:
                pr.setArticulo(valor);
                break;
            case 2:
                pr.setCodigo(valor);
                break;
            case 3:
                pr.setColor(valor);
                break;
            case 4:
                pr.setDescripcion(valor);
                break;
            case 5:
                pr.setMarca(valor);
                break;
            case 6:
                pr.setPrecio(valor);
                break;
            case 7:
                pr.setTalla(valor);
                break;
        }

        instance.getListaProductos().set(index,pr);
    }
}
