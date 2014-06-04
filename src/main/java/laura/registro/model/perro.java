/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package laura.registro.model;

/**
 *
 * @author T107
 */
//public abstract class perro implements Mascota {// 
//podria quedar asi 

public  class perro implements Mascota {
private String nombre; 

@Override

public String obtenerRegistro (){

return "Acaba de registrase  un perrito";

}


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
  
}
