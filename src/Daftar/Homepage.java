package Daftar;
import javax.swing.JFrame;
public class Homepage extends javax.swing.JFrame {
    public Homepage() {
        initComponents(); 
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setExtendedState(JFrame.MAXIMIZED_VERT);

//        setExtendedState(JFrame.MAXIMIZED_VERT);
        setVisible(true);
        setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nomor = new javax.swing.JTextField();
        umur = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        pria = new javax.swing.JRadioButton();
        wanita = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        telepon = new javax.swing.JTextField();
        Orthopedi = new javax.swing.JButton();
        PDalam = new javax.swing.JButton();
        THT = new javax.swing.JButton();
        Bedah = new javax.swing.JButton();
        Kulit = new javax.swing.JButton();
        nama = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 255, 102));

        jLabel1.setBackground(new java.awt.Color(0, 255, 102));
        jLabel1.setFont(new java.awt.Font("News706 BT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RUMAH SAKIT KEPUTIH");

        jLabel2.setText("Jalan Arief Rahman Hakim No 56, Keputih, Sukolilo, Surabaya");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setText("Nama");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel4.setText("Umur");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 137, -1, -1));

        jLabel5.setText("Alamat");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, -1, -1));

        jLabel6.setText("Nomor Identitas");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, -1, -1));

        jLabel7.setText("Jenis Kelamin");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 221, -1, -1));
        jPanel2.add(nomor, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 106, 202, -1));
        jPanel2.add(umur, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 134, 202, -1));
        jPanel2.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 166, 202, -1));

        pria.setText("Pria");
        pria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priaActionPerformed(evt);
            }
        });
        jPanel2.add(pria, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 217, -1, -1));

        wanita.setText("Wanita");
        wanita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wanitaActionPerformed(evt);
            }
        });
        jPanel2.add(wanita, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 217, -1, -1));

        jLabel9.setText("No Telepon");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 201, -1, -1));
        jPanel2.add(telepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 193, 202, -1));

        Orthopedi.setBackground(new java.awt.Color(0, 255, 102));
        Orthopedi.setForeground(new java.awt.Color(255, 255, 255));
        Orthopedi.setText("Orthopedi");
        Orthopedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrthopediActionPerformed(evt);
            }
        });
        jPanel2.add(Orthopedi, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 76, -1, -1));

        PDalam.setBackground(new java.awt.Color(0, 255, 102));
        PDalam.setForeground(new java.awt.Color(255, 255, 255));
        PDalam.setText("P. Dalam");
        PDalam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDalamActionPerformed(evt);
            }
        });
        jPanel2.add(PDalam, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 105, 81, -1));

        THT.setBackground(new java.awt.Color(0, 255, 102));
        THT.setForeground(new java.awt.Color(255, 255, 255));
        THT.setText("THT");
        THT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THTActionPerformed(evt);
            }
        });
        jPanel2.add(THT, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 134, 81, -1));

        Bedah.setBackground(new java.awt.Color(0, 255, 102));
        Bedah.setForeground(new java.awt.Color(255, 255, 255));
        Bedah.setText("Bedah");
        Bedah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BedahActionPerformed(evt);
            }
        });
        jPanel2.add(Bedah, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 163, 81, -1));

        Kulit.setBackground(new java.awt.Color(0, 255, 102));
        Kulit.setForeground(new java.awt.Color(255, 255, 255));
        Kulit.setText("Kulit");
        Kulit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KulitActionPerformed(evt);
            }
        });
        jPanel2.add(Kulit, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 192, 81, -1));
        jPanel2.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 77, 202, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void OrthopediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrthopediActionPerformed
        // TODO add your handling code here:
        Orthopedi O=new Orthopedi();
        O.setNama(nama.getText());
        O.setNomor(nomor.getText());
        O.setUmur(umur.getText());
        O.setAlamat(alamat.getText());
        O.setTelepon(telepon.getText());
        O.setPoli("Orthopedi");
        if(pria.isSelected()){
            O.setJenisKelamin(pria.getText());
        }else{
            O.setJenisKelamin(wanita.getText());
        }
        
        O.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_OrthopediActionPerformed

    private void PDalamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDalamActionPerformed
        // TODO add your handling code here:
         PDalam PD=new PDalam();
         PD.setNama(nama.getText());
         PD.setNomor(nomor.getText());
         PD.setUmur(umur.getText());
         PD.setAlamat(alamat.getText());
         PD.setTelepon(telepon.getText());
         PD.setPoli("Penyakit Dalam");
         if(pria.isSelected()){
             PD.setJenisKelamin(pria.getText());
         }
         else{
             PD.setJenisKelamin(wanita.getText());
         }
         PD.setVisible(true);
         this.dispose();
         
    }//GEN-LAST:event_PDalamActionPerformed

    private void THTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THTActionPerformed
        // TODO add your handling code here:
         THT T=new THT();
         T.setNama(nama.getText());
         T.setNomor(nomor.getText());
         T.setUmur(umur.getText());
         T.setAlamat(alamat.getText());
         T.setTelepon(telepon.getText());
         T.setPoli("Penyakit Dalam");
         if(pria.isSelected()){
             T.setJenisKelamin(pria.getText());
         }
         else{
             T.setJenisKelamin(wanita.getText());
         }
        T.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_THTActionPerformed

    private void BedahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BedahActionPerformed
        // TODO add your handling code here:
         Bedah B=new Bedah();
         B.setNama(nama.getText());
         B.setNomor(nomor.getText());
         B.setUmur(umur.getText());
         B.setAlamat(alamat.getText());
         B.setTelepon(telepon.getText());
         B.setPoli("Penyakit Dalam");
         if(pria.isSelected()){
             B.setJenisKelamin(pria.getText());
         }
         else{
             B.setJenisKelamin(wanita.getText());
         }      
        B.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BedahActionPerformed

    private void KulitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KulitActionPerformed
        // TODO add your handling code here:
         Kulit K=new Kulit();
         K.setNama(nama.getText());
         K.setNomor(nomor.getText());
         K.setUmur(umur.getText());
         K.setAlamat(alamat.getText());
         K.setTelepon(telepon.getText());
         K.setPoli("Penyakit Dalam");
         if(pria.isSelected()){
             K.setJenisKelamin(pria.getText());
         }
         else{
             K.setJenisKelamin(wanita.getText());
         }      
        K.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KulitActionPerformed

    private void priaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priaActionPerformed
        // TODO add your handling code here:
        if(pria.isSelected()){
            wanita.setSelected(false);
        }
    }//GEN-LAST:event_priaActionPerformed

    private void wanitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wanitaActionPerformed
        // TODO add your handling code here:
        if(wanita.isSelected()){
            pria.setSelected(false);
        }
    }//GEN-LAST:event_wanitaActionPerformed
 
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
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bedah;
    private javax.swing.JButton Kulit;
    private javax.swing.JButton Orthopedi;
    private javax.swing.JButton PDalam;
    private javax.swing.JButton THT;
    private javax.swing.JTextField alamat;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nomor;
    private javax.swing.JRadioButton pria;
    private javax.swing.JTextField telepon;
    private javax.swing.JTextField umur;
    private javax.swing.JRadioButton wanita;
    // End of variables declaration//GEN-END:variables
}
