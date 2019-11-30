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
    
    public String Cadastrar_Cliente(String nome,int idade, ){
    
        //JTextNome,JTextIdade,JTextCPF,JTextRua,JTextNumero,JTextCEP,JTextBairro,JTextEstado,JTextTelefone
        return "";
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
