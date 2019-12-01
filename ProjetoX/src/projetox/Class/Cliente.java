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
public class Cliente extends Pessoa{
    
    int idade;
    String logradouro;
    int n_casa;
    int cep;
    String bairro;
    String cidade;
    String estado;
    String telefone;
    //nome, cpf, idadeConvertida, logradouro, n_casaConvertido, cepConvertido, bairro, cidade, estado, telefone
    public Cliente(int id, String nome, String CPF, int idade, String logradouro, int n_casa, int cep, String bairro,String cidade,String estado,String telefone) {
        super(id, nome, CPF);
        this.idade = idade;
        this.logradouro = logradouro;
        this.n_casa = n_casa;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
    }

    

    
    
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getN_casa() {
        return n_casa;
    }

    public void setN_casa(int n_casa) {
        this.n_casa = n_casa;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
    
    
    
    
}
