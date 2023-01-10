/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package background;

import java.awt.Color;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TRAN VAN TRI
 */
public class user extends javax.swing.JFrame {

    /**
     * Creates new form user
     */
    
    private List<sourceOFmilktea> sOf;
    private DefaultTableModel model;
    private int index;
    private ControllerImp controller;

    public user() {
        user.setDefaultLookAndFeelDecorated(true);

        initComponents();
        fomatuser();
        sOf = new ArrayList<>();
        model = (DefaultTableModel) table.getModel();

        loadDataFromFile("price.txt");

    }

    private void fomatuser() {
        this.getContentPane().setBackground(Color.pink);
        setTitle("User Method");
        jTabbedPane1.setFont(new Font("Time new roman", Font.BOLD, 15));
        // jTabbedPane1.getBoundsAt(0).setBounds(0, 0, 300, 500);
        for (int i = 0; i < jTabbedPane1.getTabCount(); i++) {
            jTabbedPane1.setBackgroundAt(i, Color.orange);
            jTabbedPane1.getComponentAt(i).setBackground(Color.orange);
        }
        delete.setText(" Delete ");

        logout.setText(" Log Out ");
        logout.setForeground(Color.red);
        logout.setBackground(Color.BLACK);
        cake.setText(" Super Delicious Cake ");
        cake.setFont(new Font(" ", Font.BOLD, 15));
        cake.setForeground(Color.red);
        cake.setBackground(Color.yellow);
        cake.setIcon(new ImageIcon(getClass().getResource("/background/Icon/cake.png")));
        cafe.setText(" Coffe ");
        cafe.setBackground(Color.black);
        cafe.setForeground(Color.red);
        cafe.setIcon(new ImageIcon(getClass().getResource("/background/Icon/cafe.png")));
        cafe.setFont(new Font(" ", Font.BOLD, 15));
        save.setText(" Save ");
        save.setBounds(0, 0, 40, 15);
        save.setForeground(Color.red);
        save.setBackground(Color.yellow);
        save.setFont(new Font("", Font.BOLD, 20));
        btnmilktea.setText(" MilkTea ");
        btnmilktea.setFont(new Font("Edwardian Script ITC ", Font.BOLD, 15));
        btnmilktea.setIcon(new ImageIcon(getClass().getResource("/background/Icon/icons8-coffee-to-go-50.png")));
        Color milk = new Color(255, 153, 153);
        btnmilktea.setBackground(milk);
        table.setOpaque(true);
        table.setFillsViewportHeight(true);
        table.getTableHeader().setForeground(Color.RED);
        table.getTableHeader().setFont(new Font("", Font.BOLD, 15));
        table.setRowHeight(20, 20);
        table.setGridColor(Color.black);
        table.setFont(new Font("Time New Roman", Font.BOLD, 17));
        table.setBackground(new Color(255, 204, 204));
    }

    private void showdata() {
        model.setRowCount(0);
        for (sourceOFmilktea sof : sOf) {
            model.addRow(new Object[]{
                sof.getName(), sof.getType(), sof.getCost(), sof.getNum()
            });
        }

    }

    public void addMilkTea(sourceOFmilktea m) {
        sOf.add(m);
        showdata();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnmilktea = new javax.swing.JButton();
        cafe = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        save = new javax.swing.JButton();
        cake = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        bill = new javax.swing.JButton();
        logout = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("fbvcbc");

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));
        jTabbedPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 102));

        btnmilktea.setText("trausua");
        btnmilktea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmilkteaActionPerformed(evt);
            }
        });

        cafe.setText("cfe");
        cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cafeActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Name's Items", "Type", "Cost", "Number"
            }
        ));
        jScrollPane3.setViewportView(table);

        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        cake.setText("cake");
        cake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cakeActionPerformed(evt);
            }
        });

        delete.setText("jButton1");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        bill.setText("bill");
        bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete)
                .addGap(18, 18, 18)
                .addComponent(save)
                .addGap(44, 44, 44)
                .addComponent(bill)
                .addGap(256, 256, 256))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(btnmilktea)
                        .addGap(18, 18, 18)
                        .addComponent(cafe)
                        .addGap(18, 18, 18)
                        .addComponent(cake))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmilktea)
                    .addComponent(cafe)
                    .addComponent(cake))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(delete)
                    .addComponent(bill))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Order some thing ", jPanel2);

        logout.setText("jButton1");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        login lg = new login();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int i_row = table.getSelectedRow();
        int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắn chắn xóa dòng đã chọn?");
        if (luaChon == JOptionPane.YES_OPTION) {

            model.removeRow(i_row);
        }
    }//GEN-LAST:event_deleteActionPerformed
    private final  cake n = new cake(this, rootPaneCheckingEnabled);
    private void cakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cakeActionPerformed
        // TODO add your handling code here:

        n.setVisible(true);
    }//GEN-LAST:event_cakeActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        try {
            PrintStream pw = new PrintStream("billex.txt");
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                pw.println(
                        model.getValueAt(i, 0) + "  "
                        + (model.getValueAt(i, 1) + "").replace(' ', '_') + "\t"
                        + model.getValueAt(i, 2) + "  " + model.getValueAt(i, 3)
                );
            }
            pw.close();
            JOptionPane.showMessageDialog(null, "complete");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "error");
        }
    }//GEN-LAST:event_saveActionPerformed
    private void cafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafeActionPerformed
        // TODO add your handling code here:c#
      coffe c = new coffe(this, rootPaneCheckingEnabled);

        c.setVisible(true);
    }//GEN-LAST:event_cafeActionPerformed
private final milktea t = new milktea(this, rootPaneCheckingEnabled);
    private void btnmilkteaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmilkteaActionPerformed

        t.setVisible(true);
    }//GEN-LAST:event_btnmilkteaActionPerformed

    private void billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_billActionPerformed

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
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bill;
    private javax.swing.JButton btnmilktea;
    private javax.swing.JButton cafe;
    private javax.swing.JButton cake;
    private javax.swing.JButton delete;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton save;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void loadDataFromFile(String sd) {
        controller = new ControllerImp();
        sOf = controller.readDataFromFile(sd);
        showdata();
    }

}
