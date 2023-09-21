/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pds_actividad_01_01_grupo05_escenario01.factoy;

/**
 *
 * @author Edison
 */
public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anioFabricacion;

    public Vehiculo(String marca, String modelo, int anioFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
    }

    public abstract double calcularCostoMatricula();
}
