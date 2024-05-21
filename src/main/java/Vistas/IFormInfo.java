package Vistas;


public class IFormInfo extends javax.swing.JInternalFrame {

    public IFormInfo() {
        initComponents();           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnBusc = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtInfo = new javax.swing.JTextArea();
        btnContratar = new javax.swing.JButton();

        setClosable(true);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 14, 380));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("AREA:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "GERENCIA", "RECEPCIÓN", "CAJAS", "LIMPIEZA", "SEGURIDAD", "ALMACEN", "COMIDAS", "PISO", "ADUANAS", "FRUTAS Y VERDUDAS", "CARNICERÍA", "PANADERÍA" }));
        jComboBox1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 170, -1));

        btnBusc.setBackground(new java.awt.Color(153, 0, 0));
        btnBusc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/IconBuscar.png"))); // NOI18N
        btnBusc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnBusc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscActionPerformed(evt);
            }
        });
        jPanel3.add(btnBusc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 50, 40));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Informacion de incentivos");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 348, -1));

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MAÑANA:       05:00 AM - 11:00 AM");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TARDE:        11:00 AM - 17:00 PM");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 390, -1));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NOCHE:        17:00 PM - 11:00 PM");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 390, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 410, 158));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Busqueda de Empleado");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 17, 828, -1));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 85, 521, 10));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Información de turnos");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 348, -1));

        jPanel5.setBackground(new java.awt.Color(153, 0, 0));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Puntual: X:XX - 10 min -> Sueldo + 0.5%");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 30));

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Normal:  X:XX + 10 min -> Sin modicicación");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 380, -1));

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tardanza: X:XX + 11 min -> Sueldo - 0.5%");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 380, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 410, 150));

        jTxtInfo.setBackground(new java.awt.Color(255, 255, 255));
        jTxtInfo.setColumns(20);
        jTxtInfo.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTxtInfo.setForeground(new java.awt.Color(0, 0, 0));
        jTxtInfo.setRows(5);
        jScrollPane1.setViewportView(jTxtInfo);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 310, 200));

        btnContratar.setBackground(new java.awt.Color(153, 0, 0));
        btnContratar.setFont(new java.awt.Font("STXinwei", 1, 18)); // NOI18N
        btnContratar.setForeground(new java.awt.Color(255, 255, 255));
        btnContratar.setText("Gestionar Personal");
        btnContratar.setBorder(null);
        btnContratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratarActionPerformed(evt);
            }
        });
        jPanel3.add(btnContratar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 240, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscActionPerformed
       
        
        String opcionSeleccionada = (String) jComboBox1.getSelectedItem();
        switch (opcionSeleccionada) {
            case "GERENCIA":
        jTxtInfo.setText("Gerente de tienda(1)\nAsistetes de gerentes(2)(Uno en turno\nmañana y otro en turno tarde)\nJefe de RRHH(2)(Uno en turno mañana\ny otro en turno tarde)");              
                break;
            case "RECEPCIÓN":
        jTxtInfo.setText("Recepcionistas(6)\n(1 minimo por turno)");
                break;
            case "CAJAS":
        jTxtInfo.setText("Jefe(1)\nFrente de caja(9)\n(2 minimo por turno)\nCajeros/as(min=24; max=27)\n(8 mínimo por turno)");
                break;
            case "LIMPIEZA":
        jTxtInfo.setText("Jefe(1)\nPersonal de limpieza\n(Min=15; Max=18)\n(4 Minimo por turno)");
                break;
            case "SEGURIDAD":
        jTxtInfo.setText("Jefe(1)\nPersonal de seguridad\n(Min=15; Max=18)\n(4 mínimo por turno)");
                break;
            case "ALMACEN":
        jTxtInfo.setText("Jefe(1)\nPersonal de almacén\n(Min=21; Max=24\n(6 mínimo por turno");
                break;   
            case "COMIDAS":
        jTxtInfo.setText("Jefe(1)\nPersonal de sector comidas\n(Min=21; Max=24\n(6 mínimo por turno");
                break;    
           case "PISO":
        jTxtInfo.setText("Jefe(1)\nReponedores/Acomodadores\n(Min=27; Max=30\n(8 mínimo por turno");
                break;   
           case "ADUANAS":
        jTxtInfo.setText("Jefe(1)\nFrente de aduanas(9)\n(2 minimo por turno)\nAduaneros/as(min=24; max=27)\n(8 mínimo por turno)");
                break;   
           case "FRUTAS Y VERDURAS":
        jTxtInfo.setText("Jefe(1)\nPersonal de sector frutas y comidas\n(Min=15; Max=18\n(4 mínimo por turno");
                break;           
           case "CARNICERÍA":
        jTxtInfo.setText("Jefe(1)\nPersonal de carnicería\n(Min=15; Max=18\n(4 mínimo por turno");
                break;     
           case "PANADERÍA":
        jTxtInfo.setText("Jefe(1)\nPersonal de panadería\n(Min=15; Max=18\n(4 mínimo por turno");
                break;           
            default:       
        jTxtInfo.setText("Opción no válida");
      }

    }//GEN-LAST:event_btnBuscActionPerformed

    private void btnContratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratarActionPerformed
        FrameGestionarPersonal gest = new FrameGestionarPersonal();
        gest.setVisible(true);
    }//GEN-LAST:event_btnContratarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBusc;
    private javax.swing.JButton btnContratar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTxtInfo;
    // End of variables declaration//GEN-END:variables
}
