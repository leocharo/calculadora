package com.senati.calculadora;

public class Calculadora extends javax.swing.JFrame {

    private boolean isPrincipalTextNull;
    private Operacion operacion;
    private String valor1, valor2;
    private double memoria = 0;
    private TipoOperacion tipoOperacion;

    public Calculadora() {
        initComponents();
        isPrincipalTextNull = true;
        operacion = new Operacion();
        tipoOperacion=TipoOperacion.NINGUNA;
        
        Label_Memoria.setVisible(false);
    }

    private TipoGrado getTipoGrado() {
        if (RadioButton_Sexages.isSelected()) {
            return TipoGrado.SEXAGESIMALES;
        } else {
            return TipoGrado.RADIANES;
        }
    }

    private void setValorTextPrevio(String valor, boolean limpiar) {
        if (limpiar) 
            TextField_Previo.setText("");
        TextField_Previo.setText(valor);
    }

    private void agregarValorTextFieldPrincipal(String numero) {
        if (isPrincipalTextNull == true) {
            TextField_Principal.setText(" ");
            TextField_Principal.setText(numero);
            isPrincipalTextNull = false;
        } else {
            TextField_Principal.setText(TextField_Principal.getText() + numero);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Button_1x = new javax.swing.JButton();
        Button_Porcentaje = new javax.swing.JButton();
        Button_N1 = new javax.swing.JButton();
        Button_Mmenos = new javax.swing.JButton();
        Button_Asin = new javax.swing.JButton();
        Button_MS = new javax.swing.JButton();
        Button_Cubo = new javax.swing.JButton();
        Button_N4 = new javax.swing.JButton();
        Button_Sin = new javax.swing.JButton();
        Button_RaizX = new javax.swing.JButton();
        Button_Tan = new javax.swing.JButton();
        Button_MR = new javax.swing.JButton();
        Button_MC = new javax.swing.JButton();
        Button_N5 = new javax.swing.JButton();
        Button_Mmas = new javax.swing.JButton();
        Button_N3 = new javax.swing.JButton();
        Button_Cos = new javax.swing.JButton();
        Button_RaizCuadrada = new javax.swing.JButton();
        Button_N6 = new javax.swing.JButton();
        Button_C = new javax.swing.JButton();
        Button_Multiplicacion = new javax.swing.JButton();
        Button_CE = new javax.swing.JButton();
        Button_Xmenos1 = new javax.swing.JButton();
        Button_N9 = new javax.swing.JButton();
        Button_Exponente = new javax.swing.JButton();
        Button_Division = new javax.swing.JButton();
        Button_PI = new javax.swing.JButton();
        Button_N2 = new javax.swing.JButton();
        Button_Signo = new javax.swing.JButton();
        Button_N7 = new javax.swing.JButton();
        Button_N8 = new javax.swing.JButton();
        Button_EXP = new javax.swing.JButton();
        Button_10levarX = new javax.swing.JButton();
        Button_Decimal = new javax.swing.JButton();
        Button_N0 = new javax.swing.JButton();
        Button_log = new javax.swing.JButton();
        Button_RaizCubica = new javax.swing.JButton();
        Button_Factorial = new javax.swing.JButton();
        Button_gual = new javax.swing.JButton();
        Button_Acos = new javax.swing.JButton();
        Button_Resta = new javax.swing.JButton();
        Button_Atan = new javax.swing.JButton();
        Button_Suma = new javax.swing.JButton();
        Button_E = new javax.swing.JButton();
        Button_Cuadrado = new javax.swing.JButton();
        Button_Retroseso = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Label_Memoria = new javax.swing.JLabel();
        TextField_Principal = new javax.swing.JTextField();
        TextField_Previo = new javax.swing.JTextField();
        RadioButton_Sexages = new javax.swing.JRadioButton();
        RadioButton_Radianes = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora ");

        Button_1x.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        Button_1x.setText("1/x");
        Button_1x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_1xActionPerformed(evt);
            }
        });

        Button_Porcentaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Porcentaje.setText("%");
        Button_Porcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PorcentajeActionPerformed(evt);
            }
        });

        Button_N1.setBackground(new java.awt.Color(255, 255, 255));
        Button_N1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N1.setText("1");
        Button_N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N1ActionPerformed(evt);
            }
        });

        Button_Mmenos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Mmenos.setText("M-");
        Button_Mmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MmenosActionPerformed(evt);
            }
        });

        Button_Asin.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        Button_Asin.setText("sin-1");
        Button_Asin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AsinActionPerformed(evt);
            }
        });

        Button_MS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_MS.setText("MS");
        Button_MS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MSActionPerformed(evt);
            }
        });

        Button_Cubo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Cubo.setText("x^3");
        Button_Cubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CuboActionPerformed(evt);
            }
        });

        Button_N4.setBackground(new java.awt.Color(255, 255, 255));
        Button_N4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N4.setText("4");
        Button_N4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N4ActionPerformed(evt);
            }
        });

        Button_Sin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Sin.setText("sin");
        Button_Sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SinActionPerformed(evt);
            }
        });

        Button_RaizX.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_RaizX.setText("y√x");
        Button_RaizX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RaizXActionPerformed(evt);
            }
        });

        Button_Tan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Tan.setText("tan");
        Button_Tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_TanActionPerformed(evt);
            }
        });

        Button_MR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_MR.setText("MR");
        Button_MR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MRActionPerformed(evt);
            }
        });

        Button_MC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_MC.setText("MC");
        Button_MC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MCActionPerformed(evt);
            }
        });

        Button_N5.setBackground(new java.awt.Color(255, 255, 255));
        Button_N5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N5.setText("5");
        Button_N5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N5ActionPerformed(evt);
            }
        });

        Button_Mmas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Button_Mmas.setText("M+");
        Button_Mmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MmasActionPerformed(evt);
            }
        });

        Button_N3.setBackground(new java.awt.Color(255, 255, 255));
        Button_N3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N3.setText("3");
        Button_N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N3ActionPerformed(evt);
            }
        });

        Button_Cos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Cos.setText("cos");
        Button_Cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CosActionPerformed(evt);
            }
        });

        Button_RaizCuadrada.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_RaizCuadrada.setText("√");
        Button_RaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RaizCuadradaActionPerformed(evt);
            }
        });

        Button_N6.setBackground(new java.awt.Color(255, 255, 255));
        Button_N6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N6.setText("6");
        Button_N6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N6ActionPerformed(evt);
            }
        });

        Button_C.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_C.setForeground(new java.awt.Color(251, 54, 1));
        Button_C.setText("C");
        Button_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CActionPerformed(evt);
            }
        });

        Button_Multiplicacion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Multiplicacion.setText("*");
        Button_Multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_MultiplicacionActionPerformed(evt);
            }
        });

        Button_CE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_CE.setForeground(new java.awt.Color(251, 115, 0));
        Button_CE.setText("CE");
        Button_CE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CEActionPerformed(evt);
            }
        });

        Button_Xmenos1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Button_Xmenos1.setText("x^-1");
        Button_Xmenos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Xmenos1ActionPerformed(evt);
            }
        });

        Button_N9.setBackground(new java.awt.Color(255, 255, 255));
        Button_N9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N9.setText("9");
        Button_N9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N9ActionPerformed(evt);
            }
        });

        Button_Exponente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Exponente.setText("x^y");
        Button_Exponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_ExponenteActionPerformed(evt);
            }
        });

        Button_Division.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Division.setText("/");
        Button_Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DivisionActionPerformed(evt);
            }
        });

        Button_PI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_PI.setText("pi(π)");
        Button_PI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_PIActionPerformed(evt);
            }
        });

        Button_N2.setBackground(new java.awt.Color(255, 255, 255));
        Button_N2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N2.setText("2");
        Button_N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N2ActionPerformed(evt);
            }
        });

        Button_Signo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Signo.setText("±");
        Button_Signo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SignoActionPerformed(evt);
            }
        });

        Button_N7.setBackground(new java.awt.Color(255, 255, 255));
        Button_N7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N7.setText("7");
        Button_N7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N7ActionPerformed(evt);
            }
        });

        Button_N8.setBackground(new java.awt.Color(255, 255, 255));
        Button_N8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N8.setText("8");
        Button_N8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N8ActionPerformed(evt);
            }
        });

        Button_EXP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_EXP.setText("EXP");
        Button_EXP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_EXPActionPerformed(evt);
            }
        });

        Button_10levarX.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        Button_10levarX.setText("10^x");
        Button_10levarX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_10levarXActionPerformed(evt);
            }
        });

        Button_Decimal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Decimal.setText(".");
        Button_Decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_DecimalActionPerformed(evt);
            }
        });

        Button_N0.setBackground(new java.awt.Color(255, 255, 255));
        Button_N0.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_N0.setText("0");
        Button_N0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_N0ActionPerformed(evt);
            }
        });

        Button_log.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_log.setText("log");
        Button_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_logActionPerformed(evt);
            }
        });

        Button_RaizCubica.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_RaizCubica.setText("3√x");
        Button_RaizCubica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RaizCubicaActionPerformed(evt);
            }
        });

        Button_Factorial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Factorial.setText("n!");
        Button_Factorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_FactorialActionPerformed(evt);
            }
        });

        Button_gual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_gual.setText("=");
        Button_gual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_gualActionPerformed(evt);
            }
        });

        Button_Acos.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        Button_Acos.setText("cos-1");
        Button_Acos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AcosActionPerformed(evt);
            }
        });

        Button_Resta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Resta.setText("-");
        Button_Resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RestaActionPerformed(evt);
            }
        });

        Button_Atan.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        Button_Atan.setText("tan-1");
        Button_Atan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_AtanActionPerformed(evt);
            }
        });

        Button_Suma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Suma.setText("+");
        Button_Suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SumaActionPerformed(evt);
            }
        });

        Button_E.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_E.setText("e");
        Button_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_EActionPerformed(evt);
            }
        });

        Button_Cuadrado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Button_Cuadrado.setText("x^2");
        Button_Cuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CuadradoActionPerformed(evt);
            }
        });

        Button_Retroseso.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Button_Retroseso.setText("<--");
        Button_Retroseso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_RetrosesoActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Memoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Label_Memoria.setText("M");
        jPanel1.add(Label_Memoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 12, -1, -1));

        TextField_Principal.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        TextField_Principal.setForeground(new java.awt.Color(0, 51, 153));
        TextField_Principal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TextField_Principal.setText("0 ");
        TextField_Principal.setToolTipText("");
        TextField_Principal.setBorder(null);
        TextField_Principal.setFocusable(false);
        TextField_Principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_PrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 600, 48));

        TextField_Previo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextField_Previo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TextField_Previo.setText(" ");
        TextField_Previo.setBorder(null);
        TextField_Previo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextField_Previo.setFocusable(false);
        TextField_Previo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_PrevioActionPerformed(evt);
            }
        });
        jPanel1.add(TextField_Previo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, 600, 24));

        buttonGroup1.add(RadioButton_Sexages);
        RadioButton_Sexages.setSelected(true);
        RadioButton_Sexages.setText("Sexages");

        buttonGroup1.add(RadioButton_Radianes);
        RadioButton_Radianes.setText("Radianes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button_10levarX, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_EXP, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_log, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_N0, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Button_Factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_RaizCubica, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_Cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_N1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Button_E, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_RaizX, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_Cubo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_N4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Button_PI, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_Xmenos1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_Exponente, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_N7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Button_Acos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_Asin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_Atan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Button_Retroseso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Button_CE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_N8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_N5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_N2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Button_Cos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_Sin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_Tan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_MC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_MR, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(RadioButton_Sexages)
                                .addGap(18, 18, 18)
                                .addComponent(RadioButton_Radianes)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_Decimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Button_N3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_N6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_N9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Button_MS, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Button_Division, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_Signo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_Mmas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Button_Mmenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_RaizCuadrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Button_Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Button_Multiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_1x, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Button_Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button_Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Button_gual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton_Sexages)
                    .addComponent(RadioButton_Radianes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Cos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Sin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Tan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_MC, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_MR, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_MS, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Mmas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Mmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Acos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Asin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Atan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Retroseso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_CE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_C, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Signo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_RaizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_PI, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Xmenos1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Exponente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_N7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_N8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_N9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Division, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_E, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_RaizX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Cubo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_N4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_N5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_N6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_Multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_1x, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_Factorial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_RaizCubica, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Cuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_N1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_N2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_N3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Resta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_10levarX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_EXP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_log, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_N0, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Decimal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_Suma, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Button_gual, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Botones numericos
    private void Button_N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N1ActionPerformed
        agregarValorTextFieldPrincipal(evt.getActionCommand());
    }//GEN-LAST:event_Button_N1ActionPerformed

    private void Button_N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N2ActionPerformed
        agregarValorTextFieldPrincipal(evt.getActionCommand());
    }//GEN-LAST:event_Button_N2ActionPerformed

    private void Button_N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N3ActionPerformed
        agregarValorTextFieldPrincipal(evt.getActionCommand());
    }//GEN-LAST:event_Button_N3ActionPerformed

    private void Button_N4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N4ActionPerformed
        agregarValorTextFieldPrincipal(evt.getActionCommand());
    }//GEN-LAST:event_Button_N4ActionPerformed

    private void Button_N5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N5ActionPerformed
        agregarValorTextFieldPrincipal(evt.getActionCommand());
    }//GEN-LAST:event_Button_N5ActionPerformed

    private void Button_N6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N6ActionPerformed
        agregarValorTextFieldPrincipal(evt.getActionCommand());
    }//GEN-LAST:event_Button_N6ActionPerformed

    private void Button_N7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N7ActionPerformed
        agregarValorTextFieldPrincipal(evt.getActionCommand());
    }//GEN-LAST:event_Button_N7ActionPerformed

    private void Button_N8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N8ActionPerformed
        agregarValorTextFieldPrincipal(evt.getActionCommand());
    }//GEN-LAST:event_Button_N8ActionPerformed

    private void Button_N9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N9ActionPerformed
        agregarValorTextFieldPrincipal(evt.getActionCommand());
    }//GEN-LAST:event_Button_N9ActionPerformed

    private void Button_N0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_N0ActionPerformed
        agregarValorTextFieldPrincipal(evt.getActionCommand());
    }//GEN-LAST:event_Button_N0ActionPerformed
    //Botón la función de punto decimal
    private void Button_DecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DecimalActionPerformed
        if (!TextField_Principal.getText().contains(".")) {
            TextField_Principal.setText(TextField_Principal.getText() + ".");
            isPrincipalTextNull = false;
        }
    }//GEN-LAST:event_Button_DecimalActionPerformed
    //Botón de la función de suma
    private void Button_SumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SumaActionPerformed
        isPrincipalTextNull = true;
        valor1 = TextField_Principal.getText();
        setValorTextPrevio(valor1 + "+", true);
        tipoOperacion = TipoOperacion.SUMA;
    }//GEN-LAST:event_Button_SumaActionPerformed
    //Botón de la función de resta
    private void Button_RestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RestaActionPerformed
        isPrincipalTextNull = true;
        valor1 = TextField_Principal.getText();
        setValorTextPrevio(valor1 + "-", true);
        tipoOperacion = TipoOperacion.RESTA;
    }//GEN-LAST:event_Button_RestaActionPerformed
    //Botón de la función de multiplicar
    private void Button_MultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MultiplicacionActionPerformed
        isPrincipalTextNull = true;
        valor1 = TextField_Principal.getText();
        setValorTextPrevio(valor1 + "*", true);
        tipoOperacion = TipoOperacion.MULTIPLICACION;
    }//GEN-LAST:event_Button_MultiplicacionActionPerformed
    //Botón de la función de división
    private void Button_DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_DivisionActionPerformed
        isPrincipalTextNull = true;
        valor1 = TextField_Principal.getText();
        setValorTextPrevio(valor1 + "/", true);
        tipoOperacion = TipoOperacion.DIVISION;
    }//GEN-LAST:event_Button_DivisionActionPerformed

    //Botón de la función de igual
    private void Button_gualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_gualActionPerformed
        isPrincipalTextNull = true;
        if (tipoOperacion != TipoOperacion.NINGUNA) {
            valor2 = TextField_Principal.getText();
            TextField_Previo.setText(TextField_Previo.getText() + TextField_Principal.getText());
            switch (tipoOperacion) {
                case SUMA:
                    valor1 = operacion.calcular(valor1, valor2, TipoOperacion.SUMA);
                    TextField_Principal.setText(valor1);
                    break;
                case RESTA:
                    valor1 = operacion.calcular(valor1, valor2, TipoOperacion.RESTA);
                    TextField_Principal.setText(valor1);
                    break;
                case MULTIPLICACION:
                    valor1 = operacion.calcular(valor1, valor2, TipoOperacion.MULTIPLICACION);
                    TextField_Principal.setText(valor1);
                    break;
                case DIVISION:
                    valor1 = operacion.calcular(valor1, valor2, TipoOperacion.DIVISION);
                    TextField_Principal.setText(valor1);
                    break;
                case POTENCIA:
                    valor1 = operacion.calcular(valor1, valor2, TipoOperacion.POTENCIA);
                    TextField_Principal.setText(valor1);
                    break;
                case RAIZ:
                    valor1 = operacion.calcular(valor2, valor1, TipoOperacion.RAIZ);
                    if (!valor1.equals("Error ")) {
                        TextField_Previo.setText( TextField_Previo.getText()+ " yroot "+ valor2 );
                    }
                    TextField_Principal.setText(valor1);
                    break;
            }
        }
    }//GEN-LAST:event_Button_gualActionPerformed
//Botón con la función de RAIZ CUADRADA
    private void Button_RaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RaizCuadradaActionPerformed
        valor2 = TextField_Principal.getText();
        valor1 = operacion.calcular(valor2, "2", TipoOperacion.RAIZ);
        if (!valor1.equals("Error ")) 
            TextField_Previo.setText(" sqrt ("+ valor2+") " );
        TextField_Principal.setText(valor1);
    }//GEN-LAST:event_Button_RaizCuadradaActionPerformed
//Botón con la función de PORCENTAJE
    private void Button_PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PorcentajeActionPerformed
        valor2 = TextField_Principal.getText();
        TextField_Previo.setText(TextField_Previo.getText() + valor2);
        TextField_Principal.setText(operacion.calcular(valor1, valor2, TipoOperacion.PORCENTAJE));
    }//GEN-LAST:event_Button_PorcentajeActionPerformed
//Botón que realiza la operación inversa 1/x
    private void Button_1xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_1xActionPerformed
        valor1 = TextField_Principal.getText();
        TextField_Previo.setText("reciproc(" + valor1 + ")");
        TextField_Principal.setText(operacion.calcular(valor1, TipoOperacion.INVERSA));
    }//GEN-LAST:event_Button_1xActionPerformed
    //Botón que realiza la operación cambio de signo
    private void Button_SignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SignoActionPerformed
        valor1 = TextField_Principal.getText();
        TextField_Principal.setText(operacion.calcular(valor1, TipoOperacion.CAMBIO_SIGNO));
    }//GEN-LAST:event_Button_SignoActionPerformed
    //Botón con la función de C
    private void Button_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CActionPerformed
        TextField_Principal.setText("0");
        TextField_Previo.setText("");
        isPrincipalTextNull = true;
        valor1 = "0.0";
        valor2 = "0.0";
        tipoOperacion=TipoOperacion.NINGUNA;
    }//GEN-LAST:event_Button_CActionPerformed
    //Botón con la función de CE
    private void Button_CEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CEActionPerformed
        TextField_Principal.setText("0");
        TextField_Previo.setText("");
        isPrincipalTextNull = true;
    }//GEN-LAST:event_Button_CEActionPerformed
    //Botón con la función de RETROCEDER
    private void Button_RetrosesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RetrosesoActionPerformed
        if (TextField_Principal.getText().length() > 0) {
            TextField_Principal.setText(TextField_Principal.getText().substring(0, TextField_Principal.getText().length() - 1));
            if (TextField_Principal.getText().length() == 0) {
                TextField_Principal.setText("0");
                isPrincipalTextNull = true;
            }
        }
    }//GEN-LAST:event_Button_RetrosesoActionPerformed

    private void Button_CosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CosActionPerformed
        valor1 = TextField_Principal.getText();
        TextField_Previo.setText(" cos( " + valor1 + " )");
        TextField_Principal.setText(operacion.calcular(valor1, TipoOperacion.COSENO, getTipoGrado()));
    }//GEN-LAST:event_Button_CosActionPerformed

    private void Button_SinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SinActionPerformed
        valor1 = TextField_Principal.getText();
        TextField_Previo.setText(" sin( " + valor1 + " )");
        TextField_Principal.setText(operacion.calcular(valor1, TipoOperacion.SENO, getTipoGrado()));
    }//GEN-LAST:event_Button_SinActionPerformed

    private void Button_TanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_TanActionPerformed
        valor1 = TextField_Principal.getText();
        TextField_Previo.setText(" tan( " + valor1 + " )");
        TextField_Principal.setText(operacion.calcular(valor1, TipoOperacion.TANGENTE, getTipoGrado()));
    }//GEN-LAST:event_Button_TanActionPerformed

    private void Button_AcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AcosActionPerformed
        valor1 = TextField_Principal.getText();
        TextField_Previo.setText(" acos( " + valor1 + " )");
        TextField_Principal.setText(operacion.calcular(valor1, TipoOperacion.ACOSENO, getTipoGrado()));
    }//GEN-LAST:event_Button_AcosActionPerformed

    private void Button_AsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AsinActionPerformed
        valor1 = TextField_Principal.getText();
        TextField_Previo.setText(" asin( " + valor1 + " )");
        TextField_Principal.setText(operacion.calcular(valor1, TipoOperacion.ASENO, getTipoGrado()));
    }//GEN-LAST:event_Button_AsinActionPerformed

    private void Button_AtanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_AtanActionPerformed
        valor1 = TextField_Principal.getText();
        TextField_Previo.setText(" atan( " + valor1 + " )");
        TextField_Principal.setText(operacion.calcular(valor1, TipoOperacion.ATANGENTE, getTipoGrado()));
    }//GEN-LAST:event_Button_AtanActionPerformed
    //Botón que devuelve el valor de Pi
    private void Button_PIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_PIActionPerformed
        TextField_Previo.setText("PI ");
        TextField_Principal.setText(Math.PI + " ");
    }//GEN-LAST:event_Button_PIActionPerformed
    //Botón que eleva a x a la -1
    private void Button_Xmenos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Xmenos1ActionPerformed
        valor1 = TextField_Principal.getText();
        valor1 = operacion.calcular(valor1, "-1", TipoOperacion.POTENCIA);
        TextField_Principal.setText(valor1);
    }//GEN-LAST:event_Button_Xmenos1ActionPerformed
    //Botón que eleva un numero a x Potencia
    private void Button_ExponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_ExponenteActionPerformed
        isPrincipalTextNull = true;
        valor1 = TextField_Principal.getText();
        TextField_Previo.setText(valor1 + " ^-1 ");
        tipoOperacion = TipoOperacion.POTENCIA;
    }//GEN-LAST:event_Button_ExponenteActionPerformed
    //Botón que saca la raíz x de un número
    private void Button_RaizXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RaizXActionPerformed
        isPrincipalTextNull = true;
        valor1 = TextField_Principal.getText();
        TextField_Previo.setText(valor1 + " yroot ");
        tipoOperacion = TipoOperacion.RAIZ;
    }//GEN-LAST:event_Button_RaizXActionPerformed
    //Botón que eleva a x al cubo
    private void Button_CuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CuboActionPerformed
        valor1 = TextField_Principal.getText();
        TextField_Previo.setText("cube( " + valor1 + " )");
        valor1 = operacion.calcular(valor1, "3", TipoOperacion.POTENCIA);
        TextField_Principal.setText(valor1);
    }//GEN-LAST:event_Button_CuboActionPerformed
    //Botón que devuelve el factorial de un número
    private void Button_FactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_FactorialActionPerformed
        valor1 = TextField_Principal.getText();
        TextField_Previo.setText("fact( "+valor1 + " )");
        valor1 = operacion.calcular(valor1, TipoOperacion.FACTORIAL);
        TextField_Principal.setText(valor1);
    }//GEN-LAST:event_Button_FactorialActionPerformed
    //Botón que devuelve el valor de e
    private void Button_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EActionPerformed
        TextField_Previo.setText("E ");
        TextField_Principal.setText(Math.E + " ");
    }//GEN-LAST:event_Button_EActionPerformed
    //Botón de la raíz cubica #############################
    private void Button_RaizCubicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_RaizCubicaActionPerformed
        valor2 = TextField_Principal.getText();
        valor1 = operacion.calcular(valor2, "3", TipoOperacion.RAIZ);
        if (!valor1.equals("Error ")) 
            TextField_Previo.setText(" cuberoot ("+ valor2+") " );
        TextField_Principal.setText(valor1);
    }//GEN-LAST:event_Button_RaizCubicaActionPerformed
    //Botón eleva a x al cuadrado
    private void Button_CuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CuadradoActionPerformed
        valor1 = TextField_Principal.getText();
        TextField_Previo.setText("sqr( " + valor1 + " )");
        valor1 = operacion.calcular(valor1, "2", TipoOperacion.POTENCIA);
        TextField_Principal.setText(valor1);
    }//GEN-LAST:event_Button_CuadradoActionPerformed
    //Botón que eleva 10 a la x potencia
    private void Button_10levarXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_10levarXActionPerformed
        valor1 = TextField_Principal.getText();
        TextField_Previo.setText("powten( " + valor1 + " )");
        valor1 = operacion.calcular("10", valor1, TipoOperacion.POTENCIA);
        TextField_Principal.setText(valor1);
    }//GEN-LAST:event_Button_10levarXActionPerformed
    //Botón de la exponenciación neperiana
    private void Button_EXPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EXPActionPerformed
        valor1 = TextField_Principal.getText();
        valor1 = operacion.calcular(valor1, TipoOperacion.EXPONENCIACION);
        TextField_Principal.setText(valor1);
    }//GEN-LAST:event_Button_EXPActionPerformed
    //Botón del logaritmo neperiano
    private void Button_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_logActionPerformed
        valor1 = TextField_Principal.getText();
        TextField_Previo.setText("log( " + valor1 + " )");
        valor1 = operacion.calcular(valor1, TipoOperacion.LOGARITMO);
        TextField_Principal.setText(valor1);
    }//GEN-LAST:event_Button_logActionPerformed
    //Botón con la función MC
    private void Button_MCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MCActionPerformed
        memoria = 0;
        Label_Memoria.setVisible(false);
    }//GEN-LAST:event_Button_MCActionPerformed
    //Botón con la función MR
    private void Button_MRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MRActionPerformed
        TextField_Principal.setText(memoria + " ");
    }//GEN-LAST:event_Button_MRActionPerformed
    //Botón con la función MS
    private void Button_MSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MSActionPerformed
        memoria = Double.parseDouble(TextField_Principal.getText());
        Label_Memoria.setVisible(true);
    }//GEN-LAST:event_Button_MSActionPerformed
    //Botón con la función M+
    private void Button_MmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MmasActionPerformed
        memoria = memoria + Double.parseDouble(TextField_Principal.getText());
        Label_Memoria.setVisible(true);
    }//GEN-LAST:event_Button_MmasActionPerformed
    //Botón con la función M-
    private void Button_MmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_MmenosActionPerformed
        memoria = memoria - Double.parseDouble(TextField_Principal.getText());
        Label_Memoria.setVisible(true);
    }//GEN-LAST:event_Button_MmenosActionPerformed

    private void TextField_PrevioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_PrevioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_PrevioActionPerformed

    private void TextField_PrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_PrincipalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_PrincipalActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_10levarX;
    private javax.swing.JButton Button_1x;
    private javax.swing.JButton Button_Acos;
    private javax.swing.JButton Button_Asin;
    private javax.swing.JButton Button_Atan;
    private javax.swing.JButton Button_C;
    private javax.swing.JButton Button_CE;
    private javax.swing.JButton Button_Cos;
    private javax.swing.JButton Button_Cuadrado;
    private javax.swing.JButton Button_Cubo;
    private javax.swing.JButton Button_Decimal;
    private javax.swing.JButton Button_Division;
    private javax.swing.JButton Button_E;
    private javax.swing.JButton Button_EXP;
    private javax.swing.JButton Button_Exponente;
    private javax.swing.JButton Button_Factorial;
    private javax.swing.JButton Button_MC;
    private javax.swing.JButton Button_MR;
    private javax.swing.JButton Button_MS;
    private javax.swing.JButton Button_Mmas;
    private javax.swing.JButton Button_Mmenos;
    private javax.swing.JButton Button_Multiplicacion;
    private javax.swing.JButton Button_N0;
    private javax.swing.JButton Button_N1;
    private javax.swing.JButton Button_N2;
    private javax.swing.JButton Button_N3;
    private javax.swing.JButton Button_N4;
    private javax.swing.JButton Button_N5;
    private javax.swing.JButton Button_N6;
    private javax.swing.JButton Button_N7;
    private javax.swing.JButton Button_N8;
    private javax.swing.JButton Button_N9;
    private javax.swing.JButton Button_PI;
    private javax.swing.JButton Button_Porcentaje;
    private javax.swing.JButton Button_RaizCuadrada;
    private javax.swing.JButton Button_RaizCubica;
    private javax.swing.JButton Button_RaizX;
    private javax.swing.JButton Button_Resta;
    private javax.swing.JButton Button_Retroseso;
    private javax.swing.JButton Button_Signo;
    private javax.swing.JButton Button_Sin;
    private javax.swing.JButton Button_Suma;
    private javax.swing.JButton Button_Tan;
    private javax.swing.JButton Button_Xmenos1;
    private javax.swing.JButton Button_gual;
    private javax.swing.JButton Button_log;
    private javax.swing.JLabel Label_Memoria;
    private javax.swing.JRadioButton RadioButton_Radianes;
    private javax.swing.JRadioButton RadioButton_Sexages;
    private javax.swing.JTextField TextField_Previo;
    private javax.swing.JTextField TextField_Principal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
