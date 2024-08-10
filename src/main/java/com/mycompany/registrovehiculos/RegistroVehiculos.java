/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrovehiculos;

/**
 *
 * @author danie
 */
public class RegistroVehiculos {

    public static void main(String[] args) {
        Vehiculo auto1 = new Automovil();
        Vehiculo bici1 = new Bicicleta();

        SistemaGestionVehiculos sistema = new SistemaGestionVehiculos();

        sistema.registrarVehiculo(auto1);
        sistema.registrarVehiculo(bici1);

        sistema.iniciarTodos();

        sistema.detenerTodos();
    }
}
