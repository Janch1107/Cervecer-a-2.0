package Cerveceria;

import java.util.Scanner;
import java.util.ArrayList;

public class FuncionesCliente {

    //Scanner para obtener entradas
    static Scanner entrada = new Scanner(System.in);

    //Arreglos para Clientes
    static ArrayList<Cliente> listaClientes = new ArrayList<>();

    public static void verClientes(){
        Main.limpiarPantalla();

        System.out.println("Lista de Clientes: \n");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-25S", "ID");
        System.out.printf("%-25S", "Nombre");
        System.out.printf("%-50S", "Correo Electrónico");
        System.out.printf("%-25S", "Teléfono");
        System.out.printf("%-25S", "Dirección");
        System.out.println();
        for (Cliente objeto : listaClientes) {
            System.out.printf("%-25S", objeto.getIdCliente());
            System.out.printf("%-25S", objeto.getNombres() + " " + objeto.getApellido1() + " " + objeto.getApellido2());
            System.out.printf("%-50S", objeto.getCorreoCliente());
            System.out.printf("%-25S", objeto.getTelefonoCliente());
            System.out.printf("%-25S", objeto.getDireccionCliente());
            System.out.println();
        }
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Main.enterParaContinuar();
    }

    public static void agregarCliente() {

        Cliente objeto = new Cliente();

        Main.limpiarPantalla();

        System.out.println("Agrega los datos para el nuevo Cliente\n\n");
        do{
            System.out.print("ID del Cliente: ");
        }while(!objeto.setIdCliente(entrada.nextLine()));
        for (Cliente objeto1 : listaClientes){
            if (objeto.getIdCliente().equals(objeto1.getIdCliente())){
                System.out.println("\nEl ID ya Existe... Error al agregar Cliente\n");
                Main.enterParaContinuar();
                return;
            }
        }
        do{
            System.out.print("Nombre del Cliente: ");
        }while(!objeto.setNombres(entrada.nextLine()));
        do{
            System.out.print("Apellido Paterno del Cliente: ");
        }while(!objeto.setApellido1(entrada.nextLine()));
        do{
            System.out.print("Apellido Materno del Cliente: ");
        }while(!objeto.setApellido2(entrada.nextLine()));
        do{
            System.out.print("Correo del Cliente: ");
        }while(!objeto.setCorreoCliente(entrada.nextLine()));
        do{
            System.out.print("Contraseña del Cliente: ");
        }while(!objeto.setContraseniaCliente(entrada.nextLine()));
        do{
            System.out.print("Telefono del Cliente: ");
        }while(!objeto.setTelefonoCliente(entrada.nextLine()));
        do{
            System.out.print("Dirección del Cliente: ");
        }while(!objeto.setDireccionCliente(entrada.nextLine()));

        listaClientes.add(objeto);

        System.out.println("\nCliente Agregado con Exito!!\n");
        Main.enterParaContinuar();
        Main.limpiarPantalla();
    }

    public static void modificarCliente(){

        Main.limpiarPantalla();
        System.out.print("Indica el ID del Cliente que deseas modificar: ");
        String opcIdModificar = entrada.nextLine();

        for (int x = 0 ; x <= listaClientes.size() - 1 ; x++ ){

            Cliente objeto = listaClientes.get(x);

            if (objeto.getIdCliente().equals(opcIdModificar)) {

                System.out.println("\nAgrega los nuevos datos del Cliente\n\n");
                do{
                    System.out.print("Nombre del Cliente: ");
                }while(!objeto.setNombres(entrada.nextLine()));
                do{
                    System.out.print("Apellido Paterno del Cliente: ");
                }while(!objeto.setApellido1(entrada.nextLine()));
                do{
                    System.out.print("Apellido Materno del Cliente: ");
                }while(!objeto.setApellido2(entrada.nextLine()));
                do{
                    System.out.print("Correo del Cliente: ");
                }while(!objeto.setCorreoCliente(entrada.nextLine()));
                do{
                    System.out.print("Contraseña del Cliente: ");
                }while(!objeto.setContraseniaCliente(entrada.nextLine()));
                do{
                    System.out.print("Telefono del Cliente: ");
                }while(!objeto.setTelefonoCliente(entrada.nextLine()));
                do{
                    System.out.print("Dirección del Cliente: ");
                }while(!objeto.setDireccionCliente(entrada.nextLine()));

                listaClientes.set(x, objeto);

                System.out.println("\nCliente Agregado con Exito!!\n");
                Main.enterParaContinuar();
                Main.limpiarPantalla();
                break;
            }
            if (x == listaClientes.size() -1){
                System.out.println("\nEl ID no se encontró...\n");
                Main.enterParaContinuar();
            }
        }
    }

    public static void buscarCliente(){

        Main.limpiarPantalla();
        System.out.print("Indica el ID del Cliente que deseas Buscar: ");
        String opcIdbuscar = entrada.nextLine();

        for (int x = 0 ; x <= listaClientes.size() - 1 ; x++ ){

            Cliente objeto = listaClientes.get(x);

            if (objeto.getIdCliente().equals(opcIdbuscar)) {

                System.out.println("Lista de Clientes: \n");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%-25S", "ID");
                System.out.printf("%-25S", "Nombre");
                System.out.printf("%-50S", "Correo Electrónico");
                System.out.printf("%-25S", "Teléfono");
                System.out.printf("%-25S", "Dirección");
                System.out.println();
                System.out.printf("%-25S", objeto.getIdCliente());
                System.out.printf("%-25S", objeto.getNombres() + " " + objeto.getApellido1() + " " + objeto.getApellido2());
                System.out.printf("%-50S", objeto.getCorreoCliente());
                System.out.printf("%-25S", objeto.getTelefonoCliente());
                System.out.printf("%-25S", objeto.getDireccionCliente());
                System.out.println();
                System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                Main.enterParaContinuar();
                break;
            }
            if (x == listaClientes.size() -1){
                System.out.println("\nEl ID no se encontró...\n");
                Main.enterParaContinuar();
            }
        }
    }

    public static void eliminarCliente(){

        Main.limpiarPantalla();
        System.out.print("Indica el ID del Cliente que deseas Eliminar: ");
        String opcIdEliminar = entrada.nextLine();
        String opcMenuClientes = "";

        for (int x = 0 ; x <= listaClientes.size() - 1 ; x++ ){

            Cliente objeto = listaClientes.get(x);

            if (objeto.getIdCliente().equals(opcIdEliminar)) {

                do{
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.printf("%-25S", "ID");
                    System.out.printf("%-25S", "Nombre");
                    System.out.printf("%-50S", "Correo Electrónico");
                    System.out.printf("%-25S", "Teléfono");
                    System.out.printf("%-25S", "Dirección");
                    System.out.println();
                    System.out.printf("%-25S", objeto.getIdCliente());
                    System.out.printf("%-25S", objeto.getNombres() + " " + objeto.getApellido1() + " " + objeto.getApellido2());
                    System.out.printf("%-50S", objeto.getCorreoCliente());
                    System.out.printf("%-25S", objeto.getTelefonoCliente());
                    System.out.printf("%-25S", objeto.getDireccionCliente());
                    System.out.println();
                    System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nEste es el Cliente que deseas eliminar? (Y - N)");
                    opcMenuClientes = entrada.nextLine().toUpperCase();

                    if (opcMenuClientes.equals("Y")){
                        listaClientes.remove(x);
                        System.out.println("\nCliente Eliminado con Exito!!");
                        Main.enterParaContinuar();
                        break;
                    } else if (opcMenuClientes.equals("N")) {
                        System.out.println("\nEntendido!!");
                        Main.enterParaContinuar();
                    }else{
                        System.out.println("\nOpción no Valida");
                        Main.enterParaContinuar();
                        Main.limpiarPantalla();
                    }
                }while(!opcMenuClientes.equalsIgnoreCase("Y") && !opcMenuClientes.equalsIgnoreCase("N"));
                break;
            }
            if (x == listaClientes.size() -1){
                System.out.println("\nEl ID no se encontró...\n");
                Main.enterParaContinuar();
            }
        }
    }

}
