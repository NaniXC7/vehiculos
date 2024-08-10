/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrovehiculos;

/**
 *
 * @author danie
 */
public class Automovil implements Vehiculo {

    @Override
    public void iniciar() {
        System.out.println("El automóvil ha sido iniciado.");
    }

    @Override
    public void detener() {
        System.out.println("El automóvil ha sido detenido.");
    }
}

