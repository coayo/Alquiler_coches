package com.example.cice.alquiler_coches.Clases.vehiculos;

import java.util.*;

public class Vehiculo {

    //public int CantRuedas;

    public String Matricula;

    public String Color;

    public String Tipo_Carnet;

    public Vehiculo(String mat, String col, String tipo_carnet){
        this.Matricula = mat;
        this.Color = col;
        this.Tipo_Carnet = tipo_carnet;
    }

    public String getMatricula () { return Matricula;  }
    public String getColor () { return Color;  }
    public String getTipo_Carnet () { return Tipo_Carnet;   }



}