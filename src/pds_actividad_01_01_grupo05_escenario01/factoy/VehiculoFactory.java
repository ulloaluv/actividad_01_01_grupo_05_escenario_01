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

public class VehiculoFactory {
    
    public static Vehiculo crearVehiculo(String tipo, String marca, String modelo, int anioFabricacion) {
        switch (tipo.toLowerCase()) {
            case "auto":
                return new Auto(marca, modelo, anioFabricacion);
            case "camioneta":
                return new Camioneta(marca, modelo, anioFabricacion);
            case "camion":
                return new Camion(marca, modelo, anioFabricacion);
            default:
                throw new IllegalArgumentException("Tipo de vehículo no válido: " + tipo);
        }
    }
    
}