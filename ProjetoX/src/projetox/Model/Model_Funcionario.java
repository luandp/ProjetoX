/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.Model;

import java.awt.Component;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import projetox.Class.Funcionario;
import projetox.Class.Conexao;

/**
 *
 * @author Luan Paulo
 */
public class Model_Funcionario {
         Conexao banco = new Conexao();
    
    public String Cadastrar_Funcionario(Funcionario novo){
        
        try {
            Statement conexao = banco.Abrir();
            String InsertPessoa = "insert into Pessoa (Nome,CPF)values ('"+novo.getNome()+"','"+novo.getCPF()+"')";
            conexao.execute(InsertPessoa);
            String selectId = "select Codigo from Pessoa";
            ResultSet resultado = conexao.executeQuery(selectId);
            int id=0;
            while (resultado.next()){ id = Integer.parseInt(resultado.getString("Codigo"));  }      
            
            String InsertFuncionario = "insert into Funcionario "
                    + "(CodigoPessoa,Login,Senha,Cargo,Salario)"
                    + "values "
                    + "("+id+",'"+novo.getLogin()+"','"+novo.getSenha()+"','"+novo.getCargo()+"',"+novo.getSalario()+" )";
            conexao.execute(InsertFuncionario);
           
            return  "Funcionario Cadastrado com Sucesso!";
        } catch (Exception e) {
            return  ""+e;
            
        }
    }
    
         
      
      
     public ArrayList<Funcionario> buscar_Funcionario(String nome) throws Exception
    {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try
        {
        Statement conexao = banco.Abrir();
       // String selectJoin = "SELECT C.NOME, C.STATUS, P.DESCRICAO, P.VALOR FROM CLIENTES AS C JOIN PEDIDOS AS P ON C.IDCLIENTE = P.IDPEDIDO";
        
        String selectJoin2 = "select P.Codigo, P.Nome F.Login, F.Cargo from Pessoa as P join Funcionario as F on P.Codigo = F.CodigoPessoa and P.Nome like '"+nome+"%'";
        String selectJoin3 = "select Codigo, Nome,CPF, Login,Senha,Cargo,Salario from Pessoa inner join Funcionario on Pessoa.Codigo = Funcionario.CodigoPessoa and Pessoa.Nome like '"+nome+"%'";
        
        /*  SELECT CategoryName, ProductName
            FROM Categories INNER JOIN Products
            ON Categories.CategoryID = Products.CategoryID;*/
        String select = "select Codigo,Nome from Pessoa where nome like '" + nome + "%'";
        ResultSet resposta = conexao.executeQuery(selectJoin3);
        
        while (resposta.next())
        {            
            Funcionario funcionario = new Funcionario();
            funcionario.setId(resposta.getInt("Pessoa.Codigo"));
            funcionario.setNome(resposta.getString("Pessoa.Nome"));
            funcionario.setCPF(resposta.getString("Pessoa.CPF"));
            //String select2= "select Login,Cargo from Funcionario where CodigoPessoa = "+funcionario.getId()+" limit 1";
            funcionario.setLogin(resposta.getString("Funcionario.Login"));
            funcionario.setSenha(resposta.getString("Funcionario.Senha"));
            Component rootPane = null;
            //JOptionPane.showMessageDialog(rootPane, "senha:"+funcionario.getSenha());
            funcionario.setCargo(resposta.getString("Funcionario.Cargo"));
            funcionario.setSalario(resposta.getDouble("Funcionario.Salario"));
            
            /*ResultSet resultado2 = conexao.executeQuery(select2);
            while(resultado2.next()){
            }*/
            funcionarios.add(funcionario);
        }
        }
        catch(SQLException e)
        {
            throw  new Exception("ERROOOOO Select "+e);
        }
        banco.Fechar();
        return funcionarios;
    }
     
     
     
     public String remover_Funcionario(int id)throws Exception
    {
        try {
            Statement conexao = banco.Abrir();
            String deleteFuncioario = "delete from Funcionario where CodigoPessoa = "+id+"";
            conexao.execute(deleteFuncioario);
            String deletePessoa = "delete from Pessoa where Codigo = "+id+"";
            conexao.execute(deletePessoa);
            
        } catch (SQLException e)
        {
            throw  new Exception("Erro delete:"+e);
        }
        banco.Fechar();
        return "Funcionario Removido com Sucesso!";
    }
     
     
     
     
    public void atualizar_Funcionario(Funcionario novo,int id)throws Exception
    {
        try {
            Statement conexao = banco.Abrir();

            String updateFuncionario = "update  Funcionario set Login = '"+novo.getLogin()+"',Senha = '"+novo.getSenha()+"',Cargo = '"+novo.getCargo()+"',Salario = "+novo.getSalario()+" where CodigoPessoa = "+id+"";
            conexao.executeUpdate(updateFuncionario);
            String updatePessoa = "update Pessoa set Nome = '"+novo.getNome()+"',CPF = '"+novo.getCPF()+"' where Codigo = "+id+"";
            conexao.executeUpdate(updatePessoa);

        } catch (SQLException e) {
            throw  new Exception("Erro update: "+e);
        }
        banco.Fechar();
    }
    
    
    
    public boolean veirificarRemocao(String cargo)throws Exception
    {
        if(cargo.equals("Gerente"))
        {
            int index =0;
           
        try {
            Statement conexao = banco.Abrir();
            String select = "select Cargo from Funcionario where Cargo like '" + cargo + "%'";
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
    
   
    //metodo chamado por validarLogin||TelaLogin
   public Funcionario VerificarLogin(Funcionario test) throws Exception
    {
     ArrayList<Funcionario> funcionarios = new ArrayList<>();
     try 
     {
      Statement coon = banco.Abrir();   
      String busca ="select login,senha,tipo,codigo from usuario ";
      ResultSet resultado = coon.executeQuery(busca);
         while (resultado.next())

         {
             
             Funcionario funcionarioo = new Funcionario();
             funcionarioo.setLogin(resultado.getString("Login"));
             funcionarioo.setSenha(resultado.getString("Senha"));
             funcionarioo.setCargo(resultado.getString("Cargo"));
             funcionarioo.setId(Integer.parseInt(resultado.getString("Codigo")));
             funcionarios.add(funcionarioo);
         }
         for(int i =0;i<funcionarios.size();i++)
         {
             if(funcionarios.get(i).getLogin().equals(test.getLogin())&& funcionarios.get(i).getSenha().equals(test.getSenha()))
             {
               return funcionarios.get(i);
             }
         }
         
     } catch (Exception e) 
     {
         throw  new Exception(e);
     }
     banco.Fechar();
     Funcionario u = new Funcionario();
     u.setCargo("errado");
     return u;
     }
   
   
   
   public boolean verificarLoginDisponivel(String login) throws Exception
    {
     ArrayList<Funcionario> funcionarios = new ArrayList<>();
     try 
     {
      Statement coon = banco.Abrir();   
      String busca ="select Login from Funcionario where Login = '"+login+"'";
      ResultSet resultado = coon.executeQuery(busca);
      int conta = 0;
         while (resultado.next())
         {
             Funcionario funcionario = new Funcionario();
             funcionario.setLogin(resultado.getString("Login"));
             funcionarios.add(funcionario);
             
         }
         for(int i =0;i<funcionarios.size();i++)
         {
         if(funcionarios.get(i).getLogin().equals(login))
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
   
   
}
