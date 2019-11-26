package GUI;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto_ii_periodo_poo.classes.Filme;
import projeto_ii_periodo_poo.negocio.Regra_Negocio_Filme;

public class Tela_Pesquisa_Filmes extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel modeloex = new DefaultTableModel();
    Filme filme = new Filme();
    Regra_Negocio_Filme regra = new Regra_Negocio_Filme();
    JLabel valoor;
    ArrayList<Filme> arr = new ArrayList<>();
    ArrayList<Filme> arri = new ArrayList<>();

    public Tela_Pesquisa_Filmes(String nomeFilme, DefaultTableModel mo, JLabel valor, ArrayList<Filme> arryFilmes) {
        initComponents();
        this.setLocationRelativeTo(null);
        model.setColumnIdentifiers(new String[]{"Nome", "Codigo", "Tipo", "valor", "Situação"});
        jTable1.setModel(model);
        try {
            arr = regra.buscaFilme(nomeFilme);
            for (int i = 0; i < arr.size(); i++) {
                model.addRow(new String[]{arr.get(i).getNome(), String.valueOf(arr.get(i).getCodigo()), arr.get(i).getTipo(), String.valueOf(arr.get(i).getValor()), arr.get(i).getSituacao()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        modeloex = model;
        model = mo;
        valoor = valor;
        arri = arryFilmes;
    }

    public Tela_Pesquisa_Filmes() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisar Filme - Loca'Videos");
        setResizable(false);

        jLabel1.setText("Nome");

        jButton1.setText("Pesquisa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 138, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 507, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Tela_Locacao lo = new Tela_Locacao();
        if (jTable1.getRowCount() > 0) {
            int index = jTable1.getSelectedRow();
            for (int i = 0; i < arr.size(); i++) {
                if (i == index) {
                    filme.setNome(arr.get(i).getNome());
                    filme.setCodigo(arr.get(i).getCodigo());
                    filme.setTipo(arr.get(i).getTipo());
                    filme.setValor(arr.get(i).getValor());
                    filme.setSituacao(arr.get(i).getSituacao());
                }
            }
            for (int i = 0; i < model.getRowCount(); i++) {
                if (filme.getCodigo() == Integer.parseInt(model.getValueAt(i, 1).toString())) {
                    JOptionPane.showMessageDialog(rootPane, "Você ja escolheu esse Filme ");
                    return;
                }
            }
            for (int i = 0; i < modeloex.getRowCount(); i++) {
                if (filme.getSituacao().equals("Não Disponivel")) {
                    JOptionPane.showMessageDialog(rootPane, "Este Filme não está disponivel");
                    return;
                }
            }
            model.addRow(new String[]{filme.getNome(), String.valueOf(filme.getCodigo()), filme.getTipo(), String.valueOf(filme.getValor())});
            dispose();
            arri.add(arr.get(jTable1.getSelectedRow()));
            double valo = 0;
            for (int i = 0; i < arri.size(); i++) {
                valo = valo + arri.get(i).getValor();
            }
            int in = jTable1.getSelectedRow();
            valoor.setText(String.valueOf(valo));

        }
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nome", "Codigo", "Tipo", "valor", "Situação"});
        String nome = jTextField1.getText();
        try {
            arr = regra.buscaFilme(nome);
            for (int i = 0; i < arr.size(); i++) {
                modelo.addRow(new String[]{arr.get(i).getNome(), String.valueOf(arr.get(i).getCodigo()), arr.get(i).getTipo(), String.valueOf(arr.get(i).getValor()), arr.get(i).getSituacao()});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        jTable1.setModel(modelo);
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Pesquisa_Filmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Pesquisa_Filmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Pesquisa_Filmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Pesquisa_Filmes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Tela_Pesquisa_Filmes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
