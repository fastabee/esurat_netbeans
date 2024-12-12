/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dashboard;
import adddebit.adddebit;
import addsurat.addsurat;
import adduser.adduser;
import e.surat.koneksi;
import e.surat.session.session;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import profil.profil;

/**
 *
 * @author fastabee
 */
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
        String nipawal = session.getNip();
        nip.setText(nipawal);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nama = new javax.swing.JTextField();
        tanggal = new javax.swing.JTextField();
        nip = new javax.swing.JTextField();
        jabatan = new javax.swing.JTextField();
        jam = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelstaff = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        role = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        overbooking = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        debitnote = new javax.swing.JLabel();
        L4 = new javax.swing.JPanel();
        L2 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nama.setEditable(false);
        nama.setText("jTextField1");
        jPanel2.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        tanggal.setEditable(false);
        tanggal.setText("jTextField1");
        jPanel2.add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 100, -1));

        nip.setEditable(false);
        nip.setText("jTextField1");
        jPanel2.add(nip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        jabatan.setEditable(false);
        jabatan.setText("jTextField1");
        jPanel2.add(jabatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, -1));

        jam.setEditable(false);
        jam.setText("jTextField1");
        jPanel2.add(jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 100, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/minihome-removebg-preview.png"))); // NOI18N
        jLabel5.setText("Dashboard");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/over.png"))); // NOI18N
        jLabel7.setText("  Overbooking");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/debitnore-removebg-preview.png"))); // NOI18N
        jLabel8.setText("DebitNote");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        labelstaff.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        labelstaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user-management-96-256.png"))); // NOI18N
        labelstaff.setText("    Staff");
        labelstaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelstaffMouseClicked(evt);
            }
        });
        labelstaff.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                labelstaffKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelstaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelstaff, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 120, 240));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 430));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        role.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        role.setText("jLabel1");
        jPanel3.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Area");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jLabel1.setText("BANK SUMSEL BABEL");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        photo.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/profil-removebg-preview.png"))); // NOI18N
        photo.setText("Profil");
        photo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                photoMouseClicked(evt);
            }
        });
        jPanel3.add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 90, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 680, 40));

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/over.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 102, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Surat");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 60, -1));

        overbooking.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        overbooking.setText("Surat");
        jPanel5.add(overbooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 180, 80));

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Surat");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 60, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/debitnore-removebg-preview.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, 100, 30));

        debitnote.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        debitnote.setText("Surat");
        jPanel6.add(debitnote, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, 80));

        L4.setBackground(new java.awt.Color(102, 102, 255));
        L4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        L2.setText("User/Admin");
        L4.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 70, -1));

        L1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        L1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user-management-96-256.png"))); // NOI18N
        L1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L1MouseClicked(evt);
            }
        });
        L1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                L1KeyPressed(evt);
            }
        });
        L4.add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 9, 168, -1));

        L3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        L3.setText("User/Admin");
        L4.add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 70, -1));

        jPanel1.add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, -1, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 800, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    // Timer untuk memperbarui waktu setiap detik
    Timer timer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Ambil waktu sekarang
            LocalTime sekarang = LocalTime.now();
            String waktuSekarang = sekarang.format(formatter);
            
            // Set ke JTextField atau komponen lainnya
            jam.setText(waktuSekarang);
        }
    });
    timer.start();

 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String datenow = sdf.format(new java.util.Date());
        tanggal.setText(datenow);

        
        
        
        
        String nipnya = nip.getText();
        
       

          
  
    
    try {
        // Koneksi ke database
        java.sql.Connection c = koneksi.getKoneksi();
        
        // Query untuk mengambil data user berdasarkan NIP
        String sql = "SELECT * FROM user WHERE nip = ?";
        java.sql.PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, nipnya); // Masukkan parameter NIP ke query
        
        // Eksekusi query
        java.sql.ResultSet rs = ps.executeQuery();
        
        // Jika data ditemukan, tampilkan di form
        if (rs.next()) {
            String namanya = rs.getString("nama"); // Kolom 'nama'
            String emailnya = rs.getString("email"); // Kolom 'email'
            String jabatannya = rs.getString("jabatan"); // Kolom 'jabatan'
            String levelnya = rs.getString("level"); // Kolom 'jabatan'
            String Phatphoto = rs.getString("foto");
            
            // Tampilkan data di JForm
            nama.setText(namanya); // Misal JTextField untuk nama
            nip.setText(nipnya); // Misal JTextField untuk email
            jabatan.setText(jabatannya); // Misal JTextField untuk jabatan
            role.setText(levelnya);
           if (Phatphoto != null && !Phatphoto.isEmpty()) { 
    try {
        BufferedImage bi = ImageIO.read(new File(Phatphoto));
        Image img = bi.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        photo.setIcon(icon); // Set ikon dari gambar
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat memuat gambar.");
        photo.setIcon(null); // Kosongkan ikon jika terjadi kesalahan
    }
} else {
    photo.setIcon(null); // Kosongkan ikon jika Phatphoto null atau kosong
}

            
           
            
        } else {
            // Jika data tidak ditemukan
            javax.swing.JOptionPane.showMessageDialog(this, "Data tidak ditemukan untuk NIP: " + nipnya);
        }
     String countUser = "SELECT COUNT(*) AS total_user FROM user";
        java.sql.PreparedStatement psUser = c.prepareStatement(countUser);
        java.sql.ResultSet rsUser = psUser.executeQuery();
        if (rsUser.next()) {
            int totalUser = rsUser.getInt("total_user");
            L2.setText(String.valueOf(totalUser)); // Tampilkan di JTextField atau JLabel
        }

        // Query untuk menghitung jumlah data pada tabel debit
        String countDebit = "SELECT COUNT(*) AS total_debit FROM debit where status = 1";
        java.sql.PreparedStatement psDebit = c.prepareStatement(countDebit);
        java.sql.ResultSet rsDebit = psDebit.executeQuery();
        if (rsDebit.next()) {
            int totalDebit = rsDebit.getInt("total_debit");
            debitnote.setText(String.valueOf(totalDebit)); // Tampilkan di JTextField atau JLabel
        }

        // Query untuk menghitung jumlah data pada tabel surat
        String countSurat = "SELECT COUNT(*) AS total_surat FROM surat where status = 1";
        java.sql.PreparedStatement psSurat = c.prepareStatement(countSurat);
        java.sql.ResultSet rsSurat = psSurat.executeQuery();
        if (rsSurat.next()) {
            int totalSurat = rsSurat.getInt("total_surat");
            overbooking.setText(String.valueOf(totalSurat)); // Tampilkan di JTextField atau JLabel
        }    
        
        
    } catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage());
    }
    
    String rolenya = role.getText();
     if ("admin".equals(rolenya)){
         L1.setVisible(true);
         L2.setVisible(true);
         L3.setVisible(true);
         L4.setVisible(true);
         labelstaff.setVisible(true);
         }else{
            L1.setVisible(false);
         L2.setVisible(false);
         L3.setVisible(false);
         L4.setVisible(false);
            labelstaff.setVisible(false);
            }
        
        
    }//GEN-LAST:event_formWindowOpened

    private void labelstaffKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_labelstaffKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_labelstaffKeyPressed

    private void labelstaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelstaffMouseClicked
        adduser add = new adduser();
        add.show();
        dispose();
        
    }//GEN-LAST:event_labelstaffMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        addsurat adsus = new addsurat();
        adsus.show();
         dispose();       
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        adddebit debit = new adddebit();
       debit.show();
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void photoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photoMouseClicked
       profil p = new profil();
       p.show();
       dispose();
    }//GEN-LAST:event_photoMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void L1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_L1MouseClicked

    private void L1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_L1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_L1KeyPressed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JPanel L4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel debitnote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jabatan;
    private javax.swing.JTextField jam;
    private javax.swing.JLabel labelstaff;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nip;
    private javax.swing.JLabel overbooking;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel role;
    private javax.swing.JTextField tanggal;
    // End of variables declaration//GEN-END:variables
}
