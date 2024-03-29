/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.AdminQLSV;

import TableView.TableSinhVien;
import com.mycompany.quanlydangkymonhoc.connectDB.connectDataBase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Khoa;
import models.SinhVien;
import utilis.BackHome;
import utilis.CenterScreen;
import utilis.ProtectScreen;
import view.AdminQLMH.QLMHScreen;

/**
 *
 * @author Doan Cuong
 */
public class QLSVScreen extends javax.swing.JFrame {

    /**
     * Creates new form QLSVScreen
     */
    ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
    List<Khoa> dataCB = new ArrayList<>();
    int dongchon = -1;

    public QLSVScreen() {
        initComponents();
        showComboBoxData();
        LoadTableSinhVien();
    }

    public void LoadTableSinhVien() {
        tableSinhVien.setModel(new TableSinhVien(dsSinhVien));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSinhVien = new javax.swing.JTable();
        btnDeleteItem = new javax.swing.JButton();
        clickCTSV = new javax.swing.JButton();
        btnBackHomeAdmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        lbName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtNienKhoa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnAddItem = new javax.swing.JButton();
        cbKhoa = new javax.swing.JComboBox<>();
        txtSDT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("Danh sách sinh viên");

        tableSinhVien.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableSinhVien);

        btnDeleteItem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDeleteItem.setText("Xóa");
        btnDeleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteItemActionPerformed(evt);
            }
        });

        clickCTSV.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        clickCTSV.setText("Xem Chi Tiết");
        clickCTSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickCTSVActionPerformed(evt);
            }
        });

        btnBackHomeAdmin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnBackHomeAdmin.setText("Quay lại");
        btnBackHomeAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackHomeAdminActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("Thêm sinh viên mới");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Mã SV");

        lbName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbName.setText("Tên SV");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Niên Khóa");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Khoa");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Mật khẩu");

        btnAddItem.setText("Thêm");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        cbKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKhoaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Số điện thoại");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Địa chỉ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDeleteItem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(226, 226, 226)
                        .addComponent(clickCTSV, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221)
                        .addComponent(btnBackHomeAdmin))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddItem)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbName)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNienKhoa)
                                        .addComponent(cbKhoa, 0, 176, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNienKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnAddItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteItem)
                    .addComponent(clickCTSV)
                    .addComponent(btnBackHomeAdmin))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clickCTSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickCTSVActionPerformed
        // TODO add your handling code here:
        int row = tableSinhVien.getSelectedRow();
        // lấy id của sinh viên cần xem
        int choise = -1;
        choise = (int) tableSinhVien.getModel().getValueAt(row, 0);

        if (choise == -1) {
            JOptionPane.showMessageDialog(this, "Yêu cầu chọn sinh viên cần xem !",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String sql = "SELECT `code`, sinh_vien.name, `nien_khoa`, `password`, khoa.name, `SDT`,"
                    + " `diachi` FROM `sinh_vien`,`khoa` WHERE sinh_vien.id_khoa = khoa.id AND sinh_vien.id = " + choise;
            ResultSet rs = services.Services.get(sql);
            rs.next();

            SinhVien sinhVien = new SinhVien();
            sinhVien.setCodeSV(rs.getString(1));
            sinhVien.setHoTen(rs.getString(2));
            sinhVien.setNien_Khoa(rs.getString(3));
            sinhVien.setTenKhoa(rs.getString(5));
            sinhVien.setSdt(rs.getString(6));
            sinhVien.setDiachi(rs.getString(7));

            this.dispose();
            InforSV_Screen inforSV_Screen = new InforSV_Screen(sinhVien);
//            inforSV_Screen = (InforSV_Screen) ProtectScreen.protectScreen(inforSV_Screen);
            inforSV_Screen = (InforSV_Screen) CenterScreen.centerWindow(inforSV_Screen);
            inforSV_Screen.setTitle("Chi tiết sinh viên");
            inforSV_Screen.setVisible(true);

        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(this, "Lỗi",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_clickCTSVActionPerformed

    private void btnBackHomeAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackHomeAdminActionPerformed
        // TODO add your handling code here:
        BackHome.admin(this);

    }//GEN-LAST:event_btnBackHomeAdminActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        fetchData();
    }//GEN-LAST:event_formWindowOpened

    public void fetchData() {
        dsSinhVien = new ArrayList<>();
        PreparedStatement st;
        ResultSet rs;
        String query = "SELECT sinh_vien.id,  sinh_vien.code, sinh_vien.name, sinh_vien.nien_khoa,khoa.name as 'tenKhoa' "
                + "FROM sinh_vien INNER JOIN khoa ON sinh_vien.id_khoa = khoa.id";
        try {
            st = connectDataBase.getConnection().prepareStatement(query);
            rs = st.executeQuery();
            SinhVien x = null;
            while (rs.next()) {
                x = new SinhVien(rs.getInt("sinh_vien.id"), rs.getString("sinh_vien.code"), rs.getString("sinh_vien.name"), rs.getString("sinh_vien.nien_khoa"), rs.getString("tenKhoa"));
                dsSinhVien.add(x);
            }
            LoadTableSinhVien();
        } catch (SQLException ex) {
            Logger.getLogger(QLSVScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
        // TODO add your handling code here:
        String code = txtCode.getText();
        String name = txtName.getText();
        String nien_khoa = txtNienKhoa.getText();
        String password = txtPassword.getText();
        String ten_khoa = cbKhoa.getSelectedItem().toString();
        String sdt = txtSDT.getText();
        String diachi = txtDiaChi.getText();

        if (code.equals("") || name.equals("") || nien_khoa.equals("") || ten_khoa.equals("") || sdt.equals("") || diachi.equals("")) {
            JOptionPane.showMessageDialog(this, "Yêu cầu nhập đủ tất cả các trường !",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCode.requestFocus();
            return;
        }
        for (SinhVien sinhVien : dsSinhVien) {
            if (code.equals(sinhVien.getCodeSV())) {
                JOptionPane.showMessageDialog(this, "Mã sinh viên đã tồn tại, nhập MSV khác !",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        int id_khoa = 0;
        for (Khoa khoa : dataCB) {
            if (ten_khoa.equals(khoa.getName())) {
                id_khoa = khoa.getId();
                break;
            }
        }
        try {
            String sql = "INSERT INTO `sinh_vien`(`code`, `name`, `nien_khoa`, `password`, `id_khoa`, `SDT`, `diachi`)"
                    + " VALUES ('" + code + "','" + name + "','" + nien_khoa + "','" + password + "','" + id_khoa + "', '" + sdt + "','" + diachi + "')";
            services.Services.post(sql);
            System.out.println("sql: " + sql);
            fetchData();
            txtName.setText("");
            txtCode.setText("");
            txtPassword.setText("");
            txtNienKhoa.setText("");
            txtCode.requestFocus();
            txtSDT.setText("");
            txtDiaChi.setText("");
        } catch (Exception ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(this, ex,
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAddItemActionPerformed

    private void cbKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKhoaActionPerformed

    private void btnDeleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteItemActionPerformed
        try {
            // TODO add your handling code here:
            int row = tableSinhVien.getSelectedRow();
            // lấy id của khoa cần xóa
            int idDelete;
            idDelete = (int) tableSinhVien.getModel().getValueAt(row, 0);
            try {
                String sql = "DELETE FROM `sinh_vien` WHERE id = " + idDelete;
                services.Services.post(sql);
                fetchData();
            } catch (Exception ex) {
                System.out.println(ex);
                JOptionPane.showMessageDialog(this, "Khoa này đã có lớp, không thể xóa !",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Yêu cầu chọn sinh Vien để xóa !",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteItemActionPerformed

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
            java.util.logging.Logger.getLogger(QLSVScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSVScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSVScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSVScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QLSVScreen qlsvScreen = new QLSVScreen();
                qlsvScreen = (QLSVScreen) ProtectScreen.protectScreen(qlsvScreen);
                qlsvScreen = (QLSVScreen) CenterScreen.centerWindow(qlsvScreen);
                qlsvScreen.setVisible(true);
                qlsvScreen.setTitle("Quản lý sinh viên");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnBackHomeAdmin;
    private javax.swing.JButton btnDeleteItem;
    private javax.swing.JComboBox<String> cbKhoa;
    private javax.swing.JButton clickCTSV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbName;
    private javax.swing.JTable tableSinhVien;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNienKhoa;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables

    private void showComboBoxData() {

        String sql = "SELECT * FROM khoa";
        ResultSet rs = services.Services.get(sql);

        try {

            Khoa x = null;
            while (rs.next()) {
                x = new Khoa(rs.getInt("id"), rs.getString("name"));
                dataCB.add(x);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QLMHScreen.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (Khoa khoa : dataCB) {
            cbKhoa.addItem(khoa.getName());
        }
    }
}
