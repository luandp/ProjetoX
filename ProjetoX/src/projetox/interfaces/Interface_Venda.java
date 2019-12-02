/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.interfaces;

import java.util.ArrayList;
import projetox.Class.Venda;

/**
 *
 * @author Luan Paulo
 */
public interface Interface_Venda {
    
    public String Cadastrar_Venda();
    
    public ArrayList<Venda> buscar_Venda() throws Exception;
    
    public String remover_Venda()throws Exception;
    
    public void atualizar_Venda()throws Exception;
    
}
