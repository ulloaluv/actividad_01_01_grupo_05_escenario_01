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

public class Camioneta extends Vehiculo {
    public Camioneta(String marca, String modelo, int anioFabricacion) {
        super(marca, modelo, anioFabricacion);
    }

    @Override
    public double calcularCostoMatricula() {
        // Implementa el cálculo específico para camionetas
        // Puedes agregar la lógica según tus requerimientos
 switch(marca.toLowerCase()){
            case "toyota":
                return 2000.0;
            case "hyundai":
                return 2100.0;
            case "mazda":
                return 2500.0;
            case "suzuki":
                return 200.0;
            default:
                return 0;
        }
    }
}