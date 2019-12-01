/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.controller;

import java.util.ArrayList;
import projetox.Class.Funcionario;
import projetox.Model.Model_Funcionario;

/**
 *
 * @author Luan Paulo
 */
public class Controller_Funcionario {
   
    Model_Funcionario model = new Model_Funcionario();
    
    public String Validar_Cadastro(String nome, String cpf, String senha, String cargo, String salario,String login){
        
        //fazer validacoes aqui
        //Transformar Variaveis
        
        //nome é String
        //CPF é String
        //Senha é String
        //Cargo é String
        double salarioConvertido = Double.parseDouble(salario);

        String retorno = "";
        //criar classe cliente e popular dados
        //double salario, String senha, int id, String nome, String CPF, String cargo
        Funcionario novo = new Funcionario(salarioConvertido, senha, 0, nome, cpf, cargo,login);
        
        
        //chamar model
        retorno = model.Cadastrar_Funcionario(novo);
        
        return retorno;
    
        
    }
    
    public String Validar_Atualizar(){
        
        return "";
    }
    
    public ArrayList<Funcionario> ValidarBusca(String nome)throws Exception
    {
        ArrayList<Funcionario> funcionarios = new ArrayList();
        funcionarios = model.buscar_Funcionario(nome);
        return funcionarios;
    }
    public String verificarRemocao(int id,String cargo)throws Exception
    {
        if(id==0)
        {
            throw  new Exception("Informe um usuário para ser excluido");
        }
        boolean retorno;
        retorno = model.veirificarRemocao(cargo);
        if(retorno == true)
        {
            throw  new Exception("Você é o último usuário Administrador, por isso não pode ser removido");
        }
        model.remover_Funcionario(id);
        return "";
               
    }
    public String verificaAtualizacao()throws Exception
    {
       
       boolean retorno = true;
       retorno = model.veirificarAtualizacao();
       if(retorno == true)
       {
           return "Você não pode atualizar o último Administrador para funcionáio";
       }
       return "ok";
    }
     
    
        public void validarAtualizacao(Funcionario novo,int id,String login)throws Exception
    {
        if(novo.getNome().trim().equals(""))
        {
            throw  new Exception("Informe o nome do funcionario");
            
        }
        if(novo.getNome().trim().length()<10)
        {
            throw  new Exception("Informe o nome completo do funcionario ");
            
        }
        if(novo.getLogin().trim().equals(""))
        {
            throw  new Exception("Informe o Login do funcionario");
           
        }
        if(novo.getLogin().trim().length()<4)
        {
           throw  new Exception("Informe um Login válido");
           
        }
        if(novo.getSenha().trim().equals(""))
        {
           throw  new Exception("Informe a senha do funcionario");
           
        }
        if(novo.getSenha().trim().length()<4)
        {
           throw  new Exception("A senha deve ter no minimo 4 caracteres ");
            
        }
        if(!login.equals(novo.getLogin()))
        {
            boolean retorno;
            retorno = model.verificarLoginDisponivel(novo.getLogin());
            if(retorno == true)
            {
                throw  new Exception("Já existe um usuário com esse Login");
            }
        }
            model.atualizar_Funcionario(novo,id);
            
    }
}
