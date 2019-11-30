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
    
    Controller_Funcionario Control = new Controller_Funcionario();
    
    
    public String Cadastrar_Funcionario(){
        
    
        return "";
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
