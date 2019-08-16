package edu.ujcv.progra2;

public class Clientes<T> {
     String JK[];

   public int numeroidentidad;


    /*public String[] getJK() {
          String Nombre="x";
          int[] NumeroIdentidad={numeroidentidad};
          char[ ] sexo = {'m', 'f'};
          JK []= Nombre + NumeroIdentidad ;
          return JK;
     }*/


     public int getNumeroidentidad() {
          return numeroidentidad;
     }

     public void setNumeroidentidad(int numeroidentidad) {
          this.numeroidentidad = numeroidentidad;
     }


}
