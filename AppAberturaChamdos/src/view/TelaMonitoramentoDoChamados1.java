/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diegu
 */
public class TelaMonitoramentoDoChamados1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaAvaliação1
     */
    public TelaMonitoramentoDoChamados1() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        JTChamados = new javax.swing.JTable();
        lblNome = new javax.swing.JLabel();
        BtnEfetuarChamado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Monitoramento do Chamados");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTChamados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chamado", "Status", "Horário de abertura"
            }
        ));
        JTChamados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTChamadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTChamados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 550, 360));
        getContentPane().add(lblNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        BtnEfetuarChamado.setBackground(new java.awt.Color(102, 153, 255));
        BtnEfetuarChamado.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        BtnEfetuarChamado.setForeground(new java.awt.Color(255, 255, 255));
        BtnEfetuarChamado.setBorder(null);
        BtnEfetuarChamado.setContentAreaFilled(false);
        BtnEfetuarChamado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnEfetuarChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEfetuarChamadoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEfetuarChamado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/TelaMonitoramentoDeChamados (1).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void AddLinhaJTable(Object[] dataLinha)
        {   
        DefaultTableModel model = (DefaultTableModel) JTChamados.getModel();
        model.addRow(dataLinha);
    }
    
    private void JTChamadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTChamadosMouseClicked
       
    }//GEN-LAST:event_JTChamadosMouseClicked

    private void BtnEfetuarChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEfetuarChamadoActionPerformed

        TelaVisualizaçãoGodd TelaVisualização = new TelaVisualizaçãoGodd();
        TelaVisualização.setVisible(true);
       
    }//GEN-LAST:event_BtnEfetuarChamadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEfetuarChamado;
    private static javax.swing.JTable JTChamados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNome;
    // End of variables declaration//GEN-END:variables
}