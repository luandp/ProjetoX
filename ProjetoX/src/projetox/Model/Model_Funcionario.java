/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.Model;

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
            String codigo = "SELECT MAX(Codigo) FROM Pessoa";
            //String cod = conexao.execute(codigo);
            //int id = Integer.parseInt(codigo);
            int id = 10;
            //select * from protocolo where codigo = (SELECT MAX(CODIGO) FROM PROTOCOLO)
            String InsertFuncionario = "insert into Funcionario "
                    + "values "
                    + "("+id+","+novo.getSenha()+",'"+novo.getCargo()+"',"+novo.getSalario()+"')";
            conexao.execute(InsertFuncionario);
            
            String retorno =  "Funcionario Cadastrado com Sucesso!";
        return retorno;
        } catch (Exception e) {
            String retorno = ""+e;
            return retorno;
        }
    }
    
}
