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

    //Metodos set
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {

        if (b == 0) {
            this.b = 1;
        } else {
            this.b = b;
        }

    }

    //Metodo imprimir consola
    public void imprimirConsola() {
        System.out.println("El racional es: " + a + "/" + b);
    }

    //Metodo ToString
    @Override
    public String toString() {
        return a + "/" + b;
    }

    //Metodo suma 
    public Racional suma(Racional racional) {
        if (this.b == racional.getB()) {
            this.a += racional.getA();
        } else {
            this.a = (this.a * racional.getB()) + (this.b * racional.getA());
            this.b *= racional.getB();
        }
        return new Racional(this.a, this.b);
    }

    //Metodo resta
    public Racional resta(Racional racional) {
        if (this.b == racional.getB()) {
            this.a -= racional.getA();
        } else {
            this.a = (this.a * racional.getB()) - (this.b * racional.getA());
            this.b *= racional.getB();
        }
        return new Racional(this.a, this.b);

    }
    //Metodo producto

    public Racional producto(Racional racional) {

        return new Racional(this.a * racional.getA(), this.b * racional.getB());
    }

    //Metodo de clase division
    public static Racional division(Racional racional1, Racional racional2) {

        return new Racional(racional1.getA() * racional2.getB(), racional1.getB() * racional2.getA());
    }
    //Metodo de clase igualidad
    public static boolean igualdad(Racional racional1, Racional racional2){
        return racional1.getA()*racional1.getB()==racional2.getA() * racional1.getB();
    }
}
