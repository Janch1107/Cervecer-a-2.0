package Cerveceria;

import java.util.Scanner;



public class Main {
    //Scanner para obtener entradas
    static Scanner entrada = new Scanner(System.in);

    // Métodos funcionales
    public static void limpiarPantalla() {
        for (int i = 0; i < 45; i++) {
            System.out.println();
        }
    }
    public static void enterParaContinuar(){
        System.out.print("\nPresiona enter para continuar ... ");
        entrada.nextLine();
        System.out.println("\n\n");
    }

    // Variables de uso para Menús
    static String opcMenuGeneral = "";
    static String opcMenuInterno = "";
    static String opcMenuAdministrador = "";
    static String opcMenuCompras = "";


    // ******************************************************* MAIN *******************************************************
    public static void main(String[] args) {

        System.out.println("""
                
                    ************************************
                    ...Bienvenido a Cervecería Modelo...
                    ************************************
                 
                
                """);

        // Validación de Usuario
        System.out.print("Usuario: ");
        String usuario = entrada.nextLine();
        System.out.print("Contraseña: ");
        String contrasenia = entrada.nextLine();
        enterParaContinuar();

        do {
            limpiarPantalla();
            System.out.println("""
                        
                    
                    Selecciona una opción del Menú:
                    
                    1.Administrador
                    2.Compras
                    3.Salir
                                       
                    """);
            opcMenuGeneral = entrada.nextLine();
            // Switch del menú Administrador
            switch (opcMenuGeneral){
                case "1":
                    do {
                        limpiarPantalla();
                        System.out.println("""
                        Selecciona una opción del menú:
                                                    
                        **************************
                        *** MENU Administrador ***
                        **************************
                                
                        1.Inventarios
                        2.Proovedores
                        3.Clientes
                        4.Salir
                                                    
                        """);

                        opcMenuAdministrador = entrada.nextLine();
                        switch (opcMenuAdministrador) {
                            case "1":
                                do {

                                    limpiarPantalla();
                                    System.out.println("""
                                                                                           
                                    *********************
                                    **** INVVENTARIOS ***
                                    *********************
                                                                                           
                                    1.Ver Inventario
                                    2.Agregar articulo al inventario
                                    3.Modificar un articulo
                                    4.Buscar articulo
                                    5.Eliminar articulo del inventario
                                    6.Salir
                                                                                           
                                    """);
                                    opcMenuInterno = entrada.nextLine();
                                    System.out.println("\n");
                                    switch (opcMenuInterno) {
                                        case "1":
                                            FuncionesArticulos.verArticulos();
                                            break;
                                        case "2":
                                            FuncionesArticulos.agregarArticulos();
                                            break;
                                        case "3":
                                            FuncionesArticulos.modificarArticulos();
                                            break;
                                        case "4":
                                            FuncionesArticulos.buscarArticulos();
                                            break;
                                        case "5":
                                            FuncionesArticulos.eliminarArticulos();
                                            break;
                                        case "6":
                                            break;
                                        default:
                                            System.out.println("\n¡¡Esa no es una opción Valida!! ... ¡¡Selecciona otra Opción!!");
                                            enterParaContinuar();
                                    }
                                } while (!opcMenuInterno.equals("6"));
                                break;
                            case "2":
                                do {
                                    limpiarPantalla();
                                    System.out.println("""
                                                                                               
                                    *********************
                                    **** Proveedores ***
                                    *********************
                                                                                               
                                    1.Ver Proveedores
                                    2.Agregar Proveedor
                                    3.Modificar un Proveedor
                                    4.Buscar Proveedor
                                    5.Eliminar Proveedor
                                    6.Salir
                                                                                               
                                    """);
                                    opcMenuInterno = entrada.nextLine();
                                    System.out.println("\n");
                                    switch (opcMenuInterno) {
                                        case "1":
                                            FuncionesProveedor.verProveedores();
                                            break;
                                        case "2":
                                            FuncionesProveedor.agregarProveedor();
                                            break;
                                        case "3":
                                            FuncionesProveedor.modificarProveedor();
                                            break;
                                        case "4":
                                            FuncionesProveedor.buscarProveedor();
                                            break;
                                        case "5":
                                            FuncionesProveedor.eliminarProveedor();
                                            break;
                                        case "6":
                                            break;
                                        default:
                                            System.out.println("\n¡¡Esa no es una opción Valida!! ... ¡¡Selecciona otra Opción!!");
                                            enterParaContinuar();
                                    }
                                } while (!opcMenuInterno.equals("6"));
                                break;
                            case "3":
                                limpiarPantalla();
                                do {
                                    limpiarPantalla();
                                    System.out.println("""
                                                                                               
                                    *********************
                                    **** Clientes ***
                                    *********************
                                                                                               
                                    1.Ver Clientes
                                    2.Agregar Cliente
                                    3.Modificar un Cliente
                                    4.Buscar Cliente
                                    5.Eliminar Cliente
                                    6.Salir
                                                                                               
                                    """);
                                    opcMenuInterno = entrada.nextLine();
                                    System.out.println("\n");
                                    switch (opcMenuInterno) {
                                        case "1":
                                            FuncionesCliente.verClientes();
                                            break;
                                        case "2":
                                            FuncionesCliente.agregarCliente();
                                            break;
                                        case "3":
                                            FuncionesCliente.modificarCliente();
                                            break;
                                        case "4":
                                            FuncionesCliente.buscarCliente();
                                            break;
                                        case "5":
                                            FuncionesCliente.eliminarCliente();
                                            break;
                                        case "6":
                                            break;
                                        default:
                                            System.out.println("\n¡¡Esa no es una opción Valida!! ... ¡¡Selecciona otra Opción!!");
                                            enterParaContinuar();
                                    }
                                } while (!opcMenuInterno.equals("6"));
                                break;
                            case "4":
                                break;
                            default:
                                System.out.println("\n¡¡Esa no es una opción Valida!! ... ¡¡Selecciona otra Opción!!");
                                enterParaContinuar();
                        }
                    } while (!opcMenuAdministrador.equals("4"));
                    break;
                case "2":
                    do {
                        limpiarPantalla();
                        System.out.println("""
                                Selecciona una opción del menú:
                                                            
                                **************************
                                *** MENU Compras ***
                                **************************
                                        
                                1.Comprar
                                2.Carrito de Compras
                                3.Pagar
                                4.Salir
                                                            
                                """);
                        opcMenuCompras = entrada.nextLine();

                        switch (opcMenuCompras){
                            case "1":
                                break;
                            case "2":
                                break;
                            case "3":
                                break;
                            case "4":
                                break;
                            default:
                                System.out.println("\n¡¡Esa no es una opción Valida!! ... ¡¡Selecciona otra Opción!!");
                                enterParaContinuar();
                        }
                    }while(!opcMenuCompras.equals("4"));
                    break;
                case "3":
                    limpiarPantalla();
                    System.out.println("""
                                *********************
                                *** Hasta Luego!! ***
                                *********************
                                """);
                    break;
                default:
                    System.out.println("\n¡¡Esa no es una opción Valida!! ... ¡¡Selecciona otra Opción!!");
                    enterParaContinuar();
            }
        }while(!opcMenuGeneral.equals("3"));
    }
}
