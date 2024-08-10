/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrovehiculos;

/**
 *
 * @author danie
 */
public class Bicicleta implements Vehiculo {

    @Override
    public void iniciar() {
        System.out.println("La bicicleta ha sido iniciada.");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta ha sido detenida.");
    }
}
