package Cerveceria;

public class Proveedor {

    private String idProveedor;
    private String nombreProveedor;
    private String correoProveedor;
    private String telefonoProveedor;
    private String direccionProveedor;

    public Proveedor() {
        this.idProveedor = "";
        this.nombreProveedor = "";
        this.correoProveedor = "";
        this.telefonoProveedor = "";
        this.direccionProveedor = "";
    }

    public String getIdProveedor() {
        return idProveedor;
    }
    public Boolean setIdProveedor(String idProveedor) {
        if(idProveedor.length() == 8 && idProveedor.matches("\\d+")) {
            this.idProveedor = idProveedor;
            return true;
        }else {
            System.out.println("\nId Proveedor debe ser de 8 caracteres y sólamente números...\n");
            return false;
        }
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }
    public Boolean setNombreProveedor(String nombreProveedor) {
        if(nombreProveedor.matches(".*\\d.*+")){
            System.out.println("\nEl Nombre no puede contener números...\n");
            return false;
        }else{
            this.nombreProveedor = nombreProveedor.toUpperCase();
            return true;
        }
    }

    public String getCorreoProveedor() {
        return correoProveedor;
    }
    public Boolean setCorreoProveedor(String correoProveedor) {
        if(correoProveedor.contains("@") && correoProveedor.contains(".") && !correoProveedor.contains(" ")){
            this.correoProveedor = correoProveedor.toLowerCase();
            return true;
        }
        else {
            System.out.println("\nEl correo no es valido...\n");
            return false;
        }
    }

    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }
    public Boolean setTelefonoProveedor(String telefonoProveedor) {
        if(telefonoProveedor.length() == 10 && telefonoProveedor.matches("\\d+")) {
            this.telefonoProveedor = telefonoProveedor;
            return true;
        }else {
            System.out.println("\nEl Teléfono debe ser de 10 dígitos...\n");
            return false;
        }
    }

    public String getDireccionProveedor() {
        return direccionProveedor;
    }
    public Boolean setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
        return true;
    }

    public void mostrarDatosProveedor(){
        System.out.println(
                        "Id Proveedor: "
                        + idProveedor + "\n" +
                        "Nombre Proveedor: "
                        + nombreProveedor +
                        "Correo Proveedor: "
                        + correoProveedor + "\n" +
                        "Telefono Proveedor: "
                        + telefonoProveedor + "\n" +
                        "Dirección Proveedor: "
                        + direccionProveedor + "\n"
        );
    }
}
