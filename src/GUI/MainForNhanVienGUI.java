/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.model.ChangeScreenNhanVien;
import GUI.model.DanhMuc;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author wizardsc
 */
public class MainForNhanVienGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainForNhanVienGUI
     */
    public MainForNhanVienGUI() {
        setUndecorated(true);

        initComponents();
        setLocationRelativeTo(null);
        
        ImageIcon logo = new ImageIcon("./src/image/lblIconShop32x32.png");
        setIconImage(logo.getImage());
        
        ChangeScreenNhanVien controller = new ChangeScreenNhanVien(pnView);
        ArrayList<DanhMuc> list = new ArrayList<>();
        list.add(new DanhMuc("HoaDon", pnHoaDon, lblHoaDon));
        list.add(new DanhMuc("DSHoaDon",pnDSHoaDon,lblDSHoaDon));
        list.add(new DanhMuc("SanPham", pnSanPham, lblSanPham));
        controller.setEvent(list);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnRoot = new javax.swing.JPanel();
        pnView = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnMenu = new javax.swing.JPanel();
        lblIconHotel1 = new javax.swing.JLabel();
        pnNhanVien = new javax.swing.JPanel();
        lblNhanVien = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnHoaDon = new javax.swing.JPanel();
        lblHoaDon = new javax.swing.JLabel();
        pnSanPham = new javax.swing.JPanel();
        lblSanPham = new javax.swing.JLabel();
        pnCaLam = new javax.swing.JPanel();
        pnDSHoaDon = new javax.swing.JPanel();
        lblDSHoaDon = new javax.swing.JLabel();
        pnHeader = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        btnMinimize = new javax.swing.JLabel();
        lblThongTin = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        cbxPhanQuyen = new javax.swing.JComboBox<>();
        lblTime = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnRoot.setBackground(new java.awt.Color(255, 255, 255));
        pnRoot.setPreferredSize(new java.awt.Dimension(1300, 730));

        pnView.setBackground(new java.awt.Color(250, 247, 240));
        pnView.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        pnView.setPreferredSize(new java.awt.Dimension(1089, 750));

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel3");

        javax.swing.GroupLayout pnViewLayout = new javax.swing.GroupLayout(pnView);
        pnView.setLayout(pnViewLayout);
        pnViewLayout.setHorizontalGroup(
            pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnViewLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
            .addGroup(pnViewLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnViewLayout.setVerticalGroup(
            pnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 644, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        pnMenu.setBackground(new java.awt.Color(188, 206, 248));
        pnMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 4, 0, new java.awt.Color(0, 0, 0)));
        pnMenu.setPreferredSize(new java.awt.Dimension(211, 650));

        lblIconHotel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIconHotel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shop.png"))); // NOI18N

        pnNhanVien.setBackground(new java.awt.Color(188, 206, 248));
        pnNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        pnNhanVien.setPreferredSize(new java.awt.Dimension(300, 43));

        lblNhanVien.setFont(new java.awt.Font("Baloo 2 ExtraBold", 1, 20)); // NOI18N
        lblNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lblNhanVien.png"))); // NOI18N
        lblNhanVien.setText("  Nhân viên");

        jLabel1.setFont(new java.awt.Font("Baloo 2 SemiBold", 0, 14)); // NOI18N
        jLabel1.setText("Hello");

        jLabel2.setFont(new java.awt.Font("Baloo 2 SemiBold", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        javax.swing.GroupLayout pnNhanVienLayout = new javax.swing.GroupLayout(pnNhanVien);
        pnNhanVien.setLayout(pnNhanVienLayout);
        pnNhanVienLayout.setHorizontalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addGroup(pnNhanVienLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnNhanVienLayout.setVerticalGroup(
            pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnHoaDon.setBackground(new java.awt.Color(188, 206, 248));
        pnHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        pnHoaDon.setPreferredSize(new java.awt.Dimension(300, 43));

        lblHoaDon.setFont(new java.awt.Font("Baloo 2 ExtraBold", 1, 20)); // NOI18N
        lblHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lblCaLam.png"))); // NOI18N
        lblHoaDon.setText("  Hóa đơn");

        javax.swing.GroupLayout pnHoaDonLayout = new javax.swing.GroupLayout(pnHoaDon);
        pnHoaDon.setLayout(pnHoaDonLayout);
        pnHoaDonLayout.setHorizontalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
        );
        pnHoaDonLayout.setVerticalGroup(
            pnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        pnSanPham.setBackground(new java.awt.Color(188, 206, 248));
        pnSanPham.setForeground(new java.awt.Color(255, 255, 255));
        pnSanPham.setPreferredSize(new java.awt.Dimension(300, 43));

        lblSanPham.setFont(new java.awt.Font("Baloo 2 ExtraBold", 1, 20)); // NOI18N
        lblSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lblHome.png"))); // NOI18N
        lblSanPham.setText("  Sản phẩm");

        javax.swing.GroupLayout pnSanPhamLayout = new javax.swing.GroupLayout(pnSanPham);
        pnSanPham.setLayout(pnSanPhamLayout);
        pnSanPhamLayout.setHorizontalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
        );
        pnSanPhamLayout.setVerticalGroup(
            pnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        pnCaLam.setBackground(new java.awt.Color(188, 206, 248));
        pnCaLam.setForeground(new java.awt.Color(255, 255, 255));
        pnCaLam.setPreferredSize(new java.awt.Dimension(300, 43));

        javax.swing.GroupLayout pnCaLamLayout = new javax.swing.GroupLayout(pnCaLam);
        pnCaLam.setLayout(pnCaLamLayout);
        pnCaLamLayout.setHorizontalGroup(
            pnCaLamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
        pnCaLamLayout.setVerticalGroup(
            pnCaLamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        pnDSHoaDon.setBackground(new java.awt.Color(188, 206, 248));
        pnDSHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        pnDSHoaDon.setPreferredSize(new java.awt.Dimension(300, 43));

        lblDSHoaDon.setFont(new java.awt.Font("Baloo 2 ExtraBold", 1, 19)); // NOI18N
        lblDSHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lblLoai.png"))); // NOI18N
        lblDSHoaDon.setText("  Danh sách HD");

        javax.swing.GroupLayout pnDSHoaDonLayout = new javax.swing.GroupLayout(pnDSHoaDon);
        pnDSHoaDon.setLayout(pnDSHoaDonLayout);
        pnDSHoaDonLayout.setHorizontalGroup(
            pnDSHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDSHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDSHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
        );
        pnDSHoaDonLayout.setVerticalGroup(
            pnDSHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDSHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addComponent(pnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnCaLam, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnDSHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIconHotel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(lblIconHotel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(pnCaLam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(pnDSHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(pnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(266, 266, 266))
        );

        pnHeader.setBackground(new java.awt.Color(152, 168, 248));
        pnHeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        pnHeader.setToolTipText("");
        pnHeader.setPreferredSize(new java.awt.Dimension(102, 40));

        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close.png"))); // NOI18N
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        btnMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/minus.png"))); // NOI18N
        btnMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizeMouseClicked(evt);
            }
        });

        lblThongTin.setFont(new java.awt.Font("Baloo 2 ExtraBold", 1, 18)); // NOI18N
        lblThongTin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongTin.setText("BẠN ĐANG ĐĂNG NHẬP VỚI TƯ CÁCH");

        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/lblHome.png"))); // NOI18N

        cbxPhanQuyen.setBackground(new java.awt.Color(250, 247, 240));
        cbxPhanQuyen.setEditable(true);
        cbxPhanQuyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên" }));
        cbxPhanQuyen.setEnabled(false);

        lblTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout pnHeaderLayout = new javax.swing.GroupLayout(pnHeader);
        pnHeader.setLayout(pnHeaderLayout);
        pnHeaderLayout.setHorizontalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblThongTin)
                .addGap(14, 14, 14)
                .addComponent(cbxPhanQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(232, 232, 232)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnHeaderLayout.setVerticalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addGroup(pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxPhanQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addGroup(pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnRootLayout = new javax.swing.GroupLayout(pnRoot);
        pnRoot.setLayout(pnRootLayout);
        pnRootLayout.setHorizontalGroup(
            pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRootLayout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnView, javax.swing.GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE))
            .addComponent(pnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, Short.MAX_VALUE)
        );
        pnRootLayout.setVerticalGroup(
            pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRootLayout.createSequentialGroup()
                .addComponent(pnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                    .addComponent(pnView, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // System.exit(0);
        //       setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        //        int result=JOptionPane.showConfirmDialog(null,"Do yout want to exit?","Congfig",JOptionPane.YES_NO_OPTION);
        //        if(result==0){
            System.exit(0);
            //        }
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizeMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnMinimize;
    private javax.swing.JComboBox<String> cbxPhanQuyen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblDSHoaDon;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHoaDon;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblIconHotel1;
    private javax.swing.JLabel lblNhanVien;
    private javax.swing.JLabel lblSanPham;
    private javax.swing.JLabel lblThongTin;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel pnCaLam;
    private javax.swing.JPanel pnDSHoaDon;
    private javax.swing.JPanel pnHeader;
    private javax.swing.JPanel pnHoaDon;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnNhanVien;
    private javax.swing.JPanel pnRoot;
    private javax.swing.JPanel pnSanPham;
    private javax.swing.JPanel pnView;
    // End of variables declaration//GEN-END:variables
}
