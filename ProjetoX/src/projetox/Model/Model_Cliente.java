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
   /*     Conexao banco = new Conexao();
    
    public String Cadastrar_Cliente(Cliente novo){
        
        try {
            Statement conexao = banco.Abrir();
            String InsertPessoa = "insert into Pessoa (Nome,CPF)values ('"+novo.getNome()+"','"+novo.getCPF()+"')";
            conexao.execute(InsertPessoa);
            String codigo = "SELECT MAX(Codigo) FROM Pessoa";
            //String cod = conexao.execute(codigo);
            //int id = Integer.parseInt(codigo);
            int id = 10;
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

    */
    Conexao banco = new Conexao();

      public String Cadastrar_Cliente (Cliente novo)throws Exception
    {
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
             
             return "Cliente Cadastrado com Sucesso!";
            
        } catch (SQLException e) {
            
            throw  new Exception("Errooo Insert"+e);
        }
        
    }
      /*
      
      
     public ArrayList<Cliente> buscar_Cliente(String nome) throws Exception
    {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try
        {
        Statement con = banco.Abrir();
        String select = "select Nome,login,codigo,tipo from usuario where nome like '" + nome + "%'";
        ResultSet re = con.executeQuery(select);
        while (re.next())
        {            
            Cliente cliente = new cliente();
            cliente.setNome(re.getString("Nome"));
            cliente.setLogin(re.getString("login"));
            cliente.setTipo(re.getString("tipo"));
            cliente.setCodigo(Integer.parseInt(re.getString("codigo")));
            clientes.add(cliente);
        
        }
        }
        catch(SQLException e)
        {
            throw  new Exception("ERROOOOO Select "+e);
        }
        banco.Fechar();
        return clientes;
    }
     
     
     
     public void remover_Cliente(int codigo)throws Exception
    {
        try {
            
            Statement con = banco.Abrir();
            String delet = "delete from usuario where codigo = "+codigo+"";
            con.execute(delet);
        } catch (SQLException e)
        {
            throw  new Exception("Erro delete"+e);
        }
        banco.Fechar();
       
    }
     
     
     
     
    public void atualizar_Cliente(Cliente novo,int codigo)throws Exception
    {
        try {
            Statement con = banco.Abrir();
            String update = "update  usuario set nome = '"+novo.getNome()+"',login = '"+novo.getLogin()+"',senha = '"+novo.getSenha()+"',tipo = '"+novo.getTipo()+"' where codigo = "+codigo+"";
            con.executeUpdate(update);
        } catch (SQLException e) {
            throw  new Exception("Erro update"+e);
        }
        banco.Fechar();
    }
    
    
    
    public boolean veirificarRemocao(String tipo)throws Exception
    {
        if(tipo.equals("Administrador"))
        {
            int numero =0;
           
        try {
            Statement co = banco.Abrir();
            String select = "select tipo from usuario where tipo like '" + tipo + "%'";
            ResultSet re = co.executeQuery(select);
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
        }
        return false;
    }
    
    
    
    public boolean veirificarAtualizacao()throws Exception
    {
            int numero =0;        
        try {
            Statement co = banco.Abrir();
            String select = "select tipo from usuario where tipo like '" +"Administrador"+ "%'";
            ResultSet re = co.executeQuery(select);
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
    
    */
    /*
    //metodo chamado por validarLogin||TelaLogin
   public Cliente VerificarLogin(Cliente test) throws Exception
    {
     ArrayList<Cliente> clientes = new ArrayList<>();
     try 
     {
      Statement coon = banco.Abrir();   
      String busca ="select login,senha,tipo,codigo from usuario ";
      ResultSet resultado = coon.executeQuery(busca);
         while (resultado.next())

         {
             
             Cliente clientee = new Cliente();
             clientee.setLogin(resultado.getString("login"));
             clientee.setSenha(resultado.getString("senha"));
             clientee.setTipo(resultado.getString("tipo"));
             clientee.setCodigo(Integer.parseInt(resultado.getString("codigo")));
             clientes.add(clientee);
         }
         for(int i =0;i<clientes.size();i++)
         {
             if(clientes.get(i).getLogin().equals(test.getLogin())&& clientes.get(i).getSenha().equals(test.getSenha()))
             {
               return clientes.get(i);
             }
         }
         
     } catch (Exception e) 
     {
         throw  new Exception(e);
     }
     banco.Fechar();
     Cliente u = new Cliente();
     u.setTipo("errado");
     return u;
     }
   */
   
   /*
   public boolean verificarLoginDisponivel(String login) throws Exception
    {
     ArrayList<Cliente> clientes = new ArrayList<>();
     try 
     {
      Statement coon = banco.Abrir();   
      String busca ="select login from usuario where login = '"+login+"'";
      ResultSet resultado = coon.executeQuery(busca);
      int conta = 0;
         while (resultado.next())
         {
             Cliente cleintee = new Cliente();
             cleintee.setLogin(resultado.getString("login"));
             clientes.add(cleintee);
             
         }
         for(int i =0;i<clientes.size();i++)
         {
         if(clientes.get(i).getLogin().equals(login))
         {
               conta = conta+1;
         }
         }
         if(conta >=1)
         {
             return  true;
         }
         
     } catch (Exception e) 
     {
         throw  new Exception(e);
     }
     banco.Fechar();
     return false;
     }
   
   
   
 */
    
    
}
