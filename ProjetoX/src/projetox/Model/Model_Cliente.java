/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetox.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
            String selectId = "select Codigo from Pessoa";
            ResultSet resultado = conexao.executeQuery(selectId);
            int id=0;
            while (resultado.next()){ id = Integer.parseInt(resultado.getString("Codigo"));  }      
            
            String InsertCliente = "insert into Cliente "
                    + "(CodigoPessoa,Idade,Logradouro,N_Casa,CEP,Bairro,Cidade,Estado,Telefone)"
                    + "values "
                    + "("+id+","+novo.getIdade()+",'"+novo.getLogradouro()+"',"+novo.getN_casa()+",'"+novo.getCep()+"','"+novo.getBairro()+"','"+novo.getCidade()+"','"+novo.getEstado()+"','"+novo.getTelefone()+"')";
            conexao.execute(InsertCliente);
            return  "Cliente Cadastrado com Sucesso!";
        } catch (Exception e) {
            return  ""+e;
            
        }
    }
    
         
      
      
     public ArrayList<Cliente> buscar_Cliente(String nome) throws Exception
    {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try
        {
        Statement conexao = banco.Abrir();
        String selectJoin3 = "select Codigo, Nome,CPF, Idade,Logradouro,N_Casa,CEP,Bairro,Cidade,Estado,Telefone from Pessoa inner join Cliente on Pessoa.Codigo = Cliente.CodigoPessoa and Pessoa.Nome like '"+nome+"%'";
        String select = "select Codigo,Nome from Pessoa where nome like '" + nome + "%'";
        ResultSet resposta = conexao.executeQuery(selectJoin3);
        
        while (resposta.next())
        {            
            Cliente cliente = new Cliente();
            cliente.setId(resposta.getInt("Pessoa.Codigo"));
            cliente.setNome(resposta.getString("Pessoa.Nome"));
            cliente.setCPF(resposta.getString("Pessoa.CPF"));
            //Dados de Cliente - 
            cliente.setIdade(resposta.getInt("Cliente.Idade"));
            cliente.setLogradouro(resposta.getString("Cliente.Logradouro"));
            cliente.setN_casa(resposta.getInt("Cliente.N_Casa"));
            cliente.setCep(resposta.getString("Cliente.CEP"));
            cliente.setBairro(resposta.getString("Cliente.Bairro"));
            cliente.setCidade(resposta.getString("Cliente.Cidade"));
            cliente.setEstado(resposta.getString("Cliente.Estado"));
            cliente.setTelefone(resposta.getString("Cliente.Telefone"));
            clientes.add(cliente);
        }
        }
        catch(SQLException e)
        {
            throw  new Exception("ERRO Select :"+e);
        }
        banco.Fechar();
        return clientes;
    }
     
     
     
     public String remover_Cliente(int id)throws Exception
    {
        try {
            Statement conexao = banco.Abrir();
            String deleteCliente = "delete from Cliente where CodigoPessoa = "+id+"";
            conexao.execute(deleteCliente);
            String deletePessoa = "delete from Pessoa where Codigo = "+id+"";
            conexao.execute(deletePessoa);
            
        } catch (SQLException e)
        {
            throw  new Exception("Erro delete:"+e);
        }
        banco.Fechar();
        return "Cliente Removido com Sucesso!";
    }
     
     
     
     
    public String atualizar_Cliente(Cliente novo,int id)throws Exception
    {
        try {
            Statement conexao = banco.Abrir();

            String updateCliente = "update  Cliente set Idade = "+novo.getIdade()+",Logradouro = '"+novo.getLogradouro()+"',N_Casa = "+novo.getN_casa()+",CEP = '"+novo.getCep()+"',Bairro = '"+novo.getBairro()+"',Cidade = '"+novo.getCidade()+"',Estado = '"+novo.getEstado()+"',Telefone = '"+novo.getTelefone()+"' where CodigoPessoa = "+id+"";
            conexao.executeUpdate(updateCliente);
            String updatePessoa = "update Pessoa set Nome = '"+novo.getNome()+"',CPF = '"+novo.getCPF()+"' where Codigo = "+id+"";
            conexao.executeUpdate(updatePessoa);
            
        } catch (SQLException e) {
           throw  new Exception("Erro update: "+e);
        }
        banco.Fechar();
        return "Cliente Atualizado com Sucesso!";
    }
    
    
    //Alterar Depois
    public boolean veirificarRemocao(int id)throws Exception
    {
        String cargo = "";
        if(cargo.equals("Gerente"))
        {
            int index =0;
           
        try {
            Statement conexao = banco.Abrir();
            String select = "select Cargo from Cliente where Cargo like '" + cargo + "%'";
            ResultSet re = conexao.executeQuery(select);
            while (re.next()) 
            {                
                index = index+1;
            }
            if(index <=1)
            {
                return true;
            }
        } catch (Exception e) 
        {
            throw  new Exception("Erro select  "+e);
        }
        banco.Fechar();
        }
        return false;
    }
    
    
    //Alterar Depois
    public boolean veirificarAtualizacao()throws Exception
    {
            int numero =0;        
        try {
            Statement conexao = banco.Abrir();
            String select = "select Cargo from Funcioario where Cargo like '" +"Gerente"+ "%'";
            ResultSet re = conexao.executeQuery(select);
            while (re.next()) 
            {                
                numero = numero+1;
            }
            if(numero <=1)
            {
                return true;
            }
        } catch (Exception e) 
        {
            throw  new Exception("Erro select  "+e);
        }
        banco.Fechar();
        
        return false;

        }
    

}