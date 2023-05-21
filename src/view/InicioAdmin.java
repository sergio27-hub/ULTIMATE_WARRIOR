/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Image;
import javax.swing.*;
import javax.swing.ImageIcon;

/**
 *
 * @author chejo
 */
public class InicioAdmin extends javax.swing.JFrame {

    private ImageIcon imagen;
    private Icon icono;
    //private final AdministratorController controller = new AdministratorController();

    /**
     * Creates new form InicioAdmin
     */
    public InicioAdmin() {
        this.setLocationRelativeTo(this);
        // this.PintarImagen(this.ImageAdmin, "src/img/ADMIN.png");
        initComponents();
    }

    private void PintarImagen(JLabel ImageAdmin, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(
                ImageAdmin.getWidth(),
                ImageAdmin.getHeight(),
                Image.SCALE_DEFAULT)
        );
        ImageAdmin.setIcon(this.icono);
        this.repaint();
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
        ImageAdmin = new javax.swing.JLabel();
        ButtonTrainers = new java.awt.Button();
        ButtonStudents = new java.awt.Button();
        Title1 = new javax.swing.JLabel();
        ButtonNewDiscipline = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        ButtonTrainers.setActionCommand("TRAINERS");
        ButtonTrainers.setBackground(new java.awt.Color(0, 0, 153));
        ButtonTrainers.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        ButtonTrainers.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTrainers.setLabel("Profesores");
        ButtonTrainers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonTrainersMouseClicked(evt);
            }
        });

        ButtonStudents.setBackground(new java.awt.Color(102, 0, 102));
        ButtonStudents.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        ButtonStudents.setForeground(new java.awt.Color(255, 255, 255));
        ButtonStudents.setLabel("Alumnos");
        ButtonStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonStudentsMouseClicked(evt);
            }
        });

        Title1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 48)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setText("ADMINISTRADOR");

        ButtonNewDiscipline.setText("Nueva Disciplina");
        ButtonNewDiscipline.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ButtonNewDiscipline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonNewDisciplineMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                .addComponent(ImageAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonTrainers, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(ButtonStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonNewDiscipline, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(371, 371, 371))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(ButtonTrainers, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(ButtonStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(ImageAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(ButtonNewDiscipline, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("TRAINERS");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonTrainersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonTrainersMouseClicked
        
        ListadoTrainers listadoTrainers = new ListadoTrainers();
        listadoTrainers.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //Esto hara que al cerrar el JFrame, se oculte en lufar de terminar la ejecucion del programa
        listadoTrainers.setVisible(true);
    }//GEN-LAST:event_ButtonTrainersMouseClicked

    private void ButtonStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonStudentsMouseClicked
       
        ListadoAlumns listadoAlumns = new ListadoAlumns();
        listadoAlumns.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //Esto hara que al cerrar el JFrame, se oculte en lufar de terminar la ejecucion del programa
        listadoAlumns.setVisible(true);
    }//GEN-LAST:event_ButtonStudentsMouseClicked

    private void ButtonNewDisciplineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonNewDisciplineMouseClicked
       
        NewDiscipline newDiscipline = new NewDiscipline();
        newDiscipline.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //Esto hara que al cerrar el JFrame, se oculte en lufar de terminar la ejecucion del programa
        newDiscipline.setVisible(true);
    }//GEN-LAST:event_ButtonNewDisciplineMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonNewDiscipline;
    private java.awt.Button ButtonStudents;
    private java.awt.Button ButtonTrainers;
    private javax.swing.JLabel ImageAdmin;
    private javax.swing.JLabel Title1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
