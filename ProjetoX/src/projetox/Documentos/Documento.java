/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetox.Documentos;

/**
 *
 * @author Luan Paulo
 */
public class Documento {
    /*
        Situação Atual
            Gerenciar
                Carro
                    Buscar - ok
                    Atualizar - OK (ATUALIZA TODOS OS CARROS)
                    Remover - OK
                    Cadastrar - ok
                Cliente
                    Buscar - ok
                    Atualizar - ok
                    Remover - ok
                    Cadastrar - ok
                Funcionario
                    Buscar - ok
                    Atualizar - ok
                    Remover - ok
                    Cadastrar - ok
            Operacao
                Aluguel...
                    Buscar - Sem Nada
                    Atualizar - Sem Nada
                    Remover - Sem Nada
                    Cadastrar - Sem Nada
                Vendas...
                    Buscar - Sem Nada
                    Atualizar - Sem Nada
                    Remover - Sem Nada
                    Cadastrar - Sem Nada
            Folha de Pagamento
                 Buscar - Sem Nada
                 Atualizar - Sem Nada
                 Remover - Sem Nada
                 Cadastrar - Sem Nada
            Variaveis de Sistema
                 Abrir Banco - ok
                 Fechar Banco - ok
    
    
        Esta Classe se destina a Comentar sobre o Projeto,
        Informações pertinentes a implementação do Modelo,
        ou de como Algum erro está se comportando.
    
        Modelo do projeto
        _______________________________________________
    
   	View
		-Envia os dados da tela pra Fachada;
		-Recebe os dados de Fachada
	Fachada
		-Receber os dados de View
			Enviar os dados para Controller
			Receber os dados de Controller
		-Retorna os dados para View
	Controller
		-Recebe os dados de Controller
			-Envia os dados para Model
			-Recebe os dados de Model
		-Retorna os dados para Fachada
	Model
		-Recebe os dados de Controller
			Envia os dados pro Banco
			Recebe os dados do Banco
		-Retorna os dados para Controller
  
                Create = Cadastrar
                Read = Listar
                Update = Atualizar
                Delete = Remover
    
    
    
    
    */
    
    
//    TelaCadastrarFuncionario->
//        facade_Funcionario->
//            Controller_Funcionario->
//                Model_Funcionario
}
