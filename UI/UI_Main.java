/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import DTO.dto_DangNhap;
import UI.ChuongTrinhUI.UI_ChuongTrinh;
import UI.LopHocUI.UI_LopHoc;
import UI.KhachHangUI.UI_KhachHang;
import UI.DangNhapUI.UI_DangNhap;
import UI.TaiKhoan.UI_TaiKhoan;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComponent;

public final class UI_Main extends javax.swing.JFrame {

    public UI_Main() {
        initComponents();
        this.changeTabEffect(btnThongKe, "thongke");
    }

    public void changeTabButtonColor(JButton button, Color currentColor, Color hoverColor) {
     
        
        CustomBorder customBorder = new CustomBorder(null, null, new CustomBorder.BorderPiece(5), null);
        button.setBorder(customBorder);
        ((CustomBorder) button.getBorder()).setColor(currentColor);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                ((CustomBorder) button.getBorder()).setColor(currentColor);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                    ((CustomBorder) button.getBorder()).setColor(hoverColor);
            }
        });

        button.setFont(new Font("Noto Sans", Font.BOLD, 13));
    }
    /*
    public void setAllTabButtonColor(Color currentColor, Color hoverColor) {
            this.changeTabButtonColor(btnCTHoc, currentColor, hoverColor);
            this.changeTabButtonColor(btnKhachHang, currentColor, hoverColor);
            this.changeTabButtonColor(btnLopHoc, currentColor, hoverColor);
            this.changeTabButtonColor(btnTaiKhoan, currentColor, hoverColor);
            this.changeTabButtonColor(btnThongKe, currentColor, hoverColor);
    }
    */
    
     public void setAllTabButtonColor(String name) {
         if(name.equals("thongke")){
            this.changeTabButtonColor(btnCTHoc,CustomComponentModify.TRANSPARENT, CustomComponentModify.CHUONGTRINHHOC);
            this.changeTabButtonColor(btnKhachHang,CustomComponentModify.TRANSPARENT, CustomComponentModify.KHACHHANG);
            this.changeTabButtonColor(btnLopHoc, CustomComponentModify.TRANSPARENT, CustomComponentModify.LOPHOC);
            this.changeTabButtonColor(btnTaiKhoan, CustomComponentModify.TRANSPARENT, CustomComponentModify.TAIKHOAN);
            this.changeTabButtonColor(btnThongKe, CustomComponentModify.THONGKE, CustomComponentModify.THONGKE);
         }
                 else if(name.equals("khachhang")){
            this.changeTabButtonColor(btnCTHoc,CustomComponentModify.TRANSPARENT, CustomComponentModify.CHUONGTRINHHOC);
            this.changeTabButtonColor(btnKhachHang,CustomComponentModify.KHACHHANG, CustomComponentModify.KHACHHANG);
            this.changeTabButtonColor(btnLopHoc, CustomComponentModify.TRANSPARENT, CustomComponentModify.LOPHOC);
            this.changeTabButtonColor(btnTaiKhoan, CustomComponentModify.TRANSPARENT, CustomComponentModify.TAIKHOAN);
            this.changeTabButtonColor(btnThongKe, CustomComponentModify.TRANSPARENT, CustomComponentModify.THONGKE);
         }
                 else if(name.equals("lophoc")){
            this.changeTabButtonColor(btnCTHoc,CustomComponentModify.TRANSPARENT, CustomComponentModify.CHUONGTRINHHOC);
            this.changeTabButtonColor(btnKhachHang,CustomComponentModify.TRANSPARENT, CustomComponentModify.KHACHHANG);
            this.changeTabButtonColor(btnLopHoc, CustomComponentModify.LOPHOC, CustomComponentModify.LOPHOC);
            this.changeTabButtonColor(btnTaiKhoan, CustomComponentModify.TRANSPARENT, CustomComponentModify.TAIKHOAN);
            this.changeTabButtonColor(btnThongKe, CustomComponentModify.TRANSPARENT, CustomComponentModify.THONGKE);
         }
                          else if(name.equals("chuongtrinhhoc")){
            this.changeTabButtonColor(btnCTHoc,CustomComponentModify.CHUONGTRINHHOC, CustomComponentModify.CHUONGTRINHHOC);
            this.changeTabButtonColor(btnKhachHang,CustomComponentModify.TRANSPARENT, CustomComponentModify.KHACHHANG);
            this.changeTabButtonColor(btnLopHoc, CustomComponentModify.TRANSPARENT, CustomComponentModify.LOPHOC);
            this.changeTabButtonColor(btnTaiKhoan, CustomComponentModify.TRANSPARENT, CustomComponentModify.TAIKHOAN);
            this.changeTabButtonColor(btnThongKe, CustomComponentModify.TRANSPARENT, CustomComponentModify.THONGKE);
         }
                                   else if(name.equals("taikhoan")){
            this.changeTabButtonColor(btnCTHoc,CustomComponentModify.TRANSPARENT, CustomComponentModify.CHUONGTRINHHOC);
            this.changeTabButtonColor(btnKhachHang,CustomComponentModify.TRANSPARENT, CustomComponentModify.KHACHHANG);
            this.changeTabButtonColor(btnLopHoc, CustomComponentModify.TRANSPARENT, CustomComponentModify.LOPHOC);
            this.changeTabButtonColor(btnTaiKhoan, CustomComponentModify.TAIKHOAN, CustomComponentModify.TAIKHOAN);
            this.changeTabButtonColor(btnThongKe, CustomComponentModify.TRANSPARENT, CustomComponentModify.THONGKE);
         }


            
    }

    public void changeTabEffect(JButton nextButton, String name) {
       this.setAllTabButtonColor(name); 
    }

    /*  =====================Khu vực của Tân======*/
    //method giao diện cho nhân viên ghi danh 
    public void showGhiDanh() {
        ui_lop.hideBtnLop();
        btnTaiKhoan.setVisible(false);
        ui_ct.hideBtnCt();
    }

    //method giao diện cho nhân viên học vụ
    public void showHocVu() {
        ui_kh.hideBtnKh();
        btnTaiKhoan.setVisible(false);
        ui_ct.hideBtnCt();
    }

    //method hiển thị thông tin người dùng bên góc phải phía trên UI_Main
    public void setThongTinDangNhap(dto_DangNhap dn) {
        txtThongTinDangNhap.setText(dn.getMa() + " | " + dn.getHoTen());
    }

    /*  ====================Hết khu vực của Tân
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnLopHoc = new javax.swing.JButton();
        btnCTHoc = new javax.swing.JButton();
        btnTaiKhoan = new javax.swing.JButton();
        txtThongTinDangNhap = new javax.swing.JTextField();
        pnBody = new javax.swing.JPanel();
        pnThongKe = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Trung Tâm Anh Ngữ");
        setSize(new java.awt.Dimension(1200, 700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnDangXuat.setBackground(new java.awt.Color(255, 255, 255));
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dangxuat.png"))); // NOI18N
        btnDangXuat.setBorder(null);
        btnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        btnThongKe.setBackground(new java.awt.Color(153, 255, 153));
        btnThongKe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/thong k3.png"))); // NOI18N
        btnThongKe.setText("THỐNG KÊ");
        btnThongKe.setContentAreaFilled(false);
        btnThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongKe.setFocusable(false);
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnKhachHang.setBackground(new java.awt.Color(153, 255, 153));
        btnKhachHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/khach hang 2.png"))); // NOI18N
        btnKhachHang.setText("KHÁCH HÀNG");
        btnKhachHang.setContentAreaFilled(false);
        btnKhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKhachHang.setFocusable(false);
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });

        btnLopHoc.setBackground(new java.awt.Color(153, 255, 153));
        btnLopHoc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLopHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/class2.png"))); // NOI18N
        btnLopHoc.setText("LỚP HỌC");
        btnLopHoc.setContentAreaFilled(false);
        btnLopHoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLopHoc.setFocusable(false);
        btnLopHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLopHocActionPerformed(evt);
            }
        });

        btnCTHoc.setBackground(new java.awt.Color(153, 255, 153));
        btnCTHoc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCTHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chuong trinh hoc 1.png"))); // NOI18N
        btnCTHoc.setText("CHƯƠNG TRÌNH HỌC");
        btnCTHoc.setContentAreaFilled(false);
        btnCTHoc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCTHoc.setFocusable(false);
        btnCTHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTHocActionPerformed(evt);
            }
        });

        btnTaiKhoan.setBackground(new java.awt.Color(153, 255, 153));
        btnTaiKhoan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tai khoan 1.png"))); // NOI18N
        btnTaiKhoan.setText("TÀI KHOẢN");
        btnTaiKhoan.setContentAreaFilled(false);
        btnTaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTaiKhoan.setFocusable(false);
        btnTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaiKhoanActionPerformed(evt);
            }
        });

        txtThongTinDangNhap.setEditable(false);
        txtThongTinDangNhap.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtThongTinDangNhap.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtThongTinDangNhap.setText("<Tên Nhân Viên>-<Mã NV>");
        txtThongTinDangNhap.setBorder(null);
        txtThongTinDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThongTinDangNhapActionPerformed(evt);
            }
        });

        pnBody.setBackground(new java.awt.Color(204, 255, 255));
        pnBody.setLayout(new java.awt.CardLayout());

        pnThongKe.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnThongKeLayout = new javax.swing.GroupLayout(pnThongKe);
        pnThongKe.setLayout(pnThongKeLayout);
        pnThongKeLayout.setHorizontalGroup(
            pnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        pnThongKeLayout.setVerticalGroup(
            pnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnBody.add(pnThongKe, "card4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnLopHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(btnCTHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(btnTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtThongTinDangNhap)
                .addGap(48, 48, 48)
                .addComponent(btnDangXuat)
                .addContainerGap())
            .addComponent(pnBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtThongTinDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCTHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(pnBody, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(1216, 745));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtThongTinDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThongTinDangNhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThongTinDangNhapActionPerformed

    private void btnTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaiKhoanActionPerformed
        this.changeTabEffect(btnTaiKhoan, "taikhoan");

        pnBody.removeAll();
        pnBody.repaint();
        pnBody.revalidate();
        pnBody.add(ui_tk);
        pnBody.repaint();
        pnBody.revalidate();
    }//GEN-LAST:event_btnTaiKhoanActionPerformed

    private void btnCTHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTHocActionPerformed
        this.changeTabEffect(btnCTHoc,"chuongtrinhhoc");

        pnBody.removeAll();
        pnBody.repaint();
        pnBody.revalidate();
        pnBody.add(ui_ct);
        pnBody.repaint();
        pnBody.revalidate();
    }//GEN-LAST:event_btnCTHocActionPerformed

    private void btnLopHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLopHocActionPerformed
        this.changeTabEffect(btnLopHoc, "lophoc");

        pnBody.removeAll();
        pnBody.repaint();
        pnBody.revalidate();
        pnBody.add(ui_lop);
        pnBody.repaint();
        pnBody.revalidate();
    }//GEN-LAST:event_btnLopHocActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        this.changeTabEffect(btnKhachHang, "khachhang");

        pnBody.removeAll();
        pnBody.repaint();
        pnBody.revalidate();
        pnBody.add(ui_kh);
        pnBody.repaint();
        pnBody.revalidate();
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        this.changeTabEffect(btnThongKe, "thongke");

        pnBody.removeAll();
        pnBody.repaint();
        pnBody.add(pnThongKe);
        pnBody.repaint();
        pnBody.revalidate();
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        dispose();
        new UI_DangNhap().show();
    }//GEN-LAST:event_btnDangXuatActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UI_Main().setVisible(true);
            }
        });
    }

    //Biến tự định nghĩa
    private UI_LopHoc ui_lop = new UI_LopHoc();
    private UI_KhachHang ui_kh = new UI_KhachHang();
    private UI_ChuongTrinh ui_ct = new UI_ChuongTrinh();
    private UI_TaiKhoan ui_tk = new UI_TaiKhoan();
    //Kết thúc biến tự định nghĩa

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCTHoc;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnLopHoc;
    private javax.swing.JButton btnTaiKhoan;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnBody;
    private javax.swing.JPanel pnThongKe;
    private javax.swing.JTextField txtThongTinDangNhap;
    // End of variables declaration//GEN-END:variables
}
