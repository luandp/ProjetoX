/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.controller;

import projetox.Class.Cliente;
import projetox.Model.Model_Cliente;

/**
 *
 * @author Luan Paulo
 */
public class Controller_Cliente {
    
    Model_Cliente model = new Model_Cliente();
    
    public String Validar_Cadastro(String nome, String cpf, String idade, String logradouro, String n_casa, String cep, String bairro, String cidade, String estado, String telefone) throws Exception{
    
        //fazer validacoes aqui
        //Transformar Variaveis
        
        //nome é String
        //CPF é String
        int id = 0;
        int idadeConvertida = Integer.parseInt(idade);
        //Logradouro é String
        int n_casaConvertido = Integer.parseInt(n_casa);
        int cepConvertido = Integer.parseInt(cep);
        //Bairro é String
        //Cidade é String
        //Estado é String
        //Telefone é String
        
        //int idade, String logradouro, int n_casa, int cep, String bairro, String cidade, String estado, String telefone, int id, String nome, String CPF;
        
        String retorno = "";
        //criar classe cliente e popular dados
        //int idade, String logradouro, int n_casa, int cep, String bairro, String cidade, String estado, String telefone, int id, String nome, String CPF
        Cliente novo = new Cliente(id, nome, cpf, idadeConvertida, logradouro, n_casaConvertido, cepConvertido, bairro, cidade, estado, telefone);
        
        
        //chamar model
        retorno = model.Cadastrar_Cliente(novo);
        
        return retorno;
    }
    
    public String Validar_Atualizar(){
        
        return "";
    }
    
    public String ValidarBusca(){
        return "";
    }
    
    
}
