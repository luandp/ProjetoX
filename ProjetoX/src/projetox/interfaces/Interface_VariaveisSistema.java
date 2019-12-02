/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.interfaces;

import java.util.ArrayList;
import projetox.Class.VariaveisSistema;

/**
 *
 * @author Luan Paulo
 */
public interface Interface_VariaveisSistema {
    
     public String Cadastrar_VariaveisSistema();
    
    public ArrayList<VariaveisSistema> buscar_VariaveisSistema() throws Exception;
    
    public String remover_VariaveisSistema()throws Exception;
    
    public void atualizar_VariaveisSistema()throws Exception;
    
}
