package view;

import javax.swing.JFrame;

/**
 *
 * @author Luciano
 */
public class TelaGeral extends javax.swing.JFrame {

    public TelaGeral() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblProdutos = new javax.swing.JLabel();
        lblIconeProduto = new javax.swing.JLabel();
        lblRelatorios = new javax.swing.JLabel();
        lblIconeEntrada = new javax.swing.JLabel();
        lblEmbalagens = new javax.swing.JLabel();
        lblIconeEmbalagens = new javax.swing.JLabel();
        lblEntrada = new javax.swing.JLabel();
        lblSaida = new javax.swing.JLabel();
        lblIconeSaida = new javax.swing.JLabel();
        lblIconeRelatorios = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProdutos.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(0, 102, 204));
        lblProdutos.setText("PRODUTOS");
        jPanel1.add(lblProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        lblIconeProduto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIconeProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/product.png"))); // NOI18N
        lblIconeProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconeProdutoMouseClicked(evt);
            }
        });
        jPanel1.add(lblIconeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 92));

        lblRelatorios.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblRelatorios.setForeground(new java.awt.Color(0, 102, 204));
        lblRelatorios.setText("RELATÓRIOS");
        jPanel1.add(lblRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        lblIconeEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/arrow_circle_right_icon_155798.png"))); // NOI18N
        lblIconeEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconeEntradaMouseClicked(evt);
            }
        });
        jPanel1.add(lblIconeEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        lblEmbalagens.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblEmbalagens.setForeground(new java.awt.Color(0, 102, 204));
        lblEmbalagens.setText("EMBALAGENS");
        jPanel1.add(lblEmbalagens, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        lblIconeEmbalagens.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/box_icon_155728 (1).png"))); // NOI18N
        lblIconeEmbalagens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconeEmbalagensMouseClicked(evt);
            }
        });
        jPanel1.add(lblIconeEmbalagens, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        lblEntrada.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblEntrada.setForeground(new java.awt.Color(0, 102, 204));
        lblEntrada.setText("ENTRADA");
        jPanel1.add(lblEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        lblSaida.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblSaida.setForeground(new java.awt.Color(0, 102, 204));
        lblSaida.setText("SAÍDA");
        jPanel1.add(lblSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        lblIconeSaida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/arrow_circle_left_icon_155799.png"))); // NOI18N
        lblIconeSaida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconeSaidaMouseClicked(evt);
            }
        });
        jPanel1.add(lblIconeSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, -1));

        lblIconeRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/log_icon_155172.png"))); // NOI18N
        lblIconeRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIconeRelatoriosMouseClicked(evt);
            }
        });
        jPanel1.add(lblIconeRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Logo.png"))); // NOI18N
        jLabel3.setText("Imagem");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, -20, 790, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1000, 612));

        jPanel2.setBackground(new java.awt.Color(0, 0, 140));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 130));

        jPanel3.setBackground(new java.awt.Color(0, 0, 140));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("© ECOMMERCE REGISTER SOLUTIONS - TODOS OS DIREITOS RESERVADOS © ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 682, 1000, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblIconeProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconeProdutoMouseClicked
        TelaProduto telaProduto = new TelaProduto();

        telaProduto.setVisible(true);

    }//GEN-LAST:event_lblIconeProdutoMouseClicked

    private void lblIconeEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconeEntradaMouseClicked
        DialogEntrada dialogEntrada = new DialogEntrada(new javax.swing.JFrame(), true);

        dialogEntrada.setVisible(true);

    }//GEN-LAST:event_lblIconeEntradaMouseClicked

    private void lblIconeSaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconeSaidaMouseClicked
        DialogSaida dialogSaida = new DialogSaida(new javax.swing.JFrame(), true);

        dialogSaida.setVisible(true);

    }//GEN-LAST:event_lblIconeSaidaMouseClicked

    private void lblIconeRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconeRelatoriosMouseClicked
        DialogRelatorios dialogRelatorios = new DialogRelatorios(new javax.swing.JFrame(), true);

        dialogRelatorios.setVisible(true);
    }//GEN-LAST:event_lblIconeRelatoriosMouseClicked

    private void lblIconeEmbalagensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIconeEmbalagensMouseClicked
        DialogEmbalagem dialogEmbalagem = new DialogEmbalagem(new javax.swing.JFrame(), true);

        dialogEmbalagem.setVisible(true);

    }//GEN-LAST:event_lblIconeEmbalagensMouseClicked

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
            java.util.logging.Logger.getLogger(TelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGeral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblEmbalagens;
    private javax.swing.JLabel lblEntrada;
    private javax.swing.JLabel lblIconeEmbalagens;
    private javax.swing.JLabel lblIconeEntrada;
    private javax.swing.JLabel lblIconeProduto;
    private javax.swing.JLabel lblIconeRelatorios;
    private javax.swing.JLabel lblIconeSaida;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblRelatorios;
    private javax.swing.JLabel lblSaida;
    // End of variables declaration//GEN-END:variables
}
