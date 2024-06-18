package praxis;

public class Producto {
    private String articulo;
    private String precio;
    private String descripcion;
    private String codigo;
    private String talla;
    private String marca;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getArticulo() {
        return articulo;
    }

    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }

    @Override
    public String toString() {
        return "Datos del Producto:\n" +
                "Nombre artículo: " + articulo + '\n' +
                "Código: " + codigo + '\n' +
                "Marca: " + marca + '\n' +
                "Color: " + color + '\n' +
                "Descripción: " + descripcion + '\n' +
                "Precio: " + precio + '\n' +
                "Talla: " + talla;
    }

    public Producto(String articulo, String precio, String descripcion, String codigo, String talla, String marca, String color) {
        this.articulo = articulo;
        this.precio = precio;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.talla = talla;
        this.marca = marca;
        this.color = color;
    }

    public Producto(String[] csvLine) {
        this.articulo = csvLine[0];
        this.precio = csvLine[1];
        this.descripcion = csvLine[2];
        this.codigo = csvLine[3];
        this.talla = csvLine[4];
        this.marca = csvLine[5];
        this.color = csvLine[6];
    }
}
