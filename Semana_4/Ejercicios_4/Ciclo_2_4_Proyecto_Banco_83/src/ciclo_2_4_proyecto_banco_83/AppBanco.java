package ciclo_2_4_proyecto_banco_83;

import java.util.ArrayList;
import java.util.Scanner;

public class AppBanco {

    static Scanner leer = new Scanner(System.in);
    static int NumeroCuenta = 0;

    public static void main(String[] args) {

        Banco banco = new Banco(1, "Manos Amigas", "Cr 48 No 89-915");
        banco.setClientes(loadClientes());
        banco.setEmpleados(loadEmpleados());
        NumeroCuenta = banco.getNumeroCuenta();
        banco.display();

        int opcion = 0;
        String cedula;
        int numeroCta;
        int encontrado;
        double valor;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    System.out.println("Crear empleado");
                    Empleado e = crearEmpleado();
                    banco.setEmpleado(e);
                    break;
                case 2:
                    System.out.println("Crear cliente");
                    Cliente c = crearCliente();
                    banco.setCliente(c);
                    break;
                case 3:
                    System.out.println("Abrir cuenta");
                    System.out.println("Ingrese la cedula del cliente: ");
                    cedula = leer.next();
                    encontrado = banco.buscarCliente(cedula);
                    if (encontrado != -1) {
                        Cuenta cta = null;
                        banco.getCliente(encontrado).display();
                        System.out.println("Que tipo de cuenta es: ");
                        System.out.println("1.Ahorro");
                        System.out.println("2.Corriente");
                        int opcuenta = leer.nextInt();
                        if (opcuenta == 1) {
                            cta = crearCuentaAhorro();
                        } else if (opcuenta == 2) {
                            cta = crearCuentaCorriente();
                        } else {
                            System.out.println("Opcion no valida");
                        }
                        if (cta != null) {
                            banco.abrirCuentaCliente(encontrado, cta);
                            System.out.println("Se creo con exito la cuenta del cliente");
                        }
                    } else {
                        System.out.println("No existe el cliente con esa cedula");
                    }
                    break;
                case 4:
                    System.out.println("Cerrar cuenta");
                    System.out.println("Ingrese numero de la cuenta: ");
                    numeroCta = leer.nextInt();
                    encontrado = banco.cerrarCuenta(numeroCta);
                    if (encontrado == 1) {
                        System.out.println("La cuenta se cerro correctamente ");
                    } else {
                        System.out.println("No existe una cuenta con ese número ");
                    }
                    break;
                case 5:
                    System.out.println("Consignar cuenta");
                    System.out.println("Ingrese numero de la cuenta: ");
                    numeroCta = leer.nextInt();
                    System.out.println("Ingrese el valor a consignar: ");
                    valor = leer.nextDouble();
                    encontrado = banco.consignarCuenta(numeroCta, valor);
                    if (encontrado == 1) {
                        System.out.println("La consignación se hizo exitosamente!! ");
                    } else {
                        System.out.println("No existe una cuenta con ese número ");
                    }
                    break;
                case 6:
                    System.out.println("Retirar cuenta");
                    System.out.println("Ingrese numero de la cuenta: ");
                    numeroCta = leer.nextInt();
                    System.out.println("Ingrese el valor a consignar: ");
                    valor = leer.nextDouble();
                    encontrado = banco.retirarCuenta(numeroCta, valor);
                    if (encontrado == 1) {
                        System.out.println("El retiro se hizo exitosamente!! ");
                    } else {
                        System.out.println("No existe una cuenta con ese número ");
                    }
                    break;
                case 7:
                    System.out.println("Solicitar prestamo");
                    break;
                case 8:
                    System.out.println("Abonar prestamo");
                    break;
                case 9:
                    System.out.println("Proceso");
                    banco.procesoCalcularIntereses();
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
        Cuenta c1 = new Ahorro(1, 100000, 2);
        Cuenta c2 = new Ahorro(2, 200000, 2);
        Cuenta c3 = new Ahorro(3, 300000, 2);
        Cliente client1 = new Cliente("Camilo", "Rodriguez", "125888", "Cra 25 No98-32", "3155487");
        Cliente client2 = new Cliente("Andres", "Rangel", "15874411", "Calle 59 No9-26", "315875548");
        Cliente client3 = new Cliente("Humberto", "Galindo", "3789552", "Cr 27a No55-96", "658785");
        client1.setCuenta(c1);
        client2.setCuenta(c2);
        client3.setCuenta(c3);
        clientes.add(client1);
        clientes.add(client2);
        clientes.add(client3);
        return clientes;

    }

    public static Cuenta crearCuentaAhorro() {
        NumeroCuenta++;
        System.out.println("Que monto de dinero va abrir la cuenta: ");
        double saldo = leer.nextDouble();
        return new Ahorro(NumeroCuenta, saldo, 2);
    }

    public static Cuenta crearCuentaCorriente() {
        NumeroCuenta++;
        System.out.println("Que monto de dinero va abrir la cuenta: ");
        double saldo = leer.nextDouble();
        return new Corriente(NumeroCuenta, saldo, 3);
    }

    public static Cliente crearCliente() {
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
        Cliente cliente = new Cliente(nombres, apellidos, cedula, direccion, telefono);
        return cliente;
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
