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
    
    public String Validar_Cadastro(String id, String placa, String marca, String modelo, String cor,String ano,String portas,String arcondicionado, String direcao,String veletrico,String alarme, String classe,String tipo, String combustivel,String cambioauto,String multimidia, String status) throws Exception{

          
          try {
              
          int idConvertido = Integer.parseInt(id);
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
          
        //Verificação de Placa - Não poder ser Nulo, Não pode ser Vazio, Não pode ter nem menos e nem mais que 7 Carac 
        if(placa.trim().equals(""))
        {
            throw  new Exception("Placa não pode ser Vázio, Digite uma placa Válida!");
        }
                if(placa==null)
        {
            throw  new Exception("Placa não pode ser Nulo, Digite uma placa válido!");
        }
        if(placa.trim().length()<7 || placa.trim().length()>7)
        {
            throw  new Exception("Informe a placa do carro completa!");
        }  
        
        //Verificação de Marca - Não poder ser Nulo, Não pode ser Vazio
        if(marca.trim().equals(""))
        {
            throw  new Exception("Marca não pode ser Vázio, Digite uma Marca Válida!");
        }
                if(marca==null)
        {
            throw  new Exception("Marca não pode ser Nulo, Digite uma Marca válido!");
        }
        
        
        //Verificação de Modelo - Não poder ser Nulo, Não pode ser Vazio
        if(modelo.trim().equals(""))
        {
            throw  new Exception("Modelo não pode ser Vázio, Digite um Modelo Válida!");
        }
                if(modelo==null)
        {
            throw  new Exception("Modelo não pode ser Nulo, Digite um Modelo válido!");
        }
        
        
        //Verificação de Cor - Não poder ser Nulo, Não pode ser Vazio
        if(cor.trim().equals(""))
        {
            throw  new Exception("Cor não pode ser Vázio, Digite um Modelo Válida!");
        }
                if(cor==null)
        {
            throw  new Exception("Cor não pode ser Nulo, Digite um Modelo válido!");
        }
        //Verificação de Ano - Não poder ser Nulo, Não pode ser Vazio, Não poder ser menor que 1990
        if(anoConvertido < 1990)
        {
            throw  new Exception("Ano não pode ser menor que 1990!");
        }
                
        //Verificação de Portas - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de 2 e 4
        if(portasConvertido == 0)
        {
            throw  new Exception("Portas não pode ser Vázia, Escolha uma opção Válida!");
        }
        if(portasConvertido != 2 && portasConvertido != 4)
        {
            throw  new Exception("Escolha uma opção Válida!");
        }
        
        //Verificação de ar-condicionado - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de sim ou não
        if(arcondicionadoConvertido != true && arcondicionadoConvertido != false)
        {
            throw  new Exception("Escolha um cargo Válido!");
        }
       
        
        //Verificação de Direção - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de hidraulica, eletrica ou mecanica
         if(direcao.trim().equals(""))
        {
            throw  new Exception("Escolha uma opção Válido!");
        }
                if(direcao==null)
        {
            throw  new Exception("Escolha uma opção Válida!");
        }
        if(direcao.trim()!="Hidráulica" && direcao.trim()!="Elétrica" && direcao.trim()!="Mecânica")
        {
            throw  new Exception("Escolha uma opção válida!");
        }
        //Verificação de Vidro eletrico - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de sim ou não
        if(veeletricoConvertido!=true || veeletricoConvertido!= false)
        {
            throw  new Exception("Escolha uma opção válida!");
        }        
        //Verificação de Alarme - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de sim ou não
        if(alarmeConvertido!= true || alarmeConvertido!= false)
        {
            throw  new Exception("Escolha uma opção válida!");
        }    
                
        //Verificação de Classe - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de Hatch, SUV ou sedan
        if(classe.trim().equals(""))
        {
            throw  new Exception("Escolha uma opção Válida!");
        }
                if(classe==null)
        {
            throw  new Exception("Escolha uma opção Válida!");
        }
        if(classe.trim()!="Hatch" && classe.trim()!="Sedan" && classe.trim()!="SUV")
        {
            throw  new Exception("Escolha uma opção válida!");
        }
        //Verificação de Tipo - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de venda ou aluguel
        if(tipo.trim().equals(""))
        {
            throw  new Exception("Escolha uma opção Válida!");
        }
                if(tipo==null)
        {
            throw  new Exception("Escolha uma opção Válida!");
        }
        if(tipo.trim()!="venda" && tipo.trim()!="aluguel")
        {
            throw  new Exception("Escolha uma opção válida!");
        }
        //Verificação de Combustivel - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de Gasolina, Álcool ou flex
        if(combustivel.trim().equals(""))
        {
            throw  new Exception("Escolha uma opção Válida!");
        }
                if(combustivel==null)
        {
            throw  new Exception("Escolha uma opção Válida!");
        }
        if(combustivel.trim()!="Gasolina" && combustivel.trim()!="Álcool" && combustivel.trim()!="Flex")
        {
            throw  new Exception("Escolha uma opção válida!");
        }
        //Verificação de Cambioauto - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de Manual ou Automático
        if(cambioautoConvertido != true && cambioautoConvertido != false)
        {
            throw  new Exception("Escolha uma opção válida!");
        }
                        
        //Verificação de Multimidia - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de sim ou não
        if(multimidiaConvertido != true && multimidiaConvertido != false)
        {
            throw  new Exception("Escolha uma opção válida!");
        }  
                        
        //Verificação de Status - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de Disponível, Vendido, Manutenção ou Locado
        if(status.trim().equals(""))
        {
            throw  new Exception("Escolha uma opção Válida!");
        }
                if(status==null)
        {
            throw  new Exception("Escolha uma opção Válida!");
        }
        if(status.trim()!="Disponível" && status.trim()!="Vendido" && status.trim()!="Manutenção" && status.trim()!="Locado")
        {
            throw  new Exception("Escolha uma opção válida!");
        }
            
              
        Carro novo = new Carro(placa,marca,modelo,cor,anoConvertido,portasConvertido,arcondicionadoConvertido,direcao,veeletricoConvertido,alarmeConvertido,classe,tipo,combustivel,cambioautoConvertido,multimidiaConvertido,status);   
        return model.Cadastrar_Carro(novo);
        
        } catch (Exception e) {
            return ""+e;
        }
  
        //placa,marca,modelo,cor,anoConvertido,portasConvertido,arcondicionadoConvertido,direcao,veeletricoConvertido,alarmeConvertido,classe,tipo,combustivel,cambioautoConvertido,multimidiaConvertido,status
        
        //chamar model
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
