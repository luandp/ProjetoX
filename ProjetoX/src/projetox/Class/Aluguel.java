/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.Class;

import java.util.Date;

/**
 *
 * @author Luan Paulo
 */
public class Aluguel extends Operacao{
            double diaria;
            Date datainicial;
            Date datafinal;
            double juros;

    public Aluguel(double diaria, Date datainicial, Date datafinal, double juros, int id, Funcionario funcionario, Cliente cliente, Carro carro) {
        super(id, funcionario, cliente, carro);
        this.diaria = diaria;
        this.datainicial = datainicial;
        this.datafinal = datafinal;
        this.juros = juros;
    }

    
            
    public double getDiaria() {
        return diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public Date getDatainicial() {
        return datainicial;
    }

    public void setDatainicial(Date datainicial) {
        this.datainicial = datainicial;
    }

    public Date getDatafinal() {
        return datafinal;
    }

    public void setDatafinal(Date datafinal) {
        this.datafinal = datafinal;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
            






}







