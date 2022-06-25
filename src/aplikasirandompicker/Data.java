/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasirandompicker;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//import netscape.proteanit.sql.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Data extends javax.swing.JFrame {
    private boolean databaru;
    private final Koneksi koneksi = new Koneksi();
    /**
     * Creates new form Data
     */
    public Data() {
        initComponents();
        getData();
        databaru = true;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Next = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        InputData = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelData = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        ButtonDelete = new javax.swing.JButton();
        Inputnomor = new javax.swing.JTextField();
        ButtonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Developed by Vani Aulia Pramesti");

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("No.     :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        Next.setBackground(new java.awt.Color(23, 240, 52));
        Next.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Next.setText("NEXT");
        Next.setAutoscrolls(true);
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        getContentPane().add(Next, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        jLabel4.setBackground(new java.awt.Color(0, 153, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("SILAHKAN MASUKAN DATA MAHASISWA");
        getContentPane().add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jPanel4.setBackground(new java.awt.Color(0, 51, 51));

        InputData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputDataActionPerformed(evt);
            }
        });

        TabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama Mahasiswa"
            }
        ));
        TabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelData);

        AddButton.setBackground(new java.awt.Color(248, 89, 14));
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Add");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        UpdateButton.setBackground(new java.awt.Color(248, 89, 14));
        UpdateButton.setForeground(new java.awt.Color(255, 255, 255));
        UpdateButton.setText("Update");
        UpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateButtonMouseClicked(evt);
            }
        });
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        ButtonDelete.setBackground(new java.awt.Color(248, 89, 14));
        ButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDelete.setText("Delete");
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });

        Inputnomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputnomorActionPerformed(evt);
            }
        });

        ButtonReset.setBackground(new java.awt.Color(248, 89, 14));
        ButtonReset.setForeground(new java.awt.Color(255, 255, 255));
        ButtonReset.setText("Reset");
        ButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(InputData, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Inputnomor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(ButtonReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Inputnomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(InputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(UpdateButton)
                    .addComponent(ButtonDelete))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        if (databaru){
            try {
                String sql = "INSERT INTO mahasiswa VALUES ('%s', '%s')";
                
                sql = String.format(
                        sql,
                        Inputnomor.getText(),
                        InputData.getText()
                        
                );
                Connection conn = koneksi.getKoneksi();
                PreparedStatement pst = conn.prepareStatement(sql);
                
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Berhasil Ditambahkan");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal Ditambahkan");
            }
        }
        else{
            try {
                String sql = "UPDATE mahasiswa SET  Nama_Mahasiswa='%s' WHERE Nomor='%s'";
                
                sql = String.format(
                        sql,
                        InputData.getText(),
                        Inputnomor.getText()
                        
                );
                Connection conn = koneksi.getKoneksi();
                PreparedStatement pst = conn.prepareStatement(sql);
                
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Berhasil Diedit");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal diedit");
            }
        
        }
        getData();
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        try {
            // TODO add your handling code here:
            String sql = "DELETE FROM mahasiswa WHERE Nomor='"+Inputnomor.getText()+"'";
            
            Connection conn = koneksi.getKoneksi();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Gagal Dihapus");
        }
        getData();
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void InputDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputDataActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        // TODO add your handling code here:
        new Random().setVisible(true);
    }//GEN-LAST:event_NextActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        if (databaru){
            try {
                String sql = "INSERT INTO mahasiswa VALUES ('%s', '%s')";
                
                sql = String.format(
                        sql,
                        Inputnomor.getText(),
                        InputData.getText()
                        
                );
                Connection conn = koneksi.getKoneksi();
                PreparedStatement pst = conn.prepareStatement(sql);
                
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Berhasil Ditambahkan");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal Ditambahkan");
            }
        }
        else{
            try {
                String sql = "UPDATE mahasiswa SET  Nama_Mahasiswa='%s' WHERE Nomor='%s'";
                
                sql = String.format(
                        sql,
                        InputData.getText(),
                        Inputnomor.getText()
                        
                );
                Connection conn = koneksi.getKoneksi();
                PreparedStatement pst = conn.prepareStatement(sql);
                
                pst.execute();
                
                JOptionPane.showMessageDialog(null, "Berhasil Diedit");
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal diedit");
            }
        
        }
        getData();
        
    }//GEN-LAST:event_AddButtonActionPerformed

    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        // TODO add your handling code here:
        /*try {
            
        }catch (Exception e){
            String sql = "SELECT INTO tb_mahasiswa VALUE ('" + InputData.getText()+"','";
            
            //Connectionction con =(Connection) Koneksi.koneksiDB();
        }*/
    }//GEN-LAST:event_AddButtonMouseClicked

    private void ButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetActionPerformed
        // TODO add your handling code here:
        InputData.setText("");
        Inputnomor.setText("");
    }//GEN-LAST:event_ButtonResetActionPerformed

    private void TabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelDataMouseClicked
        /*DefaultTableModel model = (DefaultTableModel)TabelData.getModel();
        int Mytouch = TabelData.getSelectedRow();
        Inputnomor.setText(model.getValueAt(Mytouch, 0).toString());
        InputData.setText(model.getValueAt(Mytouch, 0).toString());*/
        try {
            
            databaru = false;
            
            int row = TabelData.getSelectedRow();
            String nomor_mahasiswa = TabelData.getModel().getValueAt(row, 0).toString();
            
            Connection conn = koneksi.getKoneksi();
            Statement stm = conn.createStatement();
            ResultSet sql = stm.executeQuery("SELECT * FROM mahasiswa WHERE Nomor='"+nomor_mahasiswa+"'");
            
            if (sql.next()){
                Inputnomor.setText(sql.getString("Nomor"));
                InputData.setText(sql.getString("Nama_Mahasiswa"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_TabelDataMouseClicked

    private void InputnomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputnomorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputnomorActionPerformed

    private void UpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateButtonMouseClicked

    private void getData(){
        try {
            Connection conn = koneksi.getKoneksi();
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery("select * from mahasiswa");
            
            DefaultTableModel model = (DefaultTableModel) TabelData.getModel();
            
            model.setRowCount(0);
            
            while(result.next()){
                String no = result.getString("Nomor");
                String nama = result.getString("Nama_Mahasiswa"); // Nama kolom di tabel mahasiswa
                
                model.addRow(new Object[]{no, nama});
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonReset;
    private javax.swing.JTextField InputData;
    private javax.swing.JTextField Inputnomor;
    public static javax.swing.JButton Next;
    public static javax.swing.JTable TabelData;
    public static javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    Data(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}