package com.company;

public class GuardaSol {
    // atributos:
    double peso;
    String cor, marca;
    boolean fechado;

    // métodos e funções

    void abrir() {
        System.out.printf("Guarda sol aberto...");
    }

    void abrir() {
        if (fechado == true) {
            System.out.printf("Abrindo guarda sol");
            fechado = false;
        } else{
        System.out.printf("Guarda sol já está aberto);
        }
    }
    void fechar)(){
        if (fechado == false) {
            System.out.printf("Fechando guarda sol");
            fechado = true;
        } else {
            System.out.printf("Guarda sol já está fechado");
        }
    }

}

