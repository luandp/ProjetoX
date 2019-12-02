/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.Class;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Luan Paulo
 */
public class Conexao {
        //Variavel que vai ficar com o sstatus de conexao do banco
        private Connection conexao;
        
        
        //Funcao que tenta abrir conexao com o Banco, pega erros e rapassa para a camada superior
        public Statement Abrir() throws Exception{
            try {
                String nomedoarquivo = "db1";
                String tipodoarquivo = ".accdb";
                String tipodeconexao = "jdbc:ucanaccess://";
                conexao = DriverManager.getConnection( tipodeconexao + nomedoarquivo + tipodoarquivo );
                return conexao.createStatement();
            } catch (SQLException e) {
                throw new Exception("Erro ao abrir a Conexao com o banco de dados: " + e.getMessage());
            }
        }
        public void Fechar() throws Exception{
            try {
                conexao.close();
            } catch (SQLException e) {
            throw new Exception("Erro ao fechar a Conexao com o banco de dados: " + e.getMessage());
            }
        }
}
