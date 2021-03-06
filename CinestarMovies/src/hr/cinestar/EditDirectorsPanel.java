/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hr.cinestar;

import hr.algebra.utils.MessageUtils;
import hr.cinestar.dal.Repository;
import hr.cinestar.dal.RepositoryFactory;
import hr.cinestar.model.Director;
import hr.cinestar.model.DirectorTableModel;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.Optional;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Vedran
 */
public class EditDirectorsPanel extends javax.swing.JPanel {
    
     private List<JTextComponent> validationFields;
    private List<JLabel> errorLabels;

    private static final String DIR = "assets";

    private Repository repository;
    private DirectorTableModel directorTableModel;

    private Director selectedDirector;

    /**
     * Creates new form EditDirectors
     */
    public EditDirectorsPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfLastName = new javax.swing.JTextField();
        lbFirstNameError = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbLastNameError = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDirectors = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        tfFirstName = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lbFirstNameError.setForeground(java.awt.Color.red);

        jLabel3.setText("Last Name");

        lbLastNameError.setForeground(java.awt.Color.red);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        tbDirectors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDirectors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDirectorsMouseClicked(evt);
            }
        });
        tbDirectors.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbDirectorsKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbDirectors);

        jLabel2.setText("First Name");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(java.awt.Color.red);
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfFirstName)
                    .addComponent(tfLastName)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 502, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLastNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFirstNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(584, 584, 584))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFirstNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLastNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

       if (formValid()) {
            try {
                Director director = new Director(
                        tfFirstName.getText().trim(),
                        tfLastName.getText().trim()
                );
                repository.createDirector(director);
                directorTableModel.setDirectors(repository.selectDirectors());

                clearForm();
            } catch (Exception ex) {
                Logger.getLogger(EditDirectorsPanel.class.getName()).log(Level.SEVERE, null, ex);
                MessageUtils.showErrorMessage("Error", "Unable to create article!");
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tbDirectorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDirectorsMouseClicked
       showDirector();
    }//GEN-LAST:event_tbDirectorsMouseClicked

    private void tbDirectorsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDirectorsKeyReleased
        showDirector();
    }//GEN-LAST:event_tbDirectorsKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (selectedDirector == null) {
            MessageUtils.showInformationMessage("Wrong operation", "Please choose director to update");
            return;
        }
        if (formValid()) {
            try {
                
                selectedDirector.setFirstName(tfFirstName.getText().trim());
                selectedDirector.setLastName(tfLastName.getText().trim());

                repository.updateDirector(selectedDirector.getId(), selectedDirector);
                directorTableModel.setDirectors(repository.selectDirectors());

                clearForm();
            } catch (Exception ex) {
                Logger.getLogger(EditDirectorsPanel.class.getName()).log(Level.SEVERE, null, ex);
                MessageUtils.showErrorMessage("Error", "Unable to update director!");
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        if (selectedDirector == null) {
            MessageUtils.showInformationMessage("Wrong operation", "Please choose director to delete");
            return;
        }
        if (MessageUtils.showConfirmDialog(
            "Delete director",
            "Do you really want to delete director?") == JOptionPane.YES_OPTION) {
        try {
            
            repository.deleteDirector(selectedDirector.getId());
            directorTableModel.setDirectors(repository.selectDirectors());

            clearForm();
        } catch (Exception ex) {
            Logger.getLogger(EditDirectorsPanel.class.getName()).log(Level.SEVERE, null, ex);
            MessageUtils.showErrorMessage("Error", "Unable to delete director!");
        }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        init();
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFirstNameError;
    private javax.swing.JLabel lbLastNameError;
    private javax.swing.JTable tbDirectors;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    // End of variables declaration//GEN-END:variables

    
     private void init() {
        try {
            initValidation();
            initRepository();
            initTable();
        } catch (Exception ex) {
            Logger.getLogger(EditMoviesPanel.class.getName()).log(Level.SEVERE, null, ex);
            MessageUtils.showErrorMessage("Unrecoverable error", "Cannot initiate the form");
            System.exit(1);
        }
    }

    private void initValidation() {
        validationFields = Arrays.asList(tfFirstName, tfLastName);
        errorLabels = Arrays.asList(lbFirstNameError, lbLastNameError);
    }

    private void initRepository() throws Exception {
        repository = RepositoryFactory.getRepository();
    }

    private void initTable() throws Exception {
        tbDirectors.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tbDirectors.setAutoCreateRowSorter(true);
        tbDirectors.setRowHeight(25);
        directorTableModel = new DirectorTableModel(repository.selectDirectors());
        tbDirectors.setModel(directorTableModel);
    }

    private void fillForm(Director director) {
        
        tfFirstName.setText(director.getFirstName());
        tfLastName.setText(director.getLastName());
        
    }
    
    private void clearForm() {
        validationFields.forEach(e -> e.setText(""));
        errorLabels.forEach(e -> e.setText(""));

        selectedDirector = null;
    }

    private boolean formValid() {
        boolean ok = true;

        for (int i = 0; i < validationFields.size(); i++) {
            ok &= !validationFields.get(i).getText().trim().isEmpty();
            errorLabels.get(i).setText(validationFields.get(i).getText().trim().isEmpty() ? "X" : "");

            
        }

        return ok;
    }

    private void showDirector() {
        clearForm();
        int selectedRow = tbDirectors.getSelectedRow();
        int rowIndex = tbDirectors.convertRowIndexToModel(selectedRow);
        int selectedDirectorId = (int) directorTableModel.getValueAt(rowIndex, 0);

        try {
            Optional<Director> optDirector = repository.selectDirector(selectedDirectorId);
            if (optDirector.isPresent()) {
                selectedDirector = optDirector.get();
                fillForm(selectedDirector);
            }
        } catch (Exception ex) {
            Logger.getLogger(EditDirectorsPanel.class.getName()).log(Level.SEVERE, null, ex);
            MessageUtils.showErrorMessage("Error", "Unable to show director!");
        }
    }
    
    
}
