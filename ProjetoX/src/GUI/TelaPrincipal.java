/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Luan Paulo
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JMenu = new javax.swing.JMenuBar();
        JCadastrar = new javax.swing.JMenu();
        JCadCarro = new javax.swing.JMenuItem();
        JCadCliente = new javax.swing.JMenuItem();
        JCadFuncionario = new javax.swing.JMenuItem();
        JOperacao = new javax.swing.JMenu();
        JOpeAluguel = new javax.swing.JMenuItem();
        JOpeVendas = new javax.swing.JMenuItem();
        JEstoque = new javax.swing.JMenu();
        JFolha = new javax.swing.JMenu();
        JSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JCadastrar.setText("Gerenciar");

        JCadCarro.setText("Carro");
        JCadCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCadCarroActionPerformed(evt);
            }
        });
        JCadastrar.add(JCadCarro);

        JCadCliente.setText("Cliente");
        JCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCadClienteActionPerformed(evt);
            }
        });
        JCadastrar.add(JCadCliente);

        JCadFuncionario.setText("Funcionário");
        JCadFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCadFuncionarioActionPerformed(evt);
            }
        });
        JCadastrar.add(JCadFuncionario);

        JMenu.add(JCadastrar);

        JOperacao.setText("Operação");

        JOpeAluguel.setText("Aluguel...");
        JOpeAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOpeAluguelActionPerformed(evt);
            }
        });
        JOperacao.add(JOpeAluguel);

        JOpeVendas.setText("Vendas...");
        JOpeVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOpeVendasActionPerformed(evt);
            }
        });
        JOperacao.add(JOpeVendas);

        JMenu.add(JOperacao);

        JEstoque.setText("Estoque");
        JEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JEstoqueActionPerformed(evt);
            }
        });
        JMenu.add(JEstoque);

        JFolha.setText("Folha de Pagamento");
        JFolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFolhaActionPerformed(evt);
            }
        });
        JMenu.add(JFolha);

        JSair.setText("Sair");
        JSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JSairMouseClicked(evt);
            }
        });
        JSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JSairActionPerformed(evt);
            }
        });
        JMenu.add(JSair);

        setJMenuBar(JMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCadCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCadCarroActionPerformed
            //chamar tela Listar Carro
    }//GEN-LAST:event_JCadCarroActionPerformed

    private void JCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCadClienteActionPerformed
           //chamar tela Listar Cliente
    }//GEN-LAST:event_JCadClienteActionPerformed

    private void JCadFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCadFuncionarioActionPerformed
           //chamar tela Listar Funcionario
    }//GEN-LAST:event_JCadFuncionarioActionPerformed

    private void JOpeAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JOpeAluguelActionPerformed
            //chamar tela Listar Aluguel
    }//GEN-LAST:event_JOpeAluguelActionPerformed

    private void JOpeVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JOpeVendasActionPerformed
         //chamar tela Listar Vendas
    }//GEN-LAST:event_JOpeVendasActionPerformed

    private void JEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JEstoqueActionPerformed
        //chamar tela Gerenciar Estoque
    }//GEN-LAST:event_JEstoqueActionPerformed

    private void JFolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFolhaActionPerformed
        //chamar tela Gerenciar Folha
    }//GEN-LAST:event_JFolhaActionPerformed
/*
    private void JSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JSairActionPerformed

    }//GEN-LAST:event_JSairActionPerformed
*/
    private void JSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JSairMouseClicked
        Runtime.getRuntime().exit(0); 
        TelaLogin tl = new  TelaLogin();
        tl.show();
        
    }//GEN-LAST:event_JSairMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JCadCarro;
    private javax.swing.JMenuItem JCadCliente;
    private javax.swing.JMenuItem JCadFuncionario;
    private javax.swing.JMenu JCadastrar;
    private javax.swing.JMenu JEstoque;
    private javax.swing.JMenu JFolha;
    private javax.swing.JMenuBar JMenu;
    private javax.swing.JMenuItem JOpeAluguel;
    private javax.swing.JMenuItem JOpeVendas;
    private javax.swing.JMenu JOperacao;
    private javax.swing.JMenu JSair;
    // End of variables declaration//GEN-END:variables
}
