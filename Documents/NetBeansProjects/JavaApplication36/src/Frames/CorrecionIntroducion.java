/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Funcionamiento.Conexion;
import javax.swing.ImageIcon;
import recursograficoscom.Barras;
import recursograficoscom.Fondo;

/**
 *
 * @author Durfen
 */
public class CorrecionIntroducion extends javax.swing.JFrame {
    //elementos lógicos
    private int idusuario;
    private int idcorrecion;
    private int contador = 1;
    private String [] respuestas;
    //elementos visuales
    private Barras barrasupe = new Barras();
    private Fondo fondo = new Fondo();
    
    //constructor
    public CorrecionIntroducion(int idusario,int idcorrecion, String [] respuestas) {
        this.idusuario=idusario;
        this.idcorrecion =idcorrecion;
        this.respuestas = respuestas;
        initComponents();
        iniciarcomponentes();
        setVisible(true);
        
    }
    //inicio manual
    private void iniciarcomponentes(){
        setIconImage (new ImageIcon(getClass().getResource("/Imagenescomun/Logo.png")).getImage());
        respuesta.setText(respuestas[0]);
        setResizable(false); 
        add(barrasupe);
        add(fondo);
        barrasupe.setBounds(0, 0, 700, 20);
        fondo.setBounds(0, 0, 5888, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enunciado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        respuesta = new javax.swing.JTextArea();
        botonnext = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        enunciado.setText("1. ¿Cómo puedes saber cuál es el centro de salud que te corresponde?");

        respuesta.setColumns(20);
        respuesta.setRows(5);
        jScrollPane1.setViewportView(respuesta);

        botonnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenescomun/next.png"))); // NOI18N
        botonnext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonnextMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Enunciados/correcionescrita.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonnext)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(botonnext)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonnextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonnextMouseClicked

        //Switch que organiza en que parte del text se encuentra. Se introduce la respuesta en un array
        switch (contador) {
            case 1:
                enunciado.setText("2. ¿Qué hay que hacer para pedir cita por internet?");
                respuesta.setText(respuestas[1]);
                contador++;
                break;
            case 2:
                enunciado.setText("3. ¿Qué documentos necesitas para tener la tarjeta sanitaria?");
                respuesta.setText(respuestas[2]);
                contador++;
                break;
            case 3:
                enunciado.setText("4. ¿Qué documento tienes que rellenar en la Seguridad Social?");
                respuesta.setText(respuestas[3]);
                contador++;
                break;
            case 4:
                enunciado.setText("5. ¿Qué documento te dan en la Seguridad Social después de completar la solicitud?");
                respuesta.setText(respuestas[4]);
                contador++;
                break;
            case 5:
                enunciado.setText("6. ¿Qué pasos hay que seguir para obtener la tarjeta sanitaria?");
                respuesta.setText(respuestas[5]);
                contador++;
                break;
            case 6:
                enunciado.setText("7. ¿Para qué sirve el documento acreditativo del derecho a la asistencia?");
                respuesta.setText(respuestas[6]);
                contador++;
                break;
            case 7:
                //se p
                CorrecionTextos correcion = new CorrecionTextos(idusuario,idcorrecion,true);
                dispose();
                
        }
    }//GEN-LAST:event_botonnextMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botonnext;
    private javax.swing.JLabel enunciado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea respuesta;
    // End of variables declaration//GEN-END:variables
}