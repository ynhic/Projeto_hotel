package br.com.fatec.telas;


import br.com.fatec.DAO.Cadastro_ProdutosDAO;
import br.com.fatec.DAO.ProdutoDAO;
import br.com.fatec.VO.Cadastro_ProdutosVO;
import br.com.fatec.VO.ProdutoVO;
import br.com.fatec.conexao.Conexao;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Cadastro_Produtos extends javax.swing.JFrame {

//------------ Variaveis Globais ------------
 
    
    
    
    
    Conexao conexao = new Conexao();
    Cadastro_ProdutosDAO cadastro_ProdutosDAO = new Cadastro_ProdutosDAO(conexao);
    ProdutoDAO produtoDAO = new ProdutoDAO(conexao);
    
    //variaveis antigas
    public String cargoFunc;
    public String nomeFunc;
    public int idFunc;
    public String data;
    private DefaultTableModel tableModelProduto;
    public boolean statusCaixa; 

    
//Cria/Exibe o form Estoque
    public Cadastro_Produtos() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLogo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lbPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        btLimpar = new javax.swing.JButton();
        btMenu = new javax.swing.JButton();
        btCadastrar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        lbCodigo1 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbLogo.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setText("cadastro de produtos");
        lbLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setToolTipText("");

        lbNome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbNome.setText("Nome");

        lbCodigo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbCodigo.setText("Código");

        lbPreco.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbPreco.setText("Preço Unitário");

        btLimpar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btMenu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btMenu.setText("Menu");
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });

        btCadastrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btEditar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btRemover.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btBuscar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbProdutos.setEnabled(false);
        jScrollPane2.setViewportView(tbProdutos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        lbCodigo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbCodigo1.setText("Qntd.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPreco)
                                .addGap(18, 18, 18)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbCodigo1)
                                .addGap(18, 18, 18)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(lbNome)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPreco)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCodigo1)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btEditar)
                    .addComponent(btRemover)
                    .addComponent(btLimpar)
                    .addComponent(btMenu)
                    .addComponent(btBuscar))
                .addGap(34, 34, 34))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//------------ Metodos ------------
    
    private void preencheTable() 
    {
        Vector colunas = new Vector(4);
        colunas.add("Cod");
        colunas.add("NomeProd");
        colunas.add("ValorProd");
        colunas.add("Quantidade");
        
        try 
        {
            Vector<ProdutoVO> dado = (Vector)produtoDAO.listar();
            
            tableModelProduto = new DefaultTableModel();
            tableModelProduto.setColumnIdentifiers(colunas);
            
            tbProdutos.setModel(tableModelProduto);
            TableColumnModel modeloDaColuna = tbProdutos.getColumnModel();  
            modeloDaColuna.getColumn(0).setMaxWidth(35);
            modeloDaColuna.getColumn(1).setMaxWidth(500);
            modeloDaColuna.getColumn(2).setMaxWidth(100);
            modeloDaColuna.getColumn(3).setMaxWidth(100);
            
            for( ProdutoVO x : dado) {
                tableModelProduto.addRow(x.toVector());
            }
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(Cadastro_Produtos.class.getName()).log(Level.SEVERE, null, ex);
        }
        tbProdutos.setModel(tableModelProduto);
        
    }
    
   
    
//------------ Botoes do form ------------        
    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
    
        
        
        
        
    }//GEN-LAST:event_btMenuActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
    /**
     * Este metodo limpa os campos: txtNome, jsQuantidade, txtValidade, txtCodigo, txtPreco.
     */     
        txtNome.setText("");
        txtCodigo.setText("");
        txtPreco.setText("");
        txtQuantidade.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
    
        
        
        
        
        
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
     if (txtCodigo.getText().isEmpty() ||
            txtNome.getText().isEmpty() ||
            txtPreco.getText().isEmpty()||
             txtQuantidade.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Digite campos obrigatórios","Formulário Incompleto", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //cria um novo clienteVO
        Cadastro_ProdutosVO cadastro_ProdutosVO = new Cadastro_ProdutosVO();
        //seta as informaçoes do clienteVO
        
          
          cadastro_ProdutosVO.setCodigo(Integer.parseInt(txtCodigo.getText()));
          cadastro_ProdutosVO.setNome(txtNome.getText());
          cadastro_ProdutosVO.setPreco(Double.parseDouble(txtPreco.getText()));
          cadastro_ProdutosVO.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
          
        
        try {
            if (cadastro_ProdutosDAO.alterar(cadastro_ProdutosVO) == true) {
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso", "Alerta ao usuário",
                JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro na Alteração",
                        "Mensagem ao Usuário", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro no try " + 
                    ex.getMessage(), "Mensagem ao Usuário", 
                    JOptionPane.ERROR_MESSAGE);
        }
        preencheTable();
        
        
    }//GEN-LAST:event_btEditarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    /**
     * Este metodo preenche a combo (cbProdutos) com os medicamentos cadastrados após o form ser iniciado
     */
        conexao.setNomeBanco("Hotel");
        conexao.setPorta(3306);
        conexao.setSenha("");
        conexao.setServidor("localhost");
        conexao.setUsuario("root"); 
        btEditar.setEnabled(false);
        btRemover.setEnabled(false);
        preencheTable();
        txtCodigo.setEnabled(false);
        
    }//GEN-LAST:event_formWindowOpened

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
    
        if(txtCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o codigo do produto para realizar a pesquisa","Alerta", JOptionPane.INFORMATION_MESSAGE);
            txtCodigo.setEnabled(true);
            return;
        }
        
        Cadastro_ProdutosVO cadastro_ProdutosVO = new Cadastro_ProdutosVO();
        //abastecer com a PK
        
        cadastro_ProdutosVO.setCodigo(Integer.parseInt(txtCodigo.getText()));
        
        try {
            //pesquisa no banco
            cadastro_ProdutosVO = cadastro_ProdutosDAO.pesquisarPK(cadastro_ProdutosVO);
            if(cadastro_ProdutosVO == null) {
                JOptionPane.showMessageDialog(rootPane, "Dados nao encontrados!",
                    "Mensagem ao Usuário", 
                    JOptionPane.INFORMATION_MESSAGE);
            } else {
                //achou, entao jogar dados para tela
                
                txtCodigo.setText(String.valueOf(cadastro_ProdutosVO.getCodigo()));
                txtNome.setText(cadastro_ProdutosVO.getNome());
                txtQuantidade.setText(String.valueOf(cadastro_ProdutosVO.getQuantidade()));
                txtPreco.setText(String.valueOf(cadastro_ProdutosVO.getPreco()));
                
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro no try " + 
                    ex.getMessage(), "Mensagem ao Usuário", 
                    JOptionPane.ERROR_MESSAGE);
        }
        btEditar.setEnabled(true);
        btRemover.setEnabled(true);
        
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
     if (
            txtNome.getText().isEmpty() ||
            txtPreco.getText().isEmpty() ||
             txtQuantidade.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Digite campos obrigatórios","Formulário Incompleto", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
        
         Cadastro_ProdutosVO cadastro_ProdutosVO = new Cadastro_ProdutosVO();
          
          
          
          //cadastro_ProdutosVO.setCodigo(Integer.parseInt(txtCodigo.getText()));
          cadastro_ProdutosVO.setNome(txtNome.getText());
          cadastro_ProdutosVO.setPreco(Double.parseDouble(txtPreco.getText()));
          cadastro_ProdutosVO.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
          
          
          
         try {
            cadastro_ProdutosDAO.cadastrar(cadastro_ProdutosVO);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro_clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
         limparCampos();
         preencheTable();
        
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
           new Menu_principal().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Cadastro_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Produtos().setVisible(true);
            }
        });
    }
    public void limparCampos(){
        txtCodigo.setText("");
        txtNome.setText("");
        txtPreco.setText("");
               
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btMenu;
    private javax.swing.JButton btRemover;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbCodigo1;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPreco;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
