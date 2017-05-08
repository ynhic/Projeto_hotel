/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.DAO;

import br.com.fatec.VO.Cadastro_ProdutosVO;
import br.com.fatec.VO.ProdutoVO;
import br.com.fatec.conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author henrique
 */
public class ProdutoDAO {
    //------------ Atributos ------------
    
    private Conexao conexao;
    private PreparedStatement pst;
    private ResultSet rs;
    private Statement st;
    private String sql = null;
    private ProdutoVO produtoVO = null;
    public int teste = 1;

//------------ Metodos ------------
    
    public ProdutoDAO(Conexao conexao) 
    {
    /**
     * @param conexao informacoes sobre o banco
     * 
     * Este metodo conecta a classe DAO com o banco de dados
     */      
        this.conexao = conexao;
    }

    
    
    public List<ProdutoVO> listar() throws SQLException 
    {
    /**
     * @return List lista_produto  
     * 
     * Este metodo busca todos produtos no banco de dados e os armazena em um List  
     */ 
        List <ProdutoVO> lista_produto = new Vector<ProdutoVO>();
   
        conexao.abrir(); //Abre conexao com banco
        sql = "select * from produto"; //Comando SQL para listagem
        
        st = conexao.con().createStatement();
        rs = st.executeQuery(sql); //Executa o comando SQL
        
        while(rs.next()) //Quando encontrado...
        {
            produtoVO = new ProdutoVO(); //Instacia um novo ProdutoVO
            produtoVO.setNomeProd(rs.getString("nomeProduto"));
            produtoVO.setCodProd(rs.getInt("codProduto")); //Armazena o conteudo da coluna "codProd" na variavel idProd do objeto produtoVO
            produtoVO.setValorProd(rs.getDouble("valorProduto")); //Armazena o conteudo da coluna "valorProd" na variavel valor do objeto produtoVO
            produtoVO.setQuantidade(rs.getInt("quantProd")); //Armazena o conteudo da coluna "quantProd" na variavel quantidadeTotal do objeto produtoVO

            lista_produto.add(produtoVO); //Adicona o produtoVO criado no List
        }
        conexao.fechar(); //Fecha conexao com o banco
        return lista_produto; //Retorna o List 
    }
    
    public int verificaQuantidade(int id) throws SQLException 
    {
    /**
     * @param id sera procurado na coluna de codProd na tabela "tabProduto"
     * 
     * @return int quantidadeTotal
     * 
     * Este metodo busca os dados referente ao int id, passado por paramentro, na tabela de "tabProduto" do banco de dados "farmapp" 
     *e retorna sua quantidade no estoque
     */     
        conexao.abrir(); //Abre a conexao com o banco
        
        sql = "select * from produto where codProduto = ?"; //Comando SQL para busca
        
        pst = conexao.con().prepareStatement(sql); 
        pst.setInt(1, id); //Troca "?" do comando SQL
        rs = pst.executeQuery(); //Executa o comando SQL

        if (rs.next()) //Quando encontrado...
        {
            produtoVO = new ProdutoVO(); //Instacia um novo ProdutoVO 

            produtoVO.setQuantidade(rs.getInt("quantProd")); //Armazena o conteudo da coluna "quantProd" na variavel quantidadeTotal do objeto produtoVO
            return produtoVO.getQuantidade(); //Retorna quantidade do produto existente no estoque
        } 
               
        conexao.fechar(); //Fecha a conexao com o banco
        return 0; //Retorna 0 pois o produto nao foi encontrado no estoque
    }
    
    public void atualizaQuantidadeProd(int id, int quantidade) throws SQLException  
    {
    /**
     * @param id sera procurado na coluna de codProd na tabela "tabProduto"
     * @param quantidade sera atualizado na coluna de quantProd na tabela "tabProduto"
     * 
     * Este metodo atualiza a quantidade do produto, int id, no estoque de acordo com o parametro passado por int quantidade
     */    
        conexao.abrir(); //Abre a conexao com o banco
        sql = "update produto set quantProd = ? where codProduto = ?"; //Comando SQL para editarCli            
                
        pst = conexao.con().prepareStatement(sql);
        pst.setInt(2, id); //Troca "?" do comando SQL
        pst.setInt(1, quantidade); //Troca "?" do comando SQL       
        pst.execute(); //Executa o comando SQL
        conexao.fechar(); //Fecha a conexao com o banco   
    }
    
    
    public boolean pesquisarPK(Cadastro_ProdutosVO obj) throws SQLException {
        int retorno = 0;
        conexao.abrir();
        Cadastro_ProdutosVO cadastro_ProdutosVO = null;
        
        sql = "SELECT * FROM produto WHERE codProduto = " + obj.getCodigo();
        
        pst = conexao.con().prepareStatement(sql);
        //faz a pesquisa
        rs = pst.executeQuery();
        if (rs.next()) { //encontrou
            //cria o objeto cidadeVO
            retorno = 1;
            
        }
        conexao.fechar();
        //se nao encontrou devolve cidadeVO com null
        if (retorno == 0) {
            return false;
        } else {
            return true;
        }
    }
    
}
