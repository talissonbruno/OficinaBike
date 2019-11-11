
package tela;


public class MenuPrincipal extends javax.swing.JFrame {

    
    public MenuPrincipal() {
        initComponents(); 
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        miMainUsuario = new javax.swing.JMenuItem();
        jtTelaCliente = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        mMainSair = new javax.swing.JMenu();
        miMainSair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        jMenu2.setText("jMenu2");

        jMenu4.setText("File");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar1.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/folder_system_15426.png"))); // NOI18N
        jMenu7.setText("Cadastros");

        miMainUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Usuario01.png"))); // NOI18N
        miMainUsuario.setText("Usuários");
        miMainUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMainUsuarioActionPerformed(evt);
            }
        });
        jMenu7.add(miMainUsuario);

        jtTelaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cliente01.png"))); // NOI18N
        jtTelaCliente.setText("Clientes");
        jtTelaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTelaClienteActionPerformed(evt);
            }
        });
        jMenu7.add(jtTelaCliente);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/fonecedor_02.png"))); // NOI18N
        jMenuItem3.setText("Fornecedor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem3);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/vendedora023.png"))); // NOI18N
        jMenuItem5.setText("Vendedor");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/bike-5_icon-icons.com_66458.png"))); // NOI18N
        jMenuItem6.setText("Produto");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/company_22169.png"))); // NOI18N
        jMenuItem7.setText("Empresa");
        jMenu7.add(jMenuItem7);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/maps_22147.png"))); // NOI18N
        jMenu3.setText("Endereço/Cidade/UF");

        jMenuItem8.setText("UF");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("CEP");
        jMenu3.add(jMenuItem9);

        jMenuItem10.setText("Cidade");
        jMenu3.add(jMenuItem10);

        jMenu7.add(jMenu3);

        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/iEngrenages_24182.png"))); // NOI18N
        jMenuItem23.setText("Parâmetro");
        jMenu7.add(jMenuItem23);

        jMenuBar2.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/administrative_tools_15497.png"))); // NOI18N
        jMenu8.setText("Movimentações");

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/iconfindercashiersaleshop4177567-115971_115944.png"))); // NOI18N
        jMenuItem11.setText("Entrada de produto ");
        jMenu8.add(jMenuItem11);

        jMenuItem12.setText("Pedido de venda(Faturamento)  ");
        jMenu8.add(jMenuItem12);

        jMenu6.setText("Entrada /Saida de contas pagar  ");

        jMenuItem13.setText("Entrada a pagar");
        jMenu6.add(jMenuItem13);

        jMenu8.add(jMenu6);

        jMenu9.setText("Entrada/Saida de conta receber");

        jMenuItem16.setText("Entrada de receber");
        jMenu9.add(jMenuItem16);

        jMenu8.add(jMenu9);

        jMenuItem14.setText("Ordem de Serviço(Prestaça de serviço)  ");
        jMenu8.add(jMenuItem14);

        jMenuBar2.add(jMenu8);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/folder_my_documents_15435.png"))); // NOI18N
        jMenu1.setText("Relatorios");

        jMenuItem18.setText("Venda de produto");
        jMenu1.add(jMenuItem18);

        jMenuItem19.setText("Fluxo de caixa.");
        jMenu1.add(jMenuItem19);

        jMenuItem20.setText("Conta a pagar & pagar; ");
        jMenu1.add(jMenuItem20);

        jMenuItem21.setText("Conta a receber & receber;");
        jMenu1.add(jMenuItem21);

        jMenuItem22.setText("Ordem de Serviço ");
        jMenu1.add(jMenuItem22);

        jMenuBar2.add(jMenu1);

        mMainSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/exit-symbol-1_icon-icons.com_70162.png"))); // NOI18N
        mMainSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mMainSairActionPerformed(evt);
            }
        });

        miMainSair.setText("Troca Usuario");
        miMainSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMainSairActionPerformed(evt);
            }
        });
        mMainSair.add(miMainSair);

        jMenuBar2.add(mMainSair);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1035, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mMainSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mMainSairActionPerformed
       
    }//GEN-LAST:event_mMainSairActionPerformed

    private void miMainSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMainSairActionPerformed
            Login telaLogin = new Login();
            telaLogin.setVisible(true);
            dispose();
    }//GEN-LAST:event_miMainSairActionPerformed

    private void miMainUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMainUsuarioActionPerformed
        TelaUsuario telaUsuario = new TelaUsuario();
        add(telaUsuario);
        telaUsuario.setVisible(true);
        
    }//GEN-LAST:event_miMainUsuarioActionPerformed

    private void jtTelaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTelaClienteActionPerformed
        TelaCliente telaCliente = new TelaCliente();
        add(telaCliente);
        telaCliente.setVisible(true);
    }//GEN-LAST:event_jtTelaClienteActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        TelaFornecedor telaFornecedor = new TelaFornecedor();
        add(telaFornecedor);
        telaFornecedor.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jtTelaCliente;
    private javax.swing.JMenu mMainSair;
    private javax.swing.JMenuItem miMainSair;
    private javax.swing.JMenuItem miMainUsuario;
    // End of variables declaration//GEN-END:variables
}
