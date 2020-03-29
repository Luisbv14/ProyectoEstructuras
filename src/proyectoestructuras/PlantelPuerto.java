/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoestructuras;

import java.util.LinkedList;

/**
 *
 * @author Jean Franco
 */
public class PlantelPuerto extends javax.swing.JFrame {

    LinkedList<Contenedor> container;
    Fruta fruit;
    Planta plants;
    Vegetal veg;
    private int dia;
    private int mes;
    private int yearEntrada;
    private int yearSalida;

    public PlantelPuerto() {
        this.setLocationRelativeTo(null);
        initComponents();
    }

    public void llenarContainer() {
        for (int i = 1; i <= 50; i++) {
            container = new LinkedList<>();
            container.get(i).setId(i);
            int aux1 = (int) (Math.random() * (3 - 1) + 1);
            switch (aux1) {
                case 1:
                    container.get(i).setCarga((fruit = new Fruta()).getTipo());
                    container.get(i).setDescripCarga("Contiene frutas");
                    break;
                case 2:
                    container.get(i).setCarga((plants = new Planta()).getTipo());
                    container.get(i).setDescripCarga("Contiene plantas");
                    break;
                case 3:
                    container.get(i).setCarga((veg = new Vegetal()).getTipo());
                    container.get(i).setDescripCarga("Contiene vegetales");
                    break;
            }
            container.get(i).setUbicacion("Barco, importación");
            container.get(i).setEstadoCapacidad("Lleno");

            //Poner aqui la fecha de llegada al plantel del puerto
            mes = (int) (Math.random() * (12 - 1) + 1);
            switch (mes) {
                case 1:
                    dia = (int) (Math.random() * (29 - 1) + 1);
                    break;
                case 2:
                    dia = (int) (Math.random() * (31 - 1) + 1);
                    break;
                case 3:
                    dia = (int) (Math.random() * (30 - 1) + 1);
                    break;
                case 4:
                    dia = (int) (Math.random() * (30 - 1) + 1);
                    break;
                case 5:
                    dia = (int) (Math.random() * (30 - 1) + 1);
                    break;
                case 6:
                    dia = (int) (Math.random() * (30 - 1) + 1);
                    break;
                case 7:
                    dia = (int) (Math.random() * (31 - 1) + 1);
                    break;
                case 8:
                    dia = (int) (Math.random() * (29 - 1) + 1);
                    break;
                case 9:
                    dia = (int) (Math.random() * (30 - 1) + 1);
                    break;
                case 10:
                    dia = (int) (Math.random() * (31 - 1) + 1);
                    break;
                case 11:
                    dia = (int) (Math.random() * (30 - 1) + 1);
                    break;
                case 12:
                    dia = (int) (Math.random() * (31 - 1) + 1);
                    break;
            }
            while (yearEntrada <= 1995 || mes >= 2050) {
                yearEntrada = (int) (Math.random() * (2020 - 1882) + 1882);
            }
            if (Integer.toString(mes).length() == 1) {
                mes = 0 + mes;
            }
            if (Integer.toString(dia).length() == 1) {
                dia = 0 + dia;
            }
            container.get(i).setFechaEntrada(dia + "/" + mes + "/" + yearEntrada);
            //fin codigo de generador de dia de llegada.

            //Inicio codigo generador de dia de salida.
            while (yearEntrada < yearSalida) {
                yearSalida = (int) (Math.random() * (2020 - 1882) + 1882);
            }
            mes = (int) (Math.random() * (12 - 1) + 1);
            switch (mes) {
                case 1:
                    dia = (int) (Math.random() * (29 - 1) + 1);
                    break;
                case 2:
                    dia = (int) (Math.random() * (31 - 1) + 1);
                    break;
                case 3:
                    dia = (int) (Math.random() * (30 - 1) + 1);
                    break;
                case 4:
                    dia = (int) (Math.random() * (30 - 1) + 1);
                    break;
                case 5:
                    dia = (int) (Math.random() * (30 - 1) + 1);
                    break;
                case 6:
                    dia = (int) (Math.random() * (30 - 1) + 1);
                    break;
                case 7:
                    dia = (int) (Math.random() * (31 - 1) + 1);
                    break;
                case 8:
                    dia = (int) (Math.random() * (29 - 1) + 1);
                    break;
                case 9:
                    dia = (int) (Math.random() * (30 - 1) + 1);
                    break;
                case 10:
                    dia = (int) (Math.random() * (31 - 1) + 1);
                    break;
                case 11:
                    dia = (int) (Math.random() * (30 - 1) + 1);
                    break;
                case 12:
                    dia = (int) (Math.random() * (31 - 1) + 1);
                    break;
            }
            if (Integer.toString(mes).length() == 1) {
                mes = 0 + mes;
            }
            if (Integer.toString(dia).length() == 1) {
                dia = 0 + dia;
            }
            container.get(i).setFechaSalida(dia + "/" + mes + "/" + yearSalida);          
            //Fin codigo de definir fecha de salida. 
            
            
            int aux2 = (int) (Math.random() * (10 - 1) + 1);
            if (aux2 == 5) {
                container.get(i).setDañado(true);
                container.get(i).setTipoRepair("La estructura del contenedor está dañada");
            }
        }
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
        Fondo = new javax.swing.JLabel();
        btn_Taller = new javax.swing.JButton();
        btn_Isla_A = new javax.swing.JButton();
        btn_Isla_C = new javax.swing.JButton();
        btn_Isla_D = new javax.swing.JButton();
        btn_Isla_B = new javax.swing.JButton();
        btn_Isla_E = new javax.swing.JButton();
        btn_Isla_F = new javax.swing.JButton();
        btn_Entrada = new javax.swing.JButton();
        btn_salida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Interfaz.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        btn_Taller.setText("jB");
        btn_Taller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TallerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Taller, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 250, 70));

        btn_Isla_A.setText("jButton2");
        btn_Isla_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Isla_AActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Isla_A, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 160, 160));

        btn_Isla_C.setText("jButton3");
        btn_Isla_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Isla_CActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Isla_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 130, 150));

        btn_Isla_D.setText("jButton4");
        btn_Isla_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Isla_DActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Isla_D, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 130, 150));

        btn_Isla_B.setText("jButton5");
        btn_Isla_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Isla_BActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Isla_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 150, 150));

        btn_Isla_E.setText("jButton6");
        btn_Isla_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Isla_EActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Isla_E, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 50, 160));

        btn_Isla_F.setText("jButton7");
        btn_Isla_F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Isla_FActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Isla_F, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 200, 60, 230));

        btn_Entrada.setText("jButton1");
        btn_Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EntradaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 70));

        btn_salida.setText("jButton1");
        btn_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salidaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_TallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TallerActionPerformed

        System.out.println("funciona");
    }//GEN-LAST:event_btn_TallerActionPerformed

    private void btn_Isla_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Isla_CActionPerformed

        System.out.println("funciona");
    }//GEN-LAST:event_btn_Isla_CActionPerformed

    private void btn_Isla_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Isla_DActionPerformed

        System.out.println("funciona");
    }//GEN-LAST:event_btn_Isla_DActionPerformed

    private void btn_Isla_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Isla_BActionPerformed

        System.out.println("funciona");
    }//GEN-LAST:event_btn_Isla_BActionPerformed

    private void btn_Isla_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Isla_EActionPerformed

        System.out.println("funciona");
    }//GEN-LAST:event_btn_Isla_EActionPerformed

    private void btn_Isla_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Isla_FActionPerformed

        System.out.println("funciona");
    }//GEN-LAST:event_btn_Isla_FActionPerformed

    private void btn_EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntradaActionPerformed

        System.out.println("funciona");
    }//GEN-LAST:event_btn_EntradaActionPerformed

    private void btn_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salidaActionPerformed

        System.out.println("funciona");
    }//GEN-LAST:event_btn_salidaActionPerformed

    private void btn_Isla_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Isla_AActionPerformed

        System.out.println("funciona");

    }//GEN-LAST:event_btn_Isla_AActionPerformed

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
            java.util.logging.Logger.getLogger(PlantelPuerto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlantelPuerto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlantelPuerto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlantelPuerto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlantelPuerto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btn_Entrada;
    private javax.swing.JButton btn_Isla_A;
    private javax.swing.JButton btn_Isla_B;
    private javax.swing.JButton btn_Isla_C;
    private javax.swing.JButton btn_Isla_D;
    private javax.swing.JButton btn_Isla_E;
    private javax.swing.JButton btn_Isla_F;
    private javax.swing.JButton btn_Taller;
    private javax.swing.JButton btn_salida;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
