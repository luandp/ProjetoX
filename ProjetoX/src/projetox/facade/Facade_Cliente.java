/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.facade;

import java.util.ArrayList;
import projetox.controller.Controller_Cliente;

/**
 *
 * @author Luan Paulo
 */
public class Facade_Cliente {
    
    Controller_Cliente control = new Controller_Cliente();
    
    public String Cadastrar_Cliente(String nome, String cpf, String idade, String logradouro, String n_casa, String cep, String bairro, String cidade, String estado, String telefone){
      //public String Cadastrar_Cliente(){     
        return "Cliente Cadastrado com Sucesso!"
                + "\nNome:"+nome+""
                + "\nCPF:"+cpf+""
                + "\nIdade:"+idade+""
                + "\nLogradouro:"+logradouro+""
                + "\nN da Casa:"+n_casa+""
                + "\nCEP:"+cep+""
                + "\nBairro:"+bairro+""
                + "\nCidade:"+cidade+""
                + "\nEstado:"+estado+""
                + "\nTelefone:"+telefone+""
                ;
        
    }
    
    public ArrayList Listar_Cliente(){
        
        ArrayList<String> Clientes  = new ArrayList<>();
        return Clientes;
    }
    
    public String Excluir_Cliente(){
    
        return "";
    }
    
    public String Atualizar_Cliente(){
    
        return "";
    }
    
}
