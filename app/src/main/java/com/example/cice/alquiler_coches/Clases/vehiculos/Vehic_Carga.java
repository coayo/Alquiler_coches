package com.example.cice.alquiler_coches.Clases.vehiculos;

//import Vehiculo;

/**
 * Created by cice on 14/10/16.
 */

public class Vehic_Carga extends Vehiculo {

    int tonelaje;

    public Vehic_Carga(String matricula, String color, String carnet) {
        super(matricula, color, carnet);
        tonelaje = 0;
    }

    public int getTonelaje() { return tonelaje;   }

    public void setTonelaje(int ton){
        this.tonelaje = ton;
    }
}
