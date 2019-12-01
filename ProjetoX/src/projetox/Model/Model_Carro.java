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
import projetox.Class.Carro;
import projetox.Class.Carro;
import projetox.Class.Conexao;
import projetox.Class.Carro;

/**
 *
 * @author Luan Paulo
 */
public class Model_Carro {
         Conexao banco = new Conexao();
    
    public String Cadastrar_Carro(Carro novo){
        
        try {
            Statement conexao = banco.Abrir();
            String InsertCarro = "insert into Carro (Placa,Marca,Modelo,Cor,Ano,Portas,Arcondicionado,Direcao,Vidroeletrico,Alarme,Cambio,Combustivel,Multimidia,Tipo,Status)values "
                    + "','"+novo.getPlaca()
                    + "','"+novo.getMarca()
                    + "','"+novo.getModelo()
                    + "','"+novo.getCor()
                    + "','"+novo.getAno()
                    + "','"+novo.getPortas()
                    + "','"+novo.isArcondicionado()
                    + "','"+novo.getDirecao()
                    + "','"+novo.isVeletrico()
                    + "','"+novo.isAlarme()
                    + "','"+novo.isCambioauto()
                    + "','"+novo.getCombustivel()
                    + "','"+novo.isMultimidia()
                    + "','"+novo.isStatus()
                    + "','"+novo.getTipo()+"')";
            conexao.execute(InsertCarro);      
            return  "Carro Cadastrado com Sucesso!";
        } catch (Exception e) {
            return  ""+e;
        }
    }
    
     public ArrayList<Carro> buscar_Carro(String modelo) throws Exception
    {
        ArrayList<Carro> carros = new ArrayList<>();
        try
        {
        Statement conexao = banco.Abrir();
        String select = "select * from Carro where Modelo like '" + modelo + "%'";
        ResultSet resposta = conexao.executeQuery(select);
        
        while (resposta.next())
        {             
            Carro carro = new Carro();
            carro.setId(resposta.getInt("Codigo"));
            carro.setPlaca(resposta.getString("Placa"));
            carro.setMarca(resposta.getString("Marca"));
            carro.setModelo(resposta.getString("Modelo"));
            carro.setCor(resposta.getString("Cor"));
            carro.setAno(resposta.getInt("Ano"));
            carro.setPortas(resposta.getInt("Portas"));
            carro.setArcondicionado(resposta.getBoolean("Arcondicionado"));
            carro.setDirecao(resposta.getString("Direcao"));
            carro.setVeletrico(resposta.getBoolean("Vidroeletrico"));
            carro.setAlarme(resposta.getBoolean("Alarme"));
            carro.setTipo(resposta.getString("Tipo"));
            carro.setCombustivel(resposta.getString("Combustivel"));
            carro.setCambioauto(resposta.getBoolean("Cambio"));
            carro.setMultimidia(resposta.getBoolean("Multimidia"));
            carro.setStatus(resposta.getBoolean("Status"));
          
            /*ResultSet resultado2 = conexao.executeQuery(select2);
            while(resultado2.next()){
            }*/
            carros.add(carro);
        }
        }
        catch(SQLException e)
        {
            throw  new Exception("ERROOOOO Select "+e);
        }
        banco.Fechar();
        return carros;
    }
     
     
     
     public String remover_Carro(String Modelo)throws Exception
    {
        try {
            Statement conexao = banco.Abrir();
            String deleteCarro = "delete from Carro where ModeloCarro = "+Modelo+"";
            conexao.execute(deleteCarro);
            String deletePessoa = "delete from Carro where Modelo = "+Modelo+"";
            conexao.execute(deletePessoa);
            
        } catch (SQLException e)
        {
            throw  new Exception("Erro delete:"+e);
        }
        banco.Fechar();
        return "Carro Removido com Sucesso!";
    }
     
     
     
     
    public void atualizar_Carro(Carro novo,String Modelo)throws Exception
    {
        try {
            Statement conexao = banco.Abrir();

            String updateCarro = "update  Carro set Placa = '"+novo.getPlaca()+"',Marca = '"+novo.getMarca()+"',Modelo = '"+novo.getModelo()+"',Cor = '"+novo.getCor()+"',Ano = '"+novo.getAno()+"',Portas = '"+novo.getPortas()+"',Arcondicionado = '"+novo.isArcondicionado()+"',Direcao = '"+novo.getDirecao()+"',Vidroeletrico = '"+novo.isVeletrico()+"',Alarme = '"+novo.isAlarme()+"',Tipo = '"+novo.getTipo()+"',Combustivel = '"+novo.getCombustivel()+"',Cambio = '"+novo.isCambioauto()+"',Multimidia = '"+novo.isMultimidia()+"',Status = "+novo.isStatus()+" where ModeloCarro = "+Modelo+"";
            conexao.executeUpdate(updateCarro);


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
            String select = "select Cargo from Carro where Cargo like '" + cargo + "%'";
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
   
}
