/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.pkgfinal.de.curso;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.WindowConstants;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author User21
 */
public class Insulina extends javax.swing.JFrame {
    private int id;
    private int limit = 0;
    private String url ="jdbc:mysql://192.168.1.215:3306/insulina";
    private Connection connect;
    private PreparedStatement stmt;

    /**
     * Creates new form Insulina
     */
    public Insulina(int id) {
        initComponents();
        setVisible(true);
        this.id=id;
        Dimension dim = getSize();
        Imagenfondo im = new Imagenfondo(dim);
        ImageIcon ic = new ImageIcon("src/cosa/insulina.png");
        setLocationRelativeTo(null);
        setTitle("Medinsa");
        this.setIconImage(ic.getImage());
        im.setSize(dim);
        im.setImage("/cosa/fondo.png");
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.add(im, BorderLayout.CENTER);

        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        swit = new javax.swing.JButton();
        Consultar = new javax.swing.JButton();
        jdia = new javax.swing.JComboBox();
        jmes = new javax.swing.JComboBox();
        jaño = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        volver = new javax.swing.JToggleButton();
        Mostrar = new java.awt.TextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        swit.setText("Modo consulta"
        );
        swit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switActionPerformed(evt);
            }
        });

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        jdia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4","5","6" ,"7" ,"8" ,"9" ,"10" ,"11" ,"12" ,"13" ,"14" ,"15" ,"16" ,"17" ,"18" ,"19" ,"20","21","22" ,"23" ,"24" ,"25","26" ,"27" ,"29" ,"30" ,"31"}));

        jmes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "04", "05","06","07","08","09","10","11","12" }));

        jaño.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2017", "2018", "2019", "2020", "2020", "2020", "2021", "2022", "2023", "2024", "2020", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030","2031","2032","2033","2034","2035","2036","2037","2038","2039","2040","2041","2042","2044","2045","2046" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Día");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Mes");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Año");

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jLabel4.setText("CONSULTAR INSULINA");

        volver.setText("Cerrar ventana"
        );
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        Mostrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MostrarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 176, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(swit)
                                .addGap(0, 0, 0)
                                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(swit)
                    .addComponent(Consultar)
                    .addComponent(volver))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void switActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switActionPerformed
        try {
            //Se reutilizan las conexiones hasta el cambio consumiendo de esta manera menos recursos
            connect.close(); 
        } catch (SQLException ex) {
            Logger.getLogger(Insulina.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        Enviar_1 ev = new Enviar_1(id);
        ev.setVisible(true);
        dispose();
        }
    }//GEN-LAST:event_switActionPerformed

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
        
        int dia, mes, año;
        String dias, mess, años;
        String consulta;

        dias = (String) jdia.getSelectedItem();
        mess = (String) jmes.getSelectedItem();
        años = (String) jaño.getSelectedItem();

        dia = Integer.parseInt(dias);
        mes = Integer.parseInt(mess);
        año = Integer.parseInt(años);
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Insulina.class.getName()).log(Level.SEVERE, null, ex);
            }

            ResultSet rs;
            connect = DriverManager.getConnection(url, "root", "");
            consulta = "SELECT * FROM insulina WHERE d = ? AND m = ? AND a =? AND id=?";
            stmt = connect.prepareStatement(consulta);
            stmt.setInt(1, dia);
            stmt.setInt(2, mes);
            stmt.setInt(3, año);
            stmt.setInt(4, id);

            rs = stmt.executeQuery();
            int a = 0;
                while (rs.next()) {
                    System.out.println("22");
                    Mostrar.append("\nFecha: " + dia + "/" + mes + "/" + año
                            + "\nHora " + rs.getInt("hora") + ":" + rs.getInt("min")
                            + "       Azúcar:" + rs.getInt("azucar")
                            + "       Insulina administrada: " + rs.getInt("sulina"));
                    a =1;
                }
            if(a != 1){   
                Mostrar.append("\nNo se ha introducido ningún dato para esa fecha");
            }
            

            rs.close();
            stmt.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error trying to connect to the database", "Error :0002b", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Insulina.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_ConsultarActionPerformed

    private void MostrarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MostrarKeyTyped
        // TODO add your handling code here:
        if(Mostrar.getText().length()>=limit){
            evt.consume();
        }
    }//GEN-LAST:event_MostrarKeyTyped

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_volverActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private java.awt.TextArea Mostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox jaño;
    private javax.swing.JComboBox jdia;
    private javax.swing.JComboBox jmes;
    private javax.swing.JButton swit;
    private javax.swing.JToggleButton volver;
    // End of variables declaration//GEN-END:variables

}
