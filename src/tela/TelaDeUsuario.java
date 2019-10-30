package tela;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

public class TelaDeUsuario extends javax.swing.JInternalFrame {
    
    private boolean alterar;
       
    public TelaDeUsuario() {

        initComponents();
        btNovoUsuario.setEnabled(true);
        btConsultarUsuario.setEnabled(true);
        btExcluirUsuario.setEnabled(true);
        btEditarUsuario.setEnabled(true);
        btSairUsuario.setEnabled(true);
        btCancelarUsuario.setEnabled(false);
        btSalvarUsuario.setEnabled(false);
        tfNomeUsuario.setEditable(false);
        pfSenhaUsuario.setEnabled(false);
        alterar=false;
        
        DefaultTableModel dtm = (DefaultTableModel) tabelaUsuario.getModel();
        for (int i = 0; i < Usuario.usuarios.size(); i++) {
            dtm.addRow(new Object[]{Usuario.usuarios.get(i).getNomeUsuario(), Usuario.usuarios.get(i).getSenhaUsuario()});
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pfSenhaUsuario = new javax.swing.JPasswordField();
        tfNomeUsuario = new javax.swing.JTextField();
        btNovoUsuario = new javax.swing.JButton();
        btEditarUsuario = new javax.swing.JButton();
        btExcluirUsuario = new javax.swing.JButton();
        btSairUsuario = new javax.swing.JButton();
        lbTotalUsuario = new javax.swing.JLabel();
        btCancelarUsuario = new javax.swing.JButton();
        btSalvarUsuario = new javax.swing.JButton();
        btConsultarUsuario = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Usuário"));

        jLabel1.setText("Nome do Usuário:");

        jLabel2.setText("Senha:");

        pfSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfSenhaUsuarioActionPerformed(evt);
            }
        });

        tfNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeUsuarioActionPerformed(evt);
            }
        });

        btNovoUsuario.setText("Novo");
        btNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoUsuarioActionPerformed(evt);
            }
        });

        btEditarUsuario.setText("Editar");

        btExcluirUsuario.setText("Excluir");
        btExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirUsuarioActionPerformed(evt);
            }
        });

        btSairUsuario.setText("Sair");
        btSairUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairUsuarioActionPerformed(evt);
            }
        });

        lbTotalUsuario.setText("Quantidade de usuario: 0");

        btCancelarUsuario.setText("Cancelar");
        btCancelarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarUsuarioActionPerformed(evt);
            }
        });

        btSalvarUsuario.setText("Salvar");
        btSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarUsuarioActionPerformed(evt);
            }
        });

        btConsultarUsuario.setText("Consulta");
        btConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btNovoUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEditarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluirUsuario)
                .addGap(8, 8, 8)
                .addComponent(btConsultarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSairUsuario)
                .addGap(0, 53, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTotalUsuario)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btCancelarUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvarUsuario))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addComponent(pfSenhaUsuario)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pfSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelarUsuario)
                    .addComponent(btSalvarUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovoUsuario)
                    .addComponent(btEditarUsuario)
                    .addComponent(btExcluirUsuario)
                    .addComponent(btSairUsuario)
                    .addComponent(btConsultarUsuario))
                .addGap(18, 18, 18)
                .addComponent(lbTotalUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuários"));

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuario);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pfSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfSenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfSenhaUsuarioActionPerformed

    private void tfNomeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeUsuarioActionPerformed
    
    
    private void btNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoUsuarioActionPerformed
        String nomeUsuario = tfNomeUsuario.getText();
        String senhaUsuario = pfSenhaUsuario.getText();
       
        tfNomeUsuario.setEditable(true);
        pfSenhaUsuario.setEnabled(true);
        btNovoUsuario.setEnabled(false);
        btConsultarUsuario.setEnabled(false);
        btExcluirUsuario.setEnabled(false);
        btEditarUsuario.setEnabled(false);
        btSairUsuario.setEnabled(false);
        btSalvarUsuario.setEnabled(true);
        btCancelarUsuario.setEnabled(true);
        
        tfNomeUsuario.setEditable(true);
        pfSenhaUsuario.setEnabled(true);
    }//GEN-LAST:event_btNovoUsuarioActionPerformed

    private void btExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirUsuarioActionPerformed
        btSalvarUsuario.setEnabled(false);
    }//GEN-LAST:event_btExcluirUsuarioActionPerformed

    private void btSairUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairUsuarioActionPerformed
        btSalvarUsuario.setEnabled(false);
        this.dispose();
    }//GEN-LAST:event_btSairUsuarioActionPerformed

    private void btCancelarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarUsuarioActionPerformed
        tfNomeUsuario.setText("");
        pfSenhaUsuario.setText("");
        btNovoUsuario.setEnabled(true);
        btConsultarUsuario.setEnabled(true);
        btExcluirUsuario.setEnabled(true);
        btEditarUsuario.setEnabled(true);
        btSairUsuario.setEnabled(true);
        btCancelarUsuario.setEnabled(false);
        btSalvarUsuario.setEnabled(false);
        tfNomeUsuario.setEditable(false);
        pfSenhaUsuario.setEnabled(false);
    }//GEN-LAST:event_btCancelarUsuarioActionPerformed

    private void btSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarUsuarioActionPerformed
        
        if( tfNomeUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"O nome de usuario não pode fica em branco!");
        }else{

            String nomeUsuario = tfNomeUsuario.getText();
            String senhaUsuario = pfSenhaUsuario.getText();
            Usuario usuario = new Usuario();
            usuario.cadastroUsuario(1, nomeUsuario, senhaUsuario);
            
            if(alterar==true){
                alterar = false;
                int pos = tabelaUsuario.getSelectedRow();
                Usuario.usuarios.get(pos).setNomeUsuario(nomeUsuario);
               Usuario.usuarios.get(pos).setSenhaUsuario(senhaUsuario);
                
                tabelaUsuario.setValueAt(pos, pos, 0);
                tabelaUsuario.setValueAt(nomeUsuario, pos, 1);
                
                JOptionPane.showMessageDialog(null, "Usuario cadastrado com Sucesso.");
            }else{
                Usuario.usuarios.add(usuario);
                DefaultTableModel dtm = (DefaultTableModel) tabelaUsuario.getModel();
                      
                dtm.addRow(new Object[]{nomeUsuario,senhaUsuario});

                JOptionPane.showMessageDialog(null, "Usuario cadastrado com Sucesso.");
            }
            tfNomeUsuario.setText("");
            pfSenhaUsuario.setText("");
        }
        btNovoUsuario.setEnabled(true);
        btConsultarUsuario.setEnabled(true);
        btExcluirUsuario.setEnabled(true);
        btEditarUsuario.setEnabled(true);
        btSairUsuario.setEnabled(true);
        btCancelarUsuario.setEnabled(false);
        btSalvarUsuario.setEnabled(false);
        tfNomeUsuario.setEditable(false);
        pfSenhaUsuario.setEnabled(false);
        
        
    }//GEN-LAST:event_btSalvarUsuarioActionPerformed

    private void btConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarUsuarioActionPerformed
        btSalvarUsuario.setEnabled(false);
    }//GEN-LAST:event_btConsultarUsuarioActionPerformed

    private void tabelaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarUsuario;
    private javax.swing.JButton btConsultarUsuario;
    private javax.swing.JButton btEditarUsuario;
    private javax.swing.JButton btExcluirUsuario;
    private javax.swing.JButton btNovoUsuario;
    private javax.swing.JButton btSairUsuario;
    private javax.swing.JButton btSalvarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTotalUsuario;
    private javax.swing.JPasswordField pfSenhaUsuario;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField tfNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
