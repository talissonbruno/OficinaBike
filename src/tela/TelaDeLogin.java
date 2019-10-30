
package tela;

import javax.swing.JOptionPane;
import modelo.Usuario;


public class TelaDeLogin extends javax.swing.JFrame {

    public TelaDeLogin() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btLoginEntra = new javax.swing.JButton();
        btLoginLimpa = new javax.swing.JButton();
        lbUsuario = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        tfLoginUsuario = new javax.swing.JTextField();
        pfLoginSenha = new javax.swing.JPasswordField();
        btLoginSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btLoginEntra.setText("Entrar");
        btLoginEntra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginEntraActionPerformed(evt);
            }
        });

        btLoginLimpa.setText("Limpa");
        btLoginLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginLimpaActionPerformed(evt);
            }
        });

        lbUsuario.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbUsuario.setText("Usuário:");

        lbSenha.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        lbSenha.setText("Senha:");

        tfLoginUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLoginUsuarioActionPerformed(evt);
            }
        });

        pfLoginSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfLoginSenhaActionPerformed(evt);
            }
        });

        btLoginSair.setText("Sair");
        btLoginSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginSairActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/35c70bb9-97a2-4760-a939-346c55160d6e.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Seja  bem vindo ao Sistema Bike");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/java-logo-14.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btLoginSair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLoginLimpa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLoginEntra))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbUsuario)
                                    .addComponent(lbSenha))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfLoginUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                    .addComponent(pfLoginSenha)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel4)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuario)
                    .addComponent(tfLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfLoginSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLoginLimpa)
                    .addComponent(btLoginEntra)
                    .addComponent(btLoginSair))
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginLimpaActionPerformed
        tfLoginUsuario.setText("");
        pfLoginSenha.setText("");
    }//GEN-LAST:event_btLoginLimpaActionPerformed

    private void tfLoginUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLoginUsuarioActionPerformed

        //JOptionPane.showMessageDialog(this, "Login efetuado com sucesso.");
    }//GEN-LAST:event_tfLoginUsuarioActionPerformed

    private void btLoginSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btLoginSairActionPerformed

    private void btLoginEntraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginEntraActionPerformed
       if(tfLoginUsuario.getText().equalsIgnoreCase("admin")&& pfLoginSenha.getText().equalsIgnoreCase("admin")){
            TelaPrincipal telaMain = new TelaPrincipal();
            telaMain.setVisible(true);
            dispose();
       }else if(!tfLoginUsuario.getText().equals("admin")){
           Usuario user = new Usuario();
           user.setNomeUsuario(tfLoginUsuario.getText());
           user.setSenhaUsuario(pfLoginSenha.getText());
           user.validaUsuario(user);
           TelaPrincipal telaMain = new TelaPrincipal();
           telaMain.setVisible(true);
           dispose();
       }
       else{
           JOptionPane.showMessageDialog(this, "Usuário invalido");
       }
    }//GEN-LAST:event_btLoginEntraActionPerformed

    private void pfLoginSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfLoginSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfLoginSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLoginEntra;
    private javax.swing.JButton btLoginLimpa;
    private javax.swing.JButton btLoginSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField pfLoginSenha;
    private javax.swing.JTextField tfLoginUsuario;
    // End of variables declaration//GEN-END:variables
}
