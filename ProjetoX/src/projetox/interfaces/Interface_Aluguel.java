/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.interfaces;

import java.util.ArrayList;
import projetox.Class.Aluguel;

/**
 *
 * @author Luan Paulo
 */
public interface Interface_Aluguel {
    
    public String Cadastrar_Aluguel();
    
    public ArrayList<Aluguel> buscar_Aluguel() throws Exception;
    
    public String remover_Aluguel()throws Exception;
    
    public void atualizar_Aluguel()throws Exception;
    
}
