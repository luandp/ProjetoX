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
import projetox.interfaces.Interface_Venda;

/**
 *
 * @author Luan Paulo
 */
public class Model_Venda implements Interface_Venda{
         Conexao banco = new Conexao();
    
    public int Cadastrar_Venda(Venda novo){
        
        try {
            //Cadastrar Operacao
            //Receber o Id
            //Cadastrar Venda
            //Cadastrar Venda_Carro
            
            
            Statement conexao = banco.Abrir();
            String InsertVenda = "insert into Venda (Funcionario,Cliente,PrecoTotal,Parcelas,DataCompra)values"
                                  + "("+novo.getFuncionario()+","+novo.getCliente()+","+novo.getPreco()+"PrecoTotal,"
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
           
            return  id;
        } catch (Exception e) {
            return  0;
            
        }
    }
    
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
     
     
    @Override
    public String Cadastrar_Venda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Venda> buscar_Venda() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String remover_Venda() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar_Venda() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
