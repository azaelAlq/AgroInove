package AgroInnove;

import static AgroInnove.Principal.generateRandomNumber;
import java.awt.Color;
import static java.lang.Math.random;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    Color verde = new Color(72, 110, 1);

    public Login() {
        //txt_Usuario.enableInputMethods(false);
        initComponents();
        ElegirImg();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        Pnl_Barra = new javax.swing.JPanel();
        btn_cerrar = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        Fondo_Logo = new javax.swing.JPanel();
        NombreLogo = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        Panel_Fondo = new javax.swing.JPanel();
        lbl_INICIOS = new javax.swing.JLabel();
        lbl_Contraseña = new javax.swing.JLabel();
        lbl_Usuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_Usuario = new javax.swing.JTextField();
        txt_contraseña = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_Entrar = new javax.swing.JPanel();
        lbl_Bentrar = new javax.swing.JLabel();
        btn_Nuevo = new javax.swing.JPanel();
        lbl_Nuevo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);

        Bg.setForeground(new java.awt.Color(255, 255, 255));
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_Barra.setBackground(new java.awt.Color(153, 153, 153));
        Pnl_Barra.setForeground(new java.awt.Color(102, 102, 102));
        Pnl_Barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Pnl_BarraMouseDragged(evt);
            }
        });
        Pnl_Barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Pnl_BarraMousePressed(evt);
            }
        });

        btn_cerrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_cerrarMousePressed(evt);
            }
        });

        X.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X.setText("x");
        X.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                XMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                XMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_cerrarLayout = new javax.swing.GroupLayout(btn_cerrar);
        btn_cerrar.setLayout(btn_cerrarLayout);
        btn_cerrarLayout.setHorizontalGroup(
            btn_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );
        btn_cerrarLayout.setVerticalGroup(
            btn_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_cerrarLayout.createSequentialGroup()
                .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout Pnl_BarraLayout = new javax.swing.GroupLayout(Pnl_Barra);
        Pnl_Barra.setLayout(Pnl_BarraLayout);
        Pnl_BarraLayout.setHorizontalGroup(
            Pnl_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_BarraLayout.createSequentialGroup()
                .addContainerGap(757, Short.MAX_VALUE)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Pnl_BarraLayout.setVerticalGroup(
            Pnl_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_BarraLayout.createSequentialGroup()
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Bg.add(Pnl_Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 30));

        Fondo_Logo.setBackground(new java.awt.Color(255, 255, 255));

        NombreLogo.setBackground(new java.awt.Color(51, 51, 51));
        NombreLogo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        NombreLogo.setForeground(new java.awt.Color(51, 51, 51));
        NombreLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreLogo.setText("AgroInnove");
        NombreLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        Logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Fondo_LogoLayout = new javax.swing.GroupLayout(Fondo_Logo);
        Fondo_Logo.setLayout(Fondo_LogoLayout);
        Fondo_LogoLayout.setHorizontalGroup(
            Fondo_LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo_LogoLayout.createSequentialGroup()
                .addGroup(Fondo_LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Fondo_LogoLayout.setVerticalGroup(
            Fondo_LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Fondo_LogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NombreLogo)
                .addGap(26, 26, 26))
        );

        Bg.add(Fondo_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 230, 260));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoFresa.jpg"))); // NOI18N
        Bg.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 360, 540));

        Panel_Fondo.setBackground(new java.awt.Color(255, 255, 255));

        lbl_INICIOS.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lbl_INICIOS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_INICIOS.setText("INICIAR SESIÓN");

        lbl_Contraseña.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Contraseña.setText("Contraseña");

        lbl_Usuario.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Usuario.setText("Usuario");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        txt_Usuario.setBackground(new java.awt.Color(204, 204, 204));
        txt_Usuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_Usuario.setBorder(null);
        txt_Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_UsuarioMousePressed(evt);
            }
        });
        txt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsuarioActionPerformed(evt);
            }
        });
        txt_Usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_UsuarioKeyTyped(evt);
            }
        });

        txt_contraseña.setBackground(new java.awt.Color(204, 204, 204));
        txt_contraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_contraseña.setBorder(null);
        txt_contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_contraseñaMousePressed(evt);
            }
        });
        txt_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseñaActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        btn_Entrar.setBackground(new java.awt.Color(204, 204, 204));
        btn_Entrar.setForeground(new java.awt.Color(0, 153, 255));

        lbl_Bentrar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Bentrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Bentrar.setText("Entrar");
        lbl_Bentrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Bentrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_BentrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_BentrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_BentrarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_EntrarLayout = new javax.swing.GroupLayout(btn_Entrar);
        btn_Entrar.setLayout(btn_EntrarLayout);
        btn_EntrarLayout.setHorizontalGroup(
            btn_EntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_EntrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Bentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_EntrarLayout.setVerticalGroup(
            btn_EntrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Bentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btn_Nuevo.setBackground(new java.awt.Color(204, 204, 204));
        btn_Nuevo.setForeground(new java.awt.Color(0, 153, 255));

        lbl_Nuevo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Nuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Nuevo.setText("Nuevo Usuario");
        lbl_Nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_NuevoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_NuevoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_NuevoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_NuevoLayout = new javax.swing.GroupLayout(btn_Nuevo);
        btn_Nuevo.setLayout(btn_NuevoLayout);
        btn_NuevoLayout.setHorizontalGroup(
            btn_NuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_NuevoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_NuevoLayout.setVerticalGroup(
            btn_NuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_NuevoLayout.createSequentialGroup()
                .addComponent(lbl_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel_FondoLayout = new javax.swing.GroupLayout(Panel_Fondo);
        Panel_Fondo.setLayout(Panel_FondoLayout);
        Panel_FondoLayout.setHorizontalGroup(
            Panel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_FondoLayout.createSequentialGroup()
                .addComponent(lbl_INICIOS, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_FondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Panel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Usuario)
                    .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Contraseña)
                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_FondoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btn_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        Panel_FondoLayout.setVerticalGroup(
            Panel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_FondoLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(lbl_INICIOS)
                .addGap(59, 59, 59)
                .addComponent(lbl_Usuario)
                .addGap(8, 8, 8)
                .addComponent(txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(Panel_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_FondoLayout.createSequentialGroup()
                        .addComponent(lbl_Contraseña)
                        .addGap(8, 8, 8)
                        .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btn_Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Bg.add(Panel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 440, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsuarioActionPerformed
    public void ElegirImg(){
        Random random = new Random();
        int contador = random.nextInt(5);
        Icon icono;

        switch (contador) {
            case 0:
                icono = new ImageIcon(getClass().getResource("/Imagenes/FondoAguacate.jpg"));
                Fondo.setIcon(icono);
                break;
            case 1:
                icono = new ImageIcon(getClass().getResource("/Imagenes/FondoChile.jpg"));
                Fondo.setIcon(icono);
                break;
            case 2:
                icono = new ImageIcon(getClass().getResource("/Imagenes/FondoJitomate.jpg"));
                Fondo.setIcon(icono);
                break;
            case 3:
                icono = new ImageIcon(getClass().getResource("/Imagenes/FondoLimones.jpg"));
                Fondo.setIcon(icono);
                break;
            case 4:
                icono = new ImageIcon(getClass().getResource("/Imagenes/FondoFresa.jpg"));
                Fondo.setIcon(icono);
                break;
        }
    }
    private void Pnl_BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pnl_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Pnl_BarraMousePressed

    private void Pnl_BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pnl_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Pnl_BarraMouseDragged

    private void btn_cerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMousePressed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarMousePressed

    private void XMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseEntered
        btn_cerrar.setBackground(Color.red);
    }//GEN-LAST:event_XMouseEntered

    private void XMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseExited
        btn_cerrar.setBackground(Color.WHITE);
    }//GEN-LAST:event_XMouseExited

    private void btn_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseEntered
        btn_cerrar.setBackground(Color.red);
    }//GEN-LAST:event_btn_cerrarMouseEntered

    private void btn_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseExited
        btn_cerrar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn_cerrarMouseExited

    private void XMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMousePressed
        System.exit(0);
    }//GEN-LAST:event_XMousePressed

    private void lbl_BentrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_BentrarMouseEntered
        btn_Entrar.setBackground(verde);
    }//GEN-LAST:event_lbl_BentrarMouseEntered

    private void lbl_BentrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_BentrarMouseExited
        btn_Entrar.setBackground(Color.lightGray);
    }//GEN-LAST:event_lbl_BentrarMouseExited

    private void txt_UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_UsuarioMousePressed
        //txt_Usuario.enable(true);

    }//GEN-LAST:event_txt_UsuarioMousePressed

    private void txt_contraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_contraseñaMousePressed

    }//GEN-LAST:event_txt_contraseñaMousePressed

    private void txt_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseñaActionPerformed

    private void lbl_BentrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_BentrarMousePressed
        //llamar a la otra ventana
        //javax.swing.JOptionPane.showConfirmDialog(this, "INICIO: " + txt_Usuario.getText() + "\nContraseña: " + String.valueOf(txt_contraseña.getPassword()));
        Entrada entrar = new Entrada();
        entrar.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_lbl_BentrarMousePressed

    private void txt_UsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_UsuarioKeyTyped

    }//GEN-LAST:event_txt_UsuarioKeyTyped

    private void lbl_NuevoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_NuevoMouseEntered
        btn_Nuevo.setBackground(verde);
    }//GEN-LAST:event_lbl_NuevoMouseEntered

    private void lbl_NuevoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_NuevoMouseExited
        btn_Nuevo.setBackground(Color.lightGray);
    }//GEN-LAST:event_lbl_NuevoMouseExited

    private void lbl_NuevoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_NuevoMousePressed
        Nuevo_Usuario registrar = new Nuevo_Usuario();
        registrar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_NuevoMousePressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    public javax.swing.JLabel Fondo;
    private javax.swing.JPanel Fondo_Logo;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel NombreLogo;
    private javax.swing.JPanel Panel_Fondo;
    private javax.swing.JPanel Pnl_Barra;
    private javax.swing.JLabel X;
    private javax.swing.JPanel btn_Entrar;
    private javax.swing.JPanel btn_Nuevo;
    private javax.swing.JPanel btn_cerrar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_Bentrar;
    private javax.swing.JLabel lbl_Contraseña;
    private javax.swing.JLabel lbl_INICIOS;
    private javax.swing.JLabel lbl_Nuevo;
    private javax.swing.JLabel lbl_Usuario;
    private javax.swing.JTextField txt_Usuario;
    private javax.swing.JPasswordField txt_contraseña;
    // End of variables declaration//GEN-END:variables
}
