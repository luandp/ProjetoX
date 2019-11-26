package GUI;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto_ii_periodo_poo.classes.Cliente;
import projeto_ii_periodo_poo.classes.Filme;
import projeto_ii_periodo_poo.classes.Locacao_Filmes;
import projeto_ii_periodo_poo.negocio.Regra_Negocio_Locacoes;

public class Tela_Locacao extends javax.swing.JFrame {

    DefaultTableModel modeloLocacao = new DefaultTableModel();
    Regra_Negocio_Locacoes validar = new Regra_Negocio_Locacoes();
    ArrayList<Filme> arry = new ArrayList<>();

    public Tela_Locacao() {
        initComponents();
        this.setLocationRelativeTo(null);

        DateFormat Formatodata = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        jLabel2.setText(Formatodata.format(data));
        jTable.setModel(modeloLocacao);
        Date banco = new Date();

        modeloLocacao.setColumnIdentifiers(new String[]{"Nome", "Codigo", "Tipo", "valor"});

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanelCliente = new javax.swing.JPanel();
        jMatricula = new javax.swing.JLabel();
        jNomeCliente = new javax.swing.JLabel();
        jTextNomeclien = new javax.swing.JTextField();
        jBPesquisarCliente = new javax.swing.JButton();
        CPF = new javax.swing.JLabel();
        JlabelCodigo = new javax.swing.JLabel();
        jPanelFilme = new javax.swing.JPanel();
        jNomeFil = new javax.swing.JLabel();
        jTextNomeFilme = new javax.swing.JTextField();
        jBPesquisarFilmes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jValorTotal = new javax.swing.JLabel();
        jBFinalizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Valor = new javax.swing.JLabel();
        datadevolucao = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Locação - Loca'Videos");
        setResizable(false);

        jPanelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        jMatricula.setText("Matricula :");

        jNomeCliente.setText("Nome:");

        jTextNomeclien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomeclienActionPerformed(evt);
            }
        });

        jBPesquisarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_ii_periodo_poo/resources/Lupa.png"))); // NOI18N
        jBPesquisarCliente.setText("Pesquisar");
        jBPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarClienteActionPerformed(evt);
            }
        });

        JlabelCodigo.setText("           ");

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addComponent(jMatricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JlabelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPF)
                .addGap(76, 76, 76)
                .addComponent(jNomeCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextNomeclien, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPesquisarCliente)
                .addContainerGap())
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jMatricula)
                .addComponent(jBPesquisarCliente)
                .addComponent(jNomeCliente)
                .addComponent(jTextNomeclien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(CPF)
                .addComponent(JlabelCodigo))
        );

        jPanelFilme.setBorder(javax.swing.BorderFactory.createTitledBorder("Filmes"));

        jNomeFil.setText("Nome:");

        jBPesquisarFilmes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_ii_periodo_poo/resources/Lupa.png"))); // NOI18N
        jBPesquisarFilmes.setText("Pesquisar");
        jBPesquisarFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarFilmesActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable.setName("tabela"); // NOI18N
        jTable.setOpaque(false);
        jScrollPane1.setViewportView(jTable);

        javax.swing.GroupLayout jPanelFilmeLayout = new javax.swing.GroupLayout(jPanelFilme);
        jPanelFilme.setLayout(jPanelFilmeLayout);
        jPanelFilmeLayout.setHorizontalGroup(
            jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilmeLayout.createSequentialGroup()
                .addGroup(jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFilmeLayout.createSequentialGroup()
                        .addComponent(jNomeFil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextNomeFilme, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPesquisarFilmes))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelFilmeLayout.setVerticalGroup(
            jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFilmeLayout.createSequentialGroup()
                .addGroup(jPanelFilmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNomeFil)
                    .addComponent(jTextNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisarFilmes))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jValorTotal.setText("Valor Total R$");

        jBFinalizar.setText("Finalizar");
        jBFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFinalizarActionPerformed(evt);
            }
        });

        jLabel1.setText("Data de Locação :");

        jLabel3.setText("Data de Devolução :");

        jLabel2.setText("Data");

        Valor.setText(" ");
        Valor.setMaximumSize(new java.awt.Dimension(0, 4));
        Valor.setMinimumSize(new java.awt.Dimension(0, 4));
        Valor.setPreferredSize(new java.awt.Dimension(0, 4));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Valor, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Valor, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto_ii_periodo_poo/resources/Lixeira.png"))); // NOI18N
        jButton1.setText("Remover"); // NOI18N
        jButton1.setToolTipText("");
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelFilme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(datadevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(309, 309, 309)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jValorTotal)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 621, Short.MAX_VALUE)
                                .addComponent(jBFinalizar)))
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jValorTotal, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(datadevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jBFinalizar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNomeclienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomeclienActionPerformed
    }//GEN-LAST:event_jTextNomeclienActionPerformed

    private void jBPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarClienteActionPerformed
        String nome = jTextNomeclien.getText();
        Tela_Pesquisa_CLiente c = new Tela_Pesquisa_CLiente(nome, jTextNomeclien, JlabelCodigo);
        c.show();
    }//GEN-LAST:event_jBPesquisarClienteActionPerformed

    private void jBPesquisarFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarFilmesActionPerformed
        Tela_Pesquisa_Filmes c = new Tela_Pesquisa_Filmes(jTextNomeFilme.getText(), modeloLocacao, Valor, arry);
        c.show();

    }//GEN-LAST:event_jBPesquisarFilmesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jTable.getRowCount() > 0) {
            double a = Double.parseDouble(Valor.getText());
            String V = String.valueOf(arry.get(jTable.getSelectedRow()).getValor()).substring(0, 4);
            a = a - Double.parseDouble(V);
            modeloLocacao.removeRow(jTable.getSelectedRow());
            Valor.setText(String.valueOf(a).substring(0, 4));
            JOptionPane.showMessageDialog(jTextNomeclien, "Filme Removido da lista");
            int index = jTable.getSelectedRowCount();
            arry.remove(index);

        } else {
            JOptionPane.showMessageDialog(jTextNomeclien, "Selecione o Filme a ser Retirado");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFinalizarActionPerformed
        Locacao_Filmes locacao = new Locacao_Filmes();
        ArrayList<Filme> fi = new ArrayList<>();
        Cliente cli = new Cliente();
        if (!"".equals(JlabelCodigo.getText())) {
            try {
                cli.setCodigo(Integer.parseInt(JlabelCodigo.getText()));
                locacao.setCliente(cli);
            } catch (Exception e) {
                cli.setCodigo(0);
                locacao.setCliente(cli);
            }
        }
        {
            try {
                locacao.setData_de_devoluçao(datadevolucao.getDate().toLocaleString().toString().substring(0, 10));
            } catch (Exception e) {
                locacao.setData_de_devoluçao("");
            }

            if (!"".equals(Valor.getText())) {
                try {
                    locacao.setValor_total(Double.parseDouble(Valor.getText()));
                } catch (Exception e) {
                    locacao.setValor_total(0);
                }
            }
            locacao.setData_de_locaçao(jLabel2.getText());
            if (modeloLocacao.getRowCount() > 0) {
                for (int i = 0; i < arry.size(); i++) {
                    Filme f = new Filme();
                    f.setCodigo(arry.get(i).getCodigo());
                    fi.add(f);
                }
            }
            locacao.setFilmes(fi);
            try {
                validar.validarLocacao(locacao);
                JOptionPane.showMessageDialog(jTextNomeclien, "Locação Concluida");
                dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(jTextNomeclien, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jBFinalizarActionPerformed
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Tela_Locacao().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel JlabelCodigo;
    private javax.swing.JLabel Valor;
    private com.toedter.calendar.JDateChooser datadevolucao;
    private javax.swing.JButton jBFinalizar;
    private javax.swing.JButton jBPesquisarCliente;
    private javax.swing.JButton jBPesquisarFilmes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jMatricula;
    private javax.swing.JLabel jNomeCliente;
    private javax.swing.JLabel jNomeFil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelFilme;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextNomeFilme;
    private javax.swing.JTextField jTextNomeclien;
    private javax.swing.JLabel jValorTotal;
    // End of variables declaration//GEN-END:variables
}
