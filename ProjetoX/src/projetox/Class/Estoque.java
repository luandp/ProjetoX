/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.Class;

/**
 *
 * @author Luan Paulo
 */
public class Estoque {
    
        int id;
        Carro carro;
        int quantidade;
        boolean aluguel;        

    public Estoque(int id, Carro carro, int quantidade, boolean aluguel) {
        this.id = id;
        this.carro = carro;
        this.quantidade = quantidade;
        this.aluguel = aluguel;
    }

        
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isAluguel() {
        return aluguel;
    }

    public void setAluguel(boolean aluguel) {
        this.aluguel = aluguel;
    }






}


