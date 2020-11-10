/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import model.Pessoa;

/**
 *
 * @author SESI_SENAI
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Guilherme", 30, 1.74);
        Pessoa p2 = p1;
        Pessoa p3 = p2;

    }
    
}
