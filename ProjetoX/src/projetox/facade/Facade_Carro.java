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
    
    public String Cadastrar_Carro(){
    
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
