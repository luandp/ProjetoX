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
import java.util.Date;
import projetox.Class.Carro;
import projetox.Class.Cliente;
import projetox.Class.Conexao;
import projetox.Class.Funcionario;
import projetox.Class.Venda;

/**
 *
 * @author Luan Paulo
 */
public class Model_Venda {
         Conexao banco = new Conexao();
    
    public String Cadastrar_Venda(Funcionario funcionario,Cliente cliente,ArrayList<Carro> carros, Venda novo){
        
        try {
            //Cadastrar Operacao
            //Receber o Id
            //Cadastrar Venda
            //Cadastrar Venda_Carro
            
            
            Statement conexao = banco.Abrir();
            String InsertVenda = "insert into Venda (Funcionario,Cliente,PrecoTotal,Parcelas,DataCompra)values"
                                  + "("+funcionario.getId()+","+cliente.getId()+","+novo.getPreco()+"PrecoTotal,"
                                  + " "+novo.getParcelas()+",'"+novo.getData()+"')";
            conexao.execute(InsertVenda);
            String selectId = "select Codigo from Pessoa";
            ResultSet resultado = conexao.executeQuery(selectId);
            int id=0;
            while (resultado.next()){ id = Integer.parseInt(resultado.getString("Codigo"));  }      
            
            String InsertVendaCarro = "insert into Venda_Carro "
                    + "(Venda,Carro)"
                    + "values "
                    + "("+id+","+id+")";
            conexao.execute(InsertVendaCarro);
           
            return  "Venda registrada com Sucesso!";
        } catch (Exception e) {
            return  ""+e;
            
        }
    }
    
         
      
      /*
     public ArrayList<Venda> buscar_Venda(Date data) throws Exception
    {
        ArrayList<Venda> vendas = new ArrayList<>();
        try
        {
        Statement conexao = banco.Abrir();
        String selectJoin2 = "select P.Codigo, P.Nome F.Login, F.Cargo from Pessoa as P join Venda as F on P.Codigo = F.CodigoPessoa and P.Nome like '"+nome+"%'";
        String selectJoin3 = "select Codigo, Nome,CPF, Login,Senha,Cargo,Salario from Pessoa inner join Venda on Pessoa.Codigo = Venda.CodigoPessoa and Pessoa.Nome like '"+nome+"%'";
     
        String select = "select Codigo,Nome from Pessoa where nome like '" + nome + "%'";
        ResultSet resposta = conexao.executeQuery(selectJoin3);
        
        while (resposta.next())
        {            
            Venda venda = new Venda();
            venda.setId(resposta.getInt("Pessoa.Codigo"));
            venda.setNome(resposta.getString("Pessoa.Nome"));
            venda.setCPF(resposta.getString("Pessoa.CPF"));
            //String select2= "select Login,Cargo from Venda where CodigoPessoa = "+venda.getId()+" limit 1";
            venda.setLogin(resposta.getString("Venda.Login"));
            venda.setSenha(resposta.getString("Venda.Senha"));
            Component rootPane = null;
            //JOptionPane.showMessageDialog(rootPane, "senha:"+venda.getSenha());
            venda.setCargo(resposta.getString("Venda.Cargo"));
            venda.setSalario(resposta.getDouble("Venda.Salario"));
            
         
            vendas.add(venda);
        }
        }
        catch(SQLException e)
        {
            throw  new Exception("ERROOOOO Select "+e);
        }
        banco.Fechar();
        return vendas;
    }
     
     */
     
     public String remover_Venda(int id)throws Exception
    {
        try {
            Statement conexao = banco.Abrir();
            String deleteFuncioario = "delete from Venda where CodigoPessoa = "+id+"";
            conexao.execute(deleteFuncioario);
            String deletePessoa = "delete from Pessoa where Codigo = "+id+"";
            conexao.execute(deletePessoa);
            
        } catch (SQLException e)
        {
            throw  new Exception("Erro delete:"+e);
        }
        banco.Fechar();
        return "Venda Removido com Sucesso!";
    }
     
     
     /*
     
    public void atualizar_Venda(Venda novo,int id)throws Exception
    {
        try {
            Statement conexao = banco.Abrir();

            String updateVenda = "update  Venda set Login = '"+novo.getLogin()+"',Senha = '"+novo.getSenha()+"',Cargo = '"+novo.getCargo()+"',Salario = "+novo.getSalario()+" where CodigoPessoa = "+id+"";
            conexao.executeUpdate(updateVenda);
            String updatePessoa = "update Pessoa set Nome = '"+novo.getNome()+"',CPF = '"+novo.getCPF()+"' where Codigo = "+id+"";
            conexao.executeUpdate(updatePessoa);

        } catch (SQLException e) {
            throw  new Exception("Erro update: "+e);
        }
        banco.Fechar();
    }
    
    */
    /*
    public boolean veirificarRemocao(String cargo)throws Exception
    {
        if(cargo.equals("Gerente"))
        {
            int index =0;
           
        try {
            Statement conexao = banco.Abrir();
            String select = "select Cargo from Venda where Cargo like '" + cargo + "%'";
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
    */
    
    /*
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
    */
   /*
    //metodo chamado por validarLogin||TelaLogin
   public Venda VerificarLogin(String login,String senha) throws Exception
    {
     ArrayList<Venda> vendas = new ArrayList<>();
     try 
     {
      Statement conexao = banco.Abrir();   
      String busca ="select Login,Senha,Cargo,CodigoPessoa from Venda ";
      ResultSet resultado = conexao.executeQuery(busca);
      
         while(resultado.next()){
            
             Venda vendao = new Venda();
             vendao.setLogin(resultado.getString("Login"));
             vendao.setSenha(resultado.getString("Senha"));
             vendao.setCargo(resultado.getString("Cargo"));
             vendao.setId(resultado.getInt("CodigoPessoa"));
             vendas.add(vendao);
             
             
         }
         for(int i =0;i<vendas.size();i++)
         {
             if(vendas.get(i).getLogin().equals(login)&& vendas.get(i).getSenha().equals(senha))
             {
               String buscaComplementar = "select Nome,CPF from Pessoa where Codigo = "+vendas.get(i).getId()+"";
               ResultSet resultado2 = conexao.executeQuery(buscaComplementar);
               while(resultado2.next()){
               vendas.get(i).setNome(resultado2.getString("Nome"));
               vendas.get(i).setCPF(resultado2.getString("CPF"));    
               }
               return vendas.get(i);
             }
         }
         
     } catch (Exception e) 
     {
         throw  new Exception("Oi"+e);
     }
     banco.Fechar();
     Venda invalido = new Venda();
     invalido.setCargo("errado");
     return invalido;
     }
   
   */
   /*
   public boolean verificarLoginDisponivel(String login) throws Exception
    {
     ArrayList<Venda> vendas = new ArrayList<>();
     try 
     {
      Statement coon = banco.Abrir();   
      String busca ="select Login from Venda where Login = '"+login+"'";
      ResultSet resultado = coon.executeQuery(busca);
      int conta = 0;
         while (resultado.next())
         {
             Venda venda = new Venda();
             venda.setLogin(resultado.getString("Login"));
             vendas.add(venda);
             
         }
         for(int i =0;i<vendas.size();i++)
         {
         if(vendas.get(i).getLogin().equals(login))
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
