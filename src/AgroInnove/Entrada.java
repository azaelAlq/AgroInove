
package AgroInnove;

import java.awt.Color;
import java.util.Random;

public class Entrada extends javax.swing.JFrame {

    int xMouse, yMouse;
    Texto texto = new Texto();
    Color Fresa = new Color(230, 61, 93);
    Color Aguacate = new Color(161, 184, 77);
    Color Jitomate = new Color(228, 45, 28);
    Color Limon = new Color(97, 158, 55);
    Color Chile = new Color(52, 80, 37);
    Color verde = new Color(130, 176, 41);

    public Entrada() {
        initComponents();
        RanSetQueDes();
        SetTextoPrincipal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Absolute_Layaut = new javax.swing.JPanel();
        Pnl_Izquierdo = new javax.swing.JPanel();
        Pnl_Bienvenido = new javax.swing.JPanel();
        lbl_Bienvenido = new javax.swing.JLabel();
        PanelLogo = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        Pnl_Informacion = new javax.swing.JPanel();
        lbl_Informacion = new javax.swing.JLabel();
        Pnl_Derecho = new javax.swing.JPanel();
        btn_Fresas = new javax.swing.JPanel();
        lbl_Fresas = new javax.swing.JLabel();
        btn_Aguacate = new javax.swing.JPanel();
        lbl_Aguacate = new javax.swing.JLabel();
        btn_Limon = new javax.swing.JPanel();
        lbl_Limon = new javax.swing.JLabel();
        btn_Jitomate = new javax.swing.JPanel();
        lbl_Jitomate = new javax.swing.JLabel();
        btn_Chile = new javax.swing.JPanel();
        lbl_Chile = new javax.swing.JLabel();
        Pnl_QueDesea = new javax.swing.JPanel();
        lbl_QueDesea = new javax.swing.JLabel();
        Pnl_Barra = new javax.swing.JPanel();
        btn_cerrar = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_Manual = new javax.swing.JPanel();
        lbl_Manual = new javax.swing.JLabel();
        btn_Salir = new javax.swing.JPanel();
        lbl_Salir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Absolute_Layaut.setBackground(new java.awt.Color(204, 204, 204));
        Absolute_Layaut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_Izquierdo.setBackground(new java.awt.Color(102, 102, 102));

        lbl_Bienvenido.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbl_Bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Bienvenido.setText("BIENVENIDO");

        javax.swing.GroupLayout Pnl_BienvenidoLayout = new javax.swing.GroupLayout(Pnl_Bienvenido);
        Pnl_Bienvenido.setLayout(Pnl_BienvenidoLayout);
        Pnl_BienvenidoLayout.setHorizontalGroup(
            Pnl_BienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_BienvenidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pnl_BienvenidoLayout.setVerticalGroup(
            Pnl_BienvenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PanelLogo.setBackground(new java.awt.Color(255, 255, 255));

        lbl_logo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/150 logo.png"))); // NOI18N
        lbl_logo.setText("AgroInnove");

        javax.swing.GroupLayout PanelLogoLayout = new javax.swing.GroupLayout(PanelLogo);
        PanelLogo.setLayout(PanelLogoLayout);
        PanelLogoLayout.setHorizontalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLogoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        PanelLogoLayout.setVerticalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLogoLayout.createSequentialGroup()
                .addComponent(lbl_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(112, 112, 112))
        );

        lbl_Informacion.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Informacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Informacion.setText("Que es agroinove");
        lbl_Informacion.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout Pnl_InformacionLayout = new javax.swing.GroupLayout(Pnl_Informacion);
        Pnl_Informacion.setLayout(Pnl_InformacionLayout);
        Pnl_InformacionLayout.setHorizontalGroup(
            Pnl_InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_InformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Informacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pnl_InformacionLayout.setVerticalGroup(
            Pnl_InformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_InformacionLayout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(lbl_Informacion, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout Pnl_IzquierdoLayout = new javax.swing.GroupLayout(Pnl_Izquierdo);
        Pnl_Izquierdo.setLayout(Pnl_IzquierdoLayout);
        Pnl_IzquierdoLayout.setHorizontalGroup(
            Pnl_IzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_IzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_IzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pnl_Informacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pnl_Bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        Pnl_IzquierdoLayout.setVerticalGroup(
            Pnl_IzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_IzquierdoLayout.createSequentialGroup()
                .addComponent(PanelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pnl_Bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pnl_Informacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Absolute_Layaut.add(Pnl_Izquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 30, 480, 640));

        Pnl_Derecho.setBackground(new java.awt.Color(204, 204, 204));

        btn_Fresas.setBackground(new java.awt.Color(255, 255, 255));
        btn_Fresas.setForeground(new java.awt.Color(0, 153, 255));

        lbl_Fresas.setBackground(new java.awt.Color(255, 255, 255));
        lbl_Fresas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Fresas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Fresas.setText("Fresas");
        lbl_Fresas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Fresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_FresasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_FresasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_FresasMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_FresasLayout = new javax.swing.GroupLayout(btn_Fresas);
        btn_Fresas.setLayout(btn_FresasLayout);
        btn_FresasLayout.setHorizontalGroup(
            btn_FresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_FresasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Fresas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_FresasLayout.setVerticalGroup(
            btn_FresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Fresas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btn_Aguacate.setBackground(new java.awt.Color(255, 255, 255));
        btn_Aguacate.setForeground(new java.awt.Color(0, 153, 255));

        lbl_Aguacate.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Aguacate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Aguacate.setText("Aguacate");
        lbl_Aguacate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Aguacate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_AguacateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_AguacateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_AguacateMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_AguacateLayout = new javax.swing.GroupLayout(btn_Aguacate);
        btn_Aguacate.setLayout(btn_AguacateLayout);
        btn_AguacateLayout.setHorizontalGroup(
            btn_AguacateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Aguacate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btn_AguacateLayout.setVerticalGroup(
            btn_AguacateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Aguacate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btn_Limon.setBackground(new java.awt.Color(255, 255, 255));
        btn_Limon.setForeground(new java.awt.Color(0, 153, 255));

        lbl_Limon.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Limon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Limon.setText("Limon");
        lbl_Limon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Limon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_LimonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_LimonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_LimonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_LimonLayout = new javax.swing.GroupLayout(btn_Limon);
        btn_Limon.setLayout(btn_LimonLayout);
        btn_LimonLayout.setHorizontalGroup(
            btn_LimonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_LimonLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Limon, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_LimonLayout.setVerticalGroup(
            btn_LimonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Limon, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btn_Jitomate.setBackground(new java.awt.Color(255, 255, 255));
        btn_Jitomate.setForeground(new java.awt.Color(0, 153, 255));

        lbl_Jitomate.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Jitomate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Jitomate.setText("Jitomate");
        lbl_Jitomate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Jitomate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_JitomateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_JitomateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_JitomateMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_JitomateLayout = new javax.swing.GroupLayout(btn_Jitomate);
        btn_Jitomate.setLayout(btn_JitomateLayout);
        btn_JitomateLayout.setHorizontalGroup(
            btn_JitomateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Jitomate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btn_JitomateLayout.setVerticalGroup(
            btn_JitomateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Jitomate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btn_Chile.setBackground(new java.awt.Color(255, 255, 255));
        btn_Chile.setForeground(new java.awt.Color(0, 153, 255));

        lbl_Chile.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Chile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Chile.setText("Chile");
        lbl_Chile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Chile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_ChileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_ChileMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_ChileMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_ChileLayout = new javax.swing.GroupLayout(btn_Chile);
        btn_Chile.setLayout(btn_ChileLayout);
        btn_ChileLayout.setHorizontalGroup(
            btn_ChileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_ChileLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Chile, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btn_ChileLayout.setVerticalGroup(
            btn_ChileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Chile, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lbl_QueDesea.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lbl_QueDesea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Pnl_QueDeseaLayout = new javax.swing.GroupLayout(Pnl_QueDesea);
        Pnl_QueDesea.setLayout(Pnl_QueDeseaLayout);
        Pnl_QueDeseaLayout.setHorizontalGroup(
            Pnl_QueDeseaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_QueDeseaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_QueDesea, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Pnl_QueDeseaLayout.setVerticalGroup(
            Pnl_QueDeseaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_QueDesea, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Pnl_DerechoLayout = new javax.swing.GroupLayout(Pnl_Derecho);
        Pnl_Derecho.setLayout(Pnl_DerechoLayout);
        Pnl_DerechoLayout.setHorizontalGroup(
            Pnl_DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_DerechoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Pnl_QueDesea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pnl_DerechoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Pnl_DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Chile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Limon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Jitomate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Fresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Aguacate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );
        Pnl_DerechoLayout.setVerticalGroup(
            Pnl_DerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_DerechoLayout.createSequentialGroup()
                .addComponent(Pnl_QueDesea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(btn_Fresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Aguacate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Jitomate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Limon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Chile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        Absolute_Layaut.add(Pnl_Derecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 270, 640));

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
                .addContainerGap(697, Short.MAX_VALUE)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Pnl_BarraLayout.setVerticalGroup(
            Pnl_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_BarraLayout.createSequentialGroup()
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Absolute_Layaut.add(Pnl_Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 30));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        btn_Manual.setBackground(new java.awt.Color(255, 255, 255));
        btn_Manual.setForeground(new java.awt.Color(0, 153, 255));

        lbl_Manual.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Manual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Manual.setText("Manual de usuario");
        lbl_Manual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Manual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_ManualMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_ManualMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_ManualMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_ManualLayout = new javax.swing.GroupLayout(btn_Manual);
        btn_Manual.setLayout(btn_ManualLayout);
        btn_ManualLayout.setHorizontalGroup(
            btn_ManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Manual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
        );
        btn_ManualLayout.setVerticalGroup(
            btn_ManualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Manual, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        );

        btn_Salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_Salir.setForeground(new java.awt.Color(0, 153, 255));

        lbl_Salir.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Salir.setText("salir");
        lbl_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_SalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_SalirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_SalirLayout = new javax.swing.GroupLayout(btn_Salir);
        btn_Salir.setLayout(btn_SalirLayout);
        btn_SalirLayout.setHorizontalGroup(
            btn_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );
        btn_SalirLayout.setVerticalGroup(
            btn_SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btn_Manual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Manual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Absolute_Layaut.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 740, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Absolute_Layaut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Absolute_Layaut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void RanSetQueDes() {
        Random random = new Random();
        int Nram = random.nextInt(5);        
        
        lbl_QueDesea.setText(texto.StrToHtml("Que desea cultivar"));
    }
    
    public void SetTextoPrincipal(){
        lbl_Informacion.setText(texto.StrToHtml(texto.StrAlinear("AgroInnove tiene la capacidad de recopilar información sobre diferentes "
                + "factores clave como el pH del suelo, la humedad, el clima y la ubicación geográfica, "
                + "lo que nos permite ofrecer una evaluación detallada y lo más aproximada posible sobre "
                + "las condiciones actuales del suelo. Al contar con información necesaria, somos capaces "
                + "de brindar un análisis completo de los datos obtenidos, así como un cálculo preciso de "
                + "los costos de preparación de la tierra de cultivo.",50)));
    }
    
    
    private void lbl_FresasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_FresasMouseEntered
        btn_Fresas.setBackground(Fresa);
    }//GEN-LAST:event_lbl_FresasMouseEntered

    private void lbl_FresasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_FresasMouseExited
       btn_Fresas.setBackground(Color.white);
    }//GEN-LAST:event_lbl_FresasMouseExited

    private void lbl_FresasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_FresasMousePressed
        Principal principal = new Principal();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_FresasMousePressed

    private void lbl_AguacateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_AguacateMouseEntered
        btn_Aguacate.setBackground(Aguacate);
    }//GEN-LAST:event_lbl_AguacateMouseEntered

    private void lbl_AguacateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_AguacateMouseExited
        btn_Aguacate.setBackground(Color.white);
    }//GEN-LAST:event_lbl_AguacateMouseExited

    private void lbl_AguacateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_AguacateMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_AguacateMousePressed

    private void lbl_JitomateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_JitomateMouseEntered
        btn_Jitomate.setBackground(Jitomate);
    }//GEN-LAST:event_lbl_JitomateMouseEntered

    private void lbl_JitomateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_JitomateMouseExited
        btn_Jitomate.setBackground(Color.white);
    }//GEN-LAST:event_lbl_JitomateMouseExited

    private void lbl_JitomateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_JitomateMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_JitomateMousePressed

    private void lbl_LimonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_LimonMouseEntered
        btn_Limon.setBackground(Limon);
    }//GEN-LAST:event_lbl_LimonMouseEntered

    private void lbl_LimonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_LimonMouseExited
        btn_Limon.setBackground(Color.white);
    }//GEN-LAST:event_lbl_LimonMouseExited

    private void lbl_LimonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_LimonMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_LimonMousePressed

    private void lbl_ChileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ChileMouseEntered
        btn_Chile.setBackground(Chile);
    }//GEN-LAST:event_lbl_ChileMouseEntered

    private void lbl_ChileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ChileMouseExited
        btn_Chile.setBackground(Color.white);
    }//GEN-LAST:event_lbl_ChileMouseExited

    private void lbl_ChileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ChileMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_ChileMousePressed

    private void Pnl_BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pnl_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Pnl_BarraMouseDragged

    private void Pnl_BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pnl_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Pnl_BarraMousePressed

    private void XMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseEntered
        btn_cerrar.setBackground(Color.red);
    }//GEN-LAST:event_XMouseEntered

    private void XMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseExited
        btn_cerrar.setBackground(Color.WHITE);
    }//GEN-LAST:event_XMouseExited

    private void XMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMousePressed
        System.exit(0);
    }//GEN-LAST:event_XMousePressed

    private void btn_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseEntered
        btn_cerrar.setBackground(Color.red);
    }//GEN-LAST:event_btn_cerrarMouseEntered

    private void btn_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseExited
        btn_cerrar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btn_cerrarMouseExited

    private void btn_cerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMousePressed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarMousePressed

    private void lbl_ManualMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ManualMouseEntered
        btn_Manual.setBackground(verde);
    }//GEN-LAST:event_lbl_ManualMouseEntered

    private void lbl_ManualMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ManualMouseExited
        btn_Manual.setBackground(Color.WHITE);
    }//GEN-LAST:event_lbl_ManualMouseExited

    private void lbl_ManualMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ManualMousePressed
        lbl_Bienvenido.setText("MANUAL DE USUARIO");
        lbl_Informacion.setText(texto.ManualUsuario());
    }//GEN-LAST:event_lbl_ManualMousePressed

    private void lbl_SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SalirMouseEntered
        btn_Salir.setBackground(verde);
    }//GEN-LAST:event_lbl_SalirMouseEntered

    private void lbl_SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SalirMouseExited
        btn_Salir.setBackground(Color.WHITE);
    }//GEN-LAST:event_lbl_SalirMouseExited

    private void lbl_SalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SalirMousePressed
        Login log = new Login();
        log.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_SalirMousePressed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Absolute_Layaut;
    private javax.swing.JPanel PanelLogo;
    private javax.swing.JPanel Pnl_Barra;
    private javax.swing.JPanel Pnl_Bienvenido;
    private javax.swing.JPanel Pnl_Derecho;
    private javax.swing.JPanel Pnl_Informacion;
    private javax.swing.JPanel Pnl_Izquierdo;
    private javax.swing.JPanel Pnl_QueDesea;
    private javax.swing.JLabel X;
    private javax.swing.JPanel btn_Aguacate;
    private javax.swing.JPanel btn_Chile;
    private javax.swing.JPanel btn_Fresas;
    private javax.swing.JPanel btn_Jitomate;
    private javax.swing.JPanel btn_Limon;
    private javax.swing.JPanel btn_Manual;
    private javax.swing.JPanel btn_Salir;
    private javax.swing.JPanel btn_cerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_Aguacate;
    private javax.swing.JLabel lbl_Bienvenido;
    private javax.swing.JLabel lbl_Chile;
    private javax.swing.JLabel lbl_Fresas;
    private javax.swing.JLabel lbl_Informacion;
    private javax.swing.JLabel lbl_Jitomate;
    private javax.swing.JLabel lbl_Limon;
    private javax.swing.JLabel lbl_Manual;
    private javax.swing.JLabel lbl_QueDesea;
    private javax.swing.JLabel lbl_Salir;
    private javax.swing.JLabel lbl_logo;
    // End of variables declaration//GEN-END:variables
}
