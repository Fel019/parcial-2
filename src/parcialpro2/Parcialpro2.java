/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialpro2;

/**
 *
 * @author estudiante103
 */

public class Parcialpro2 {
    public static void juego(String[] args){
        arma espada = new arma("espada de acero", 3);
        arma baston = new arma("baston magico", 2);
        arma garras = new arma("garras de adamantio", 4);
        
        dragon dragon = new dragon("shenlon", 100, 15);
        mago mago = new mago("merlin",70, 10);
        guerrero guerrero = new guerrero("arthur", 85, 12, 3);
        
        dragon.equipararma(garras);
        mago.equipararma(baston);
        guerrero.equipararma(espada);
        
        System.out.print(mago.aprenderhechizo("rayo electrico"));
        System.out.print(mago.aprenderhechizo("escudo arcano"));
    }
}

