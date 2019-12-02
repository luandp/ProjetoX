/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.controller;

import java.util.ArrayList;
import projetox.Class.Cliente;
import projetox.Class.Cliente;
import projetox.Model.Model_Cliente;
import projetox.Model.Model_Cliente;

/**
 *
 * @author Luan Paulo
 */
public class Controller_Cliente {
   
    Model_Cliente model = new Model_Cliente();
    
    public String Validar_Cadastro(String nome, String cpf, String idade,String logradouro,String n_casa,String cep,String bairro,String cidade,String estado,String telefone){
        
            //fazer validacoes aqui
            //Transformar Variaveis
            //int idade;
            int idadeConvertido = Integer.parseInt(idade);
            //String logradouro;
            //int n_casa;
            int n_casaConvertido = Integer.parseInt(n_casa);
            //String cep;
            //String bairro;
            //String cidade;
            //String estado;
            //String telefone;
        
        Cliente novo = new Cliente(idadeConvertido, nome, cpf, idadeConvertido, logradouro, n_casaConvertido, cep, bairro, cidade, estado, telefone);
        return model.Cadastrar_Cliente(novo);
    }
    
    public String Validar_Atualizar(){
        
        return "";
    }
    
    public ArrayList<Cliente> ValidarBusca(String nome)throws Exception
    {
        ArrayList<Cliente> clientes = new ArrayList();
        clientes = model.buscar_Cliente(nome);
        return clientes;
    }
    public String verificarRemocao(int id)throws Exception
    {
        if(id==0)
        {
            throw  new Exception("Informe um usuário para ser excluido");
        }
        boolean retorno;
        //retorno = model.veirificarRemocao(id);
        retorno = false;
        if(retorno == true)
        {
            throw  new Exception("Você é o último usuário Administrador, por isso não pode ser removido");
        }
        model.remover_Cliente(id);
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
     
    
        public String validarAtualizacao(Cliente novo,int id)throws Exception
    {
        if(novo.getNome().trim().equals(""))
        {
            throw  new Exception("Informe o nome do funcionario");
            
        }
        if(novo.getNome().trim().length()<10)
        {
            throw  new Exception("Informe o nome completo do funcionario ");
            
        }
        /*
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
        }*/
            return model.atualizar_Cliente(novo,id);
            
    }
    public ArrayList<Cliente> validarConsultaDeNome(String nome) throws Exception
    {
        ArrayList<Cliente> arryclientes = new ArrayList<>();
        arryclientes = model.buscar_Cliente(nome);
        return arryclientes;
    }
   
}