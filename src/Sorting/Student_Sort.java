/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.DefaultListModel;

/**
 *
 * @author feli8871
 */



public class Student_Sort extends javax.swing.JFrame {
    
    /**
     * Creates new form Student_Sort
     */
    DefaultListModel data;
    Student s[]=new Student[100];
    public Student_Sort() {
        initComponents();
        data=new DefaultListModel();
        studentlist.setModel(data);
        
    }
    
    public static void selectionSort(Student[] a){
   for (int i = 0; i < a.length - 1; i++){
      int minIndex = findMinimum(a, i);
      if (minIndex != i)
	//if lowest is not already in place
         swap(a, i, minIndex);
   } //end for
}  

//supporting findMinimum method

public static int findMinimum(Student[] a, int first){
   //first=where to start looking from
   //assume first is also the smallest for now
   int minIndex = first; 
   for (int i = first + 1; i < a.length; i++)
      if (a[i].compareTo(a[minIndex])<1)
         minIndex = i;
   return minIndex;
}

//supporting swap method (same as bubble sort swap)

public static void swap(Student[] a, int x, int y){
   Student temp = a[x];
   a[x] = a[y];
   a[y] = temp;
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnopen = new javax.swing.JButton();
        btnsort = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtlist = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnopen.setText("Open File");
        btnopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnopenActionPerformed(evt);
            }
        });

        btnsort.setText("Sort by Name");
        btnsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortActionPerformed(evt);
            }
        });

        txtlist.setColumns(20);
        txtlist.setRows(5);
        jScrollPane1.setViewportView(txtlist);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnsort)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnopen)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnopen)
                        .addGap(18, 18, 18)
                        .addComponent(btnsort)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnopenActionPerformed
        try{
        FileReader f=new FileReader("src\\Searching\\studata.txt");
        BufferedReader b=new BufferedReader(f);
        
            for (int i = 0; i < 100; i++) {
                String nm,ad;
                int id;
                nm=b.readLine();
                ad=b.readLine();
               // Use below to verify 
               id=Integer.parseInt(b.readLine());
               s[i]=new Student(nm,ad,id);
               // System.out.println(nm+"\t"+ad+"\t"+id);
               
            }
            b.close();
        }catch(Exception e){
            System.out.println(e.toString());
    }
        
        data.clear();
        //Lists names in txt file by ID
        for (Student stu: s) {
            data.addElement(stu.getName());
        }
    }//GEN-LAST:event_btnopenActionPerformed

    private void btnsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortActionPerformed
        data.clear();
        selectionSort(s);
        for (Student stu: s) {
            data.addElement(stu.getName());
        }
    }//GEN-LAST:event_btnsortActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Sort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Sort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnopen;
    private javax.swing.JButton btnsort;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtlist;
    // End of variables declaration//GEN-END:variables
}
