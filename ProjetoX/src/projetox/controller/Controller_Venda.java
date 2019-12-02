/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.controller;

import projetox.Class.Venda;
import projetox.Model.Model_Venda;

/**
 *
 * @author Luan Paulo
 */
public class Controller_Venda {
        Model_Venda model = new Model_Venda();
     public void validarLocacao(Venda venda) throws Exception
    {
        if (venda.getCliente().getId() == 0) {
            throw new Exception("Informe o Cliente para a Locação");
        }
        /*
        if(venda.getFilmes().isEmpty()|| venda.getValor_total()==0)
        {
            throw  new Exception("Uma locação deve ter no minimo 1 Filme");
        }
        */
        
        int codigo = 0;
        codigo = model.Cadastrar_Venda(venda);
        //model.inserirfilmes(venda.get(), codigo);
        //model.modificarSituacao(venda.getCarro());

    }
}
