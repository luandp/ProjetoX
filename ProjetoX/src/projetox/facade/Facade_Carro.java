/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.facade;

import java.util.ArrayList;
import projetox.Class.Carro;
import projetox.controller.Controller_Carro;

/**
 *
 * @author Luan Paulo
 */
public class Facade_Carro {
    
    Controller_Carro control = new Controller_Carro();

    public String Cadastrar_Carro(String placa, String marca, String modelo, String cor,String ano,String portas,String arcondicionado, String direcao,String veletrico,String alarme, String classe,String tipo, String combustivel,String cambioauto,String multimidia, String status) throws Exception{
        return control.Validar_Cadastro(placa,marca,modelo,cor,ano,portas,arcondicionado,direcao,veletrico,alarme,classe,tipo,combustivel,cambioauto,multimidia,status);
    }
    
    public ArrayList Listar_Carro(){
        
        ArrayList<String> Carros  = new ArrayList<>();
        return Carros;
    }
    
    public String Excluir_Carro(){
        
       
        return "";
    }
    
    public String Atualizar_Carro(){
    
        control.Validar_Atualizar();
        return "";
    }
    public ArrayList Listar_Carros(String nome) throws Exception{
        ArrayList<Carro> carros  = new ArrayList<>();
        return control.ValidarBusca(nome);
    }
    public String Excluir_Carro(int id) throws Exception{
        
        return control.verificarRemocao(id);
    }
    public String validar_Atualizacao(int id, String placa, String marca, String modelo, String cor,String ano,String portas,String arcondicionado, String direcao,String veletrico,String alarme, String classe,String tipo, String combustivel,String cambioauto,String multimidia, String status)throws Exception{
        return control.validarAtualizacao(id,placa,marca,modelo,cor,ano,portas,arcondicionado,direcao,veletrico,alarme,classe,tipo,combustivel,cambioauto,multimidia,status);
    }
}
