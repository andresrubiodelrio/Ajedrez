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
public class Caballo 
{
    private Color color;
    private Posicion posicion;

    private Color getColor() {
        return color;
    }

    private Posicion getPosicion() {
        return posicion;
    }

    private void setColor(Color color) {
        this.color = color;
    }

    private void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    
    public Caballo()
    {
    color=Color.NEGRO;
    posicion.fila=8;
    posicion.columna='b';
    
    }
    public Caballo(Color color)
    {
        if(color==Color.BLANCO)
        {
        color=Color.BLANCO;
        posicion.fila=1;
        posicion.columna='b';
        }else
        {
            color=Color.NEGRO;
            posicion.fila=8;
            posicion.columna='b';
        }
        }
}