/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.interfaces;

import java.util.ArrayList;
import projetox.Class.Pessoa;

/**
 *
 * @author Luan Paulo
 */
public interface Interface_Pessoa {
    
    public String Cadastrar_Pessoa();
    
    public ArrayList<Pessoa> buscar_Pessoa() throws Exception;
    
    public String remover_Pessoa()throws Exception;
    
    public void atualizar_Pessoa()throws Exception;
    
}
