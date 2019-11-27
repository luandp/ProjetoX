/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.controller;

import projetox.Class.Carro;
import projetox.Model.Model_Carro;

/**
 *
 * @author Luan Paulo
 */
public class Controller_Carro {
    Model_Carro model = new Model_Carro();
        
    public void validarCadastro(Carro novo) throws Exception
    {
        if(novo.getNome().trim().equals(""))
        {
            throw  new Exception("Informe o nome do usuário");
            
        }
        if(novo.getNome().trim().length()<10)
        {
            throw  new Exception("Informe o nome completo do usuário ");
            
        }
        if(novo.getCPF().trim().equals(""))
        {
            throw  new Exception("Informe o Login do usuário");
            
        }
        if(novo.getCPF().trim().length()<11)
        {
            throw  new Exception( "Informe um Login válido");
            
        }
        if(novo.getSenha().trim().equals(""))
        {
            throw  new Exception("Informe a senha do usuário");
            
        }
        if(novo.getSenha().trim().length()<4)
        {
            throw  new Exception("A senha deve ter no minimo 4 caracteres ");
            
        }  
        
        if(novo.getSalario() == 0)
        {
            
            throw  new Exception("Valor do salario não pode ser zero");
            
        }
        
        if(novo.getSalario() < 998)
        {
            throw  new Exception("Valor menor que o salario minimo");
            
        }
        
        if(novo.getSalario() > 20000)
        {
            throw  new Exception("Salario maior que o permitido");
            
        }
        
        
        
        
        boolean retorno = true;
            //(Verificar CPF) retorno = crud.verificarLoginDisponivel(novo.getLogin()); 
            if(retorno == true)
            {
                throw   new Exception("Já existe um usuário com esse Login");
            }
            model.cadastrarUsuario(novo);//criar função cadastrarFuncionario
        
    }
    
}
    
}
