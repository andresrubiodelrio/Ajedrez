/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iesalandalus.programacion.caballoajedrez;

/**
 *
 * @author Youness
 */
public class Posicion 
{
    int fila;
    char columna;

    public int getFila() {
        return fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setFila(int fila) {
        if(fila<1 || fila>8)
            throw new IllegalArgumentException("La fila pasada como parametro no es valida, prueba con este intervalo [1,8]");
        else
        this.fila = fila;
    }

    public void setColumna(char columna) {
        if(columna<'a' || columna>'h')
            throw new IllegalArgumentException("La fila pasada como parametro no es valida, prueba con este intervalo [a,h]");
        else
        this.columna = columna;
    }
    
}
