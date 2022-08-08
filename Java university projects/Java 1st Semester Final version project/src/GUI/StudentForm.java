
package GUI;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class StudentForm extends javax.swing.JFrame {

    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    /**
     * Creates new form StudentForm1
     */
    public StudentForm() {
        initComponents();
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        stud = new javax.swing.JSplitPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        cmbGender = new javax.swing.JComboBox<>();
        dobLabel = new javax.swing.JLabel();
        dobField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        studentIdLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        admissionClass = new javax.swing.JTextField();
        doaLabel = new javax.swing.JLabel();
        doaField = new javax.swing.JTextField();
        studentIdField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Form");

        stud.setDividerLocation(0);
        stud.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );

        stud.setLeftComponent(jPanel6);

        jLabel1.setBackground(new java.awt.Color(120, 120, 120));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Form");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 720));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 710));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Basic Info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        firstNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        firstNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name:");

        firstNameField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        firstNameField.setToolTipText("Enter First Name here");
        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });
        firstNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                firstNameFieldKeyTyped(evt);
            }
        });

        lastNameLabel.setBackground(new java.awt.Color(0, 0, 0));
        lastNameLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name:");
        lastNameLabel.setToolTipText("");

        lastNameField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lastNameField.setToolTipText("Enter Last Name Here");
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });
        lastNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastNameFieldKeyTyped(evt);
            }
        });

        addressLabel.setBackground(new java.awt.Color(0, 0, 0));
        addressLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Address:");

        genderLabel.setBackground(new java.awt.Color(0, 0, 0));
        genderLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Gender:");

        cmbGender.setBackground(new java.awt.Color(102, 102, 102));
        cmbGender.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        cmbGender.setForeground(new java.awt.Color(255, 255, 255));
        cmbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));

        dobLabel.setBackground(new java.awt.Color(0, 0, 0));
        dobLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dobLabel.setForeground(new java.awt.Color(255, 255, 255));
        dobLabel.setText("Date of Birth:");

        dobField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        dobField.setToolTipText("Enter Student's Date of Birth here");
        dobField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobFieldActionPerformed(evt);
            }
        });

        addressField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        addressField.setToolTipText("");
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });
        addressField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addressFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dobLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                            .addComponent(dobField)
                            .addComponent(firstNameField))
                        .addGap(321, 321, 321)
                        .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLabel)
                    .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Academic Info", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        studentIdLabel.setBackground(new java.awt.Color(0, 0, 0));
        studentIdLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        studentIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        studentIdLabel.setText("Student ID:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admission in Class:");

        admissionClass.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        doaLabel.setBackground(new java.awt.Color(0, 0, 0));
        doaLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        doaLabel.setForeground(new java.awt.Color(255, 255, 255));
        doaLabel.setText("Date of Admission:");

        doaField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        doaField.setToolTipText("Enter Student's Date of Admission here");
        doaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doaFieldActionPerformed(evt);
            }
        });

        studentIdField.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        studentIdField.setToolTipText("Enter Student ID here");
        studentIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdFieldActionPerformed(evt);
            }
        });
        studentIdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                studentIdFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentIdLabel)
                .addGap(18, 18, 18)
                .addComponent(studentIdField)
                .addGap(107, 107, 107)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(admissionClass)
                .addGap(72, 72, 72)
                .addComponent(doaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(doaField)
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(doaLabel)
                        .addComponent(admissionClass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(doaField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentIdLabel)
                        .addComponent(studentIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        backButton.setBackground(new java.awt.Color(120, 120, 120));
        backButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        newButton.setBackground(new java.awt.Color(120, 120, 120));
        newButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(120, 120, 120));
        updateButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(120, 120, 120));
        saveButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(120, 120, 120));
        deleteButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(458, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(18, 18, 18)
                .addComponent(newButton)
                .addGap(18, 18, 18)
                .addComponent(saveButton)
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addContainerGap(451, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backButton, deleteButton, newButton, saveButton, updateButton});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(saveButton)
                    .addComponent(newButton)
                    .addComponent(backButton))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        stud.setRightComponent(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(stud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stud)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdFieldActionPerformed
        
    }//GEN-LAST:event_studentIdFieldActionPerformed

    private void doaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doaFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainMenu menu=new MainMenu();
        this.hide();
        menu.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        firstNameField.setText("");
        studentIdField.setText("");
        lastNameField.setText("");
        addressField.setText("");
        cmbGender.setSelectedIndex(0);
        admissionClass.setText("");
        dobField.setText("");
        doaField.setText("");
        deleteButton.setEnabled(true);
        updateButton.setEnabled(true);
        studentIdField.requestFocus();
    }//GEN-LAST:event_newButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
         try{
            con = Connect.ConnectDB();
            String sql = "update StudentRecord set FirstName='"+firstNameField.getText()+"',LastName='"+lastNameField.getText()+"',DateOfBirth='"+dobField.getText()+"',Address='"+addressField.getText()+"',DateOfAcceptance='"+doaField.getText()+"',Class='"+ admissionClass.getText()+"'";
            pst = con.prepareStatement(sql);
            pst.execute();
            if("".equals(studentIdField.getText())){
                JOptionPane.showMessageDialog(null, "Please select a record to update!");
                return;
            }
            JOptionPane.showMessageDialog(this, "Updated Successfully!","Record",JOptionPane.INFORMATION_MESSAGE);
            updateButton.setEnabled(true);
            
            
        }
        catch(HeadlessException | SQLException ex){

            JOptionPane.showMessageDialog(this,ex);
        }
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        
        try{
            con = Connect.ConnectDB();
            if("".equals(studentIdField.getText())){
                JOptionPane.showMessageDialog(null, "Please Enter Student ID", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Statement st;
            st = con.createStatement();
            String sql1="select StudentID from StudentRecord where StudentID='"+studentIdField.getText()+"'";
            rs = st.executeQuery(sql1);
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Student ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                studentIdField.setText("");
                studentIdField.requestDefaultFocus();
                return;
            }

            String sql= "insert into StudentRecord(StudentID,FirstName,LastName,DateOfBirth,Address,DateOfAcceptance,Gender,Class) values ('"+studentIdField.getText()+"','"+firstNameField.getText()+"','"+lastNameField.getText()+"','"+dobField.getText()+"','"+addressField.getText()+"','"+doaField.getText()+"','"+cmbGender.getSelectedItem()+"','"+admissionClass.getText()+"')";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Registered!", "Student", JOptionPane.INFORMATION_MESSAGE);
            saveButton.setEnabled(true);
        }
        catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
        }
        
    }//GEN-LAST:event_saveButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        try{
            if("".equals(studentIdField.getText())){
                JOptionPane.showMessageDialog(null, "Please enter Student ID to delete record!");
                return;
            }
            int d = JOptionPane.showConfirmDialog(this, "Are sure want to delete.?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if(d==0){
                con = Connect.ConnectDB();
                String sql = "delete from StudentRecord where StudentID='"+studentIdField.getText()+"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);
                reset();
            }

        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void studentIdFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentIdFieldKeyTyped
        char input = evt.getKeyChar();
         if((input<'0' || input>'9') && input!='\b'){
             evt.consume();
             JOptionPane.showMessageDialog(this, "Please enter digits!");
         }
    }//GEN-LAST:event_studentIdFieldKeyTyped

    private void addressFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressFieldKeyTyped
        char input = evt.getKeyChar();
        
        
    }//GEN-LAST:event_addressFieldKeyTyped

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        
    }//GEN-LAST:event_addressFieldActionPerformed

    private void dobFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobFieldActionPerformed

    private void lastNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameFieldKeyTyped
        char input = evt.getKeyChar();
        if(!(input<'0' || input>'9') && input!='\b'){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Name does not contain any numbers!");
        }
    }//GEN-LAST:event_lastNameFieldKeyTyped

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void firstNameFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameFieldKeyTyped
        char input = evt.getKeyChar();
        if(!(input<'0' || input>'9') && input!='\b'){
            evt.consume();
            JOptionPane.showMessageDialog(this, "Name does not contain any numbers!");
        }
    }//GEN-LAST:event_firstNameFieldKeyTyped

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

     void reset(){
        firstNameField.setText("");
        studentIdField.setText("");
        lastNameField.setText("");
       
        addressField.setText("");
        cmbGender.setSelectedIndex(0);
        admissionClass.setText("");
        dobField.setText("");
        doaField.setText("");
        deleteButton.setEnabled(false);
        updateButton.setEnabled(false);
        studentIdField.requestFocus();
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
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField addressField;
    private javax.swing.JLabel addressLabel;
    public javax.swing.JTextField admissionClass;
    private javax.swing.JButton backButton;
    public javax.swing.JComboBox<String> cmbGender;
    public javax.swing.JButton deleteButton;
    public javax.swing.JTextField doaField;
    private javax.swing.JLabel doaLabel;
    public javax.swing.JTextField dobField;
    private javax.swing.JLabel dobLabel;
    public javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton newButton;
    public javax.swing.JButton saveButton;
    private javax.swing.JSplitPane stud;
    public javax.swing.JTextField studentIdField;
    private javax.swing.JLabel studentIdLabel;
    public javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
