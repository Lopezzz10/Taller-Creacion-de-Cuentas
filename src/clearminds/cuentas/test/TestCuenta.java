package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

    public static void main(String[] args) {

        // 1. Creación de instancias con diferentes constructores
        Cuenta cuenta1 = new Cuenta("03476");
        cuenta1.setSaldo(675);

        Cuenta cuenta2 = new Cuenta("03476", "C", 98);

        Cuenta cuenta3 = new Cuenta("03476");
        cuenta3.setTipo("C");

        // 2. Visualización inicial
        System.out.println("-------- Valores Iniciales ---------");
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();

        // Reto Adicional: modificar saldos y tipos, volver a imprimir
        cuenta1.setTipo("B");
        cuenta1.setSaldo(1200);

        cuenta2.setSaldo(500);

        cuenta3.setSaldo(50);

        System.out.println("-------- Valores Modificados ---------");
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();

        // Reto Adicional: tres cuentas adicionales con constructores sobrecargados
        Cuenta cuenta4 = new Cuenta("04521");
        Cuenta cuenta5 = new Cuenta("07892", "D", 320.50);
        Cuenta cuenta6 = new Cuenta("01234", "C", 1500);

        System.out.println("-------- Cuentas Adicionales ---------");
        cuenta4.imprimirConMiEstilo();
        cuenta5.imprimirConMiEstilo();
        cuenta6.imprimirConMiEstilo();
    }
}