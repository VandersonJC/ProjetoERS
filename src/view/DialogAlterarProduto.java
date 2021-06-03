/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.*;
import entities.*;
import java.io.*;

/**
 *
 * @author Vanderson
 */
public class DialogAlterarProduto extends javax.swing.JDialog {

    /**
     * Creates new form DialogAlterarProduto
     */
    public DialogAlterarProduto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    Produto produto;
    File imagem;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpInferior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tpAlterarProduto = new javax.swing.JTabbedPane();
        jpProduto = new javax.swing.JPanel();
        jpColocarImagem = new javax.swing.JPanel();
        lblImagem = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfSku = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaDescricao = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        tfPreco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfAltura = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfEstoque = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfEstoqueMinimo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfCusto = new javax.swing.JTextField();
        tfComprimento = new javax.swing.JTextField();
        tfLargura = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfGarantia = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        cbEmbalagem = new javax.swing.JComboBox<>();
        btnAbrirImagem = new javax.swing.JButton();
        tfPeso = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jpListaPrecos = new javax.swing.JPanel();
        btnVoltar1 = new javax.swing.JButton();
        sDescricao = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        sDescricao1 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpSuperior.setBackground(new java.awt.Color(0, 0, 140));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGO ERS");

        javax.swing.GroupLayout jpSuperiorLayout = new javax.swing.GroupLayout(jpSuperior);
        jpSuperior.setLayout(jpSuperiorLayout);
        jpSuperiorLayout.setHorizontalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSuperiorLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(704, Short.MAX_VALUE))
        );
        jpSuperiorLayout.setVerticalGroup(
            jpSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jpSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        jpInferior.setBackground(new java.awt.Color(0, 0, 140));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("© ECOMMERCE REGISTER SOLUTIONS - TODOS OS DIREITOS RESERVADOS © ");

        javax.swing.GroupLayout jpInferiorLayout = new javax.swing.GroupLayout(jpInferior);
        jpInferior.setLayout(jpInferiorLayout);
        jpInferiorLayout.setHorizontalGroup(
            jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpInferiorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jpInferiorLayout.setVerticalGroup(
            jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
            .addGroup(jpInferiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpInferiorLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jpInferior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 800, 20));

        jpProduto.setBackground(new java.awt.Color(255, 255, 255));
        jpProduto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpColocarImagem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 140)));

        lblImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagem.setText("Imagem");

        javax.swing.GroupLayout jpColocarImagemLayout = new javax.swing.GroupLayout(jpColocarImagem);
        jpColocarImagem.setLayout(jpColocarImagemLayout);
        jpColocarImagemLayout.setHorizontalGroup(
            jpColocarImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
        );
        jpColocarImagemLayout.setVerticalGroup(
            jpColocarImagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );

        jpProduto.add(jpColocarImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        tfNome.setText("Nome");
        jpProduto.add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 65, 480, -1));

        jLabel3.setText("SKU:");
        jpProduto.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 22, -1, -1));

        tfSku.setText("Sku");
        tfSku.setEnabled(false);
        jpProduto.add(tfSku, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 110, 22));

        jLabel4.setText("Garantia:");
        jpProduto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, 20));

        tfEan.setText("Ean");
        jpProduto.add(tfEan, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 110, 110, 22));

        jLabel5.setText("EAN:");
        jpProduto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 113, -1, -1));

        tfMarca.setText("Marca");
        jpProduto.add(tfMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 110, 22));

        jLabel6.setText("Marca:");
        jpProduto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, 20));

        jtaDescricao.setColumns(20);
        jtaDescricao.setRows(5);
        jScrollPane1.setViewportView(jtaDescricao);

        jpProduto.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 510, 130));

        jLabel7.setText("Descrição:");
        jpProduto.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        tfPreco.setText("Preço");
        jpProduto.add(tfPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 152, 110, 22));

        jLabel8.setText("Altura:");
        jpProduto.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, 20));

        tfAltura.setText("A");
        tfAltura.setEnabled(false);
        jpProduto.add(tfAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 110, 22));

        jLabel9.setText("Custo:");
        jpProduto.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, 20));

        tfEstoque.setText("Unidades");
        jpProduto.add(tfEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 110, 22));

        jLabel10.setText("Estoque:");
        jpProduto.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, 20));

        jLabel11.setText("Estoque minímo:");
        jpProduto.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, 20));

        tfEstoqueMinimo.setText("Unidades");
        jpProduto.add(tfEstoqueMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 110, 22));

        jLabel12.setText("Preço:");
        jpProduto.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 152, -1, 20));

        tfCusto.setText("Custo");
        jpProduto.add(tfCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 110, 22));

        tfComprimento.setText("C");
        tfComprimento.setEnabled(false);
        jpProduto.add(tfComprimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 110, 22));

        tfLargura.setText("L");
        tfLargura.setEnabled(false);
        jpProduto.add(tfLargura, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 110, 22));

        jLabel13.setText("Embalagem:");
        jpProduto.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, 20));

        jLabel14.setText("Comprimento:");
        jpProduto.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, 20));

        jLabel15.setText("Largura:");
        jpProduto.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, -1, 20));

        tfGarantia.setText("Garantia");
        jpProduto.add(tfGarantia, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 110, 22));

        jLabel16.setText("Nome:");
        jpProduto.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 68, -1, -1));

        btnSalvar.setBackground(new java.awt.Color(0, 0, 140));
        btnSalvar.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jpProduto.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, -1, -1));

        btnVoltar.setBackground(new java.awt.Color(0, 0, 140));
        btnVoltar.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jpProduto.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, -1, -1));

        cbEmbalagem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personalizado", "Caixa 1", "Caixa 2", "Caixa 3" }));
        cbEmbalagem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbEmbalagemItemStateChanged(evt);
            }
        });
        jpProduto.add(cbEmbalagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 110, 22));

        btnAbrirImagem.setBackground(new java.awt.Color(0, 0, 140));
        btnAbrirImagem.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnAbrirImagem.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirImagem.setText("Abrir Imagem");
        btnAbrirImagem.setToolTipText("Clique para importar a imagem");
        btnAbrirImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirImagemActionPerformed(evt);
            }
        });
        jpProduto.add(btnAbrirImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, -1, -1));

        tfPeso.setText("Peso");
        jpProduto.add(tfPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 110, 22));

        jLabel17.setText("Peso:");
        jpProduto.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, 20));

        tpAlterarProduto.addTab("  Produto", jpProduto);

        jpListaPrecos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar1.setBackground(new java.awt.Color(0, 0, 140));
        btnVoltar1.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnVoltar1.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar1.setText("Adicionar Preço");
        btnVoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar1ActionPerformed(evt);
            }
        });
        jpListaPrecos.add(btnVoltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));

        sDescricao.setBackground(new java.awt.Color(0, 0, 140));
        jpListaPrecos.add(sDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 53, 160, -1));

        jTextField1.setText("Desc");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jpListaPrecos.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 38, 160, -1));

        sDescricao1.setBackground(new java.awt.Color(0, 0, 140));
        jpListaPrecos.add(sDescricao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 52, 160, -1));

        jTextField2.setText("Preço");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jpListaPrecos.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 37, 160, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jpListaPrecos.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 780, 460));

        tpAlterarProduto.addTab("Lista de preços", jpListaPrecos);

        getContentPane().add(tpAlterarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 800, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        dispose();

    }//GEN-LAST:event_btnVoltarActionPerformed

    private void cbEmbalagemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbEmbalagemItemStateChanged

        Conexao_Embalagem conexao_Embalagem = new Conexao_Embalagem();

        String itemSelecionado = (String) cbEmbalagem.getSelectedItem();
        Double comprimento = null;
        Double largura = null;
        Double altura = null;

        for (int i = 0; i < conexao_Embalagem.listar().size(); i++) {

            if (itemSelecionado.equals(conexao_Embalagem.listar().get(i).getDescricao())) {

                comprimento = conexao_Embalagem.listar().get(i).getComprimento();
                altura = conexao_Embalagem.listar().get(i).getAltura();
                largura = conexao_Embalagem.listar().get(i).getLargura();

            }

        }

        tfComprimento.setText(Double.toString(comprimento));
        tfAltura.setText(Double.toString(altura));
        tfLargura.setText(Double.toString(largura));
    }//GEN-LAST:event_cbEmbalagemItemStateChanged

    private void btnAbrirImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirImagemActionPerformed

        //imagem = selecionarImagem();
        lblImagem.setText("");
        //abrirImagem(imagem);

    }//GEN-LAST:event_btnAbrirImagemActionPerformed

    private void btnVoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltar1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(DialogAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogAlterarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogAlterarProduto dialog = new DialogAlterarProduto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrirImagem;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnVoltar1;
    private javax.swing.JComboBox<String> cbEmbalagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel jpColocarImagem;
    private javax.swing.JPanel jpInferior;
    private javax.swing.JPanel jpListaPrecos;
    private javax.swing.JPanel jpProduto;
    private javax.swing.JPanel jpSuperior;
    private javax.swing.JTextArea jtaDescricao;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JSeparator sDescricao;
    private javax.swing.JSeparator sDescricao1;
    private javax.swing.JTextField tfAltura;
    private javax.swing.JTextField tfComprimento;
    private javax.swing.JTextField tfCusto;
    private javax.swing.JTextField tfEan;
    private javax.swing.JTextField tfEstoque;
    private javax.swing.JTextField tfEstoqueMinimo;
    private javax.swing.JTextField tfGarantia;
    private javax.swing.JTextField tfLargura;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPeso;
    private javax.swing.JTextField tfPreco;
    private javax.swing.JTextField tfSku;
    private javax.swing.JTabbedPane tpAlterarProduto;
    // End of variables declaration//GEN-END:variables
}
