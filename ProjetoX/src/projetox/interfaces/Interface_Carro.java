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
    
    public String Cadastrar_Carro(Carro novo);
    
    public ArrayList<Carro> buscar_Carro(String modelo) throws Exception;
    
    public String remover_Carro(String Modelo)throws Exception;
    
    public void atualizar_Carro(Carro novo,String Modelo)throws Exception;
    
    public boolean veirificarRemocao(String cargo)throws Exception;
    
    public boolean veirificarAtualizacao()throws Exception;
    
    
}
