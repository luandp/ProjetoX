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
public class Funcionario extends Pessoa{
        double salario;
        String senha;
        String cargo;
        String login;
    public Funcionario() {
        super(0, "", "");
        this.salario = 0;
        this.senha = "";
        this.cargo = "";
        this.login = "";
    }
    public Funcionario(double salario, String senha, int id, String nome, String CPF, String cargo, String login) {
        super(id, nome, CPF);
        this.salario = salario;
        this.senha = senha;
        this.cargo = cargo;
        this.login = login;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
        
        public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
        
}
