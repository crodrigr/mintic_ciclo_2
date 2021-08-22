package ciclo_2_75_appbanco;

import java.util.ArrayList;
import java.util.Scanner;

public class AppBanco {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Banco banco = new Banco("Manos Amigas", "Cra 59 No96-9", 1);
        loadEmpleados(banco);
        loadClientes(banco);
        int opc = 0;
        String cedula;
        int encontrado;
        int numCuenta;
        do {
            opc = menu();
            switch (opc) {
                case 1:
                    System.out.println("Crear Empleado");
                    crearEmpleado(banco);
                    System.out.println("El empleado se guardo con exito!");
                    break;
                case 2:
                    System.out.println("Crear Cliente");
                    crearCliente(banco);
                    System.out.println("El cliente se guardo con exito!");
                    break;
                case 3:
                    System.out.println("Abrir Cuenta");
                    System.out.println("Ingrese la cedula cliente");
                    cedula = leer.next();
                    encontrado = banco.buscarCliente(cedula);
                    if (encontrado != -1) {
                       crearCuenta(banco,encontrado);
                    } else {
                        System.out.println("Cliente no existe");
                    }
                    break;
                case 4:
                    System.out.println("Cerrar Cuenta");
                    System.out.println("Ingrese número de la cuenta");
                    numCuenta = leer.nextInt();
                    banco.cerraCuenta(numCuenta);
                    break;
                case 5:
                    System.out.println("Consignar");
                    break;
                case 6:
                    System.out.println("Retirar");
                    break;
                case 7:
                    System.out.println("Solicitar prestamo");
                    break;
                case 8:
                    System.out.println("Abonar presta");
                    break;
                case 9:
                    System.out.println("Proceso calcular intereses cuentas del banco");
                    break;
                case 10:
                    banco.mostrarClientes();
                    break;
            }

        } while (opc >= 1 && opc < 11);

    }

    public static int menu() {
        System.out.println("__________MENU________________________________________");
        System.out.println("__________1.Crear Empleado____________________________");
        System.out.println("__________2.Crear Cliente_____________________________");
        System.out.println("__________3.Abrir cuenta______________________________");
        System.out.println("__________4.Cerrar cuenta_____________________________");
        System.out.println("__________5.Consignar_________________________________");
        System.out.println("__________6.Retirar___________________________________");
        System.out.println("__________7.Solicitar prestamo________________________");
        System.out.println("__________8.Abonar a prestamo_________________________");
        System.out.println("__________9.Calcular intereses de la cuentas__________");
        System.out.println("__________10.Mostrar clientes_________________________");
        System.out.println("__________11.Salir____________________________________");
        return leer.nextInt();
    }

    public static void crearCuenta(Banco banco, int posCliente) {

        System.out.println("Ingrese el saldo");
        double saldo = leer.nextDouble();
        System.out.println("Porcentaje interes");
        double porc = leer.nextDouble();
        System.out.println("1. Ahorros");
        System.out.println("2. Corriente");
        int tipo = leer.nextInt();
        if(tipo>=1 && tipo<=2){
        Cuenta c;
        if (tipo == 1) {
          c=new Ahorro(banco.getCantidadCuentas()+1,saldo,porc);
        } else {
          c=new Corriente(banco.getCantidadCuentas()+1,saldo,porc);
        }
         banco.getClientes().get(posCliente).guardarCuenta(c);
        }
        

    }

    public static void crearEmpleado(Banco banco) {
        System.out.println("Ingrese el código");
        String codigo = leer.next();
        System.out.println("Ingrese los nombres");
        String nombres = leer.next();
        System.out.println("Ingrese los apellidos");
        String apellidos = leer.next();
        System.out.println("Ingrese la cedula");
        String cedula = leer.next();
        System.out.println("Ingrese la dirección");
        String direccion = leer.next();
        System.out.println("Ingrese teléfono");
        String telefono = leer.next();
        banco.guardarEmpleado(new Empleado(codigo, nombres, apellidos, cedula, direccion, telefono));
    }

    public static void crearCliente(Banco banco) {
        System.out.println("Ingrese los nombres");
        String nombres = leer.next();
        System.out.println("Ingrese los apellidos");
        String apellidos = leer.next();
        System.out.println("Ingrese la cedula");
        String cedula = leer.next();
        System.out.println("Ingrese la dirección");
        String direccion = leer.next();
        System.out.println("Ingrese teléfono");
        String telefono = leer.next();
        banco.guardarCliente(new Cliente(nombres, apellidos, cedula, direccion, telefono));
    }

    public static void loadEmpleados(Banco banco) {
        Empleado emp1 = new Empleado("001", "Camilo", "Rodriguez", "125888", "Cra 25 No98-32", "3155487");
        Empleado emp2 = new Empleado("002", "Maria", "Moreno", "8975522", "Cra 109 No9-7", "25482");
        Empleado emp3 = new Empleado("003", "Andres", "Perez", "21558", "Cra 35 No98-32", "3155487");
        banco.guardarEmpleado(emp1);
        banco.guardarEmpleado(emp2);
        banco.guardarEmpleado(emp3);
    }

    public static void loadClientes(Banco banco) {
        Cuenta c1 = new Ahorro(1, 100000, 2);
        Cuenta c2 = new Ahorro(2, 200000, 2);
        Cuenta c3 = new Ahorro(3, 300000, 2);
        Cuenta c4 = new Corriente(4, 800000, 2);
        Cuenta c5 = new Corriente(5, 1800000, 2);
        Cliente client1 = new Cliente("Camilo", "Rodriguez", "125888", "Cra 25 No98-32", "3155487");
        Cliente client2 = new Cliente("Andres", "Rangel", "15874411", "Calle 59 No9-26", "315875548");
        Cliente client3 = new Cliente("Humberto", "Galindo", "3789552", "Cr 27a No55-96", "658785");
        client1.guardarCuenta(c1);
        client1.guardarCuenta(c4);
        client1.guardarCuenta(c5);
        client2.guardarCuenta(c2);
        client3.guardarCuenta(c3);
        banco.guardarCliente(client1);
        banco.guardarCliente(client2);
        banco.guardarCliente(client3);
    }

}
