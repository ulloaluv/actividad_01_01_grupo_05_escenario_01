package pds_actividad_01_01_grupo05_escenario01.factoy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edison
 */
public class VehiculoControlador {
    private VehiculoFactory factory;

    public VehiculoControlador(VehiculoFactory factory) {
        this.factory = factory;
    }

    public Vehiculo crearVehiculo(String tipo, String marca, String modelo, int anio) {
        return factory.crearVehiculo(tipo, marca, modelo, 0);
    }

    public double calcularCostoMatricula(Vehiculo vehiculo) {
        return vehiculo.calcularCostoMatricula();
    }
}