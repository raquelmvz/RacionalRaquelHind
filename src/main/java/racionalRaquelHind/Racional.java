/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racionalRaquelHind;

/**
 *
 * @author raquel
 */
public class Racional {

    //Numerador
    private int a;
    //Denominador
    private int b;

    //Constructor por defecto
    public Racional() {

        this.a = 1;
        this.b = 1;
    }

    //Constructor con parametros
    public Racional(int a, int b) {
        this.a = a;
        if (b == 0) {
            this.b = 1;
        } else {
            this.b = b;
        }
    }
     //getters

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

}
