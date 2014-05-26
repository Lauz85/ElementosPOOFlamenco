/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Contador;

/**
 *
 * @author lauraflamenco
 */
public class ContadorVisita {
    
    private static int  contador ;

    public static int getContador() {
        return contador ++;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

 
    
}
