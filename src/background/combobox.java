/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package background;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// tam thoi ko can su dung 
/**
 *
 * @author TRAN VAN TRI
 */
public class combobox {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
 
   private final String cityname[] = {"cocailone","normal"};
   private String data = "";

    JFrame f;
     final DefaultComboBoxModel cityName1 = new DefaultComboBoxModel();
        JComboBox cb = new JComboBox(cityname);
 
    combobox() {
        f = new JFrame("co cai nit");
 
        
        final DefaultComboBoxModel cityName1 = new DefaultComboBoxModel();
        JComboBox cb = new JComboBox(cityname);
        
        cb.setBounds(100, 50, 150, 20);
        f.add(cb);
         
        JLabel cityLabel = new JLabel("City: ");
        cityLabel.setBounds(50, 50, 80, 20);
        f.add(cityLabel);
 
        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e) {
        cb.setSelectedIndex(0);
                
                if (cb.getSelectedIndex() != -1) {
                    data = "City Selected: " + cb.getItemAt(
                            cb.getSelectedIndex());
                }
                
            }
       

 
    public static void main(String[] args) {
        new combobox();
        
    }

   
} 

