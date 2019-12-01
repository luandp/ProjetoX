/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.facade;

import java.util.ArrayList;
import projetox.controller.Controller_Funcionario;

/**
 *
 * @author Luan Paulo
 */
public class Facade_Funcionario {
    
    Controller_Funcionario control = new Controller_Funcionario();
    
    
    public String Cadastrar_Funcionario(String nome, String cpf, String senha, String cargo, String salario, String login){
         //recebe variaveis
     String retorno = ""; 
      
     
      //chama controller
      retorno = control.Validar_Cadastro(nome, cpf, senha, cargo, salario,login);
        
     
        return retorno;
      /*  return "Cliente Cadastrado com Sucesso!"
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
                ;*/
        
        
    
        
    }
    
    public ArrayList Listar_Funcionarios(){
        
        ArrayList<String> Funcionarios  = new ArrayList<>();
        return Funcionarios;
    }
    
    public String Excluir_Funcionario(){
    
        return "";
    }
    
    public String Atualizar_Funcionario(){
    
        return "";
    }
}
