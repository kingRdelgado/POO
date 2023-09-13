package com.gamis214;


public class Leon extends Animal {

    private String raza;

    public Leon (String nombre,String tipo_alimentacion,int edad,String raza){
        super(nombre,tipo_alimentacion,edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void mostrar(){
        System.out.println(getNombre() + "-"+getTipo_alimentacion()+"-"+getEdad()+"-"+getRaza());
    }

    @Override
    public void Alimentarse() {
        System.out.println("Me alimento de carne y soy el rey de la selva");
    }
}