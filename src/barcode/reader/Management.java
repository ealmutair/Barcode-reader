/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcode.reader;

import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EssamAlmutair
 */
public class Management extends javax.swing.JFrame {

    /**
     * Creates new form Management
     */
    public Management() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        EventsList = new javax.swing.JList<>();
        AddNewPerson = new javax.swing.JButton();
        Attend = new javax.swing.JButton();
        DeletePerson = new javax.swing.JButton();
        NewEvent = new javax.swing.JButton();
        deleteEvent = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Event = new javax.swing.JTextField();
        finishAttendence = new javax.swing.JButton();
        AttendField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "الرقم المعرف", "الأسم", "الوصف", "الحالة"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        jLabel1.setText("قائمة الأنشطة القادمة");

        jLabel2.setText("معلومات الحضور");

        EventsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                EventsListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(EventsList);

        AddNewPerson.setText("إضافة شخص جديد");
        AddNewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewPersonActionPerformed(evt);
            }
        });

        Attend.setText("تحضير");
        Attend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendActionPerformed(evt);
            }
        });

        DeletePerson.setText("حذف شخص من قائمة النشاط");
        DeletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePersonActionPerformed(evt);
            }
        });

        NewEvent.setText("نشاط جديد");
        NewEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewEventActionPerformed(evt);
            }
        });

        deleteEvent.setText("حذف نشاط");
        deleteEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEventActionPerformed(evt);
            }
        });

        jLabel5.setText("التحضير للأنشطة");

        jButton1.setText("إحصائيات");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("إعدادات");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Event.setText("jTextField1");
        Event.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventActionPerformed(evt);
            }
        });

        finishAttendence.setText("تم إكتمال التحضير");
        finishAttendence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishAttendenceActionPerformed(evt);
            }
        });

        AttendField.setText("1");
        AttendField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendFieldActionPerformed(evt);
            }
        });

        jButton3.setText("الصفحة الرئيسية");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(finishAttendence)
                .addGap(44, 44, 44)
                .addComponent(AttendField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(Attend)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(63, 63, 63)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(Event, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(44, 44, 44))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addComponent(deleteEvent)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(NewEvent)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(DeletePerson)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddNewPerson)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Attend)
                    .addComponent(finishAttendence)
                    .addComponent(AttendField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Event, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddNewPerson)
                    .addComponent(DeletePerson)
                    .addComponent(NewEvent)
                    .addComponent(deleteEvent))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddNewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewPersonActionPerformed
        addNewUser user = new addNewUser();
        user.setVisible(true);
    }//GEN-LAST:event_AddNewPersonActionPerformed

    private void AttendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendActionPerformed
        // TODO add your handling code here:
        //get selected values before show attendence
        int selectedId = Integer.parseInt(AttendField.getText());//selected id to mark present
        String temp = Event.getText();//selected event
        //
        int eventId=0;
        
        Operations operation = new Operations();
        
        try {
            eventId=operation.getEventId(temp);
        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //before mark anyone attend, try to show who we mark present
            ArrayList<User> present=operation.showPresentUser(eventId);
        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.print("before");
            //This method to insert user and event to eventUser table
            System.out.println(selectedId+"     "+eventId);
            operation.insertSelectedUserToEvent(eventId, selectedId);
        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel model = new DefaultTableModel();
        String[] column = {"القسم","الكلية ", "الوظيفة ", " الأسم", " الرقم المعرف"};

        model.setColumnIdentifiers(column);

        //This method to show all the attendence after user select specific event
        ArrayList<User> item = operation.showSelectedEventAttendence(temp, selectedId);
        
        for (int i = 0; i < item.size(); i++) {

            String name = item.get(i).getName();
            String id = Integer.toString(item.get(i).getId());
            String college = item.get(i).getType();
            String type = item.get(i).getCollege();
            String department =item.get(i).getDepartment();
            String[] row = {department,college, type, name, id};
            model.addRow(row);

        }
        Table.setModel(model);//show selected Event in the textfield
        

    }//GEN-LAST:event_AttendActionPerformed

    private void DeletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeletePersonActionPerformed

    private void NewEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewEventActionPerformed
        // TODO add your handling code here:
        NewEvent event = new NewEvent();
        event.setVisible(true);
    }//GEN-LAST:event_NewEventActionPerformed

    private void deleteEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEventActionPerformed
        // TODO add your handling code here:
        String deletedEvent=Event.getText();
        System.out.print(deletedEvent);
        Operations operation = new Operations();
        int id=0;
        try {
             id=operation.getEventId(deletedEvent);
             System.out.print(id);
        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            operation.deleteEvent(id);
        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }
        //for showing the new events again
//        DefaultListModel dm = new DefaultListModel();
//
//        try {
//            ArrayList<Event> item = operation.AddEventsList();
//            for (int i = 0; i < item.size(); i++) {
//
//                String a = item.get(i).getName();
//                dm.addElement(a);
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        EventsList.setModel(dm);
    }//GEN-LAST:event_deleteEventActionPerformed

    //This method to list all the events into the EventList Fram.
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
//        EventsList.setModel();
        Operations op = new Operations();
        DefaultListModel dm = new DefaultListModel();

        try {
            ArrayList<Event> item = op.AddEventsList();
            for (int i = 0; i < item.size(); i++) {

                String a = item.get(i).getName();
                dm.addElement(a);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventsList.setModel(dm);

    }//GEN-LAST:event_formWindowOpened

    private void EventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_EventActionPerformed

    private void finishAttendenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishAttendenceActionPerformed
        // TODO add your handling code here:
        Operations operation = new Operations();
        String event = Event.getText();
        DefaultListModel dm = new DefaultListModel();

        try {
            //mark the event is done 
            operation.changeEventToDone(event);
            
            //show the new comming events list
            ArrayList<Event> events = operation.AddEventsList();

            for (int i = 0; i < events.size(); i++) {

                String a = events.get(i).getName();
                dm.addElement(a);
            }//

        } catch (SQLException ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventsList.setModel(dm);
        Event.setText("");

    }//GEN-LAST:event_finishAttendenceActionPerformed

    private void EventsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_EventsListValueChanged
        // TODO add your handling code here:
        String temp = EventsList.getSelectedValue().toString();// to show selected Event 

        Event.setText(temp);

    }//GEN-LAST:event_EventsListValueChanged

    private void AttendFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AttendFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Statestics stat = new Statestics();
        stat.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        MainPage main = new MainPage();
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Options option = new Options();
        option.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //I deleted the previous comments and I added this line of code
                new Management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNewPerson;
    private javax.swing.JButton Attend;
    private javax.swing.JTextField AttendField;
    private javax.swing.JButton DeletePerson;
    private javax.swing.JTextField Event;
    private javax.swing.JList<String> EventsList;
    private javax.swing.JButton NewEvent;
    private javax.swing.JTable Table;
    private javax.swing.JButton deleteEvent;
    private javax.swing.JButton finishAttendence;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void showSelectedEventAttendence(String temp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
