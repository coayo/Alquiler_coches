package com.example.cice.alquiler_coches.Clases.vehiculos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by cice on 14/10/16.
 */
public class Renta implements Iterable<Vehiculo> {
    private  int pos = 0;
    private List<Vehiculo> TodosCoches;

    public Renta(List<Vehiculo> TodosCoches){
        super();
        this.TodosCoches = TodosCoches;
    }

     public boolean hasNext(){
         if (TodosCoches.get(pos+1)< TodosCoches.size())
         return true;

     }
    public Vehiculo next(){
        Vehiculo car = TodosCoches.get(pos+1);
        return car;
    }

    public void iterable(){
        while (TodosCoches.hasNext){
            return car;
        }


    }



}
