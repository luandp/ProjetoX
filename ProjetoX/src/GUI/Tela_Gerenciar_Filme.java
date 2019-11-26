package GUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto_ii_periodo_poo.classes.Filme;
import projeto_ii_periodo_poo.negocio.Regra_Negocio_Filme;

public class Tela_Gerenciar_Filme extends javax.swing.JFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modeloFilme = new DefaultTableModel();
    ArrayList<Filme> arr = new ArrayList<>();

    public Tela_Gerenciar_Filme() {
        initComponents();
        this.setLocationRelativeTo(null);
        modeloFilme.setColumnIdentifiers(new String[]{"Nome", "Código", "Descriçao", "tipo", "Valor"});
        jTableCadasFilm.setModel(modeloFilme);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTipo = new javax.swing.JLabel();
        jBCadastrar = new javax.swing.JButton();
        jTextBuscar = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCadasFilm = new javax.swing.JTable();
        jBRemover = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento Filme - Loca'Videos");
        setResizable(false);

        jLTipo.setText("Nome");

        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jTableCadasFilm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableCadasFilm);

        jBRemover.setText("Remover");
        jBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoverActionPerformed(evt);
            }
        });

        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBRemover)
                            .addComponent(jBCadastrar)
                            .addComponent(jButton1))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLTipo)
                        .addGap(173, 556, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(187, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jBRemover)
                        .addGap(18, 18, 18)
                        .addComponent(jBCadastrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 23, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Nome", "Código", "Descriçao", "tipo", "Valor"});
        Regra_Negocio_Filme regra = new Regra_Negocio_Filme();
        String nome = "";
        nome = jTextBuscar.getText();
        try {
            arr = regra.buscaFilme(nome);
            for (int i = 0; i < arr.size(); i++) {
                model.addRow(new String[]{arr.get(i).getNome(), String.valueOf(arr.get(i).getCodigo()), arr.get(i).getDescriçao(), arr.get(i).getTipo(), String.valueOf(arr.get(i).getValor())});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jTableCadasFilm.setModel(model);
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        Tela_Cadastrar_Filme ca = new Tela_Cadastrar_Filme();
        ca.show();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Nome", "Código", "Descriçao", "tipo", "Valor"});
        jTableCadasFilm.setModel(model);

    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoverActionPerformed
        Regra_Negocio_Filme re = new Regra_Negocio_Filme();
        int index = jTableCadasFilm.getSelectedRow();
        try {
            if (index > 0) {
                for (int i = 0; i < arr.size(); i++) {
                    if (i == index) {
                        re.verificarRemocao(arr.get(i).getCodigo());
                        JOptionPane.showMessageDialog(rootPane, "Filme removido");
                        return;
                    }
                }

            }
            re.verificarRemocao(0);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Nome", "Código", "Descriçao", "tipo", "Valor"});
        jTableCadasFilm.setModel(model);

    }//GEN-LAST:event_jBRemoverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Regra_Negocio_Filme re = new Regra_Negocio_Filme();
        int index = 0;
        try {
            if (jTableCadasFilm.getRowCount() > 0) {
                index = jTableCadasFilm.getSelectedRow();
                for (int i = 0; i < arr.size(); i++) {
                    if (i == index) {
                        re.verificarAtualizacao(arr.get(i).getCodigo());
                        Tela_Atualizar_Filme at = new Tela_Atualizar_Filme(arr.get(i));
                        at.show();

                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new String[]{"Nome", "Código", "Descriçao", "tipo", "Valor"});
        jTableCadasFilm.setModel(model);

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Tela_Gerenciar_Filme().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBRemover;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCadasFilm;
    private javax.swing.JTextField jTextBuscar;
    // End of variables declaration//GEN-END:variables
}
