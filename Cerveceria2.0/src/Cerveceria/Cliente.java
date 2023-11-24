package Cerveceria;

public class Cliente{

    private String idCliente;
    private String nombres;
    private String apellido1;
    private String apellido2;
    private String correoCliente;
    private String contraseniaCliente;
    private String telefonoCliente;
    private String direccionCliente;

    public Cliente() {
        this.idCliente = "";
        this.nombres = "";
        this.apellido1 = "";
        this.apellido2 = "";
        this.correoCliente = "";
        this.telefonoCliente = "";
        this.direccionCliente = "";
    }

    public String getIdCliente() {
        return idCliente;
    }
    public boolean setIdCliente(String idCliente) {
        if(idCliente.length() == 8 && idCliente.matches("\\d+")) {
            this.idCliente = idCliente;
            return true;
        }else {
            System.out.println("\nId Cliente debe ser de 8 caracteres y sólamente números...\n");
            return false;
        }
    }

    public String getNombres() {
        return nombres;
    }
    public Boolean setNombres(String nombres) {
        if(nombres.matches(".*\\d.*+")){
            System.out.println("\nEl Nombre no puede contener números...\n");
            return false;
        }else{
            this.nombres = nombres.toUpperCase();
            return true;
        }
    }

    public String getApellido1() {
        return apellido1;
    }
    public Boolean setApellido1(String apellido1) {
        if(apellido1.matches(".*\\d.*+")){
            System.out.println("\nEl Apellido no puede contener números...\n");
            return false;
        }else{
            this.apellido1 = apellido1.toUpperCase();
            return true;
        }
    }

    public String getApellido2() {
        return apellido2;
    }
    public Boolean setApellido2(String apellido2) {
        if(apellido2.matches(".*\\d.*+")){
            System.out.println("\nEl Apellido no puede contener números...\n");
            return false;
        }else{
            this.apellido2 = apellido2.toUpperCase();
            return true;
        }
    }

    public String getCorreoCliente() {
        return correoCliente;
    }
    public Boolean setCorreoCliente(String correoCliente) {
        if(correoCliente.contains("@") && correoCliente.contains(".") && !correoCliente.contains(" ")){
            this.correoCliente = correoCliente.toLowerCase();
            return true;
        }
        else {
            System.out.println("\nEl correo no es valido...\n");
            return false;
        }
    }

    public String getContraseniaCliente() {
        return contraseniaCliente;
    }

    public Boolean setContraseniaCliente(String contraseniaCliente) {
        if (contraseniaCliente.length() < 8){
            System.out.println("\nLa contraseña debe contener más de 8 caracteres...\n");
            return false;
        } else if (contraseniaCliente.matches("\\d{2,}")) {
            System.out.println("\nLA contraseña debe tener por lo menos 2 caracteres numéricos...\n");
            return false;
        }else{
            this.contraseniaCliente = contraseniaCliente;
            return true;
        }
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }
    public Boolean setTelefonoCliente(String telefonoCliente) {
        if(telefonoCliente.length() == 10 && telefonoCliente.matches("\\d+")) {
            this.telefonoCliente = telefonoCliente;
            return true;
        }else {
            System.out.println("\nEl Teléfono debe ser de 10 dígitos...");
            return false;
        }
    }


    public String getDireccionCliente() {
        return direccionCliente;
    }
    public Boolean setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
        return true;
    }

    public void mostrarDatosCliente(){
        System.out.println(
                "Id Cliente: "
                + idCliente + "\n" +
                "Nombre Cliente: "
                + nombres + " " + apellido1 + " " + apellido2 + "\n" +
                "Correo Cliente: "
                + correoCliente + "\n" +
                "Telefono Cliente: "
                + telefonoCliente + "\n" +
                "Dirección Cliente: "
                + direccionCliente + "\n"
        );
    }
}
