/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.controller;

import java.util.ArrayList;
import projetox.Class.Carro;
import projetox.Class.Cliente;
import projetox.Model.Model_Carro;

/**
 *
 * @author Luan Paulo
 */
public class Controller_Carro {
    
    Model_Carro model = new Model_Carro();
    
    public String Validar_Cadastro(String placa, String marca, String modelo, String cor,String ano,String portas,String arcondicionado, String direcao,String veletrico,String alarme, String classe,String tipo, String combustivel,String cambioauto,String multimidia, String status) throws Exception{
//        int id;
//        String placa;
//        String marca;
//        String modelo;
//        String cor;
//        int ano;
          int anoConvertido = Integer.parseInt(ano);
//        int portas;//2 ou 4;
          int portasConvertido = Integer.parseInt(portas);
//        boolean arcondicionado;
          boolean arcondicionadoConvertido = Boolean.parseBoolean(arcondicionado);
//        String direcao;//eletrica ou hidraulica ou mecanica
//        boolean veletrico;
          boolean veeletricoConvertido = Boolean.parseBoolean(veletrico);
//        boolean alarme;
          boolean alarmeConvertido = Boolean.parseBoolean(alarme);
//        String classe;//sedan ou ratch ou suv
//        String tipo;//Aluguel - Venda
//        String combustivel;//gasolina ou alcool ou flex ou diesel
//        boolean cambioauto;//automatico ou manual
          boolean cambioautoConvertido = Boolean.parseBoolean(cambioauto);
//        boolean multimidia;//
          boolean multimidiaConvertido = Boolean.parseBoolean(multimidia);
//        String status;//Disponivel - vendido - Alugado - em Manutenção
        
        String retorno = "";
        Carro novo = new Carro(placa,marca,modelo,cor,anoConvertido,portasConvertido,arcondicionadoConvertido,direcao,veeletricoConvertido,alarmeConvertido,classe,tipo,combustivel,cambioautoConvertido,multimidiaConvertido,status);
        
        
        //chamar model
        retorno = model.Cadastrar_Carro(novo);
        
        return retorno;
    }
    
    public String Validar_Atualizar(){
        
        return "";
    }
    
    public ArrayList<Carro> ValidarBusca(String nome)throws Exception
    {
        ArrayList<Carro> carros = new ArrayList();
        carros = model.buscar_Carro(nome);
        return carros;
    }
}
