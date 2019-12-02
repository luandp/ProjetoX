/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.Class;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Luan Paulo
 */

        
public class Venda extends Operacao{
        double preco;
        int parcelas;
        String data;
        Funcionario fun = new Funcionario();
        Cliente cli = new Cliente();
        Carro ca = new Carro();
    public Venda(){
        super();
        this.preco = preco;
        this.parcelas = parcelas;
        this.data = data;
        
    }
    public Venda(double preco, int parcelas, String data, int id, Funcionario funcionario, Cliente cliente, Carro carro) {
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setCarro(ArrayList<Carro> fi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
}
