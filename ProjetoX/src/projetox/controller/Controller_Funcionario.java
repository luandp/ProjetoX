/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.controller;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import projetox.Class.Funcionario;
import projetox.Model.Model_Funcionario;
import projetox.view.TelaPrincipal;

/**
 *
 * @author Luan Paulo
 */
public class Controller_Funcionario {
   
    Model_Funcionario model = new Model_Funcionario();
    
    public String Validar_Cadastro(String nome, String cpf, String senha, String cargo, String salario,String login) throws Exception{
        
        /*
        Variaveis
        id - Não
        nome - Não poder ser Nulo, Não pode ser Vazio, Não pode ter menos que 10 Carac
        CPF -  Não poder ser Nulo, Não pode ser Vazio, Não pode ter menos ou mais que 11 Carac
        salario - Não poder ser Nulo, Não pode ser Vazio, não pode ser menor que o salario minimo 998
        senha   - Não poder ser Nulo, Não pode ser Vazio,  Não pode ter menos que 4 Carac
        cargo - Não poder ser Nulo, Não pode ser Vazio,  Não pode ser diferente de Funcionario, Comissionado, Gerente
        login - Não poder ser Nulo, Não pode ser Vazio,  Não pode ser repetido na base, não pode ter menos que 4 Carac
        */
        try {
            
            
            //nome
            //cpf
            //senha
            //cargo
            double salarioConvertido = Double.parseDouble(salario);
            //login
            
            
            /*
        Variaveis
        id - Não
        nome - Não poder ser Nulo, Não pode ser Vazio, Não pode ter menos que 10 Carac
        CPF -  Não poder ser Nulo, Não pode ser Vazio, Não pode ter menos ou mais que 11 Carac
        salario - Não poder ser Nulo, Não pode ser Vazio, não pode ser menor que o salario minimo 998
        senha   - Não poder ser Nulo, Não pode ser Vazio,  Não pode ter menos que 4 Carac
        cargo - Não poder ser Nulo, Não pode ser Vazio,  Não pode ser diferente de Funcionario, Comissionado, Gerente
        login - Não poder ser Nulo, Não pode ser Vazio,  Não pode ser repetido na base, não pode ter menos que 4 Carac
        */
            
        //verificacao de nome - Não poder ser Nulo, Não pode ser Vazio, Não pode ter menos que 10 Carac
            if(nome.trim().equals(""))
        {
            throw  new Exception("Nome não pode ser Vázio, Digite um nome Válido!");
        }
                if(nome==null)
        {
            throw  new Exception("Nome não pode ser Nulo, Digite um nome válido!");
        }
        if(nome.trim().length()<10)
        {
            throw  new Exception("Informe o nome completo do usuário!");
        }
        //verificacao de CPF -  Não poder ser Nulo, Não pode ser Vazio, Não pode ter menos ou mais que 11 Carac
            if(cpf.trim().equals(""))
        {
            throw  new Exception("cpf não pode ser Vázio, Digite um cpf Válido!");
        }
                if(cpf==null)
        {
            throw  new Exception("cpf não pode ser Nulo, Digite um cpf válido!");
        }
        if(cpf.trim().length()!=11)
        {
            throw  new Exception("Informe o cpf completo com 11 Digitos!");
        }
        //verificacao de salario - Não poder ser Nulo, Não pode ser Vazio, não pode ser menor que o salario minimo 998
            if(salarioConvertido<998)
        {
            throw  new Exception("Salario não pode ser menor que o Salario Minimo = R$998.56");
        }
        //verificacao de senha   - Não poder ser Nulo, Não pode ser Vazio,  Não pode ter menos que 4 Carac
            if(senha.trim().equals(""))
        {
            throw  new Exception("Senha não pode ser Vázio, Digite uma senha Válida!");
        }
                if(senha==null)
        {
            throw  new Exception("Senha não pode ser Nulo, Digite uma senha válida!");
        }
        if(senha.trim().length()<4)
        {
            throw  new Exception("Senha não pode ter menos de 4 Caracteres - Digite uma nova Senha!");
        }
        //verificacao de cargo - Não poder ser Nulo, Não pode ser Vazio,  Não pode ser diferente de Funcionario, Comissionado, Gerente
            if(cargo.trim().equals(""))
        {
            throw  new Exception("Cargo não pode ser Vázio, Escolha um cargo Válido!");
        }
                if(cargo==null)
        {
            throw  new Exception("Cargo não pode ser Nulo, Escolha um cargo Válido!");
        }
        if(cargo.trim()!="Funcionario" && cargo.trim()!="Comissionado" && cargo.trim()!="Gerente")
        {
            throw  new Exception("Escolha um cargo Válido!");
        }
        //verificacao de login - Não poder ser Nulo, Não pode ser Vazio,  Não pode ser repetido na base, não pode ter menos que 4 Carac    
            if(login.trim().equals(""))
        {
            throw  new Exception("login não pode ser Vázio, Digite um login Válido!");
        }
                if(login==null)
        {
            throw  new Exception("login não pode ser Nulo, Digite um login válido!");
        }
        if(login.trim().length()<4)
        {
            throw  new Exception("Login não pode ter menos de 4 Caracteres - Digite um login Diferente");
        }
        //Fim das Verificações
        //____________________________________________________________________________________________________________________________________
        Funcionario novo = new Funcionario(salarioConvertido, senha, 0, nome, cpf, cargo,login);
        return model.Cadastrar_Funcionario(novo);
   
        } catch (Exception e) {
            
              return ""+e;
        }
               
    }
    
    public String Validar_Atualizar(){
        
        return "";
    }
    
    public ArrayList<Funcionario> ValidarBusca(String nome)throws Exception
    {
        ArrayList<Funcionario> funcionarios = new ArrayList();
        funcionarios = model.buscar_Funcionario(nome);
        return funcionarios;
    }
    public String verificarRemocao(int id,String cargo)throws Exception
    {
        if(id==0)
        {
            throw  new Exception("Informe um usuário para ser excluido");
        }
        boolean retorno;
        retorno = model.veirificarRemocao(cargo);
        if(retorno == true)
        {
            throw  new Exception("Você é o último usuário Administrador, por isso não pode ser removido");
        }
        model.remover_Funcionario(id);
        return "";
               
    }
    public String verificaAtualizacao()throws Exception
    {
       
       boolean retorno = true;
       retorno = model.veirificarAtualizacao();
       if(retorno == true)
       {
           return "Você não pode atualizar o último Administrador para funcionáio";
       }
       return "ok";
    }
     
    
        public void validarAtualizacao(Funcionario novo,int id,String login)throws Exception
    {
        if(novo.getNome().trim().equals(""))
        {
            throw  new Exception("Informe o nome do funcionario");
            
        }
        if(novo.getNome().trim().length()<10)
        {
            throw  new Exception("Informe o nome completo do funcionario ");
            
        }
        if(novo.getLogin().trim().equals(""))
        {
            throw  new Exception("Informe o Login do funcionario");
           
        }
        if(novo.getLogin().trim().length()<4)
        {
           throw  new Exception("Informe um Login válido");
           
        }
        if(novo.getSenha().trim().equals(""))
        {
           throw  new Exception("Informe a senha do funcionario");
           
        }
        if(novo.getSenha().trim().length()<4)
        {
           throw  new Exception("A senha deve ter no minimo 4 caracteres ");
            
        }
        if(!login.equals(novo.getLogin()))
        {
            boolean retorno;
            retorno = model.verificarLoginDisponivel(novo.getLogin());
            if(retorno == true)
            {
                throw  new Exception("Já existe um usuário com esse Login");
            }
        }
            model.atualizar_Funcionario(novo,id);
            
    }
        
    public Funcionario validar_Login(String login, String senha)throws Exception
    {
       
       if(login.trim().equals(""))
        {
       throw  new Exception("Informe o seu Login ");
        }
        if(senha.trim().equals("")|| senha.trim().length()<3)
        {
        throw  new Exception("Informe a sua Senha ");
        
        }
            Funcionario funcionarioo = new Funcionario();
            funcionarioo =  model.VerificarLogin(login,senha);
            if(funcionarioo.getCargo().equals("errado"))
            {
                throw  new Exception("123456: ALogin ou Senha invalida");
                
            }
        return funcionarioo;
            
           
       
        
}
    
}
