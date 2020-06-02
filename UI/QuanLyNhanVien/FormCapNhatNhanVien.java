/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.QuanLyNhanVien;

import DTO.NhanVienDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class FormCapNhatNhanVien extends javax.swing.JFrame {
    
    private AfterSuaNhanVien afterSuaNhanVien;
    private NhanVienDTO nhanVienDTO;

    /**
     * Creates new form FormCapNhatTaiKhoan
     */
    public FormCapNhatNhanVien() {
        initComponents();
    }

    public AfterSuaNhanVien getAfterSuaNhanVien() {
        return afterSuaNhanVien;
    }

    public void setAfterSuaNhanVien(AfterSuaNhanVien afterSuaNhanVien) {
        this.afterSuaNhanVien = afterSuaNhanVien;
    }
    
    public void clearAfterSuaNhanVien(AfterSuaNhanVien afterSuaNhanVien) {
        this.afterSuaNhanVien = null;
    }

    public NhanVienDTO getNhanVienDTO() {
        return nhanVienDTO;
    }

    public void setNhanVienDTO(NhanVienDTO nhanVienDTO) {
        this.nhanVienDTO = nhanVienDTO;
    }
    
    public void setDefaultInformations(NhanVienDTO nhanVienDTO) {
        if (nhanVienDTO != null) {
            this.nhanVienDTO = nhanVienDTO;
        }
        
        this.textfeildHoTen.setText(this.nhanVienDTO.getHO_TEN());
        this.textfeilTenDangNhap.setText(this.nhanVienDTO.getTEN_DANG_NHAP());
        this.textfeildSDT.setText(this.nhanVienDTO.getSDT());
        this.passwordfeildMatKhau.setText(this.nhanVienDTO.getMAT_KHAU());
        this.comboboxLoaiNhanVien.setSelectedIndex(this.nhanVienDTO.getLOAI());
    }
    
    public NhanVienDTO parseInformation() {
        NhanVienDTO nhanVienDTO = null;
        
        nhanVienDTO = new NhanVienDTO(
                this.nhanVienDTO.getMA_NV(), 
                this.textfeildHoTen.getText(), 
                this.textfeildSDT.getText(), 
                this.comboboxLoaiNhanVien.getSelectedIndex(), 
                this.textfeilTenDangNhap.getText(), 
                String.valueOf(this.passwordfeildMatKhau.getPassword())
        );
        
        return nhanVienDTO;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneSuaNhanVien = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textfeildHoTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textfeildSDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboboxLoaiNhanVien = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        textfeilTenDangNhap = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        passwordfeildMatKhau = new javax.swing.JPasswordField();
        buttonXacNhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cập Nhật Tài Khoản");

        paneSuaNhanVien.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CẬP NHẬT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("TÊN NHÂN VIÊN");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("SỐ ĐIỆN THOẠI");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("LOẠI NHÂN VIÊN");

        comboboxLoaiNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "Ghi danh", "Học vụ" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("TÊN ĐĂNG NHẬP");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("MẬT KHẨU");

        buttonXacNhan.setBackground(new java.awt.Color(91, 155, 213));
        buttonXacNhan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buttonXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        buttonXacNhan.setText("XÁC NHẬN");
        buttonXacNhan.setContentAreaFilled(false);
        buttonXacNhan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonXacNhan.setFocusable(false);
        buttonXacNhan.setOpaque(true);
        buttonXacNhan.setPreferredSize(new java.awt.Dimension(209, 40));
        buttonXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonXacNhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneSuaNhanVienLayout = new javax.swing.GroupLayout(paneSuaNhanVien);
        paneSuaNhanVien.setLayout(paneSuaNhanVienLayout);
        paneSuaNhanVienLayout.setHorizontalGroup(
            paneSuaNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneSuaNhanVienLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(paneSuaNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneSuaNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addGroup(paneSuaNhanVienLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(paneSuaNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))))
                .addGap(38, 38, 38)
                .addGroup(paneSuaNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textfeildHoTen)
                    .addComponent(textfeildSDT)
                    .addComponent(comboboxLoaiNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfeilTenDangNhap)
                    .addComponent(passwordfeildMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneSuaNhanVienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paneSuaNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneSuaNhanVienLayout.createSequentialGroup()
                        .addComponent(buttonXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneSuaNhanVienLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(167, 167, 167))))
        );
        paneSuaNhanVienLayout.setVerticalGroup(
            paneSuaNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneSuaNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(paneSuaNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textfeildHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(paneSuaNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneSuaNhanVienLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3))
                    .addGroup(paneSuaNhanVienLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(textfeildSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(paneSuaNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboboxLoaiNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(paneSuaNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textfeilTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(paneSuaNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passwordfeildMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(buttonXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneSuaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneSuaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonXacNhanActionPerformed
        //Tiến hành sửa nhân viên 
        NhanVienDTO newNhanVienDTO = this.parseInformation();
        
        if (newNhanVienDTO.equals(this.nhanVienDTO)) {
            JOptionPane.showMessageDialog(
                    this, 
                    "Bạn chưa sửa thông tin nhân viên", 
                    "Thông báo", 
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }
        
        int deleteResult = JOptionPane.showConfirmDialog(
                this, 
                "Bạn có chắc chắn muốn sửa thông tin nhân viên thành:" + "\n" + newNhanVienDTO.toString(), 
                "Sủa thông tin nhân viên", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.INFORMATION_MESSAGE
        );
        
        if (deleteResult == JOptionPane.YES_OPTION) {
            //Sửa ngay và luôn 
        }
        else if (deleteResult == JOptionPane.NO_OPTION) {
            return;
        }
                
        //Làm việc sau khi sửa 
        if (this.afterSuaNhanVien != null) {
            this.afterSuaNhanVien.DoAfterSuaNhanVien();
        }
        
        //Đóng panel 
        this.dispose();
    }//GEN-LAST:event_buttonXacNhanActionPerformed

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
            java.util.logging.Logger.getLogger(FormCapNhatNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCapNhatNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCapNhatNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCapNhatNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCapNhatNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonXacNhan;
    private javax.swing.JComboBox<String> comboboxLoaiNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel paneSuaNhanVien;
    private javax.swing.JPasswordField passwordfeildMatKhau;
    private javax.swing.JTextField textfeilTenDangNhap;
    private javax.swing.JTextField textfeildHoTen;
    private javax.swing.JTextField textfeildSDT;
    // End of variables declaration//GEN-END:variables
}