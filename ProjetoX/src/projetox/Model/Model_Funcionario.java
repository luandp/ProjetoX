/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
                    + "(CodigoPessoa,Senha,Cargo,Salario)"
                    + "values "
                    + "("+id+",'"+novo.getSenha()+"','"+novo.getCargo()+"',"+novo.getSalario()+" )";
            conexao.execute(InsertFuncionario);
           
            return  "Funcionario Cadastrado com Sucesso!";
        } catch (Exception e) {
            return  ""+e;
            
        }
    }
    
         
      /*
      
     public ArrayList<Funcionario> buscar_Funcionario(String nome) throws Exception
    {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        try
        {
        Statement conexao = banco.Abrir();
        String select = "select Nome,login,codigo,tipo from usuario where nome like '" + nome + "%'";
        ResultSet re = conexao.executeQuery(select);
        while (re.next())
        {            
            Funcionario funcionario = new Funcionario();
            funcionario.setNome(re.getString("Nome"));
            funcionario.setLogin(re.getString("login"));
            funcionario.setTipo(re.getString("tipo"));
            funcionario.setCodigo(Integer.parseInt(re.getString("codigo")));
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
     */
     
     
     public void remover_Funcionario(int codigo)throws Exception
    {
        try {
            
            Statement conexao = banco.Abrir();
            String delete = "delete from usuario where codigo = "+codigo+"";
            conexao.execute(delete);
        } catch (SQLException e)
        {
            throw  new Exception("Erro delete:"+e);
        }
        banco.Fechar();
       
    }
     
     
     /*
     
    public void atualizar_Funcionario(Funcionario novo,int codigo)throws Exception
    {
        try {
            Statement conexao = banco.Abrir();
            String update = "update  usuario set nome = '"+novo.getNome()+"',login = '"+novo.getLogin()+"',senha = '"+novo.getSenha()+"',tipo = '"+novo.getTipo()+"' where codigo = "+codigo+"";
            conexao.executeUpdate(update);
        } catch (SQLException e) {
            throw  new Exception("Erro update: "+e);
        }
        banco.Fechar();
    }
    
    */
    
    public boolean veirificarRemocao(String tipo)throws Exception
    {
        if(tipo.equals("Administrador"))
        {
            int numero =0;
           
        try {
            Statement conexao = banco.Abrir();
            String select = "select tipo from usuario where tipo like '" + tipo + "%'";
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
        }
        return false;
    }
    
    
    
    public boolean veirificarAtualizacao()throws Exception
    {
            int numero =0;        
        try {
            Statement conexao = banco.Abrir();
            String select = "select tipo from usuario where tipo like '" +"Administrador"+ "%'";
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
    
   /*
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
             funcionarioo.setLogin(resultado.getString("login"));
             funcionarioo.setSenha(resultado.getString("senha"));
             funcionarioo.setTipo(resultado.getString("tipo"));
             funcionarioo.setCodigo(Integer.parseInt(resultado.getString("codigo")));
             funcionarios.add(funcionarioo);
         }
         for(int i =0;i<funcionarios.size();i++)
         {
             if(funcionarios.get(i).getLogin().equals(test.getLogin())&& clientes.get(i).getSenha().equals(test.getSenha()))
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
     u.setTipo("errado");
     return u;
     }
   */
   
   /*
   public boolean verificarLoginDisponivel(String login) throws Exception
    {
     ArrayList<Funcionario> funcionarios = new ArrayList<>();
     try 
     {
      Statement coon = banco.Abrir();   
      String busca ="select login from usuario where login = '"+login+"'";
      ResultSet resultado = coon.executeQuery(busca);
      int conta = 0;
         while (resultado.next())
         {
             Funcionario funcionario = new Funcionario();
             funcionario.setLogin(resultado.getString("login"));
             funcionario.add(funcionario);
             
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
   
   */
   
 
    
    
    
}
