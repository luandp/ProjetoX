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
    */
}
