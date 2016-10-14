package com.example.cice.alquiler_coches.Clases.vehiculos;

/**
 * Created by cice on 14/10/16.
 */

public class Limosine {
    private String name = "";

    private static final Limosine INSTANCE = new Limosine("tesr");

    private Limosine(String limood){
        this.name = limood;
    }

    public static Limosine getInstance(){
        return INSTANCE;
    }

    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

}
