package org.ptech081.parking;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

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

        // Crear dos cupos
        Cupo cupo1 = new Cupo('A');
        Cupo cupo2 = new Cupo('B');

        // Crear 2 registros E/S
        LocalDate fechaInicio = LocalDate.now();
        LocalTime horaInicio = LocalTime.now();
        LocalDate fechaFin = LocalDate.of(2024, Month.MARCH, 24);
        LocalTime horaFin = LocalTime.of(15, 30, 0);
        List<Registro> misRegistros = new ArrayList<Registro>();

        // crear registro

        Registro registro1 = new Registro(fechaInicio, horaInicio, fechaFin, horaFin, 5000L, cupo1,cliente1.misCarros.get(0), cliente1);

        Registro registro2 = new Registro(fechaInicio, horaInicio, fechaFin, horaFin, 6000L, cupo2, cliente1.misCarros.get(0), cliente1);

        

        // añadir el registro a la lista

        misRegistros.add(registro1);
        misRegistros.add(registro2);
        System.out.println("Registros de E/S parking");
        for (Registro r : misRegistros) {
            System.out.println("Cliente " +
            r.cliente.nombre + " " + 
            r.cliente.apellidos + "|" +
            r.carro.placa + " " +
            r.carro.tipoVehiculo + "|" + 
            r.valor + "|" +
            r.fechaInicio + " " +
            r.horaInicio + "|" 
            );
        }

    }

}
