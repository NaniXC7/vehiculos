/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrovehiculos;

/**
 *
 * @author danie
 */
import java.util.ArrayList;
import java.util.List;

public class SistemaGestionVehiculos {

    private List<Vehiculo> vehiculos = new ArrayList<>();

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void iniciarTodos() {
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.iniciar();
        }
    }

    public void detenerTodos() {
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.detener();
        }
    }
}
