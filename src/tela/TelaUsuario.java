package tela;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;

public class TelaUsuario extends javax.swing.JInternalFrame {
    
    private boolean alterar;
       
    public TelaUsuario() {

        initComponents();
        btNovoUsuario.setEnabled(true);
        btConsultarUsuario.setEnabled(true);
        btExcluirUsuario.setEnabled(true);
        btEditarUsuario.setEnabled(true);
        btCancelarUsuario.setEnabled(false);
        btSalvarUsuario.setEnabled(false);
        tfNomeUsuario.setEditable(false);
        pfSenhaUsuario.setEnabled(false);
        jRadioButtonAdministador.setEnabled(false);
        jRadioButtonGerente.setEnabled(false);
        jRadioButtonVendedor.setEnabled(false);
        alterar=false;
        
        DefaultTableModel dtm = (DefaultTableModel) tabelaUsuario.getModel();
        for (int i = 0; i < Usuario.usuarios.size(); i++) {
            dtm.addRow(new Object[]{Usuario.usuarios.get(i).getNomeUsuario(), Usuario.usuarios.get(i).getSenhaUsuario()});
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupUsuario = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btCancelarUsuario = new javax.swing.JButton();
        btSalvarUsuario = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButtonGerente = new javax.swing.JRadioButton();
        jRadioButtonVendedor = new javax.swing.JRadioButton();
        jRadioButtonAdministador = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        tfNomeUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pfSenhaUsuario = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuario = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btExcluirUsuario = new javax.swing.JButton();
        btConsultarUsuario = new javax.swing.JButton();
        btEditarUsuario = new javax.swing.JButton();
        btNovoUsuario = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Usuário"));

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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de usuário"));

        buttonGroupUsuario.add(jRadioButtonGerente);
        jRadioButtonGerente.setText("Gerente");
        jRadioButtonGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGerenteActionPerformed(evt);
            }
        });

        buttonGroupUsuario.add(jRadioButtonVendedor);
        jRadioButtonVendedor.setText("Vendedor");

        buttonGroupUsuario.add(jRadioButtonAdministador);
        jRadioButtonAdministador.setText("Administrador");
        jRadioButtonAdministador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAdministadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonAdministador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonGerente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonVendedor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonAdministador)
                    .addComponent(jRadioButtonGerente)
                    .addComponent(jRadioButtonVendedor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));
        jPanel6.setToolTipText("");

        tfNomeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuário:");

        jLabel2.setText("Senha:");

        pfSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfSenhaUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Codigo do Usuario:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(164, 164, 164))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfSenhaUsuario)
                            .addComponent(tfNomeUsuario))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btCancelarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelarUsuario)
                    .addComponent(btSalvarUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuários"));

        tabelaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Senha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
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
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Comandos"));

        btExcluirUsuario.setText("Excluir");
        btExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirUsuarioActionPerformed(evt);
            }
        });

        btConsultarUsuario.setText("Consulta");
        btConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarUsuarioActionPerformed(evt);
            }
        });

        btEditarUsuario.setText("Editar");

        btNovoUsuario.setText("Incluir");
        btNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btExcluirUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConsultarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovoUsuario)
                    .addComponent(btEditarUsuario)
                    .addComponent(btExcluirUsuario)
                    .addComponent(btConsultarUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
     
        btSalvarUsuario.setEnabled(true);
        btCancelarUsuario.setEnabled(true);
                
        tfNomeUsuario.setEditable(true);
        pfSenhaUsuario.setEnabled(true);
        jRadioButtonAdministador.setEnabled(true);
        jRadioButtonGerente.setEnabled(true);
        jRadioButtonVendedor.setEnabled(true);
    }//GEN-LAST:event_btNovoUsuarioActionPerformed

    private void btExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirUsuarioActionPerformed
        btSalvarUsuario.setEnabled(false);
    }//GEN-LAST:event_btExcluirUsuarioActionPerformed

    private void btCancelarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarUsuarioActionPerformed
        tfNomeUsuario.setText("");
        pfSenhaUsuario.setText("");
        btNovoUsuario.setEnabled(true);
        btConsultarUsuario.setEnabled(true);
        btExcluirUsuario.setEnabled(true);
        btEditarUsuario.setEnabled(true);
     
        btCancelarUsuario.setEnabled(false);
        btSalvarUsuario.setEnabled(false);
        tfNomeUsuario.setEditable(false);
        pfSenhaUsuario.setEnabled(false);
        jRadioButtonAdministador.setEnabled(false);
        jRadioButtonGerente.setEnabled(false);
        jRadioButtonVendedor.setEnabled(false);
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
        
        btCancelarUsuario.setEnabled(false);
        btSalvarUsuario.setEnabled(false);
        tfNomeUsuario.setEditable(false);
        pfSenhaUsuario.setEnabled(false);
        jRadioButtonAdministador.setEnabled(false);
        jRadioButtonGerente.setEnabled(false);
        jRadioButtonVendedor.setEnabled(false);
        
        
    }//GEN-LAST:event_btSalvarUsuarioActionPerformed

    private void btConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarUsuarioActionPerformed
        btSalvarUsuario.setEnabled(false);
    }//GEN-LAST:event_btConsultarUsuarioActionPerformed

    private void tabelaUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaUsuarioMouseClicked

    private void jRadioButtonAdministadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAdministadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAdministadorActionPerformed

    private void jRadioButtonGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonGerenteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarUsuario;
    private javax.swing.JButton btConsultarUsuario;
    private javax.swing.JButton btEditarUsuario;
    private javax.swing.JButton btExcluirUsuario;
    private javax.swing.JButton btNovoUsuario;
    private javax.swing.JButton btSalvarUsuario;
    private javax.swing.ButtonGroup buttonGroupUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButtonAdministador;
    private javax.swing.JRadioButton jRadioButtonGerente;
    private javax.swing.JRadioButton jRadioButtonVendedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField pfSenhaUsuario;
    private javax.swing.JTable tabelaUsuario;
    private javax.swing.JTextField tfNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
