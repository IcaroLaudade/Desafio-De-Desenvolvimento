/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.voxus;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Icaro
 */
public class Pilha {

    private List<Integer> pilha = new ArrayList<>();
    private int menor;

    public Pilha() {
    }

    /**
     *
     * @param numero
     * @throws Exception Método cuja função é adicionar um número na pilha
     */
    public void push(int numero) throws Exception {
        if (pilha.isEmpty()) {
            this.menor = numero;
        } else if (this.menor > numero) {
            this.menor = numero;
        }
        this.pilha.add(numero);
    }

    /**
     *
     * @return @throws Exception Método para remoção do valor que estiver no
     * topo da pilha
     */
    public int pop() throws Exception {
        return pilha.remove(pilha.size() - 1);
    }

    public int min() {
        return this.menor;
    }
}
