package br.com.fatec.telas;

import br.com.fatec.DAO.Cadastro_clientesDAO;
import br.com.fatec.VO.Cadastro_clientesVO;
import br.com.fatec.conexao.Conexao;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author henrique
 */
public class Cadastro_clientes extends javax.swing.JFrame {
    
    private String sexo;
    Conexao conexao = new Conexao();
    Cadastro_clientesDAO cadastro_clientesDAO = new Cadastro_clientesDAO(conexao);
    
    
    public void limparCampos(){
        txtDatanasc.setText("");
        txtCpf.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtNome.setText("");
        txtRG.setText("");
        txtTelefone.setText("");
        txtComplemento.setText("");
        rd_feminino.setSelected(false);
        rd_masculino.setSelected(false);
        
        
    }
    
    /**
     * Creates new form Cadastro
     */
    public Cadastro_clientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        bt_group = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        rd_feminino = new javax.swing.JRadioButton();
        rd_masculino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        txtRG = new javax.swing.JFormattedTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtDatanasc = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setText("N°");

        jLabel3.setText("Email");

        jLabel13.setText("Telefone");

        jLabel16.setText("Nome completo");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel1.setText("RG");

        jLabel2.setText("CPF");

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");

        bt_group.add(rd_feminino);
        rd_feminino.setText("Feminino");
        rd_feminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_femininoActionPerformed(evt);
            }
        });

        bt_group.add(rd_masculino);
        rd_masculino.setText("Masculino");
        rd_masculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_masculinoActionPerformed(evt);
            }
        });

        jLabel5.setText("Sexo");

        jLabel7.setText("Data Nascimento");

        jLabel6.setText("Endereço");

        jLabel8.setText("Complemento");

        txtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComplementoActionPerformed(evt);
            }
        });

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar Tudo");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-A")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRGFocusLost(evt);
            }
        });

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });

        try {
            txtDatanasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addGap(179, 179, 179))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rd_feminino)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(rd_masculino)
                                    .addComponent(jLabel5))
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtDatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(253, 253, 253))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btPesquisar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btLimpar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btCadastrar)))
                                .addGap(18, 18, 18)
                                .addComponent(btCancelar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rd_masculino)
                    .addComponent(txtDatanasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rd_feminino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addGap(11, 11, 11)
                .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btAlterar)
                    .addComponent(btCancelar)
                    .addComponent(btLimpar)
                    .addComponent(btPesquisar))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void rd_femininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_femininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd_femininoActionPerformed

    private void txtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComplementoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao.setNomeBanco("Hotel");
        conexao.setPorta(3306);
        conexao.setSenha("");
        conexao.setServidor("localhost");
        conexao.setUsuario("root");          // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        
        if (txtComplemento.getText().isEmpty() ||
            txtCpf.getText().isEmpty() ||
            txtDatanasc.getText().isEmpty() ||
            txtEmail.getText().isEmpty() ||
            txtEndereco.getText().isEmpty() ||
            txtNome.getText().isEmpty() ||
            txtRG.getText().isEmpty() ||
            txtTelefone.getText().isEmpty() ||
            rd_masculino.getText().isEmpty() ||
            rd_feminino.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Digite campos obrigatórios","Formulário Incompleto", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
        
         Cadastro_clientesVO cadastro_clientesVO = new Cadastro_clientesVO();
          
          
          if (rd_masculino.isSelected()){
              sexo="M";
          }
          if(rd_feminino.isSelected()){
              sexo="F";
          }
          
           String strData = txtDatanasc.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        java.util.Date dataUtil = null;
        try {
            dataUtil = sdf.parse(strData);
        } catch (ParseException ex) {
            Logger.getLogger(Reserva_quarto.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.sql.Date dataNascSql;
        dataNascSql= new java.sql.Date(dataUtil.getTime());
          
          
          cadastro_clientesVO.setComplemento(txtComplemento.getText());
          cadastro_clientesVO.setSexo(sexo);
          cadastro_clientesVO.setCpf(txtCpf.getText());
          cadastro_clientesVO.setNome(txtNome.getText());
          cadastro_clientesVO.setDatanasc(dataNascSql);
          cadastro_clientesVO.setEmail(txtEmail.getText());
          cadastro_clientesVO.setEndereco(txtEndereco.getText());
          cadastro_clientesVO.setRG(txtRG.getText());
          cadastro_clientesVO.setTelefone(txtTelefone.getText());
          
        try {
            cadastro_clientesDAO.cadastrar(cadastro_clientesVO);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        limparCampos();
                  
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void rd_masculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_masculinoActionPerformed
        
    }//GEN-LAST:event_rd_masculinoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        if (txtComplemento.getText().isEmpty() ||
            txtCpf.getText().isEmpty() ||
            txtDatanasc.getText().isEmpty() ||
            txtEmail.getText().isEmpty() ||
            txtEndereco.getText().isEmpty() ||
            txtNome.getText().isEmpty() ||
            txtRG.getText().isEmpty() ||
            txtTelefone.getText().isEmpty() ||
            rd_masculino.getText().isEmpty() ||
            rd_feminino.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Digite campos obrigatórios","Formulário Incompleto", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //cria um novo clienteVO
        Cadastro_clientesVO cadastro_clientesVO = new Cadastro_clientesVO();
        //seta as informaçoes do clienteVO
        if (rd_masculino.isSelected()){
              sexo="M";
          }
          if(rd_feminino.isSelected()){
              sexo="F";
          }
          
        String strData = txtDatanasc.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        java.util.Date dataUtil = null;
        try {
            dataUtil = sdf.parse(strData);
        } catch (ParseException ex) {
            Logger.getLogger(Reserva_quarto.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.sql.Date dataNascSql;
        dataNascSql= new java.sql.Date(dataUtil.getTime());
          
          
          cadastro_clientesVO.setComplemento(txtComplemento.getText());
          cadastro_clientesVO.setSexo(sexo);
          cadastro_clientesVO.setCpf(txtCpf.getText());
          cadastro_clientesVO.setNome(txtNome.getText());
          cadastro_clientesVO.setDatanasc(dataNascSql);
          cadastro_clientesVO.setEmail(txtEmail.getText());
          cadastro_clientesVO.setEndereco(txtEndereco.getText());
          cadastro_clientesVO.setRG(txtRG.getText());
          cadastro_clientesVO.setTelefone(txtTelefone.getText());
        
        try {
            if (cadastro_clientesDAO.alterar(cadastro_clientesVO) == true) {
                JOptionPane.showMessageDialog(rootPane, "Alteração OK",
                        "Mensagem ao Usuário", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro na Alteração",
                        "Mensagem ao Usuário", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro no try " + 
                    ex.getMessage(), "Mensagem ao Usuário", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        if(txtCpf.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o CPF para realizar a pesquisa","Alerta", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        Cadastro_clientesVO cadastro_clientesVO = new Cadastro_clientesVO();
        //abastecer com a PK
        
        cadastro_clientesVO.setCpf(txtCpf.getText());
        
         /* String CPF;
        CPF = txtCpf.getValue().toString();
        cadastro_clientesVO.setCpf(CPF);*/
        
        
        
        
        try {
            //pesquisa no banco
            cadastro_clientesVO = cadastro_clientesDAO.pesquisarPK(cadastro_clientesVO);
            if(cadastro_clientesVO == null) {
                JOptionPane.showMessageDialog(rootPane, "Dados nao encontrados!",
                    "Mensagem ao Usuário", 
                    JOptionPane.INFORMATION_MESSAGE);
            } else {
                //achou, entao jogar dados para tela
                
                
                txtCpf.setText(cadastro_clientesVO.getCpf());
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                
                String dateString;
                dateString = sdf.format(cadastro_clientesVO.getDatanasc());
                
                txtDatanasc.setText(dateString);
                txtEmail.setText(cadastro_clientesVO.getEmail());
                txtEndereco.setText(cadastro_clientesVO.getEndereco());
                txtNome.setText(cadastro_clientesVO.getNome());
                txtRG.setText(cadastro_clientesVO.getRG());
                txtTelefone.setText(cadastro_clientesVO.getTelefone());
                txtComplemento.setText(cadastro_clientesVO.getComplemento());
                
                if("M".equals(cadastro_clientesVO.getSexo()))
                    rd_masculino.setSelected(true);
                if("F".equals(cadastro_clientesVO.getSexo()))
                    rd_feminino.setSelected(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro no try " + 
                    ex.getMessage(), "Mensagem ao Usuário", 
                    JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btLimparActionPerformed

    private void txtRGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRGFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRGFocusLost

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfFocusLost

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
new Menu_principal().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cadastro_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.ButtonGroup bt_group;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton rd_feminino;
    private javax.swing.JRadioButton rd_masculino;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDatanasc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtRG;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
