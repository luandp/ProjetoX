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
public class Operacao {
        int id;
        Funcionario funcionario;
        Cliente cliente;
        Carro carro;

    public Operacao(int id, Funcionario funcionario, Cliente cliente, Carro carro) {
        this.id = id;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.carro = carro;
    }

        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
        
        
        
        
        
}
