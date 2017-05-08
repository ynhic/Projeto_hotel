/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec.DAO;

import br.com.fatec.VO.Cadastro_clientesVO;
import br.com.fatec.VO.EstadiaVO;
import br.com.fatec.VO.Reserva_quartoVO;
import br.com.fatec.conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author henrique
 */
public class EstadiaDAO {
     private Conexao conexao;
    private PreparedStatement pst;
    private ResultSet rs;
    private Statement st;
    private String sql = null;
    


public EstadiaDAO(Conexao conexao) 
    {
    /**
     * @param conexao informacoes sobre o banco
     * 
     * Este metodo conecta a classe DAO com o banco de dados
     */      
        this.conexao = conexao;
    }
     public EstadiaVO pesquisarPK(String cpf) throws SQLException {
        
        conexao.abrir();
       // EstadiaVO estadiaVO = null;
            Reserva_quartoVO reserva_quartoVO = new Reserva_quartoVO();//null;
            //Cadastro_clientesVO cadastro_clientesVO = null;
            
            Cadastro_clientesVO cadastro_clientesVO = new Cadastro_clientesVO();
            EstadiaVO estadiaVO = new EstadiaVO(cadastro_clientesVO, reserva_quartoVO);
            //estadiaVO = null;
        sql = "SELECT clientes.cpf, clientes.nome, reserva_quarto.codreserva, reserva_quarto.dataentrada "
                + "from clientes, reserva_quarto "
                + "where clientes.cpf =  " + cpf + "  and clientes.cpf = reserva_quarto.cpf ";
        
        pst = conexao.con().prepareStatement(sql);
        
        
        //faz a pesquisa
        rs = pst.executeQuery();
        if (rs.next()) { //encontrou
            //cria o objeto cidadeVO
            
            
            cadastro_clientesVO.setNome(rs.getString("nome"));
            estadiaVO.setCliente(cadastro_clientesVO);
            
            cadastro_clientesVO.setCpf(rs.getString("cpf"));
            estadiaVO.setCliente(cadastro_clientesVO);
            
            reserva_quartoVO.setCodreserva(rs.getString("codreserva"));
            estadiaVO.setReserva(reserva_quartoVO);
            
            reserva_quartoVO.setDataEntrada(rs.getDate("dataentrada"));
            estadiaVO.setReserva(reserva_quartoVO);
            
            
            
            //estadiaVO.getCliente().setCpf(rs.getString("cpf"));
            //estadiaVO.getCliente().setNome(rs.getString("nome"));
            
           // estadiaVO.getReserva().setCodreserva(rs.getString("codreserva"));
           //estadiaVO.getReserva().setDataEntrada(rs.getDate("dataentrada"));
            
            
        }
        if(estadiaVO.getReserva().getCodreserva()==null){
            sql = "SELECT nome, cpf FROM clientes WHERE cpf = " + cpf;
        
        pst = conexao.con().prepareStatement(sql);
        //faz a pesquisa
        rs = pst.executeQuery();
        if (rs.next()) { //encontrou
            //cria o objeto cidadeVO
            cadastro_clientesVO.setNome(rs.getString("nome"));
            estadiaVO.setCliente(cadastro_clientesVO);
            
            cadastro_clientesVO.setCpf(rs.getString("cpf"));
            estadiaVO.setCliente(cadastro_clientesVO);
 
        }
      }
        conexao.fechar();
        //se nao encontrou devolve cidadeVO com null
        return estadiaVO;
    }
     
     
     public void cadastrar(EstadiaVO obj) throws SQLException 
    {
        
        conexao.abrir(); //Abre a conexao com o  banco
        
        
        sql = "Insert into estadia (cpf,  codreserva, codestadia, dataentrada )"
                + " values (?, ?, ?, ?)"; //Comando SQL para cadastro   
        
        


        
        
        pst = conexao.con().prepareStatement(sql);
        
        
        pst.setString(1, obj.getCliente().getCpf()); //Troca "?" do comando SQL
        pst.setString(2, obj.getReserva().getCodreserva());        
        pst.setString(3, obj.getCodEstadia()); //Troca "?" do comando SQL
        pst.setDate(4, (java.sql.Date) obj.getReserva().getDataEntrada()); //Troca "?" do comando SQL
        
        
        
        pst.executeUpdate(); //Execulta o comando SQL
        
        JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!",
                "Informação", JOptionPane.INFORMATION_MESSAGE);
        
        conexao.fechar(); //Fecha a conexao com o banco
    }



}