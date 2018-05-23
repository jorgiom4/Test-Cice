package com.instancia2;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hola mundo desde el proyecto de pruebas con repositorio");
        System.out.println("Esto es otra linea");

        UnaFuncion();
    }

    static void UnaFuncion(){
        System.out.println("Otra salida por consola");
        for(int i = 0; i<10; i++){
            System.out.println("Valor de i: " + i);
        }

        System.out.println("Despues del for");

    }
}
