/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.interfaces;

import java.util.ArrayList;
import projetox.Class.Carro;

/**
 *
 * @author Luan Paulo
 */
public interface Interface_Carro {
    
    public String Cadastrar_Carro();
    
    public ArrayList<Carro> buscar_Carro() throws Exception;
    
    public String remover_Carro()throws Exception;
    
    public void atualizar_Carro()throws Exception;
    
    public boolean veirificarRemocao()throws Exception;
    
    public boolean veirificarAtualizacao()throws Exception;
    
    
}
