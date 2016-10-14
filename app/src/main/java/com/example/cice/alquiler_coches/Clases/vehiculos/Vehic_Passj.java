package com.example.cice.alquiler_coches.Clases.vehiculos;

/**
 * Created by cice on 14/10/16.
 */

public class Vehic_Passj extends Vehiculo {
    int cant_passj;

    public Vehic_Passj(String matricula, String color, String carnet) {
        super(matricula, color, carnet);
        cant_passj = 0;
    }

    public void setCant_passj(int cantidad){

        this.cant_passj = cantidad;
    }


    public String toString() {
        return super.toString();
    }
}
