package Cerveceria;

public class Articulo {

    private String idArticulo;
    private String nombreArticulo;
    private String descripcionArticulo;
    private Double precioArticulo;
    private Integer cantidadArticulo;
    private String proveedorPerteneciente;

    public Articulo() {
        this.idArticulo = "";
        this.nombreArticulo = "";
        this.descripcionArticulo = "";
        this.precioArticulo = 0.0;
        this.cantidadArticulo = 0;
        this.proveedorPerteneciente = "";
    }

    public String getIdArticulo() {
        return idArticulo;
    }
    public Boolean setIdArticulo(String idArticulo) {
        if(idArticulo.length() == 8 && idArticulo.matches("\\d+")) {
            this.idArticulo = idArticulo;
            return true;
        }else {
            System.out.println("\nId Articulo debe ser de 8 caracteres y sólamente números...\n");
            return false;
        }
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }
    public Boolean setNombreArticulo(String nombreArticulo) {
        nombreArticulo = nombreArticulo.replace(" ", "");
        nombreArticulo = nombreArticulo.replace("á","a");
        nombreArticulo = nombreArticulo.replace("é","e");
        nombreArticulo = nombreArticulo.replace("í","i");
        nombreArticulo = nombreArticulo.replace("ó","o");
        nombreArticulo = nombreArticulo.replace("ú","u");

        if(nombreArticulo.length() <= 10) {
            this.nombreArticulo = nombreArticulo.toUpperCase();
            return true;
        }else {
            return false;
        }
    }

    public String getDescripcionArticulo() {
        return descripcionArticulo;
    }
    public Boolean setDescripcionArticulo(String descripcionArticulo) {
        this.descripcionArticulo = descripcionArticulo;
        return true;
    }

    public Double getPrecioArticulo() {
        return precioArticulo;
    }
    public Boolean setPrecioArticulo(Double precioArticulo) {
        if(precioArticulo > 0){
            this.precioArticulo = precioArticulo;
            return true;
        }else{
            System.out.println("El precio no puede ser menor o igual a 0...");
            return false;
        }
    }
    public Boolean setPrecioArticulo(String precioArticulo) {
        if(precioArticulo.matches("\\d+")){
            if (Double.valueOf(precioArticulo) > 0){
                this.precioArticulo = Double.valueOf(precioArticulo);
                return true;

            }else{
                System.out.println("\nEl valor del precio no puede ser menor o igual a 0...\n");
                return false;
            }
        }else{
            System.out.println("\nEl precio sólo puede contener numeros\n");
            return false;
        }
    }

    public Integer getCantidadArticulo() {
        return cantidadArticulo;
    }
    public Boolean setCantidadArticulo(Integer cantidadArticulo) {
        if(cantidadArticulo > 0){
            this.cantidadArticulo = cantidadArticulo;
            return true;
        }else{
            System.out.println("La cantidad no puede ser menor o igual a 0...");
            return false;
        }
    }
    public Boolean setCantidadArticulo(String cantidadArticulo){
        if(cantidadArticulo.matches("\\d+")){
            if (Integer.valueOf(cantidadArticulo) > 0){
                this.cantidadArticulo = Integer.valueOf(cantidadArticulo);
                return true;

            }else{
                System.out.println("\nLa cantidad no puede ser menor o igual a 0...\n");
                return false;
            }
        }else{
            System.out.println("\nLa cantidad sólo puede contener numeros\n");
            return false;
        }
    }

    public String getProveedorPerteneciente() {
        return proveedorPerteneciente;
    }
    public Boolean setProveedorPerteneciente(String proveedorPerteneciente) {
        this.proveedorPerteneciente = proveedorPerteneciente.toUpperCase();
        return true;
    }

    public void mostrarDatosArticulo(){
        System.out.println(
                        "Id Articulo: "
                        + idArticulo + "\n" +
                        "Nombre Articulo: "
                        + nombreArticulo +
                        "Descripción Articulo: "
                        + descripcionArticulo + "\n" +
                        "Precio Articulo: "
                        + precioArticulo + "\n" +
                        "Cantidad Articulo: "
                        + cantidadArticulo + "\n" +
                        " Proveedor Perteneciente: "
                        + proveedorPerteneciente + "\n"
        );
    }
}
