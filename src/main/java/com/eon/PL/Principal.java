package com.eon.PL;

import com.eon.Entities.Cliente;
import com.eon.Entities.Cuenta;
import java.text.DecimalFormat;

public class Principal {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Luis", "Ramos");
        Cuenta cuenta = new Cuenta(500.0);
        DecimalFormat df = new DecimalFormat("####0.00");
        cliente.setCuenta(cuenta);

        System.out.printf("Creando el cliente %s %s %n", cliente.getNombre(), cliente.getApellido());
        System.out.printf("Creando su cuenta bancaria con saldo %s€ %n", df.format(cliente.getCuenta().getBalance()));

        System.out.println(cuenta.extraer(150.00));
        System.out.println(cuenta.ingresar(22.50));
        System.out.println(cuenta.extraer(47.62));
        System.out.println(cuenta.extraer(400.0));

    }
}
