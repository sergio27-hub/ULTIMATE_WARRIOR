/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.AdministratorController;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import model.Person;

/**
 *
 * @author chejo
 */
public class ListadoAlumns extends javax.swing.JFrame {

    private final AdministratorController controller = new AdministratorController();
    private DefaultTableModel model; // Sirve para insertar datos en la tabla

    /**
     * Creates new form ListadoAlumns
     */
    public ListadoAlumns() {
        initComponents();
        loadStudents();
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
                trainer.getEmail(), trainer.getPassword(),trainer.getDiscipline(), trainer.getHours()};
            model.addRow(rowData);
        }
        table.setModel(model);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        AddAlumn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        AddAlumn.setBackground(new java.awt.Color(153, 153, 153));
        AddAlumn.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        AddAlumn.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        AddAlumn.setText("Agregar Alumno");
        AddAlumn.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("Actions.Yellow")));
        AddAlumn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddAlumnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AddAlumn, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(AddAlumn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
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

    private void AddAlumnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddAlumnMouseClicked
        AddAlumn addAlumn = new AddAlumn();
        addAlumn.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //Esto hara que al cerrar el JFrame, se oculte en lufar de terminar la ejecucion del programa
        addAlumn.setVisible(true);
    }//GEN-LAST:event_AddAlumnMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAlumn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
