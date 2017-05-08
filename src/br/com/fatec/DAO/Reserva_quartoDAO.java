/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.DAO;

import br.com.fatec.VO.Cadastro_ProdutosVO;
import br.com.fatec.VO.Cadastro_clientesVO;
import br.com.fatec.VO.Reserva_quartoVO;
import br.com.fatec.conexao.Conexao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Francisco
 */
public class Reserva_quartoDAO {

    
//------------ Atributos ------------
    
    private Conexao conexao;
    private PreparedStatement pst;
    private ResultSet rs;
    private Statement st;
    private String sql = null;
    
//------------ Metodos ------------

    public Reserva_quartoDAO(Conexao conexao) 
    {
    /**
     * @param conexao informacoes sobre o banco
     * 
     * Este metodo conecta a classe DAO com o banco de dados
     */      
        this.conexao = conexao;
    }
    
    public void reservar(Reserva_quartoVO obj) throws SQLException 
    {
    /**
     * @param nome nome a ser inserido na coluna nomeCli da tabela "clientes"
     * @param idade idade a ser inserido na coluna idadeCli da tabela "clientes"
     * @param sexo sexo a ser inserido na coluna sexoCli da tabela "clientes"* 
     * 
     *Este metodo cadastra na tabela "clientes" do banco de dados "poo" os dados passados por paramentro    
     */     
        conexao.abrir(); //Abre a conexao com o  banco
        
        
        sql = "Insert into reserva_quarto (cpf, numquarto, dataentrada, datasaida, codreserva)"
                + " values (?, ?, ?, ?, ?)"; //Comando SQL para cadastro   
        
        
        
        
        pst = conexao.con().prepareStatement(sql);
        
        pst.setString(1, obj.getCpf()); //Troca "?" do comando SQL
        pst.setString(2, obj.getNumQuarto()); //Troca "?" do comando SQL
       // pst.setString(3, obj.getStatus()); //Troca "?" do comando SQL
        pst.setDate(3, (java.sql.Date) obj.getDataEntrada());
        pst.setDate(4, (java.sql.Date) obj.getDataSaida());
      //  pst.setDouble(6, obj.getDiaria());
       // pst.setInt(7, obj.getTotalDias());
        //pst.setDouble(8, obj.getTotal());
        pst.setString(5, obj.getCodreserva());
        
        pst.executeUpdate(); //Execulta o comando SQL
        JOptionPane.showMessageDialog(null,"Reserva efetuada com sucesso", "Alerta ao Usuário", JOptionPane.INFORMATION_MESSAGE);
        
        conexao.fechar(); //Fecha a conexao com o banco
    }
    
    
    public Reserva_quartoVO pesquisarPK(String cpf) throws SQLException {
        
        conexao.abrir();
        //Cadastro_clientesVO cadastro_clientesVO = new Cadastro_clientesVO();
       // Reserva_quartoVO reserva_quartoVO = null;
       
       
        Cadastro_clientesVO cadastro_clientesVO = new Cadastro_clientesVO();
        Reserva_quartoVO reserva_quartoVO = new Reserva_quartoVO(cadastro_clientesVO);
        //JOptionPane.showMessageDialog(null, reserva_quartoVO.getCpf());
        
        sql = "SELECT clientes.cpf, clientes.nome, reserva_quarto.codreserva, reserva_quarto.dataentrada,"
                + " reserva_quarto.numquarto , reserva_quarto.datasaida "
               
                + "from clientes, reserva_quarto "
                + " where clientes.cpf =   " + cpf + "   and clientes.cpf = reserva_quarto.cpf  ";
        
        pst = conexao.con().prepareStatement(sql);
        //faz a pesquisa
        rs = pst.executeQuery();
        if (rs.next()) { //encontrou
            //cria o objeto cidadeVO
            //cpf, numquarto, status, dataentrada, datasaida, diaria, totaldias, total, codreserva)
            reserva_quartoVO = new Reserva_quartoVO();
            reserva_quartoVO.setCodreserva(rs.getString("codreserva"));
            reserva_quartoVO.setCpf(rs.getString("cpf"));
            reserva_quartoVO.setDataEntrada(rs.getDate("dataentrada"));
            reserva_quartoVO.setDataSaida(rs.getDate("datasaida"));
            //reserva_quartoVO.setStatus(rs.getString("status"));
            //reserva_quartoVO.setTotalDias(rs.getInt("totaldias"));
            //reserva_quartoVO.setTotal(rs.getDouble("total"));
            reserva_quartoVO.setNumQuarto(rs.getString("numquarto"));
            //reserva_quartoVO.setDiaria(rs.getDouble("diaria"));
            
            cadastro_clientesVO.setNome(rs.getString("nome"));
            reserva_quartoVO.setCadastro_clientes(cadastro_clientesVO);
            
            cadastro_clientesVO.setCpf(rs.getString("cpf"));
            reserva_quartoVO.setCadastro_clientes(cadastro_clientesVO);
            
            
        }
        conexao.fechar();
        //se nao encontrou devolve cidadeVO com null
        return reserva_quartoVO;
    }
    
    
    
    
}
