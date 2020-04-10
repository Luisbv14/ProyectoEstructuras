/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoestructuras;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Jean Franco
 */
public class PlantelPuerto extends javax.swing.JFrame {

    //Creacion de todas las variables necesarias
    LinkedList<Contenedor> listaContainer = new LinkedList<>();
    LinkedList<Contenedor> almacenFiscal = new LinkedList<>();
    LinkedList<Contenedor> finca = new LinkedList<>();
    private int tamañoListaContainer = 50;

    ArrayList<Stack> islaA = new ArrayList<Stack>();
    ArrayList<Stack> islaB = new ArrayList<Stack>();
    ArrayList<Stack> islaC = new ArrayList<Stack>();
    ArrayList<Stack> islaD = new ArrayList<Stack>();
    ArrayList<Stack> islaE = new ArrayList<Stack>();
    ArrayList<Stack> islaF = new ArrayList<Stack>();
    ArrayList taller = new ArrayList();

    Stack stkA = new Stack();
    Stack stkB = new Stack();
    Stack stkC = new Stack();
    Stack stkD = new Stack();
    Stack stkE = new Stack();
    Stack stkF = new Stack();

//    Contenedor[] islaA = new Contenedor[8];
//    Contenedor[] islaB = new Contenedor[8];
//    Contenedor[] islaC = new Contenedor[8];
//    Contenedor[] islaD = new Contenedor[8];
//    Contenedor[] islaE = new Contenedor[8];
//    Contenedor[] islaF = new Contenedor[8];
    Contenedor container;
    Fruta fruit;
    Planta plants;
    Vegetal veg;
    private int dia;
    private int mes;
    private int yearEntrada;
    private int yearSalida;

    //Metodo de inicio
    public PlantelPuerto() {
//        this.setLocationRelativeTo(null);
        llenarContainer();
        initComponents();

    }

    /*Metodo encargado de asignarle toda la informacion 
    a cada uno de los contenedores*/
    public void llenarContainer() {
        for (int i = 0; i < tamañoListaContainer; i++) {
            container = new Contenedor();
            listaContainer.add(container);
            listaContainer.get(i).setId(i + 1);
            int aux1 = (int) (Math.random() * (5 - 1) + 1);
//            System.out.println("Opcion que elige el contenedor " + aux1);
            switch (aux1) {
                case 1:
                    listaContainer.get(i).setCarga((fruit = new Fruta()).getTipo());
                    listaContainer.get(i).setDescripCarga("Contiene frutas citricas");
                    listaContainer.get(i).setEstadoCapacidad("lleno");
                    listaContainer.get(i).setUbicacion("Isla B");
                    genDañado(i);
                    break;
                case 2:
                    listaContainer.get(i).setCarga((plants = new Planta()).getTipo());
                    listaContainer.get(i).setDescripCarga("Contiene plantas");
                    listaContainer.get(i).setEstadoCapacidad("lleno");
                    listaContainer.get(i).setUbicacion("Isla D");
                    genDañado(i);
                    break;
                case 3:
                    listaContainer.get(i).setCarga((veg = new Vegetal()).getTipo());
                    listaContainer.get(i).setDescripCarga("Contiene vegetales");
                    listaContainer.get(i).setEstadoCapacidad("lleno");
                    listaContainer.get(i).setUbicacion("Isla C");
                    genDañado(i);
                    break;
                case 4:
                    listaContainer.get(i).setCarga("Vacío");
                    listaContainer.get(i).setDescripCarga("Vacío");
                    listaContainer.get(i).setEstadoCapacidad("Vacio");
                    listaContainer.get(i).setUbicacion("Isla E");
                    genDañado(i);
                    break;
                default:
//                    System.out.println("aux1 cayo" + aux1);
                    break;
            }
            listaContainer.get(i).setUbicacion("Barco (importación)");
            //Poner aqui la fecha de llegada al plantel del puerto
            mes = (int) (Math.random() * (13 - 1) + 1);
            switch (mes) {
                case 1:
                    dia = (int) (Math.random() * (30 - 1) + 1);
                    
                    break;
                case 2:
                    dia = (int) (Math.random() * (32 - 1) + 1);
                    
                    break;
                case 3:
                    dia = (int) (Math.random() * (31 - 1) + 1);
                    
                    break;
                case 4:
                    dia = (int) (Math.random() * (31 - 1) + 1);
                    
                    break;
                case 5:
                    dia = (int) (Math.random() * (31 - 1) + 1);
                    
                    break;
                case 6:
                    dia = (int) (Math.random() * (31 - 1) + 1);
                    
                    break;
                case 7:
                    dia = (int) (Math.random() * (32 - 1) + 1);
                    
                    break;
                case 8:
                    dia = (int) (Math.random() * (30 - 1) + 1);
                    
                    break;
                case 9:
                    dia = (int) (Math.random() * (31 - 1) + 1);
                    
                    break;
                case 10:
                    dia = (int) (Math.random() * (32 - 1) + 1);
                    
                    break;
                case 11:
                    dia = (int) (Math.random() * (31 - 1) + 1);
                    
                    break;
                case 12:
                    dia = (int) (Math.random() * (32 - 1) + 1);
                    
                    break;
            }
            
            yearEntrada = (int) (Math.random() * (2022 - 1882) + 1882);  
            
            while (yearEntrada < 1995 || mes >= 2023) {
                yearEntrada = (int) (Math.random() * (2020 - 1882) + 1882);  
                
            }
            if (Integer.toString(mes).length() == 1) {
                mes = 0 + mes;
            }
            if (Integer.toString(dia).length() == 1) {
                dia = 0 + dia;
            }
            listaContainer.get(i).setFechaEntrada(dia + "/" + mes + "/" + yearEntrada);
            //fin codigo de generador de dia y mes de llegada.

            //Inicio codigo generador de dia de salida.
            /*cambiar esta parte
            yearSalida = (int) (Math.random() * (2050 - 2010) + 2010);
            while (yearEntrada > yearSalida) {
                yearSalida = (int) (Math.random() * (2050 - 2010) + 2010);
                System.out.println("Buscando fecha while1");
                while (yearEntrada < yearSalida) {
                    yearSalida = (int) (Math.random() * (2020 - 1882) + 1882);
                    System.out.println("buscando fecha while2");
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
                listaContainer.get(i).setFechaSalida(dia + "/" + mes + "/" + yearSalida);
                //Fin codigo de definir fecha de salida. 

                //Randomización de contenedores dañados.
                int aux2 = (int) (Math.random() * (10 - 1) + 1);
                if (aux2 == 5) {
                    listaContainer.get(i).setDañado(true);
                    listaContainer.get(i).setTipoRepair("La estructura del contenedor está dañada"); //Tambien refrigeracion
                }
            }
             */
        }
        containerIslas();
    }

    /*Metodo que hace que los contenedores esten dañados
     */
    public void genDañado(int i) {
        int aux3 = (int) (Math.random() * (3 - 1) + 1);
        switch (aux3) {
            case 1:
                listaContainer.get(i).setDañado(false);
                break;
            case 2:
                listaContainer.get(i).setDañado(true);
                int aux = (int) (Math.random() * (4 - 1) + 1);
                switch (aux) {
                    case 1:
                        listaContainer.get(i).setTipoRepair("eliminacion de corrosion");
                        break;
                    case 2:
                        listaContainer.get(i).setTipoRepair("correcion de imperfercciones");
                        break;
                    case 3:
                        listaContainer.get(i).setTipoRepair("Pintura anti-corrosion");
                        break;
                }
                break;
        }
    }

    /*Metodo que verifica el contenido de los contenedores 
    y los agrega a su respectiva isla. */
    public void containerIslas() {
        try {
            for (int i = 0; i < tamañoListaContainer; i++) {
//            System.out.println("La i es = " + i);
                if (listaContainer.get(i).getCarga().equals("Bananos")) {
                    System.out.println("entro banano!!!");
                    /*Hacer un throw exception diciendo que ya se llenó un stack
                     */
                    for (int j = 0; j < 3; j++) {
                        /*iterar con un for por la isla y verificar si el stack esta lleno,
                                                        si no lo esta lo agrega, si si lo esta pasa al siguiente*/
                        stkA.add(listaContainer.get(i));
                    }
                    islaA.add(stkA);
//                    throw new IndexOutOfBoundsException("Se llenó uno de los stacks de la isla A");
                } else if (listaContainer.get(i).getCarga().equals("Arroz")) {
                    listaContainer.get(i).setUbicacion("Isla F");
                    for (int j = 0; j < 5; j++) {
                        stkF.add(listaContainer.get(i));
                    }
                    islaF.add(stkF);
//                    throw new IndexOutOfBoundsException("Se llenó uno de los stacks de la isla F");
                    System.out.println("Se llenó uno de los stacks de la isla F");
                } else if (listaContainer.get(i).getDescripCarga().equals("Contiene frutas citricas")) {
                    for (int j = 0; j < 3; j++) {
                        stkB.add(listaContainer.get(i));
                    }
                    islaB.add(stkB);
//                    throw new IndexOutOfBoundsException("Se llenó uno de los stacks de la isla B");
                    System.out.println("Se llenó uno de los stacks de la isla B");
                } else if (listaContainer.get(i).getDescripCarga().equals("Contiene vegetales")) {
                    for (int j = 0; j < 3; j++) {
                        stkC.add(listaContainer.get(i));
                    }
                    islaC.add(stkC);
//                    throw new IndexOutOfBoundsException("Se llenó uno de los stacks de la isla C");
                    System.out.println("Se llenó uno de los stacks de la isla C");
                } else if (listaContainer.get(i).getDescripCarga().equals("Contiene plantas")) {
                    for (int j = 0; j < 3; j++) {
                        stkD.add(listaContainer.get(i));
                    }
                    islaD.add(stkD);
//                    throw new IndexOutOfBoundsException("Se llenó uno de los stacks de la isla D");
                    System.out.println("Se llenó uno de los stacks de la isla D");
                } else if (listaContainer.get(i).getDescripCarga().equals("Vacio")) {
                    for (int j = 0; j < 6; j++) {
                        stkE.add(listaContainer.get(i));
                    }
                    islaE.add(stkE);
//                    throw new IndexOutOfBoundsException("Se llenó uno de los stacks de la isla E");
                    System.out.println("Se llenó uno de los stacks de la isla E");
                } else if (listaContainer.get(i).isDañado() == true) {
                    taller.add(listaContainer.get(i));
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    /*
    Metodo que se encarga de buscar un contenedor tomando como argumento el id del contenedor
     */
    public String buscar(int idSearch) {
        String containerUbicacion = "";
        for (int i = 0; i < 10; i++) {
            containerUbicacion = listaContainer.get(i).getUbicacion();
        }
        return containerUbicacion;
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
        btnMenu = new javax.swing.JButton();
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

        btnMenu.setText("jButton1");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 60, 80));

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
        System.out.println("Descripcion de los contenedores en el taller:");
        for (int i = 0; i < taller.size(); i++) {
            System.out.println(taller.get(i).toString());
        }
        System.out.println("Cantidad de contenedores en el taller: " + taller.size());
        System.out.println("");
    }//GEN-LAST:event_btn_TallerActionPerformed

    private void btn_Isla_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Isla_CActionPerformed
        System.out.println("Descripcion de los contenedores en la isla C:");
        for (int i = 0; i < islaC.size(); i++) {
            System.out.println(islaC.get(i).toString());
        }
        System.out.println("Cantidad de contenedores en la isla C: " + islaC.size());
        System.out.println("");
    }//GEN-LAST:event_btn_Isla_CActionPerformed

    private void btn_Isla_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Isla_DActionPerformed
        System.out.println("Descripcion de los contenedores en la isla D:");
        for (int i = 0; i < islaD.size(); i++) {
            System.out.println(islaD.get(i).toString());
        }
        System.out.println("Cantidad de contenedores en la isla D: " + islaD.size());
        System.out.println("");
    }//GEN-LAST:event_btn_Isla_DActionPerformed

    private void btn_Isla_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Isla_BActionPerformed
        System.out.println("Descripcion de los contenedores en la isla B:");
        for (int i = 0; i < islaB.size(); i++) {
            System.out.println(islaB.get(i).toString());
        }
        System.out.println("Cantidad de contenedores en la isla B: " + islaB.size());
        System.out.println("");
    }//GEN-LAST:event_btn_Isla_BActionPerformed

    private void btn_Isla_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Isla_EActionPerformed
        System.out.println("Descripcion de los contenedores en la isla E:");
        for (int i = 0; i < islaE.size(); i++) {
            System.out.println(islaE.get(i).toString());
        }
        System.out.println("Cantidad de contenedores en la isla E: " + islaE.size());
        System.out.println("");
    }//GEN-LAST:event_btn_Isla_EActionPerformed

    private void btn_Isla_FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Isla_FActionPerformed
        System.out.println("Descripcion de los contenedores en la isla F:");
        for (int i = 0; i < islaF.size(); i++) {
            System.out.println(islaF.get(i).toString());
        }
        System.out.println("Cantidad de contenedores en la isla F: " + islaF.size());
        System.out.println("");
    }//GEN-LAST:event_btn_Isla_FActionPerformed

    private void btn_EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntradaActionPerformed
        for (int i = 0; i < tamañoListaContainer; i++) {
            System.out.println(listaContainer.get(i).toString());
        }
        System.out.println("");
    }//GEN-LAST:event_btn_EntradaActionPerformed

    private void btn_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salidaActionPerformed
        System.out.println("SoyLaSalida");
        /*
        Hacer el metodo que permita sacar contenedores de sus islas y mandarlos a las
        listas de la finca y almacen fiscal
         */
    }//GEN-LAST:event_btn_salidaActionPerformed

    private void btn_Isla_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Isla_AActionPerformed
        System.out.println("Descripcion de los contenedores en la isla A:");
        for (int i = 0; i < islaA.size(); i++) {
            System.out.println(islaA.get(i).toString());
        }
        System.out.println("Cantidad de contenedores en la isla A: " + islaA.size());
        System.out.println("");
    }//GEN-LAST:event_btn_Isla_AActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        menuBuscar();
    }//GEN-LAST:event_btnMenuActionPerformed

    public void menuBuscar() {
        int menuAux = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opción que desea ejecutar.\n1.Buscar un contenedor.\n2.Salir del menu."));
        switch (menuAux) {
            case 1:
                int idTemp = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del contenedor que desea buscar: "));
                if (idTemp > 0 && idTemp <= 50) {
                    buscar(idTemp);
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un id válido.");
                    menuBuscar();
                }
                break;
            case 2:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Por favor, ingrese una opción válida.");
        }
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
            java.util.logging.Logger.getLogger(PlantelPuerto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlantelPuerto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlantelPuerto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlantelPuerto.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnMenu;
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
