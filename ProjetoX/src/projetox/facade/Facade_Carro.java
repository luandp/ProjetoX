/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.facade;

import java.util.ArrayList;
import projetox.controller.Controller_Carro;

/**
 *
 * @author Luan Paulo
 */
public class Facade_Carro {
    
    Controller_Carro control = new Controller_Carro();

    public String Cadastrar_Carro(int id, String placa, String marca, String modelo, String cor, String ano, int portas, boolean arcondicionado, String direcao, boolean veletrico, boolean alarme, String tipo, String combustivel, boolean cambioauto, boolean multimidia, boolean status) throws Exception{
      //recebe variaveis
     String retorno = ""; 
      

      //chama controller
      retorno = control.Validar_Cadastro(placa, marca, modelo, cor, ano, portas, arcondicionado, direcao, veletrico, alarme, tipo, combustivel, cambioauto, multimidia, status);
        
        
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
        
    
        control.Validar_Cadastro();
        return "";
    }
    
    public ArrayList Listar_Carro(){
        
        ArrayList<String> Carros  = new ArrayList<>();
        return Carros;
    }
    
    public String Excluir_Carro(){
        
       
        return "";
    }
    
    public String Atualizar_Carro(){
    
        control.Validar_Atualizar();
        return "";
    }
}
