/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.AdministratorController;
import java.awt.Image;
import static java.awt.SystemColor.text;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author chejo
 */
public class InicioAlumn extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
    private final AdministratorController controller = new AdministratorController();
    private String texto = "\"ENFRENTATE A CADA DESAFIOCON VALENTIA Y DETERMINACIÓN. RECUERDA QUE CADA BATALLA TE ACERCA MÁS A LA VICTORIA."
            + "! NO TE RINDAS SIGUE LUCHANDO Y ALCANZARÁS TUS METAS!\"";

    /**
     * Creates new form InicioAlumn
     */
    public InicioAlumn() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.PintarImagen(this.ImagenFondo, "src/img/fondo.jpg");
        frase.setText(TextoFrase(texto));

    }

    public String TextoFrase(String texto) {
        return "<html><p>" + texto + "</p></html>";
    }

    private void PintarImagen(JLabel ImagenFondo, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(
                ImagenFondo.getWidth(),
                ImagenFondo.getHeight(),
                Image.SCALE_DEFAULT)
        );
        ImagenFondo.setIcon(this.icono);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        frase = new javax.swing.JLabel();
        buttonComents = new java.awt.Button();
        ImagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOLA CAMPEÓN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 44, -1, -1));

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("FRASE DEL DIA ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 340, 90));

        frase.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        frase.setForeground(new java.awt.Color(255, 0, 0));
        frase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frase.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        frase.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel1.add(frase, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 570, 180));

        buttonComents.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        buttonComents.setLabel("DEJAR COMENTARIO DE CLASE");
        buttonComents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonComentsMouseClicked(evt);
            }
        });
        buttonComents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonComentsActionPerformed(evt);
            }
        });
        jPanel1.add(buttonComents, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 610, 350, 40));
        jPanel1.add(ImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, -1, 980, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonComentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonComentsActionPerformed

    }//GEN-LAST:event_buttonComentsActionPerformed

    private void buttonComentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonComentsMouseClicked
        CommentsStudents commentsview = new CommentsStudents();
        commentsview.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //Esto hara que al cerrar el JFrame, se oculte en lufar de terminar la ejecucion del programa
        commentsview.setVisible(true);
    }//GEN-LAST:event_buttonComentsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenFondo;
    private java.awt.Button buttonComents;
    private javax.swing.JLabel frase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
