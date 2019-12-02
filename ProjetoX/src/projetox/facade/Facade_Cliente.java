/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.facade;

import java.util.ArrayList;
import projetox.Class.Cliente;
import projetox.Class.Funcionario;
import projetox.controller.Controller_Cliente;

/**
 *
 * @author Luan Paulo
 */
public class Facade_Cliente {
    
    Controller_Cliente control = new Controller_Cliente();
    
    public String Cadastrar_Cliente(String nome, String cpf, String idade, String logradouro, String n_casa, String cep, String bairro, String cidade, String estado, String telefone) throws Exception{
      return control.Validar_Cadastro(nome, cpf, idade, logradouro, n_casa, cep, bairro, cidade, estado, telefone);
    }
    
    public ArrayList Listar_Cliente(){
        
        ArrayList<String> Clientes  = new ArrayList<>();
        return Clientes;
    }
        public ArrayList Listar_Clientes(String nome) throws Exception{
        ArrayList<Cliente> Clientes  = new ArrayList<>();
        return control.ValidarBusca(nome);
    }
    public String Excluir_Cliente(int id) throws Exception{
        
        return control.verificarRemocao(id);
    }
    
    public String Atualizar_Cliente(){
    
        return "";
    }
    public String validar_Atualizacao(Cliente novo,int id)throws Exception{
        
        return control.validarAtualizacao(novo, id);
    }
}
