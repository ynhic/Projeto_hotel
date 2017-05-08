/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.DAO;

import br.com.fatec.VO.Cadastro_clientesVO;
import br.com.fatec.conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class Cadastro_clientesDAO {
    private Conexao conexao;
    private PreparedStatement pst;
    private ResultSet rs;
    private Statement st;
    private String sql = null;
    
//------------ Metodos ------------

    public Cadastro_clientesDAO(Conexao conexao) 
    {
    /**
     * @param conexao informacoes sobre o banco
     * 
     * Este metodo conecta a classe DAO com o banco de dados
     */      
        this.conexao = conexao;
    }

    public Cadastro_clientesDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void cadastrar(Cadastro_clientesVO obj) throws SQLException 
    {
    /**
     * @param nome nome a ser inserido na coluna nomeCli da tabela "clientes"
     * @param idade idade a ser inserido na coluna idadeCli da tabela "clientes"
     * @param sexo sexo a ser inserido na coluna sexoCli da tabela "clientes"* 
     * 
     *Este metodo cadastra na tabela "clientes" do banco de dados "poo" os dados passados por paramentro    
     */     
        conexao.abrir(); //Abre a conexao com o  banco
        
        
        sql = "Insert into clientes (cpf, Datanasc, Email, Endereco, Nome, Telefone, sexo, rg, complemento )"
                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)"; //Comando SQL para cadastro   
        
        


        
        
        pst = conexao.con().prepareStatement(sql);
        
        
        pst.setString(1, obj.getCpf()); //Troca "?" do comando SQL
        pst.setDate(2, (java.sql.Date) obj.getDatanasc()); //Troca "?" do comando SQL
        pst.setString(3, obj.getEmail()); //Troca "?" do comando SQL
        pst.setString(4, obj.getEndereco());
        pst.setString(5, obj.getNome());
        pst.setString(6, obj.getTelefone());
        pst.setString(7, obj.getSexo());
        pst.setString(8, obj.getRG());
        pst.setString(9, obj.getComplemento());
        
        pst.executeUpdate(); //Execulta o comando SQL
        
        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!",
                "Informação", JOptionPane.INFORMATION_MESSAGE);
        
        conexao.fechar(); //Fecha a conexao com o banco
    }
    
    
     public boolean alterar(Cadastro_clientesVO obj) throws SQLException {
         conexao.abrir();
        //cria uma variavel para conter comandos SQL
        sql="UPDATE clientes SET cpf = ?, Datanasc = ?, Email = ?, Endereco = ?, Nome = ?,"
                + " Telefone = ?, sexo = ?, rg = ?, complemento = ?  WHERE"
                + " cpf = ?";

        pst = conexao.con().prepareStatement(sql);
        //atribui cada dados do objeto CidadeVO para o comando acima
        pst.setString(1, obj.getCpf()); //Troca "?" do comando SQL
        pst.setDate(2, (java.sql.Date) obj.getDatanasc()); //Troca "?" do comando SQL
        pst.setString(3, obj.getEmail()); //Troca "?" do comando SQL
        pst.setString(4, obj.getEndereco());
        pst.setString(5, obj.getNome());
        pst.setString(6, obj.getTelefone());
        pst.setString(7, obj.getSexo());
        pst.setString(8, obj.getRG());
        pst.setString(9, obj.getComplemento());
        pst.setString(10, obj.getCpf());
        //Executa um comando sql
        int retorno = pst.executeUpdate();
        conexao.fechar();
        if (retorno == 0) {
            return false;
        } else {
            return true;
        }
        
        
    }
     
      public Cadastro_clientesVO pesquisarPK(Cadastro_clientesVO obj) throws SQLException {
        
        conexao.abrir();
        Cadastro_clientesVO cadastro_clientesVO = null;
        
        sql = "SELECT * FROM clientes WHERE cpf = " + obj.getCpf();
        
        pst = conexao.con().prepareStatement(sql);
        //faz a pesquisa
        rs = pst.executeQuery();
        if (rs.next()) { //encontrou
            //cria o objeto cidadeVO
            cadastro_clientesVO = new Cadastro_clientesVO();
            cadastro_clientesVO.setCpf(rs.getString("cpf"));
            cadastro_clientesVO.setNome(rs.getString("nome"));
            cadastro_clientesVO.setRG(rs.getString("rg"));
            cadastro_clientesVO.setSexo(rs.getString("sexo"));
            
            java.sql.Date datanascSQL;
            datanascSQL = rs.getDate("datanasc");
            java.util.Date datanascUTIL;
            datanascUTIL = new Date(datanascSQL.getTime());
            
            cadastro_clientesVO.setDatanasc(datanascUTIL);
            cadastro_clientesVO.setEmail(rs.getString("email"));
            cadastro_clientesVO.setEndereco(rs.getString("endereco"));
            cadastro_clientesVO.setComplemento(rs.getString("complemento"));
            cadastro_clientesVO.setTelefone(rs.getString("telefone"));
        }
        conexao.fechar();
        //se nao encontrou devolve cidadeVO com null
        return cadastro_clientesVO;
    }
    
    
}
