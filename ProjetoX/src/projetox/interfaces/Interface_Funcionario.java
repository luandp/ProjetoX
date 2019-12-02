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
    
    public String Cadastrar_Funcionario(Funcionario novo);
    
    public ArrayList<Funcionario> buscar_Funcionario(String nome) throws Exception;
    
    public String remover_Funcionario(int id)throws Exception;
    
    public void atualizar_Funcionario(Funcionario novo,int id)throws Exception;
    
    public boolean veirificarRemocao(String cargo)throws Exception;
    
    public boolean veirificarAtualizacao()throws Exception;
    
    public Funcionario VerificarLogin(String login,String senha) throws Exception;
    
    public boolean verificarLoginDisponivel(String login) throws Exception;
    
}
