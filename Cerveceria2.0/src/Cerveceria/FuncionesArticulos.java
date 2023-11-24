package Cerveceria;

import java.util.Scanner;
import java.util.ArrayList;

public class FuncionesArticulos {

    //Scanner para obtener entradas
    static Scanner entrada = new Scanner(System.in);

    //Arreglos para Articulos
    static ArrayList<Articulo> listaArticulos = new ArrayList<>();

    //Funciones Articulos
    public static void verArticulos(){
        Main.limpiarPantalla();

        System.out.println("Inventario de Artículos: \n");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-25S", "ID");
        System.out.printf("%-25S", "Nombre");
        System.out.printf("%-50S", "Descripción");
        System.out.printf("%-25S", "Precio");
        System.out.printf("%-25S", "Cantidad");
        System.out.printf("%-25S", "Proveedor");
        System.out.println();
        for (Articulo objeto1 : listaArticulos) {
            System.out.printf("%-25S", objeto1.getIdArticulo());
            System.out.printf("%-25S", objeto1.getNombreArticulo());
            System.out.printf("%-50S", objeto1.getDescripcionArticulo());
            System.out.printf("%-25S", "$" + objeto1.getPrecioArticulo());
            System.out.printf("%-25S", objeto1.getCantidadArticulo());
            System.out.printf("%-25S", objeto1.getProveedorPerteneciente());
            System.out.println();

        }
        System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Main.enterParaContinuar();
    }

    public static void agregarArticulos() {

        Articulo objeto = new Articulo();

        Main.limpiarPantalla();

        System.out.println("Agrega los datos para el nuevo Articulo\n\n");
        do{
            System.out.print("ID del Articulo: ");
        }while(!objeto.setIdArticulo(entrada.nextLine()));
        for (Articulo objeto1 : listaArticulos){
            if (objeto.getIdArticulo().equals(objeto1.getIdArticulo())){
                System.out.println("\nEl ID ya Existe... Error al agregar Articulo\n");
                Main.enterParaContinuar();
                return;
            }
        }
        do{
            System.out.print("Nombre del Articulo: ");
        }while(!objeto.setNombreArticulo(entrada.nextLine()));
        do{
            System.out.print("Descripción del Articulo: ");
        }while(!objeto.setDescripcionArticulo(entrada.nextLine()));
        do{
            System.out.print("Precio del Articulo: ");
        }while(!objeto.setPrecioArticulo(entrada.nextLine()));
        do{
            System.out.print("Cantidad del Articulo: ");
        }while(!objeto.setCantidadArticulo(entrada.nextLine()));
        do{
            System.out.print("Proveedor del Articulo: ");
        }while(!objeto.setProveedorPerteneciente(entrada.nextLine()));

        listaArticulos.add(objeto);

        System.out.println("\nArticulo Agregado con Exito!!\n");
        Main.enterParaContinuar();
        Main.limpiarPantalla();
    }

    public static void modificarArticulos(){

        Main.limpiarPantalla();
        System.out.print("Indica el ID del Articulo que deseas modificar: ");
        String opcIdModificar = entrada.nextLine();

        for (int x = 0 ; x <= listaArticulos.size() - 1 ; x++ ){

            Articulo objeto = listaArticulos.get(x);

            if (objeto.getIdArticulo().equals(opcIdModificar)) {

                System.out.println("\nAgrega los nuevos datos del Articulo\n\n");
                do{
                    System.out.print("Nombre del Articulo: ");
                }while(!objeto.setNombreArticulo(entrada.nextLine()));
                do{
                    System.out.print("Descripción del Articulo: ");
                }while(!objeto.setDescripcionArticulo(entrada.nextLine()));
                do{
                    System.out.print("Precio del Articulo: ");
                }while(!objeto.setPrecioArticulo(entrada.nextLine()));
                do{
                    System.out.print("Cantidad del Articulo: ");
                }while(!objeto.setCantidadArticulo(entrada.nextLine()));
                do{
                    System.out.print("Proveedor del Articulo: ");
                }while(!objeto.setProveedorPerteneciente(entrada.nextLine()));

                listaArticulos.set(x, objeto);

                System.out.println("\nArticulo Agregado con Exito!!\n");
                Main.enterParaContinuar();
                Main.limpiarPantalla();
                break;
            }
            if (x == listaArticulos.size() -1){
                System.out.println("\nEl ID no se encontró...\n");
                Main.enterParaContinuar();
            }
        }
    }

    public static void buscarArticulos(){

        Main.limpiarPantalla();
        System.out.print("Indica el ID del Articulo que deseas Buscar: ");
        String opcIdbuscar = entrada.nextLine();

        for (int x = 0 ; x <= listaArticulos.size() - 1 ; x++ ){

            Articulo objeto = listaArticulos.get(x);

            if (objeto.getIdArticulo().equals(opcIdbuscar)) {

                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.printf("%-25S", "ID");
                System.out.printf("%-25S", "Nombre");
                System.out.printf("%-50S", "Descripción");
                System.out.printf("%-25S", "Precio");
                System.out.printf("%-25S", "Cantidad");
                System.out.printf("%-25S", "Proveedor");
                System.out.println();
                System.out.printf("%-25S", objeto.getIdArticulo());
                System.out.printf("%-25S", objeto.getNombreArticulo());
                System.out.printf("%-50S", objeto.getDescripcionArticulo());
                System.out.printf("%-25S", "$" + objeto.getPrecioArticulo());
                System.out.printf("%-25S", objeto.getCantidadArticulo());
                System.out.printf("%-25S", objeto.getProveedorPerteneciente());
                System.out.println();
                System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                Main.enterParaContinuar();
                break;
            }
            if (x == listaArticulos.size() -1){
                System.out.println("\nEl ID no se encontró...\n");
                Main.enterParaContinuar();
            }
        }

    }

    public static void eliminarArticulos(){

        Main.limpiarPantalla();
        System.out.print("Indica el ID del Articulo que deseas Eliminar: ");
        String opcIdEliminar = entrada.nextLine();
        String opcMenuArticulos = "";

        for (int x = 0 ; x <= listaArticulos.size() - 1 ; x++ ){

            Articulo objeto = listaArticulos.get(x);

            if (objeto.getIdArticulo().equals(opcIdEliminar)) {

                do{
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.printf("%-25S", "ID");
                    System.out.printf("%-25S", "Nombre");
                    System.out.printf("%-50S", "Descripción");
                    System.out.printf("%-25S", "Precio");
                    System.out.printf("%-25S", "Cantidad");
                    System.out.printf("%-25S", "Proveedor");
                    System.out.println();
                    System.out.printf("%-25S", objeto.getIdArticulo());
                    System.out.printf("%-25S", objeto.getNombreArticulo());
                    System.out.printf("%-50S", objeto.getDescripcionArticulo());
                    System.out.printf("%-25S", "$" + objeto.getPrecioArticulo());
                    System.out.printf("%-25S", objeto.getCantidadArticulo());
                    System.out.printf("%-25S", objeto.getProveedorPerteneciente());
                    System.out.println();
                    System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\nEste es el Artículo que deseas eliminar? (Y - N)");
                    opcMenuArticulos = entrada.nextLine().toUpperCase();

                    if (opcMenuArticulos.equals("Y")){
                        listaArticulos.remove(x);
                        System.out.println("\nArticulo Eliminado con Exito!!");
                        Main.enterParaContinuar();
                        break;
                    } else if (opcMenuArticulos.equals("N")) {
                        System.out.println("\nEntendido!!");
                        Main.enterParaContinuar();
                    }else{
                        System.out.println("\nOpción no Valida");
                        Main.enterParaContinuar();
                        Main.limpiarPantalla();
                    }
                }while(!opcMenuArticulos.equalsIgnoreCase("Y") && !opcMenuArticulos.equalsIgnoreCase("N"));
                break;
            }
            if (x == listaArticulos.size() -1){
                System.out.println("\nEl ID no se encontró...\n");
                Main.enterParaContinuar();
            }
        }

    }

}





