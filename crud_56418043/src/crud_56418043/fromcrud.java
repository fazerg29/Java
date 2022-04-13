
package crud_56418043;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fromcrud extends javax.swing.JFrame {

    /**
     * Creates new form fromcrud
     */
    public fromcrud() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_kodebarang = new javax.swing.JTextField();
        txt_namabarang = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        txt_stok = new javax.swing.JTextField();
        btn_simpan = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_kode = new javax.swing.JTextField();
        btn_cari = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_ambilkode = new javax.swing.JTextField();
        txt_ambilnama = new javax.swing.JTextField();
        txt_ambilstok = new javax.swing.JTextField();
        btn_ambilcari = new javax.swing.JButton();
        btn_ambilbarang = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_updatekode = new javax.swing.JTextField();
        txt_updatenama = new javax.swing.JTextField();
        txt_updateharga = new javax.swing.JTextField();
        txt_updatestok = new javax.swing.JTextField();
        btn_updatecari = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txt_hapuskode = new javax.swing.JTextField();
        btn_hapus = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Kode Barang");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Harga (IDR) ");

        jLabel4.setText("Stok");

        btn_simpan.setText("Simpan ");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_kodebarang)
                            .addComponent(txt_namabarang)
                            .addComponent(txt_harga)
                            .addComponent(txt_stok, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btn_simpan)))
                .addContainerGap(538, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_kodebarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_namabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_simpan)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tambah Barang", jPanel1);

        jLabel5.setText("Kode Barang");

        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(55, 55, 55)
                        .addComponent(txt_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_cari)))
                .addContainerGap(515, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_kode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_cari)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cari Barang", jPanel2);

        jLabel6.setText("Kode Barang");

        jLabel7.setText("Nama Barang");

        jLabel8.setText("Mengambil");

        txt_ambilkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ambilkodeActionPerformed(evt);
            }
        });

        btn_ambilcari.setText("Cari");
        btn_ambilcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ambilcariActionPerformed(evt);
            }
        });

        btn_ambilbarang.setText("Ambil Barang");
        btn_ambilbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ambilbarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_ambilkode, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_ambilcari))
                            .addComponent(txt_ambilnama)
                            .addComponent(txt_ambilstok)))
                    .addComponent(btn_ambilbarang))
                .addContainerGap(446, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_ambilkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_ambilcari)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_ambilnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txt_ambilstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btn_ambilbarang)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ambil Barang", jPanel3);

        jLabel9.setText("Kode Barang");

        jLabel10.setText("Nama Barang");

        jLabel11.setText("Harga");

        jLabel12.setText("Stok");

        btn_updatecari.setText("Cari");
        btn_updatecari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updatecariActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_updatenama)
                            .addComponent(txt_updateharga)
                            .addComponent(txt_updatestok, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(txt_updatekode))
                        .addGap(18, 18, 18)
                        .addComponent(btn_updatecari))
                    .addComponent(btn_update))
                .addContainerGap(445, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_updatekode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_updatecari)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_updatenama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_updateharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_updatestok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btn_update)
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("Update Barang", jPanel4);

        jLabel13.setText("Kode Barang");

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(37, 37, 37)
                        .addComponent(txt_hapuskode, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_hapus))
                .addContainerGap(521, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_hapuskode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btn_hapus)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hapus Barang", jPanel5);

        btn_refresh.setText("Refresh Barang");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Harga", "Stok"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_refresh))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 226, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        koneksi connect = new koneksi();
        String kode = txt_kodebarang.getText();
        String nama = txt_namabarang.getText();
        int harga = Integer.parseInt(txt_harga.getText());
        int stok = Integer.parseInt(txt_stok.getText());
        String query = "INSERT INTO barang (kode, nama, harga, stok) VALUES ('"+kode+"','"+nama+"','"+harga+"','"+stok+"')";
        try{
            connect.getStatement().executeUpdate(query);
            JOptionPane.showMessageDialog(null, "insert berhasil");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "insert gagal");
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        // TODO add your handling code here:
        koneksi connect = new koneksi();
        ResultSet data = null;
        int jumBaris = 0;
        int i = 0;
        String query = "SELECT * FROM barang";
        try{
            data = connect.getStatement().executeQuery(query);
            while(data.next()){
                jumBaris++;
            }
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        String isi[][] = new String[jumBaris][4];
        try{
            data = connect.getStatement().executeQuery(query);
            while(data.next()){
                isi[i][0]=data.getString("Kode");
                isi[i][1]=data.getString("Nama");
                isi[i][2]=data.getString("Harga");
                isi[i][3]=data.getString("Stok");
                i++;
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error lagi");
        }

        String NamaKolom[]={"Kode","Nama","Harga","Stok"};
        DefaultTableModel model=new DefaultTableModel(isi,NamaKolom){};
        jTable1.setModel(model);
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        
        koneksi connect = new koneksi();
        
        String kode = txt_kode.getText();
        String nama, harga, stok;
        ResultSet data= null;
        String query = "select * from barang where kode='"+kode+"'";
        try {
            data = connect.getStatement().executeQuery(query);
            if (data.next()){
                kode = data.getString("Kode");
                nama = data.getString("Nama");
                harga = data.getString("Harga");
                stok = data.getString("Stok");
                
                JOptionPane.showMessageDialog(null, "Kode : " + kode + "\nNama : " + nama +"\nHarga : " + harga + "\nStok : " + stok); 
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan");
        }
    }//GEN-LAST:event_btn_cariActionPerformed

    private void txt_ambilkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ambilkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ambilkodeActionPerformed

    private void btn_ambilcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ambilcariActionPerformed
        
              koneksi connect = new koneksi();

              String kode = txt_ambilkode.getText();
              String nama, harga, stok;

              ResultSet data = null;
              String query = "select * from barang where kode='"+kode+"'";
                
              try{
                  data = connect.getStatement().executeQuery(query);
                  if (data.next()){
                        nama = data.getString("nama");
                        txt_ambilnama.setText(nama);
                  }
                  else {
                      JOptionPane.showMessageDialog(null, "data tidak ditemukan");
                  }
                 
              }catch (SQLException ex){
                  JOptionPane.showMessageDialog(null, "error SQL");
              }
    }//GEN-LAST:event_btn_ambilcariActionPerformed

    private void btn_ambilbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ambilbarangActionPerformed
        
        koneksi connect = new koneksi();
        String kode = txt_ambilkode.getText();
        ResultSet data = null;
        int stok = 0;
        int ambil = Integer.parseInt(txt_ambilstok.getText());
        String queryStock = "select stok from barang where kode='"+kode+"'";
                try{
                    data = connect.getStatement().executeQuery(queryStock);
                    if(data.next()){
                        stok = Integer.parseInt(data.getString("stok"));
                    }
                    
                }catch (SQLException ex){
                    System.out.println(ex.getMessage());
                }
                System.out.println(stok);
                int sisa = stok-ambil;
                String query = "update barang set stok = '"+sisa+"' where kode = '"+kode+"'";
                try {
                    connect.getStatement().executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Update berhasil");
                }catch(SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Update gagal");
                }
    }//GEN-LAST:event_btn_ambilbarangActionPerformed

    private void btn_updatecariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updatecariActionPerformed
        // TODO add your handling code here:
              koneksi connect = new koneksi();

              String kode = txt_updatekode.getText();
              String nama, harga, stok;

              ResultSet data = null;
              String query = "select * from barang where kode='"+kode+"'";
                
              try{
                  data = connect.getStatement().executeQuery(query);
                  if (data.next()){
                        nama = data.getString("nama");
                        harga = data.getString("harga");
                        stok = data.getString("stok");
                        
                        txt_updatenama.setText(nama);
                        txt_updateharga.setText(harga);
                        txt_updatestok.setText(stok);
                  }
                  else {
                      JOptionPane.showMessageDialog(null, "data tidak ditemukan");
                  }
                 
              }catch (SQLException ex){
                  JOptionPane.showMessageDialog(null, "error SQL");
              }
    }//GEN-LAST:event_btn_updatecariActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        
        koneksi connect = new koneksi();
        String kode = txt_updatekode.getText();
        String nama = txt_updatenama.getText();
        String harga = txt_updateharga.getText();
        String stok = txt_updatestok.getText();
        
        String query = "Update barang set nama = '"+nama+"', harga = '"+harga+"', stok = '"+stok+"' where kode = '"+kode+"'";
        
        try {
            connect.getStatement().executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Update berhasil");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Update gagal");
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        koneksi connect = new koneksi();
        
        String kode = txt_hapuskode.getText();
        String query = "Delete from barang where kode='"+kode+"'";
        
        try{
            int konfirmasi = JOptionPane.showConfirmDialog(null,"ingin dihapus");
            if (konfirmasi == 0){
                connect.getStatement().executeUpdate(query);
                JOptionPane.showMessageDialog(null,"data berhasil dihapus");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"error SQL");
        }
        
    }//GEN-LAST:event_btn_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(fromcrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fromcrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fromcrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fromcrud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fromcrud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ambilbarang;
    private javax.swing.JButton btn_ambilcari;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btn_updatecari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_ambilkode;
    private javax.swing.JTextField txt_ambilnama;
    private javax.swing.JTextField txt_ambilstok;
    private javax.swing.JTextField txt_hapuskode;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_kode;
    private javax.swing.JTextField txt_kodebarang;
    private javax.swing.JTextField txt_namabarang;
    private javax.swing.JTextField txt_stok;
    private javax.swing.JTextField txt_updateharga;
    private javax.swing.JTextField txt_updatekode;
    private javax.swing.JTextField txt_updatenama;
    private javax.swing.JTextField txt_updatestok;
    // End of variables declaration//GEN-END:variables
}
