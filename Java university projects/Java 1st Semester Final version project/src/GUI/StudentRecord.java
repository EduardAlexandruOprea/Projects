
package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class StudentRecord extends javax.swing.JFrame {
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    
    public StudentRecord() {
        initComponents();
        con=Connect.ConnectDB();
        Get_Data();
        setLocationRelativeTo(null);
    }
    
    private void Get_Data(){
        String sql = "select StudentID, FirstName ,LastName , Class  from StudentRecord";
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            dataTable.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        teacherRecord = new javax.swing.JButton();
        staffRecord = new javax.swing.JButton();
        teacherForm = new javax.swing.JButton();
        staffForm = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Record");

        dataTable.setBackground(new java.awt.Color(153, 153, 153));
        dataTable.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14"
            }
        ));
        dataTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataTable);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        teacherRecord.setBackground(new java.awt.Color(120, 120, 120));
        teacherRecord.setText("Teacher Record");
        teacherRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherRecordActionPerformed(evt);
            }
        });

        staffRecord.setBackground(new java.awt.Color(120, 120, 120));
        staffRecord.setText("Staff Record");
        staffRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffRecordActionPerformed(evt);
            }
        });

        teacherForm.setBackground(new java.awt.Color(120, 120, 120));
        teacherForm.setText("Teacher Form");
        teacherForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherFormActionPerformed(evt);
            }
        });

        staffForm.setBackground(new java.awt.Color(120, 120, 120));
        staffForm.setText("Staff Form");
        staffForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffFormActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(120, 120, 120));
        jButton11.setText("Logout");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(120, 120, 120));
        backButton.setText("Main Menu");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(18, 18, 18)
                .addComponent(teacherRecord)
                .addGap(18, 18, 18)
                .addComponent(staffRecord)
                .addGap(18, 18, 18)
                .addComponent(teacherForm)
                .addGap(18, 18, 18)
                .addComponent(staffForm)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backButton, jButton11, staffForm, staffRecord, teacherForm, teacherRecord});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(teacherForm)
                        .addComponent(staffForm)
                        .addComponent(jButton11))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(teacherRecord)
                        .addComponent(staffRecord)
                        .addComponent(backButton)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableMouseClicked
        try{
            con = Connect.ConnectDB();
            int row = dataTable.getSelectedRow();
            String tableClick = dataTable.getModel().getValueAt(row, 0).toString();
            String sql = "select * from StudentRecord where StudentID= "+tableClick;
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                this.hide();
                StudentForm student=new StudentForm();
                student.setVisible(true);
                String add1 = rs.getString("StudentID");
                student.studentIdField.setText(add1);
                String add2 = rs.getString("FirstName");
                student.firstNameField.setText(add2);
                String add3 = rs.getString("LastName");
                student.lastNameField.setText(add3);
                String add4 = rs.getString("DateOfBirth");
                student.dobField.setText(add4);
             
                String add9 = rs.getString("Address");
                student.addressField.setText(add9);
                String add10 = rs.getString("DateOfAcceptance");
                student.doaField.setText(add10);
               
            
                String add13 = rs.getString("Gender");
                student.cmbGender.setSelectedItem(add13);
                String add14 = rs.getString("Class");
                student.admissionClass.setText(add14);
                student.updateButton.setEnabled(true);
                student.deleteButton.setEnabled(true);
                student.saveButton.setEnabled(true);
                //student.studentIdField.setEnabled(true);
            }
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_dataTableMouseClicked

    private void teacherRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherRecordActionPerformed
        TeacherRecord record=new TeacherRecord();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_teacherRecordActionPerformed

    private void staffRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffRecordActionPerformed
        StaffRecord record=new StaffRecord();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_staffRecordActionPerformed

    private void teacherFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherFormActionPerformed
        TeacherForm form=new TeacherForm();
        this.hide();
        form.setVisible(true);
    }//GEN-LAST:event_teacherFormActionPerformed

    private void staffFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffFormActionPerformed
        StaffForm form=new StaffForm();
        this.hide();
        form.setVisible(true);
    }//GEN-LAST:event_staffFormActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Login login=new Login();
        this.hide();
        login.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        /*StudentForm menu=new StudentForm();
        this.hide();
        menu.setVisible(true);*/
        MainMenu m=new MainMenu();
        m.setVisible(true);
        this.hide();
    }//GEN-LAST:event_backButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
    this.hide();
    StudentForm form = new StudentForm();
    form.setVisible(true);
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
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable dataTable;
    private javax.swing.JButton jButton11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton staffForm;
    private javax.swing.JButton staffRecord;
    private javax.swing.JButton teacherForm;
    private javax.swing.JButton teacherRecord;
    // End of variables declaration//GEN-END:variables
}
