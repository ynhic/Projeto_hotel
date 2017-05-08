/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.DAO;

import br.com.fatec.VO.Cadastro_clientesVO;
import br.com.fatec.VO.Login_SenhaVO;
import br.com.fatec.conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author henrique
 */
public class Login_SenhaDAO {
    
    private Conexao conexao;
    private PreparedStatement pst;
    private ResultSet rs;
    private Statement st;
    private String sql = null;
    
//------------ Metodos ------------

    public Login_SenhaDAO(Conexao conexao) 
    {
        
        
    /**
     * @param conexao informacoes sobre o banco
     * 
     * Este metodo conecta a classe DAO com o banco de dados
     */      
        this.conexao = conexao;
    }
    
    public Login_SenhaVO verificar(Login_SenhaVO obj) throws SQLException {
         conexao.abrir();
         Login_SenhaVO login_SenhaVO = null;
        //cria uma variavel para conter comandos SQL
        sql = "SELECT * FROM funcionario WHERE login = ? and senha = ? ";

        pst = conexao.con().prepareStatement(sql);
        
        pst.setString(1, obj.getLogin()); //Troca "?" do comando SQL
        pst.setString(2, obj.getSenha()); //Troca "?" do comando SQL
        //Executa um comando sql
        rs = pst.executeQuery();
        //atribui cada dados do objeto CidadeVO para o comando acima
        if (rs.next()) { //encontrou
            
            login_SenhaVO = new Login_SenhaVO();
            login_SenhaVO.setLogin(rs.getString("login"));
            login_SenhaVO.setSenha(rs.getString("senha"));
       
        
        
        
        
    }
        conexao.fechar();
        
        
        return login_SenhaVO;
  }
      
    
}
