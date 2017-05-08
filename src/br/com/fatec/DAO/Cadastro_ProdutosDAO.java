/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.DAO;

import br.com.fatec.VO.Cadastro_ProdutosVO;
import br.com.fatec.VO.Cadastro_clientesVO;
import br.com.fatec.conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author henrique
 */
public class Cadastro_ProdutosDAO {
    
    private Conexao conexao;
    private PreparedStatement pst;
    private ResultSet rs;
    private Statement st;
    private String sql = null;
    
//------------ Metodos ------------

    public Cadastro_ProdutosDAO(Conexao conexao) 
    {
    /**
     * @param conexao informacoes sobre o banco
     * 
     * Este metodo conecta a classe DAO com o banco de dados
     */      
        this.conexao = conexao;
    }

    public Cadastro_ProdutosDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void cadastrar(Cadastro_ProdutosVO obj) throws SQLException 
    {
     
        conexao.abrir(); //Abre a conexao com o  banco
       // codProduto retirado do sql
        
        sql = "Insert into produto ( nomeProduto, valorProduto, quantProd )"
                + " values (?, ?, ?)"; //Comando SQL para cadastro   
               
        pst = conexao.con().prepareStatement(sql);
              
        //pst.setInt(1, obj.getCodigo()); //Troca "?" do comando SQL
        pst.setString(1, obj.getNome()); //Troca "?" do comando SQL
        pst.setDouble(2, obj.getPreco()); //Troca "?" do comando SQL
        pst.setInt(3, obj.getQuantidade()); //Troca "?" do comando SQL
        
        

        pst.executeUpdate(); //Execulta o comando SQL
        
        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!",
                "Informação", JOptionPane.INFORMATION_MESSAGE);
        
        conexao.fechar(); //Fecha a conexao com o banco
    }
    
    public boolean alterar(Cadastro_ProdutosVO obj) throws SQLException {
         conexao.abrir();
        //cria uma variavel para conter comandos SQL
        sql="UPDATE produto SET nomeProduto = ?, valorProduto = ?, quantProd = ?  WHERE"
                + " codProduto = ?";

        pst = conexao.con().prepareStatement(sql);
        //atribui cada dados do objeto CidadeVO para o comando acima
        pst.setString(1, obj.getNome()); //Troca "?" do comando SQL
        pst.setDouble(2, obj.getPreco()); //Troca "?" do comando SQL
        pst.setInt(3, obj.getQuantidade());
        pst.setInt(4, obj.getCodigo()); //Troca "?" do comando SQL
         //Troca "?" do comando SQL
        
        //Executa um comando sql
        int retorno = pst.executeUpdate();
        
        conexao.fechar();
        if (retorno == 0) {
            return false;
        } else {
            return true;
        }
        
        
    }
    
    public Cadastro_ProdutosVO pesquisarPK(Cadastro_ProdutosVO obj) throws SQLException {
        
        conexao.abrir();
        Cadastro_ProdutosVO cadastro_ProdutosVO = null;
        
        sql = "SELECT * FROM produto WHERE codProduto = " + obj.getCodigo();
        
        pst = conexao.con().prepareStatement(sql);
        //faz a pesquisa
        rs = pst.executeQuery();
        if (rs.next()) { //encontrou
            //cria o objeto cidadeVO
            cadastro_ProdutosVO = new Cadastro_ProdutosVO();
            cadastro_ProdutosVO.setCodigo(rs.getInt("codProduto"));
            cadastro_ProdutosVO.setNome(rs.getString("nomeProduto"));
            cadastro_ProdutosVO.setPreco(rs.getDouble("valorProduto"));
            cadastro_ProdutosVO.setQuantidade(rs.getInt("quantProd"));
            
        }
        conexao.fechar();
        //se nao encontrou devolve cidadeVO com null
        return cadastro_ProdutosVO;
    }
    
}
