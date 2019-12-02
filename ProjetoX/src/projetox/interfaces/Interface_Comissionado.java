/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.interfaces;

import java.util.ArrayList;
import projetox.Class.Comissionado;

/**
 *
 * @author Matheus Freitas
 */
public interface Interface_Comissionado {
    
    public String Cadastrar_Comissionado();
    
    public ArrayList<Comissionado> buscar_Comissionado() throws Exception;
    
    public String remover_Comissionado()throws Exception;
    
    public void atualizar_Comissionado()throws Exception;
    
    
}
