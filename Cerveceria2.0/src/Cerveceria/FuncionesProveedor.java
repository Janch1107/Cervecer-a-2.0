package Cerveceria;

import java.util.Scanner;
import java.util.ArrayList;

public class FuncionesProveedor {

    //Scanner para obtener entradas
    static Scanner entrada = new Scanner(System.in);

    //Arreglos para Proveedores
    static ArrayList<Proveedor> listaProveedores = new ArrayList<>();

    public static void verProveedores(){
        Main.limpiarPantalla();

        System.out.println("Lista de Proveedores: \n");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-25S", "ID");
        System.out.printf("%-25S", "Nombre");
        System.out.printf("%-50S", "Correo Electrónico");
        System.out.printf("%-25S", "Teléfono");
        System.out.printf("%-25S", "Dirección");
        System.out.println();
        for (Proveedor objeto : listaProveedores) {
            System.out.printf("%-25S", objeto.getIdProveedor());
            System.out.printf("%-25S", objeto.getNombreProveedor());
            System.out.printf("%-50S", objeto.getCorreoProveedor());
            System.out.printf("%-25S", objeto.getTelefonoProveedor());
            System.out.printf("%-25S", objeto.getDireccionProveedor());
            System.out.println();

        }
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Main.enterParaContinuar();
    }

    public static void agregarProveedor() {

        Proveedor objeto = new Proveedor();

        Main.limpiarPantalla();

        System.out.println("Agrega los datos para el nuevo Proveedor\n\n");
        do{
            System.out.print("ID del Proveedor: ");
        }while(!objeto.setIdProveedor(entrada.nextLine()));
        for (Proveedor objeto1 : listaProveedores){
            if (objeto.getIdProveedor().equals(objeto1.getIdProveedor())){
                System.out.println("\nEl ID ya Existe... Error al agregar Proveedor\n");
                Main.enterParaContinuar();
                return;
            }
        }
        do{
            System.out.print("Nombre del Proveedor: ");
        }while(!objeto.setNombreProveedor(entrada.nextLine()));
        do{
            System.out.print("Correo del Proveedor: ");
        }while(!objeto.setCorreoProveedor(entrada.nextLine()));
        do{
            System.out.print("Telefono del Proveedor: ");
        }while(!objeto.setTelefonoProveedor(entrada.nextLine()));
        do{
            System.out.print("Dirección del Proveedor: ");
        }while(!objeto.setDireccionProveedor(entrada.nextLine()));

        listaProveedores.add(objeto);

        System.out.println("\nProveedor Agregado con Exito!!\n");
        Main.enterParaContinuar();
        Main.limpiarPantalla();
    }

    public static void modificarProveedor(){

        Main.limpiarPantalla();
        System.out.print("Indica el ID del Articulo que deseas modificar: ");
        String opcIdModificar = entrada.nextLine();

        for (int x = 0 ; x <= listaProveedores.size() - 1 ; x++ ){

            Proveedor objeto = listaProveedores.get(x);

            if (objeto.getIdProveedor().equals(opcIdModificar)) {

                System.out.println("\nAgrega los nuevos datos del Proveedor\n\n");
                do{
                    System.out.print("Nombre del Proveedor: ");
                }while(!objeto.setNombreProveedor(entrada.nextLine()));
                do{
                    System.out.print("Correo del Proveedor: ");
                }while(!objeto.setCorreoProveedor(entrada.nextLine()));
                do{
                    System.out.print("Telefono del Proveedor: ");
                }while(!objeto.setTelefonoProveedor(entrada.nextLine()));
                do{
                    System.out.print("Dirección del Proveedor: ");
                }while(!objeto.setDireccionProveedor(entrada.nextLine()));

                listaProveedores.set(x, objeto);

                System.out.println("\nProveedor Agregado con Exito!!\n");
                Main.enterParaContinuar();
                Main.limpiarPantalla();
                break;
            }
            if (x == listaProveedores.size() -1){
                System.out.println("\nEl ID no se encontró...\n");
                Main.enterParaContinuar();
            }
        }
    }

    public static void buscarProveedor(){

        Main.limpiarPantalla();
        System.out.print("Indica el ID del Proveedor que deseas Buscar: ");
        String opcIdbuscar = entrada.nextLine();

        for (int x = 0 ; x <= listaProveedores.size() - 1 ; x++ ){

            Proveedor objeto = listaProveedores.get(x);

            if (objeto.getIdProveedor().equals(opcIdbuscar)) {

                System.out.println("Lista de Proveedores: \n");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%-25S", "ID");
                System.out.printf("%-25S", "Nombre");
                System.out.printf("%-50S", "Correo Electrónico");
                System.out.printf("%-25S", "Teléfono");
                System.out.printf("%-25S", "Dirección");
                System.out.println();
                System.out.printf("%-25S", objeto.getIdProveedor());
                System.out.printf("%-25S", objeto.getNombreProveedor());
                System.out.printf("%-50S", objeto.getCorreoProveedor());
                System.out.printf("%-25S", objeto.getTelefonoProveedor());
                System.out.printf("%-25S", objeto.getDireccionProveedor());
                System.out.println();
                System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                Main.enterParaContinuar();
                break;
            }
            if (x == listaProveedores.size() -1){
                System.out.println("\nEl ID no se encontró...\n");
                Main.enterParaContinuar();
            }
        }
    }

    public static void eliminarProveedor(){

        Main.limpiarPantalla();
        System.out.print("Indica el ID del Proveedor que deseas Eliminar: ");
        String opcIdEliminar = entrada.nextLine();
        String opcMenuProveedores = "";

        for (int x = 0 ; x <= listaProveedores.size() - 1 ; x++ ){

            Proveedor objeto = listaProveedores.get(x);

            if (objeto.getIdProveedor().equals(opcIdEliminar)) {

                do{
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.printf("%-25S", "ID");
                    System.out.printf("%-25S", "Nombre");
                    System.out.printf("%-50S", "Correo Electrónico");
                    System.out.printf("%-25S", "Teléfono");
                    System.out.printf("%-25S", "Dirección");
                    System.out.println();
                    System.out.printf("%-25S", objeto.getIdProveedor());
                    System.out.printf("%-25S", objeto.getNombreProveedor());
                    System.out.printf("%-50S", objeto.getCorreoProveedor());
                    System.out.printf("%-25S", objeto.getTelefonoProveedor());
                    System.out.printf("%-25S", objeto.getDireccionProveedor());
                    System.out.println();
                    System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nEste es el Proveedor que deseas eliminar? (Y - N)");
                    opcMenuProveedores = entrada.nextLine().toUpperCase();

                    if (opcMenuProveedores.equals("Y")){
                        listaProveedores.remove(x);
                        System.out.println("\nProveedor Eliminado con Exito!!");
                        Main.enterParaContinuar();
                        break;
                    } else if (opcMenuProveedores.equals("N")) {
                        System.out.println("\nEntendido!!");
                        Main.enterParaContinuar();
                    }else{
                        System.out.println("\nOpción no Valida");
                        Main.enterParaContinuar();
                        Main.limpiarPantalla();
                    }
                }while(!opcMenuProveedores.equalsIgnoreCase("Y") && !opcMenuProveedores.equalsIgnoreCase("N"));
                break;
            }
            if (x == listaProveedores.size() -1){
                System.out.println("\nEl ID no se encontró...\n");
                Main.enterParaContinuar();
            }
        }

    }

}
