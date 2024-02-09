package org.ptech081.parking;

import org.ptech081.parking.entities.*;

public class Main {
    public static void main(String[] args) {

        // crear carros con los constructores:
        Carro carrito1 = new Carro("BJC 598",
                TipoVehiculo.CAMIONETA);
        Carro carrito2 = new Carro();
        carrito2.placa = "IUG 345";
        carrito2.tipoVehiculo = TipoVehiculo.MOTO;

        // crear clientes

        Cliente cliente1 = new Cliente("Gilberta", "Uwu", 16746542l);

        // invocar el metodo addCar :

        cliente1.addCar(carrito2);
        cliente1.addCar("ASD 156", TipoVehiculo.BUS);

        // recorrer los del cliente

        for (Carro c : cliente1.misCarros) {
            System.out.println(c.placa + "" + c.tipoVehiculo);
            System.out.println("-------------");

        }

    }
}