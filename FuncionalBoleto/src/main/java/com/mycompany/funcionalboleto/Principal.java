/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.funcionalboleto;

/**
 *
 * @author 05728612148
 */
public class Principal {

    public static void main(String[] args) {
        ProcessarBoletos processador = new ProcessarBoletos(ProcessarBoletos::lerBradesco);
        String nomeArquivo = Principal.class.getResource("bradesco-1.csv").getPath();
        System.out.println(nomeArquivo);
        processador.processar(nomeArquivo);
    };
    
}