
package tela;

import javax.swing.JOptionPane;
import modelo.Usuario;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btLoginEntra = new javax.swing.JButton();
        lbUsuario = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        tfLoginUsuario = new javax.swing.JTextField();
        pfLoginSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btLoginEntra.setText("Entrar");
        btLoginEntra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginEntraActionPerformed(evt);
            }
        });
        getContentPane().add(btLoginEntra, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 230, -1));

        lbUsuario.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lbUsuario.setText("Usuário:");
        getContentPane().add(lbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, 20));

        lbSenha.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(255, 255, 255));
        lbSenha.setText("Senha:");
        getContentPane().add(lbSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, -1, 21));

        tfLoginUsuario.setForeground(new java.awt.Color(0, 0, 0));
        tfLoginUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLoginUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(tfLoginUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 230, -1));

        pfLoginSenha.setForeground(new java.awt.Color(0, 0, 0));
        pfLoginSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfLoginSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(pfLoginSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 230, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sistema Bike");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/35c70bb9-97a2-4760-a939-346c55160d6e.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfLoginUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLoginUsuarioActionPerformed

        //JOptionPane.showMessageDialog(this, "Login efetuado com sucesso.");
    }//GEN-LAST:event_tfLoginUsuarioActionPerformed

    private void btLoginEntraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginEntraActionPerformed
       if(tfLoginUsuario.getText().equalsIgnoreCase("admin")&& pfLoginSenha.getText().equalsIgnoreCase("admin")){
            MenuPrincipal telaMain = new MenuPrincipal();
            telaMain.setVisible(true);
            dispose();
       }/*else if(!tfLoginUsuario.getText().equals("admin")){
           Usuario user = new Usuario();
           user.setNomeUsuario(tfLoginUsuario.getText());
           user.setSenhaUsuario(pfLoginSenha.getText());
           user.validaUsuario(user);
           MenuPrincipal telaMain = new MenuPrincipal();
           telaMain.setVisible(true);
           dispose();
       }*/
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLoginEntra;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField pfLoginSenha;
    private javax.swing.JTextField tfLoginUsuario;
    // End of variables declaration//GEN-END:variables
}
