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
    
    public String Validar_Cadastro(String placa, String marca, String modelo, String cor, String ano, String portas, String arcondicionado, String direcao, String veletrico, String alarme, String classe, String tipo, String combustivel, String cambioauto, String multimidia, String status) throws Exception{
        
          
          try {
              
          //int idConvertido = Integer.parseInt(id);
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
          //boolean cambioautoConvertido;
//        
          //boolean multimidia;//
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
            throw  new Exception("1-Escolha uma opção Válida!");
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
            throw  new Exception("2-Escolha uma opção Válida!");
        }
        if(direcao.trim()!="Hidraulica" && direcao.trim()!="Eletrica" && direcao.trim()!="Mecanica")
        {
            throw  new Exception("3-Escolha uma opção válida!");
        }
        //Verificação de Vidro eletrico - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de sim ou não
        if(veeletricoConvertido!=true && veeletricoConvertido!= false)
        {
            throw  new Exception("4-Escolha uma opção válida!");
        }        
        //Verificação de Alarme - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de sim ou não
        if(alarmeConvertido!= true && alarmeConvertido!= false)
        {
            throw  new Exception("5-Escolha uma opção válida!");
        }    
                
        //Verificação de Classe - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de Hatch, SUV ou sedan
        if(classe.trim().equals(""))
        {
            throw  new Exception("6-Escolha uma opção Válida!");
        }
                if(classe==null)
        {
            throw  new Exception("7-Escolha uma opção Válida!");
        }
        if(classe.trim()!="Hatch" && classe.trim()!="Sedan" && classe.trim()!="SUV")
        {
            throw  new Exception("8-Escolha uma opção válida!");
        }
        //Verificação de Tipo - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de venda ou aluguel
        if(tipo.trim().equals(""))
        {
            throw  new Exception("9-Escolha uma opção Válida!");
        }
                if(tipo==null)
        {
            throw  new Exception("10-Escolha uma opção Válida!");
        }
        if(tipo.trim()!="Venda" && tipo.trim()!="Aluguel")
        {
            throw  new Exception("11-Escolha uma opção válida!");
        }
        //Verificação de Combustivel - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de Gasolina, Álcool ou flex
        if(combustivel.trim().equals(""))
        {
            throw  new Exception("12-Escolha uma opção Válida!");
        }
                if(combustivel==null)
        {
            throw  new Exception("13-Escolha uma opção Válida!");
        }
        if(combustivel.trim()!="Gasolina" && combustivel.trim()!="Alcool" && combustivel.trim()!="Flex")
        {
            throw  new Exception("14-Escolha uma opção válida!");
        }
        //Verificação de Cambioauto - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de Manual ou Automático
        if(cambioauto.trim().equals(""))
        {
            throw  new Exception("15-Escolha uma opção válida!");
        }
                if(cambioauto==null)
        {
            throw  new Exception("15.1-Escolha uma opção Válida!");
        }
        if(!cambioauto.trim().equals("Manual") && !combustivel.trim().equals("Automatico"))
        {
            throw  new Exception("14-Escolha uma opção válida!");
        }        
        //Verificação de Multimidia - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de sim ou não
        if(multimidiaConvertido != true && multimidiaConvertido != false)
        {
            throw  new Exception("16-Escolha uma opção válida!");
        }  
                        
        //Verificação de Status - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de Disponível, Vendido, Manutenção ou Locado
        if(status.trim().equals(""))
        {
            throw  new Exception("17-Escolha uma opção Válida!");
        }
                if(status==null)
        {
            throw  new Exception("18-Escolha uma opção Válida!");
        }
        if(status.trim()!="Disponivel" && status.trim()!="Vendido" && status.trim()!="Manutencao" && status.trim()!="Locado")
        {
            throw  new Exception("19-Escolha uma opção válida!");
        }
            
              
        Carro novo = new Carro(placa,marca,modelo,cor,anoConvertido,portasConvertido,arcondicionadoConvertido,direcao,veeletricoConvertido,alarmeConvertido,classe,tipo,combustivel,cambioauto,multimidiaConvertido,status);   
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
    public String verificarRemocao(int id)throws Exception
    {
        if(id==0)
        {
            throw  new Exception("Informe um carro para ser excluido");
        }
        boolean retorno;
        //retorno = model.veirificarRemocao(id);
        retorno = false;
        if(retorno == true)
        {
            throw  new Exception("");
        }
        
        return model.remover_Carro(id);
               
    }
    public String validarAtualizacao(int id,String placa, String marca, String modelo, String cor, String ano, String portas, String arcondicionado, String direcao, String veletrico, String alarme, String classe, String tipo, String combustivel, String cambioauto, String multimidia, String status)throws Exception
    {   
            
          try {
              
          //int idConvertido = Integer.parseInt(id);
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
          //boolean cambioautoConvertido;
//        
          //boolean multimidia;//
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
            throw  new Exception("1-Escolha uma opção Válida!");
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
            throw  new Exception("2-Escolha uma opção Válida!");
        }
        if(direcao.trim()!="Hidraulica" && direcao.trim()!="Eletrica" && direcao.trim()!="Mecanica")
        {
            throw  new Exception("3-Escolha uma opção válida!");
        }
        //Verificação de Vidro eletrico - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de sim ou não
        if(veeletricoConvertido!=true && veeletricoConvertido!= false)
        {
            throw  new Exception("4-Escolha uma opção válida!");
        }        
        //Verificação de Alarme - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de sim ou não
        if(alarmeConvertido!= true && alarmeConvertido!= false)
        {
            throw  new Exception("5-Escolha uma opção válida!");
        }    
                
        //Verificação de Classe - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de Hatch, SUV ou sedan
        if(classe.trim().equals(""))
        {
            throw  new Exception("6-Escolha uma opção Válida!");
        }
                if(classe==null)
        {
            throw  new Exception("7-Escolha uma opção Válida!");
        }
        if(classe.trim()!="Hatch" && classe.trim()!="Sedan" && classe.trim()!="SUV")
        {
            throw  new Exception("8-Escolha uma opção válida!");
        }
        //Verificação de Tipo - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de venda ou aluguel
        if(tipo.trim().equals(""))
        {
            throw  new Exception("9-Escolha uma opção Válida!");
        }
                if(tipo==null)
        {
            throw  new Exception("10-Escolha uma opção Válida!");
        }
        if(tipo.trim()!="Venda" && tipo.trim()!="Aluguel")
        {
            throw  new Exception("11-Escolha uma opção válida!");
        }
        //Verificação de Combustivel - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de Gasolina, Álcool ou flex
        if(combustivel.trim().equals(""))
        {
            throw  new Exception("12-Escolha uma opção Válida!");
        }
                if(combustivel==null)
        {
            throw  new Exception("13-Escolha uma opção Válida!");
        }
        if(combustivel.trim()!="Gasolina" && combustivel.trim()!="Alcool" && combustivel.trim()!="Flex")
        {
            throw  new Exception("14-Escolha uma opção válida!");
        }
        //Verificação de Cambioauto - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de Manual ou Automático
        if(cambioauto.trim().equals(""))
        {
            throw  new Exception("15-Escolha uma opção válida!");
        }
                if(cambioauto==null)
        {
            throw  new Exception("15.1-Escolha uma opção Válida!");
        }
        if(!cambioauto.trim().equals("Manual") && !combustivel.trim().equals("Automatico"))
        {
            throw  new Exception("14-Escolha uma opção válida!");
        }        
        //Verificação de Multimidia - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de sim ou não
        if(multimidiaConvertido != true && multimidiaConvertido != false)
        {
            throw  new Exception("16-Escolha uma opção válida!");
        }  
                        
        //Verificação de Status - Não poder ser Nulo, Não pode ser Vazio, Não pode ser diferente de Disponível, Vendido, Manutenção ou Locado
        if(status.trim().equals(""))
        {
            throw  new Exception("17-Escolha uma opção Válida!");
        }
                if(status==null)
        {
            throw  new Exception("18-Escolha uma opção Válida!");
        }
        if(!status.trim().equals("Disponivel") && !status.trim().equals("Vendido") && !status.trim().equals("Manutencao") && !status.trim().equals("Locado"))
        {
            throw  new Exception("19-Escolha uma opção válida!");
        }
            
         
        Carro novo = new Carro(placa,marca,modelo,cor,anoConvertido,portasConvertido,arcondicionadoConvertido,direcao,veeletricoConvertido,alarmeConvertido,classe,tipo,combustivel,cambioauto,multimidiaConvertido,status);   
           return model.atualizar_Carro(novo,id);  
       
        
        } catch (Exception e) {
            return ""+e;
        }   
    }
    public ArrayList<Carro> buscaCarro(String modelo)throws Exception
    {
        ArrayList<Carro> Carros = new ArrayList<>();
       Carros =  model.buscar_Carro(modelo);
       return  Carros;
    }
}
