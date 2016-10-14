package com.example.cice.alquiler_coches.Clases.vehiculos;

//import Vehiculo;

class Moto extends Vehiculo{
    int Gomas ;

    public Moto(String a, String b, String c){
        super(a,b,c);
        Gomas = 2;
    }

    public int getGomas() {
        return Gomas;
    }

    public void setGomas(int gomas) {
        Gomas = gomas;
    }
}
