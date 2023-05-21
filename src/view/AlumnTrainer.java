/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.AdministratorController;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.Discipline;
import model.Person;

/**
 *
 * @author chejo
 */
public class AlumnTrainer extends javax.swing.JFrame {

    private final AdministratorController controller = new AdministratorController();

    private DefaultComboBoxModel modelDisciplines = new DefaultComboBoxModel<>();

    private DefaultTableModel model; // Sirve para insertar datos en la tabla

    public AlumnTrainer() {
        initComponents();
        loadDisciplines();
        if (!controller.isEmpty() || controller != null) { //isEmpty() en lugar de size() para verificar si el controlador está vacío. Si el controlador no está vacío, se llama al método loadStudents() para cargar los estudiantes en la tabla. De lo contrario, no se realiza ninguna acción
            loadStudents();
        }
        addWindowListener(new WindowAdapter() { // Es parte del ciclo de vida del JPanel o JFrame, el cual indica que cada vez que está activado realiza lo que esta dentro del metodo.
            @Override //Sobreescribir
            public void windowActivated(WindowEvent e) {
                loadStudents();
            }
        });

    }

    private void loadStudents() {
        ArrayList<Person> trainers = controller.getStudents();
        model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("DNI");
        model.addColumn("Email");
        model.addColumn("Contraseña");
        model.addColumn("Disciplina");
        model.addColumn("Horario");

        // model.setColumnEditable(1,false);
        // model.setColumnEditable(2,false);
        for (Person trainer : trainers) {
            Object[] rowData = {trainer.getName(), trainer.getLastname(), trainer.getDni(),
                trainer.getEmail(), trainer.getPassword(), trainer.getDiscipline(), trainer.getHours()};
            model.addRow(rowData);
        }
        TableAlumn.setModel(model);
    }

    private void loadDisciplines() {
        ArrayList<Discipline> disciplines = controller.getAllDisciplines();
        for (Discipline discipline : disciplines) {
            modelDisciplines.addElement(discipline.getName());
        }
        ComboBoxDiscipline.setModel(modelDisciplines);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAlumn = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        buttonaddNewStudent = new java.awt.Button();
        ComboBoxDiscipline = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        buttonLabelMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TableAlumn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "LastName", "Discipline", "DNI"
            }
        ));
        jScrollPane1.setViewportView(TableAlumn);

        jLabel1.setText("STUDENTS: ");

        buttonaddNewStudent.setLabel("ADD NEW STUDENT");
        buttonaddNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonaddNewStudentActionPerformed(evt);
            }
        });

        ComboBoxDiscipline.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("SEGUN DISCIPILNA :");

        buttonLabelMostrar.setText("Mostrar");
        buttonLabelMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLabelMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ComboBoxDiscipline, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addComponent(buttonaddNewStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(buttonLabelMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBoxDiscipline, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(buttonLabelMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonaddNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonaddNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonaddNewStudentActionPerformed
        AddAlumn addAlumn = new AddAlumn();
        addAlumn.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //Esto hara que al cerrar el JFrame, se oculte en lufar de terminar la ejecucion del programa
        addAlumn.setVisible(true);
    }//GEN-LAST:event_buttonaddNewStudentActionPerformed

    private void buttonLabelMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLabelMostrarActionPerformed
        String discipline = ComboBoxDiscipline.getSelectedItem().toString();
    }//GEN-LAST:event_buttonLabelMostrarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxDiscipline;
    private javax.swing.JTable TableAlumn;
    private javax.swing.JButton buttonLabelMostrar;
    private java.awt.Button buttonaddNewStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
