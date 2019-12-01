/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.Class;

/**
 *
 * @author Luan Paulo
 */
public class Comissionado extends Funcionario{
    
        double comissao;

    public Comissionado(double comissao, double salario, String senha, int id, String nome, String CPF, String cargo, String login) {
        super(salario, senha, id, nome, CPF, cargo,login);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
        
        
}
