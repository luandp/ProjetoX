/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.Model;

import java.sql.Statement;
import projetox.Class.Cliente;
import projetox.Class.Conexao;

/**
 *
 * @author Luan Paulo
 */
public class Model_Cliente {
        Conexao banco = new Conexao();
    
    public String Cadastrar_Cliente(Cliente novo){
        
        try {
            Statement conexao = banco.Abrir();
            String InsertPessoa = "insert into Pessoa (Nome,CPF)values ('"+novo.getNome()+"','"+novo.getCPF()+"')";
            conexao.execute(InsertPessoa);
            
            String codigo = "SELECT Max('Codigo') from 'Pessoa'";
            int id = Integer.parseInt(codigo);
            //select * from protocolo where codigo = (SELECT MAX(CODIGO) FROM PROTOCOLO)
            String InsertCliente = "insert into Cliente "
                    + "(CodigoPessoa,Idade,Logradouro,N_Casa,CEP,Bairro,Cidade,Estado,Telefone)"
                    + "values "
                    + "("+id+","+novo.getIdade()+",'"+novo.getLogradouro()+"',"+novo.getN_casa()+",'"+novo.getCep()+"','"+novo.getBairro()+"','"+novo.getCidade()+"','"+novo.getEstado()+"','"+novo.getTelefone()+"')";
            conexao.execute(InsertCliente);
            
            String retorno =  "Cliente Cadastrado com Sucesso!";
        return retorno;
        } catch (Exception e) {
            String retorno = ""+e;
            return retorno;
        }
    }
    
    
    
    
    
    
    
}
