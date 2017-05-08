/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class Conexao {
     
    private String usuario;
    private String senha;
    private String servidor;
    private String nomeBanco;
    private int porta;
    private Connection conexao;
    
    public boolean abrir() 
    {
    /**
     * Este metodo abre a conexao com o banco de dados informado pelos atribultos
     */    
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://" + getServidor() + ":" + getPorta() + "/" + getNomeBanco();
            setConexao(DriverManager.getConnection(url, getUsuario(), getSenha()));
            return true;
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro SQL:" + ex.getMessage());
        } 
        catch (ClassNotFoundException ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro Class:" + ex.getMessage());
        }
        return false;
    }
    
    public void fechar() 
    {
    /**
     * Este metodo fecha a conexao com o banco de dados informado pelos atribultos
     */     
        try 
        {
            conexao.close();
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro:" + ex.getMessage());
        }
    }
    
    public Connection con() 
    {
        return conexao;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the servidor
     */
    public String getServidor() {
        return servidor;
    }

    /**
     * @param servidor the servidor to set
     */
    public void setServidor(String servidor) {
        this.servidor = servidor;
    }

    /**
     * @return the nomeBanco
     */
    public String getNomeBanco() {
        return nomeBanco;
    }

    /**
     * @param nomeBanco the nomeBanco to set
     */
    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    /**
     * @return the porta
     */
    public int getPorta() {
        return porta;
    }

    /**
     * @param porta the porta to set
     */
    public void setPorta(int porta) {
        this.porta = porta;
    }

    /**
     * @return the Conexao
     */
    public Connection getConexao() {
        return conexao;
    }

    /**
     * @param conexao the Conexao to set
     */
    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }
}
