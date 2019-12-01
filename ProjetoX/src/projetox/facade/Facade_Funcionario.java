/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.facade;

import java.util.ArrayList;
import projetox.Class.Funcionario;
import projetox.controller.Controller_Funcionario;

/**
 *
 * @author Luan Paulo
 */
public class Facade_Funcionario {
    
    Controller_Funcionario control = new Controller_Funcionario();
    
    
    public String Cadastrar_Funcionario(String nome, String cpf, String senha, String cargo, String salario, String login){
            return control.Validar_Cadastro(nome, cpf, senha, cargo, salario,login);
        }
     
    public ArrayList Listar_Funcionarios(String nome) throws Exception{
        ArrayList<Funcionario> Funcionarios  = new ArrayList<>();
        return control.ValidarBusca(nome);
    }
    
    public String Excluir_Funcionario(int id,String cargo) throws Exception{
        return control.verificarRemocao(id,cargo);
    }
    
    public String Atualizar_Funcionario(){
        return "";
    }
    public String verificaAtualizacao()throws Exception
    {
       return control.verificaAtualizacao();
    }
    public String validar_Atualizacao(Funcionario novo,int id,String login)throws Exception{
        control.validarAtualizacao(novo, id, login);
        return "validado";
    }
}
