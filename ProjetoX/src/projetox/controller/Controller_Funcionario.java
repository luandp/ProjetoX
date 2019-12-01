/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.controller;

import projetox.Class.Funcionario;
import projetox.Model.Model_Funcionario;

/**
 *
 * @author Luan Paulo
 */
public class Controller_Funcionario {
   
    Model_Funcionario model = new Model_Funcionario();
    
    public String Validar_Cadastro(String nome, String cpf, String senha, String cargo, String salario){
        
        //fazer validacoes aqui
        //Transformar Variaveis
        
        //nome é String
        //CPF é String
        //Senha é String
        //Cargo é String
        double salarioConvertido = Double.parseDouble(salario);

        String retorno = "";
        //criar classe cliente e popular dados
        //double salario, String senha, int id, String nome, String CPF, String cargo
        Funcionario novo = new Funcionario(salarioConvertido, senha, 0, nome, cpf, cargo);
        
        
        //chamar model
        retorno = model.Cadastrar_Funcionario(novo);
        
        return retorno;
    
        
    }
    
    public String Validar_Atualizar(){
        
        return "";
    }
    
    public String ValidarBusca(){
        return "";
    }
}
