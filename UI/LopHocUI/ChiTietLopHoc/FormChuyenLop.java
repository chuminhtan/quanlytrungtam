/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LopHocUI.ChiTietLopHoc;

/**
 *
 * @author USER
 */
public class FormChuyenLop extends javax.swing.JFrame {

    /**
     * Creates new form FormChuyenLop
     */
    public FormChuyenLop() {
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

        pnChuyenLop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbChuyenLop = new javax.swing.JComboBox<>();
        btnXacNhanChuyenLop = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Chuyển Lớp");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(500, 250));
        setResizable(false);

        pnChuyenLop.setBackground(new java.awt.Color(255, 255, 255));
        pnChuyenLop.setPreferredSize(new java.awt.Dimension(520, 340));

        jLabel1.setText("CHỌN LỚP CHUYỂN ĐẾN");

        cbChuyenLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChuyenLopActionPerformed(evt);
            }
        });

        btnXacNhanChuyenLop.setBackground(new java.awt.Color(91, 155, 213));
        btnXacNhanChuyenLop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXacNhanChuyenLop.setForeground(new java.awt.Color(255, 255, 255));
        btnXacNhanChuyenLop.setText("XÁC NHẬN");
        btnXacNhanChuyenLop.setContentAreaFilled(false);
        btnXacNhanChuyenLop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacNhanChuyenLop.setFocusable(false);
        btnXacNhanChuyenLop.setOpaque(true);
        btnXacNhanChuyenLop.setPreferredSize(new java.awt.Dimension(209, 40));
        btnXacNhanChuyenLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanChuyenLopActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CHUYỂN LỚP");

        javax.swing.GroupLayout pnChuyenLopLayout = new javax.swing.GroupLayout(pnChuyenLop);
        pnChuyenLop.setLayout(pnChuyenLopLayout);
        pnChuyenLopLayout.setHorizontalGroup(
            pnChuyenLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChuyenLopLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cbChuyenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChuyenLopLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnChuyenLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChuyenLopLayout.createSequentialGroup()
                        .addComponent(btnXacNhanChuyenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnChuyenLopLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(166, 166, 166))))
        );
        pnChuyenLopLayout.setVerticalGroup(
            pnChuyenLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChuyenLopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(pnChuyenLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbChuyenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnXacNhanChuyenLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnChuyenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnChuyenLop, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnXacNhanChuyenLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanChuyenLopActionPerformed
        
    }//GEN-LAST:event_btnXacNhanChuyenLopActionPerformed

    private void cbChuyenLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChuyenLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbChuyenLopActionPerformed

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
            java.util.logging.Logger.getLogger(FormChuyenLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormChuyenLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormChuyenLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormChuyenLop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormChuyenLop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXacNhanChuyenLop;
    private javax.swing.JComboBox<String> cbChuyenLop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnChuyenLop;
    // End of variables declaration//GEN-END:variables
}
