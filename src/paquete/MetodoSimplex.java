package paquete;

import java.io.*;
import java.text.DecimalFormat;
import javax.swing.*;
public class MetodoSimplex extends javax.swing.JFrame {
    int numerodetabla=1;
    int termina=0;
    //Aqui esta el renglon pivote y es global por que la ocupo en otros metodos
    int renglonpiv=0;
    //Valores de z los cuales multiplico por menos uno para hacerlos negativo ya que asi es como se ocupan
    double maxmulti,maxmulti2;
    //Variable para donde me indica clumna pivote 
    int colpiv;
    //Variables de las cajas de texto 
    static double cc1,cc2,cc3,cc4,cc5,cc6,cc7,cc8,cc9,maxz,maxz2;
    //variables de holgura renglon 1
    static double r1=1,r2=0,r3=0;
    //variables de holgura renglon 2
     static double rr1=0,rr2=1,rr3=0;
     //variables de holgura reglon 3
      static double h1=0,h2=0,h3=1;
      //variables de holgura de z
      static double val1=0,val2=0,val3=0,val4=0;
      
      
    static BufferedReader entra=new BufferedReader (new InputStreamReader (System.in));
    public MetodoSimplex() {
        
        //this.setLocationRelativeTo(null);
        this.setResizable(false);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        maxzx = new javax.swing.JTextField();
        maxzy = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        llenartabla = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        c3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        c4 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        c5 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        c6 = new javax.swing.JTextField();
        c7 = new javax.swing.JTextField();
        c8 = new javax.swing.JTextField();
        c9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        s1 = new javax.swing.JTextField();
        s31 = new javax.swing.JTextField();
        s2 = new javax.swing.JTextField();
        s3 = new javax.swing.JTextField();
        s4 = new javax.swing.JTextField();
        s5 = new javax.swing.JTextField();
        sol1 = new javax.swing.JTextField();
        s21 = new javax.swing.JTextField();
        s22 = new javax.swing.JTextField();
        s23 = new javax.swing.JTextField();
        s24 = new javax.swing.JTextField();
        s25 = new javax.swing.JTextField();
        s32 = new javax.swing.JTextField();
        s33 = new javax.swing.JTextField();
        s35 = new javax.swing.JTextField();
        s34 = new javax.swing.JTextField();
        z1 = new javax.swing.JTextField();
        z2 = new javax.swing.JTextField();
        z3 = new javax.swing.JTextField();
        z4 = new javax.swing.JTextField();
        sol4 = new javax.swing.JTextField();
        sol3 = new javax.swing.JTextField();
        sol2 = new javax.swing.JTextField();
        z5 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("MetodoSimplex");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Z =");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        maxzx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxzxActionPerformed(evt);
            }
        });

        jLabel6.setText("Restricciones");

        jLabel18.setText("Solucion");

        llenartabla.setText("Llenar Tabla");
        llenartabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                llenartablaMouseClicked(evt);
            }
        });
        llenartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llenartablaActionPerformed(evt);
            }
        });

        jButton1.setText("Siguiente");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X + ");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Y");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X + ");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("X + ");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("X + ");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Y");

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Y");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Y");

        jLabel15.setText("(1)");

        jLabel16.setText("(2)");

        jLabel17.setText("(3)");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("<=");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("<=");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("<=");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel17))))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jLabel19.setText("R1");

        jLabel20.setText("R2");

        jLabel21.setText("R3");

        jLabel22.setText("Z");

        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });

        jLabel23.setText("X");

        jLabel24.setText("Y");

        jLabel25.setText("S1");

        jLabel26.setText("S2");

        jLabel27.setText("S3");

        jLabel28.setText("RES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(z1)
                                    .addComponent(s31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(s32)
                                    .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(s33)
                                    .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(s34)
                                    .addComponent(z4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(s35)
                                    .addComponent(z5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sol3)
                                    .addComponent(sol4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(s21, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(s22)
                                    .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(s3)
                                    .addComponent(s23, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(s4)
                                    .addComponent(s24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(s5)
                                    .addComponent(s25, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sol1)
                                    .addComponent(sol2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel23)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel24)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel25)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel26)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel27)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel28)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel25)
                        .addComponent(jLabel26)
                        .addComponent(jLabel28))
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sol1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(s24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sol2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sol3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(z1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sol4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(257, 257, 257))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(llenartabla))
                            .addComponent(jLabel6)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maxzx, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxzy, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(maxzx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxzy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(llenartabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maxzxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxzxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxzxActionPerformed

    private void llenartablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_llenartablaMouseClicked

    }//GEN-LAST:event_llenartablaMouseClicked
    
    public void Error () throws  NumberFormatException {
        //Extraigo los datos de las restrcciones aqui para que si meten algo que no o lo dejan bacio no truene
        try{
         cc1 = Double.parseDouble(c1.getText());  
        cc2 = Double.parseDouble(c2.getText());
        cc3 = Double.parseDouble(c3.getText());
        
        //Aqui se extraen los datos de la segunda restrccion
        cc4=Double.parseDouble(c4.getText());
        cc5=Double.parseDouble(c5.getText());
        cc6=Double.parseDouble(c6.getText());
        
        //Aqui se extraen los datos de la tercera restrccion
        
        cc7=Double.parseDouble(c7.getText());
        cc8=Double.parseDouble(c8.getText());
        cc9=Double.parseDouble(c9.getText());
        
          // Aqui se extraen los numeros de z
        maxz=Double.parseDouble(maxzx.getText());
        maxz2=Double.parseDouble(maxzy.getText());
        

        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"LLene los Campos");
        }
    }
    private void llenartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llenartablaActionPerformed
        Error();

        //int array[][]=
        
        //Aqui se muestran los datos en la tabla del primer renglon
        s1.setText("" + cc1);
        s2.setText(""+cc2);
        s3.setText("" +r1);
        s4.setText(""+ r2);
        s5.setText(""+r3);
        sol1.setText("" + cc3);
        //Aqui se muestran los datos de la tabla en el segundo renglon
        
        s21.setText(""+cc4);
        s22.setText(""+cc5);
        s23.setText(""+rr1);
        s24.setText(""+rr2 );
        s25.setText("" + rr3);
        sol2.setText("" + cc6);
        
        //Aqui se muestran los datos de el tercer renglon
        
        s31.setText(""+ cc7);
        s32.setText("" + cc8);
        s33.setText("" + h1);
        s34.setText(""+ h2);
        s35.setText("" + h3);
        sol3.setText("" + cc9);
        
      
        //Aqui se muestran los datos de el cuarto renglon el de z
      
//        maxmulti=maxz*-1;
//        maxmulti2=maxz2*-1;
        maxz=maxz*-1;
        maxz2=maxz2*-1;
        
        z1.setText(""+ maxz);
        z2.setText("" + maxz2);
        z3.setText("" + val1);
        z4.setText(""+val2);
        z5.setText(""+ val3);
        sol4.setText("" + val4);
        
        
        
         

    }//GEN-LAST:event_llenartablaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        int i,j;
        double[][] aux=new double [3][5];
        double array[][]= {
            //Aqui meto todos los datos de las cajas de texto a una matriz para
            //Que se mas facil manipular los datos
            
            //   0           1          2           3       4           5
            //   x           y          s1         s2       s3      solucion
            {   cc1    ,    cc2    ,    r1    ,    r2   ,   r3    ,   cc3    },//s1   0 
            {   cc4    ,    cc5    ,    rr1   ,    rr2  ,   rr3   ,   cc6    },//s2   1 
            {   cc7    ,    cc8    ,    h1    ,    h2   ,   h3    ,   cc9    },//s3   2 
            {   maxz   ,   maxz2   ,   val1   ,   val2  ,  val3   ,   val4   },//z    3
        };
       
        
        
        if(termina==1){
            JOptionPane.showMessageDialog(null, "El ejercicio ya esta terminado");
        }else{
            numerodetabla++;
       
            
        //esto solo lo ise para comprovar que los datos que agarro si coinciden con los que hay en la tabla
        for(i = 0; i < 4; i++){
            for (j = 0; j < 6; j++) {
                System.out.print("  " + array[i][j]);
            }
            System.out.println();
        }
        
        
        
        //Aqui busca el numero menor de la columna z para encontrar la columna pivote
        i=0;
        j=0;
        
        int buscamen=9999999;
        
        for(i=3;i<4;i++){
            for(j=0;j<6;j++){
                if(buscamen>=array[i][j]){
                    buscamen=(int) array[i][j];
                    //Aqui esta el valor de mi columna pivote en la siguiente variable
                    colpiv=j;
               }      
            }
            System.out.println();
        }
    
        
        //Aqui saco el renglon pivote
        double buscamay=999999999;
        
        i=0;
        j=0;
        int cont=0;
        double div=0;
        
        for (i = 0; i < 3; i++) {
            for (j = colpiv; j < colpiv + 1; j++) {
                div = array[cont][5] / array[cont][colpiv];
                cont++;
                if (div < buscamay) {
                    buscamay = div;
                    renglonpiv = i;
                }
            }
            //System.out.println("Resultado div " + div);
        }
        
        RenglonPivote();
        RenglonesQuefaltan();
      
        }
        
        
        
        
        
        
        
        //Aqui compruebo si la ultima linea ose z todos sus valores son positivos 
        //De ser asi el ejercicio estaria terminado
        //es otra matriz siferente por que si pongo la mima que tengo arriva los valores no
        //estaria cambiados ya que cuando me genero la priemera matriz me la iso con los valores que tenia en ese
        //momento pero se ase la nueva para que carge los nuevos valores ya modificados
        
        
         double comprovar[][]= {
             
            //   0           1          2           3       4           5
            //   x           y          s1         s2       s3      solucion
            {   cc1    ,    cc2    ,    r1    ,    r2   ,   r3    ,   cc3    },//s1   0 
            {   cc4    ,    cc5    ,    rr1   ,    rr2  ,   rr3   ,   cc6    },//s2   1 
            {   cc7    ,    cc8    ,    h1    ,    h2   ,   h3    ,   cc9    },//s3   2 
            {   maxz   ,   maxz2   ,   val1   ,   val2  ,  val3   ,   val4   },//z    3
        };
         
        if (termina == 0) {
            if (comprovar[3][0] >= 0 && comprovar[3][1] >= 0 && comprovar[3][2] >= 0 && comprovar[3][3] >= 0 && comprovar[3][4] >= 0 && comprovar[3][5] >= 0) {
                JOptionPane.showMessageDialog(null, "Genial el ejercicio esta terminado");
                termina++;
            }
        }
        
        
        
    
        System.out.println("Columna pivote vale "+  colpiv);
        System.out.println("El renglon pivote vale: " + renglonpiv);
        //JOptionPane.showMessageDialog(null,"Se supone que me imprimio la matiz en consola");
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2ActionPerformed

    
    
    public  void RenglonPivote () {
        int i,j;
             double array[][]= {
            //Aqui meto todos los datos de las cajas de texto a una matriz para
            //Que se mas facil manipular los datos
            //   0           1          2           3       4           5
            //   x           y          s1         s2       s3      solucion
            {   cc1    ,    cc2    ,    r1    ,    r2   ,   r3    ,   cc3    },//s1   0 
            {   cc4    ,    cc5    ,    rr1   ,    rr2  ,   rr3   ,   cc6    },//s2   1 
            {   cc7    ,    cc8    ,    h1    ,    h2   ,   h3    ,   cc9    },//s3   2 
            {   maxz   ,   maxz2   ,   val1   ,   val2  ,  val3   ,   val4   },//z    3
        };
       
             
         if ( renglonpiv == 0) {
            //JOptionPane.showMessageDialog(null,"entre aqui");
            i = 0;
            j = 0;
            double renpiv = 0;
            for (i = renglonpiv; i < renglonpiv + 1; i++) {
                for (j = 0; j < 6; j++) {
                    renpiv = array[renglonpiv][j] / array[renglonpiv][colpiv];

                //Aqui mando a las cjas de texto el resultado de las diviciones y actualizo el valor que tenian
                    //las cajas ya que su valor cambio al divir.
                    if (j == 0) {
                        cc1 = renpiv;
                        s1.setText("");
                        s1.setText("" + renpiv);
                    }
                    if (j == 1) {
                        cc2 = renpiv;
                        s2.setText("");
                        s2.setText("" + renpiv);
                    }
                    if (j == 2) {
                        r1 = renpiv;
                        s3.setText("");
                        s3.setText("" + renpiv);
                    }
                    if (j == 3) {
                        r2 = renpiv;
                        s4.setText("");
                        s4.setText("" + renpiv);
                    }

                    if (j == 4) {
                        r3 = renpiv;
                        s5.setText("");
                        s5.setText("" + renpiv);
                    }
                    if (j == 5) {
                        cc3 = renpiv;
                        sol1.setText("");
                        sol1.setText("" + renpiv);
                    }
                    //System.out.println("Divicion: " + renpiv);
                }
            }
        }
        
             
        //Este renglo pivote solo es valido cuando la COLUMNA PIVOTE VALGA 1 y RENGLO PIVOTE VALGA 1
          //Aqui ago el nuevo renglon pivotito
        if ( renglonpiv == 1) {
            
            i = 0;
            j = 0;
            double renpiv = 0;
            for (i = renglonpiv; i < renglonpiv + 1; i++) {
                for (j = 0; j < 6; j++) {
                    //System.out.println("primero " + array[renglonpiv][j]);
                    //System.out.println("Segundo " + array[renglonpiv][colpiv]);
                    renpiv = array[renglonpiv][j] / array[renglonpiv][colpiv];

                //Aqui mando a las cjas de texto el resultado de las diviciones y actualizo el valor que tenian
                    //las cajas ya que su valor cambio al divir.
                    if (j == 0) {
                        cc4 = renpiv;
                        s21.setText("");
                        s21.setText("" + renpiv);
                    }
                    if (j == 1) {
                        cc5 = renpiv;
                        s22.setText("");
                        s22.setText("" + renpiv);
                    }
                    if (j == 2) {
                        rr1 = renpiv;
                        s23.setText("");
                        s23.setText("" + renpiv);
                    }
                    if (j == 3) {
                        rr2 = renpiv;
                        s24.setText("");
                        s24.setText("" + renpiv);
                    }

                    if (j == 4) {
                        rr3 = renpiv;
                        s25.setText("");
                        s25.setText("" + renpiv);
                    }
                    if (j == 5) {
                        cc6 = renpiv;
                        sol2.setText("");
                        sol2.setText("" + renpiv);
                    }
                    //System.out.println("Divicion: " + renpiv);
                }
            }
        }
        
        
            //Este renglo pivote solo es valido cuando la COLUMNA PIVOTE VALGA 1 y RENGLO PIVOTE VALGA 2
          //Aqui ago el nuevo renglon pivotito
        if (renglonpiv == 2) {
            i = 0;
            j = 0;
            double renpiv = 0;
            for (i = renglonpiv; i < renglonpiv + 1; i++) {
                for (j = 0; j < 6; j++) {
                    renpiv = array[renglonpiv][j] / array[renglonpiv][colpiv];

                //Aqui mando a las cjas de texto el resultado de las diviciones y actualizo el valor que tenian
                    //las cajas ya que su valor cambio al divir.
                    if (j == 0) {
                        cc7 = renpiv;
                        s31.setText("");
                        s31.setText("" + renpiv);
                    }
                    if (j == 1) {
                        cc8 = renpiv;
                        s32.setText("");
                        s32.setText("" + renpiv);
                    }
                    if (j == 2) {
                        h1 = renpiv;
                        s33.setText("");
                        s33.setText("" + renpiv);
                    }
                    if (j == 3) {
                        h2 = renpiv;
                        s34.setText("");
                        s34.setText("" + renpiv);
                    }

                    if (j == 4) {
                        h3 = renpiv;
                        s35.setText("");
                        s35.setText("" + renpiv);
                    }
                    if (j == 5) {
                        cc9 = renpiv;
                        sol3.setText("");
                        sol3.setText("" + renpiv);
                    }
                    System.out.println("Divicion: " + renpiv);
                }
            }
        }
        
        
    }
    
    
    
    public void RenglonesQuefaltan ()   {
                    double array[][]= {
            //Aqui meto todos los datos de las cajas de texto a una matriz para
            //Que se mas facil manipular los datos
            
            //   0           1          2           3       4           5
            //   x           y          s1         s2       s3      solucion
            {   cc1    ,    cc2    ,    r1    ,    r2   ,   r3    ,   cc3    },//s1   0 
            {   cc4    ,    cc5    ,    rr1   ,    rr2  ,   rr3   ,   cc6    },//s2   1 
            {   cc7    ,    cc8    ,    h1    ,    h2   ,   h3    ,   cc9    },//s3   2 
            {   maxz   ,   maxz2   ,   val1   ,   val2  ,  val3   ,   val4   },//z    3
        };
       

        int i = 0;
        int j = 0;
        double coeficientecolpiv;
        double operacion = 0, renglonviejo = 0;
        double nuevorenglonpiv;
        double resul = 0;

            System.out.println("");
        
        //AQUI AGO UN IF PARA CADA POSIBLIDAD DE QUE ME SALGA EN EL VALOR DEL RENGLON PIVOTE YA QUE CUANDO 
        //SE TIENE EL RENGLON PIVOTE CON ESE NO SE HACE NADA HASTA LA SIGUIENTE TABLA
        
        
        
        //Aqui es para cuando el renglon pivote valga 0
                if (renglonpiv == 0) {
            for (i = renglonpiv + 1; i < 4; i++) {
                for (j = 0; j < 6; j++) {

                    renglonviejo = array[i][j];//renlgon actual viejo
                    coeficientecolpiv = array[i][colpiv];//coeficiente columna pivote
                    nuevorenglonpiv = array[renglonpiv][j];//Nuevo Renglo Pivote

                    resul = renglonviejo - coeficientecolpiv * nuevorenglonpiv;
                    
                    if(i == 1){
                        if(j == 0){
                            cc4=resul;
                            s21.setText("");
                            s21.setText("" + resul);
                        }
                        
                        if(j == 1){
                            cc5=resul;
                            s22.setText("");
                            s22.setText("" + resul);
                        }
                        
                        if(j == 2){
                            rr1=resul;
                            s23.setText("");
                            s23.setText("" + resul);
                            
                        }
                        
                        if(j == 3){
                            rr2= resul;
                            s24.setText("");
                            s24.setText("" + resul);
                        }
                        
                        if(j == 4){
                            rr3=resul;
                            s25.setText("");
                            s25.setText("" + resul);
                            
                        }
                        
                        if(j == 5){
                            
                            cc6=resul;
                            
                            sol2.setText("");
                            sol2.setText("" + resul);
                        }
                        
                    }
                    if (i == 2) {
                        if (j == 0) {
                            cc7 = resul;
                            s31.setText("");
                            s31.setText("" + resul);
                        }
                        if (j == 1) {
                            cc8 = resul;
                            s32.setText("");
                            s32.setText("" + resul);
                        }
                        if (j == 2) {
                            h1 = resul;
                            s33.setText("");
                            s33.setText("" + resul);
                        }
                        if (j == 3) {
                            h2 = resul;
                            s34.setText("");
                            s34.setText("" + resul);
                        }

                        if (j == 4) {
                            h3 = resul;
                            s35.setText("");
                            s35.setText("" + resul);
                        }
                        if (j == 5) {
                            cc9 = resul;
                            sol3.setText("");
                            sol3.setText("" + resul);
                        }
                    }
                    
                        if (i == 3) {
                            if (j == 0) {
                                maxz = resul;
                                z1.setText("");
                                z1.setText("" + resul);
                            }
                            if (j == 1){
                                maxz2= resul;
                                z2.setText("");
                                 z2.setText("" + resul); 
                            }
                            if (j == 2){
                                val1=resul;
                                z3.setText("");
                                z3.setText("" + resul); 
                            }
                            if(j == 3){
                                val2=resul;
                                z4.setText("");
                                z4.setText("" + resul);
                            }
                            if(j == 4){
                                val3= resul;
                                z5.setText("");
                                z5.setText("" + resul);
                            }
                            if(j == 5){
                                val4=resul;
                                sol4.setText("");
                                sol4.setText("" + resul);
                            }
                        }
                    System.out.println();
                }//cierro for
            }
        }
        
                
                
                
                
        //Esto es para sacar el nuevo renglo pero solo funciona si el renglo pivote vale 1
        if (renglonpiv == 1) {
            for (i = 0; i < renglonpiv; i++) {
                for (j = 0; j < 6; j++) {
                    //NR= RenglonActualviejo-coeficiente columna pivote* Nuevo Renglon Pivote

                    renglonviejo = array[i][j];//renlgon actual viejo
                    coeficientecolpiv = array[i][colpiv];//coeficiente columna pivote
                    nuevorenglonpiv = array[renglonpiv][j];//Nuevo Renglo Pivote

                    resul = renglonviejo - coeficientecolpiv * nuevorenglonpiv;

                    System.out.println("Resultado final:" + resul);

                    if (j == 0) {
                        cc1 = resul;
                        s1.setText("");
                        s1.setText("" + resul);
                    }
                    if (j == 1) {
                        cc2 = resul;
                        s2.setText("");
                        s2.setText("" + resul);
                    }
                    if (j == 2) {
                        r1 = resul;
                        s3.setText("");
                        s3.setText("" + resul);
                    }
                    if (j == 3) {
                        r2 = resul;
                        s4.setText("");
                        s4.setText("" + resul);
                    }

                    if (j == 4) {
                        r3 = resul;
                        s5.setText("");
                        s5.setText("" + resul);
                    }
                    if (j == 5) {
                        cc3 = resul;
                        sol1.setText("");
                        sol1.setText("" + resul);
                    }
                }

                System.out.println("");
            }
            System.out.println();

            for (i = renglonpiv + 1; i < 4; i++) {
                for (j = 0; j < 6; j++) {

                    renglonviejo = array[i][j];//renlgon actual viejo
                    coeficientecolpiv = array[i][colpiv];//coeficiente columna pivote
                    nuevorenglonpiv = array[renglonpiv][j];//Nuevo Renglo Pivote

                    resul = renglonviejo - coeficientecolpiv * nuevorenglonpiv;

                    System.out.println("Resultado final:" + resul);

                    if (i == 2) {
                        if (j == 0) {
                            cc7 = resul;
                            s31.setText("");
                            s31.setText("" + resul);
                        }
                        if (j == 1) {
                            cc8 = resul;
                            s32.setText("");
                            s32.setText("" + resul);
                        }
                        if (j == 2) {
                            h1 = resul;
                            s33.setText("");
                            s33.setText("" + resul);
                        }
                        if (j == 3) {
                            h2 = resul;
                            s34.setText("");
                            s34.setText("" + resul);
                        }

                        if (j == 4) {
                            h3 = resul;
                            s35.setText("");
                            s35.setText("" + resul);
                        }
                        if (j == 5) {
                            cc9 = resul;
                            sol3.setText("");
                            sol3.setText("" + resul);
                        }
                    }
                    
                        if (i == 3) {
                            if (j == 0) {
                                maxz = resul;
                                z1.setText("");
                                z1.setText("" + resul);
                            }
                            if (j == 1){
                                maxz2= resul;
                                z2.setText("");
                                 z2.setText("" + resul); 
                            }
                            if (j == 2){
                                val1=resul;
                                z3.setText("");
                                z3.setText("" + resul); 
                            }
                            if(j == 3){
                                val2=resul;
                                z4.setText("");
                                z4.setText("" + resul);
                            }
                            if(j == 4){
                                val3= resul;
                                z5.setText("");
                                z5.setText("" + resul);
                            }
                            if(j == 5){
                                val4=resul;
                                sol4.setText("");
                                sol4.setText("" + resul);
                            }
                        }
                    System.out.println();
                }
            }
        }
        
        
     
       
        
        
        
        if (renglonpiv == 2) {
            for (i = 0; i < 4; i++) {
                for (j = 0; j < 6; j++) {

                    renglonviejo = array[i][j];//renlgon actual viejo
                    coeficientecolpiv = array[i][colpiv];//coeficiente columna pivote
                    nuevorenglonpiv = array[renglonpiv][j];//Nuevo Renglo Pivote

                    resul = renglonviejo - coeficientecolpiv * nuevorenglonpiv;

                    if (i == 0) {
                        if (j == 0) {
                            cc1 = resul;
                            s1.setText("");
                            s1.setText("" + resul);
                        }
                        if (j == 1) {
                            cc2 = resul;
                            s2.setText("");
                            s2.setText("" + resul);
                        }
                        if (j == 2) {
                            r1 = resul;
                            s3.setText("");
                            s3.setText("" + resul);
                        }
                        if (j == 3) {
                            r2 = resul;
                            s4.setText("");
                            s4.setText("" + resul);
                        }

                        if (j == 4) {
                            r3 = resul;
                            s5.setText("");
                            s5.setText("" + resul);
                        }
                        if (j == 5) {
                            cc3 = resul;
                            sol1.setText("");
                            sol1.setText("" + resul);
                        }
                    }
                    
                    if (i == 1) {
                        if (j == 0) {
                            cc4 = resul;
                            s21.setText("");
                            s21.setText("" + resul);
                        }

                        if (j == 1) {
                            cc5 = resul;
                            s22.setText("");
                            s22.setText("" + resul);
                        }

                        if (j == 2) {
                            rr1 = resul;
                            s23.setText("");
                            s23.setText("" + resul);

                        }

                        if (j == 3) {
                            rr2 = resul;
                            s24.setText("");
                            s24.setText("" + resul);
                        }

                        if (j == 4) {
                            rr3 = resul;
                            s25.setText("");
                            s25.setText("" + resul);

                        }

                        if (j == 5) {
                            cc6 = resul;
                            sol2.setText("");
                            sol2.setText("" + resul);
                        }

                       
                    }
                    if (i == 3) {
                        if (j == 0) {
                            maxz = resul;
                            z1.setText("");
                            z1.setText("" + resul);
                        }
                        if (j == 1) {
                            maxz2 = resul;
                            z2.setText("");
                            z2.setText("" + resul);
                        }
                        if (j == 2) {
                            val1 = resul;
                            z3.setText("");
                            z3.setText("" + resul);
                        }
                        if (j == 3) {
                            val2 = resul;
                            z4.setText("");
                            z4.setText("" + resul);
                        }
                        if (j == 4) {
                            val3 = resul;
                            z5.setText("");
                            z5.setText("" + resul);
                        }
                        if (j == 5) {
                            val4 = resul;
                            sol4.setText("");
                            sol4.setText("" + resul);
                        }
                    }
                    System.out.println();
                }//cierro for
            }
        }


        
        
        
        
        
            
        

    }

   
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
            java.util.logging.Logger.getLogger(MetodoSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MetodoSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MetodoSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MetodoSimplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MetodoSimplex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JTextField c4;
    private javax.swing.JTextField c5;
    private javax.swing.JTextField c6;
    private javax.swing.JTextField c7;
    private javax.swing.JTextField c8;
    private javax.swing.JTextField c9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton llenartabla;
    private javax.swing.JTextField maxzx;
    private javax.swing.JTextField maxzy;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s21;
    private javax.swing.JTextField s22;
    private javax.swing.JTextField s23;
    private javax.swing.JTextField s24;
    private javax.swing.JTextField s25;
    private javax.swing.JTextField s3;
    private javax.swing.JTextField s31;
    private javax.swing.JTextField s32;
    private javax.swing.JTextField s33;
    private javax.swing.JTextField s34;
    private javax.swing.JTextField s35;
    private javax.swing.JTextField s4;
    private javax.swing.JTextField s5;
    private javax.swing.JTextField sol1;
    private javax.swing.JTextField sol2;
    private javax.swing.JTextField sol3;
    private javax.swing.JTextField sol4;
    private javax.swing.JTextField z1;
    private javax.swing.JTextField z2;
    private javax.swing.JTextField z3;
    private javax.swing.JTextField z4;
    private javax.swing.JTextField z5;
    // End of variables declaration//GEN-END:variables
}
