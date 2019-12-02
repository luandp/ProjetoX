/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.controller;

import java.util.ArrayList;
import projetox.Class.Carro;
import projetox.Class.Cliente;
import projetox.Model.Model_Carro;

/**
 *
 * @author Luan Paulo
 */
public class Controller_Carro {
    
    Model_Carro model = new Model_Carro();
    
    public String Validar_Cadastro(int id, String placa, String marca, String modelo, String cor, int ano, int portas, boolean arcondicionado, String direcao, boolean veletrico, boolean alarme, String tipo, String combustivel, boolean cambioauto, boolean multimidia, boolean status) throws Exception{
    
        //fazer validacoes aqui
        //Transformar Variaveis
     
      
        //Logradouro é String
        
        //Bairro é String
        //Cidade é String
        //Estado é String
        //Telefone é String
        
        //int idade, String logradouro, int n_casa, int cep, String bairro, String cidade, String estado, String telefone, int id, String nome, String CPF;
        
        String retorno = "";
        //criar classe cliente e popular dados
        //int idade, String logradouro, int n_casa, int cep, String bairro, String cidade, String estado, String telefone, int id, String nome, String CPF
        Carro novo = new Carro(id, placa, marca, modelo, cor, ano, portas, arcondicionado, direcao, veletrico, alarme, tipo, combustivel, cambioauto, multimidia, status);
        
        
        //chamar model
        retorno = model.Cadastrar_Carro(novo);
        
        return retorno;
    }
    
    public String Validar_Atualizar(){
        
        return "";
    }
    
    public ArrayList<Carro> ValidarBusca(String nome)throws Exception
    {
        ArrayList<Carro> carros = new ArrayList();
        carros = model.buscar_Carro(nome);
        return carros;
    }
}
