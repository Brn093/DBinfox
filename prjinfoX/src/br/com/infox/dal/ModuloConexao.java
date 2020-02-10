/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author João Bruno
 */
public class ModuloConexao {
    
    // Método responsável por estabelecer a conexão com o banco
    // Framework Connection
    public static Connection conector(){
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";    // Chamando o driver importado para a biblioteca
        String url = "jdbc:mysql://localhost:3306/dbinfox";     // Armazenar informações do banco de dados
        String user = "root";
        String password = "";
        // Estabelecendo a conexao com o banco de dados
        try{
            Class.forName(driver);          // Executa o driver
            conexao = DriverManager.getConnection(url, user, password);     // variável anteriormente criada
            return conexao;     // retorna a conexao
        }catch(Exception e){
            // apoio para esclarecer o erro
            //System.out.println(e);
            return null;
        }
    }
}   
