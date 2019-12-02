/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.interfaces;

import java.util.ArrayList;
import projetox.Class.Operacao;

/**
 *
 * @author Luan Paulo
 */
public interface Interface_Operacao {
    
    public String Cadastrar_Operacao();
    
    public ArrayList<Operacao> buscar_Operacao() throws Exception;
    
    public String remover_Operacao()throws Exception;
    
    public void atualizar_Operacao()throws Exception;
    
}
