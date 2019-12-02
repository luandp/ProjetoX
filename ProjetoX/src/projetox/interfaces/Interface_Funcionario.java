/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.interfaces;

import java.util.ArrayList;
import projetox.Class.Funcionario;

/**
 *
 * @author Luan Paulo
 */
public interface Interface_Funcionario {
    
    public String Cadastrar_Funcionario();
    
    public ArrayList<Funcionario> buscar_Funcionario() throws Exception;
    
    public String remover_Funcionario()throws Exception;
    
    public void atualizar_Funcionario()throws Exception;
    
    public String remover_Funcionario(int id)throws Exception;
    
    public boolean veirificarRemocao(String cargo)throws Exception;
    
    public boolean veirificarAtualizacao()throws Exception;
    
    public Funcionario VerificarLogin() throws Exception;
    
    public boolean verificarLoginDisponivel() throws Exception;
    
}
