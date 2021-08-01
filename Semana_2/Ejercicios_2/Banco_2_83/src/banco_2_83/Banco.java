package banco_2_83;

import java.util.Scanner;

public class Banco {

    static Scanner leer = new Scanner(System.in);
    static int numElemento = 0;

    public static void main(String[] args) {
        Cuenta[] cuentas = new Cuenta[10];

        int op = 0;
        int numeroCuenta = 0;
        int pos = 0;
        do {
            op = menu();
            switch (op) {
                case 1:
                    crearCuenta(cuentas);
                    break;
                case 2:
                    listarCuentas(cuentas);
                    break;
                case 3:
                    System.out.println("Ingrese el número de cuenta a buscar");
                    numeroCuenta = leer.nextInt();
                    pos = buscarCuenta(numeroCuenta, cuentas);
                    if (pos != -1) {
                        System.out.println("Ingrese el valor a retiro");
                        double valorRe = leer.nextDouble();
                        System.out.println(cuentas[pos].getSaldo());
                        cuentas[pos].retiro(valorRe);
                        System.out.println(cuentas[pos].getSaldo());
                    } else {
                        System.out.println("El número de cuenta a buscar no existe");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el número de cuenta a buscar");
                    numeroCuenta = leer.nextInt();
                    pos = buscarCuenta(numeroCuenta, cuentas);
                    if (pos != -1) {
                        System.out.println("Ingrese el valor a depositar");
                        double valorRe = leer.nextDouble();
                        System.out.println(cuentas[pos].getSaldo());
                        cuentas[pos].deposito(valorRe);
                        System.out.println(cuentas[pos].getSaldo());
                    } else {
                        System.out.println("El número de cuenta a buscar no existe");
                    }
                    break;
                case 5:
                    aplicarBonificaciones(cuentas);  
                    break;
            }
        } while (op >= 1 && op < 6);
        System.out.println("-------FIN PROGRAMA-----");

    }

    public static int buscarCuenta(int numero, Cuenta[] c) {
        for (int i = 0; i < c.length; i++) {
            if (c[i].getNumero() == numero) {
                return i;
            }
        }
        return -1;
    }

    public static int menu() {
        System.out.println("___MENU____");
        System.out.println("___1.Crear Cuenta______");
        System.out.println("___2.Listar Cuentas____");
        System.out.println("___3.Retiro____________");
        System.out.println("___4.Deposito____________");
        System.out.println("___5.Aplicar bonificacion_");
        System.out.println("___6.Salir_____________");
        int opcion = leer.nextInt();
        return opcion;

    }

    public static void aplicarBonificaciones(Cuenta[] c) {
        System.out.println("Aplicando bonificaciones a todas las cuentas: ");
        for (int i = 0; i < c.length; i++) {
            if (c[i] != null) {
                c[i].setBonificacion();
            }
        }

    }

    public static void listarCuentas(Cuenta[] c) {
        System.out.println("Todas la cuentas del banco: ");
        for (int i = 0; i < c.length; i++) {
            if (c[i] != null) {
                System.out.println("-----------------------------");
                c[i].balance();
            }
        }

    }

    public static void crearCuenta(Cuenta[] c) {
        System.out.println("Ingresar número de la cuenta: ");
        int numero = leer.nextInt();
        System.out.println("Ingresar el titular de la cuenta: ");
        String titular = leer.next();
        System.out.println("Ingresar el saldo de la cuenta: ");
        double saldo = leer.nextDouble();
        Cuenta c1 = new Cuenta(numero, titular, saldo);
        c[numElemento] = c1;
        numElemento++;

    }

}
