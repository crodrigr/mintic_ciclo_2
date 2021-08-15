package ciclo_2_4_proyecto_banco_83;

import java.util.ArrayList;
import java.util.Scanner;

public class AppBanco {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        Banco banco = new Banco(1, "Manos Amigas", "Cr 48 No 89-915");
        banco.setClientes(loadClientes());
        banco.setEmpleados(loadEmpleados());
        banco.display();

        int opcion = 0;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.println("Crear empleado");
                    Empleado e=crearEmpleado();
                    banco.setEmpleado(e);
                    break;
                case 2:
                    System.out.println("Crear cliente");
                    break;
                case 3:
                    System.out.println("Abrir cuenta");
                    break;
                case 4:
                    System.out.println("Cerrar cuenta");
                    break;
                case 5:
                    System.out.println("Consignar cuenta");
                    break;
                case 6:
                    System.out.println("Retirar cuenta");
                    break;
                case 7:
                    System.out.println("Solicitar prestamo");
                    break;
                case 8:
                    System.out.println("Abonar prestamo");
                    break;
                case 9:
                    System.out.println("Proceso");
                    break;
                case 10:
                    banco.displayClientes();
                    break;
                case 11:
                    banco.displayEmpleados();
                    break;
            }

        } while (opcion >= 1 && opcion < 12);

    }

    public static int menu() {
        System.out.println("______MENU___________________");
        System.out.println("______1.Crear  Empleado______");
        System.out.println("______2.Crear  Cliente_______");
        System.out.println("______3.Abrir  Cuenta________");
        System.out.println("______4.Cerrar Cuenta________");
        System.out.println("______5.Consiganar___________");
        System.out.println("______6.Retirar______________");
        System.out.println("______7.Prestamo_____________");
        System.out.println("______8.Abonar prestamo______");
        System.out.println("______9.Proceso interes_____");
        System.out.println("______10.Mostrar clientes_____");
        System.out.println("______11.Mostrar empleados_____");
        System.out.println("______12.Salir______");
        int op = leer.nextInt();
        return op;
    }

    public static ArrayList<Empleado> loadEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        Empleado emp1 = new Empleado("001", "Gerente", new Ahorro(1, 0, 2), "Camilo", "Rodriguez", "125888", "Cra 25 No98-32", "3155487");
        Empleado emp2 = new Empleado("002", "Asesor", new Ahorro(2, 0, 2), "Maria", "Moreno", "8975522", "Cra 109 No9-7", "25482");
        Empleado emp3 = new Empleado("003", "Cajero", new Ahorro(3, 0, 2), "Andres", "Perez", "21558", "Cra 35 No98-32", "3155487");
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        return empleados;
    }

    public static ArrayList<Cliente> loadClientes() {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Cliente client1 = new Cliente("Camilo", "Rodriguez", "125888", "Cra 25 No98-32", "3155487");
        Cliente client2 = new Cliente("Andres", "Rangel", "15874411", "Calle 59 No9-26", "315875548");
        Cliente client3 = new Cliente("Humberto", "Galindo", "3789552", "Cr 27a No55-96", "658785");
        clientes.add(client1);
        clientes.add(client2);
        clientes.add(client3);
        return clientes;

    }

    public static Empleado crearEmpleado() {
        System.out.println("Ingrese nombres del empleado");
        String nombres = leer.next();
        System.out.println("Ingrese apellidos del empleado");
        String apellidos = leer.next();
        System.out.println("Ingrese la cedula del empleado");
        String cedula = leer.next();
        System.out.println("Ingrese direccion del empleado");
        String direccion = leer.next();
        System.out.println("Ingrese telefono del empleado");
        String telefono = leer.next();
        System.out.println("Ingrese codigo del empleado");
        String codigo = leer.next();
        System.out.println("Ingrese cargo del empleado");
        String cargo = leer.next();
        System.out.println("Ingrese numero cuenta nomina");
        int numero = leer.nextInt();
        Cuenta nomina = new Ahorro(numero, 0, 2);
        Empleado emp = new Empleado(codigo, cargo, nomina, nombres, apellidos, cedula, direccion, telefono);
        return emp;
    }

}