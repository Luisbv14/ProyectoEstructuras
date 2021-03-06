/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoestructuras;

import java.awt.Component;

/**
 *
 * @author Jean Franco
 */
public class LoginUI extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    Usuario u = new Usuario();
    PlantelPuerto i = new PlantelPuerto();
    public LoginUI() {
//        this.setLocationRelativeTo(null);
        initComponents();
        this.getRootPane().setDefaultButton(btn_login);
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
        btn_login = new javax.swing.JButton();
        txf_ID = new javax.swing.JTextField();
        lb_ID = new javax.swing.JLabel();
        lb_contraseña = new javax.swing.JLabel();
        lb_error = new javax.swing.JLabel();
        pwf_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));
        jPanel1.add(txf_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 210, -1));

        lb_ID.setText("ID");
        jPanel1.add(lb_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        lb_contraseña.setText("Contraseña");
        jPanel1.add(lb_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));
        jPanel1.add(lb_error, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 330, 30));
        jPanel1.add(pwf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 210, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
      u.setId(txf_ID.getText());
      u.setContraseña(pwf_password.getText());
      if("Admin".equals(u.getContraseña()) && "Admin".equals(u.getId())){
        this.dispose();
        i.setVisible(true);
      }else{
          lb_error.setText("Los datos ingresados no son los correctos");
      }
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_ID;
    private javax.swing.JLabel lb_contraseña;
    private javax.swing.JLabel lb_error;
    private javax.swing.JPasswordField pwf_password;
    private javax.swing.JTextField txf_ID;
    // End of variables declaration//GEN-END:variables
}
