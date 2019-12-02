/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.interfaces;

import java.util.ArrayList;

/**
 *
 * @author Luan Paulo
 */
public interface Interface_FolhaPagamento {
    
    public String Cadastrar_FolhaPagamento();
    
    //public ArrayList<FolhaPagamento> buscar_FolhaPagamento() throws Exception;
    
    public String remover_FolhaPagamento()throws Exception;
    
    public void atualizar_FolhaPagamento()throws Exception;
    
}
