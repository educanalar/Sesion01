package com.poo.clase;

public class Persona {
    String nombre, mensaje;
    float peso;
    int altura;
    public Persona(){}

    public Persona(String nombre, String mensaje, float peso, int altura) {
        this.nombre = nombre;
        this.mensaje = mensaje;
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularIMC( float peso, int altura){
        return peso / altura * altura;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String toString(){
        return "Hola" + getNombre()+", su IMC es"+ " " + getMensaje();
    }
}
