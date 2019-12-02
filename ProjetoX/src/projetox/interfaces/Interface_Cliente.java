/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.interfaces;

import java.util.ArrayList;
import projetox.Class.Cliente;

/**
 *
 * @author Luan Paulo
 */
public interface Interface_Cliente {
    
    public String Cadastrar_Cliente();
    
    public ArrayList<Cliente> buscar_Cliente() throws Exception;
    
    public String remover_Cliente()throws Exception;
    
    public void atualizar_Cliente()throws Exception;
    
}
