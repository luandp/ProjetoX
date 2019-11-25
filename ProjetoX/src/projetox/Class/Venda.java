/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.Class;

import java.util.Date;

/**
 *
 * @author Luan Paulo
 */
public class Venda extends Operacao{
        double preco;
        int parcelas;
        Date data;

    public Venda(double preco, int parcelas, Date data, int id, Funcionario funcionario, Cliente cliente, Carro carro) {
        super(id, funcionario, cliente, carro);
        this.preco = preco;
        this.parcelas = parcelas;
        this.data = data;
    }

    
        
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
        
        
}
