package AgroInnove;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;



public class Principal extends javax.swing.JFrame {

    int xMouse, yMouse;
    Datos datos = new Datos(0, 0, 0, 0);
    Calidad calidad = new Calidad();
    Texto texto = new Texto();
    Color verde = new Color(130, 176, 41);
    Color verde2 = new Color(72, 110, 1);
    Color Exelente = new Color(61, 113, 209);
    Color MuyBueno = new Color(18, 176, 5);
    Color Bueno = new Color(119, 178, 0);
    Color Regular = new Color(236, 205, 0);
    Color Malo = new Color(248, 104, 0);
    
   
    public Principal() {
        initComponents();
    
       
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        PanelLogo = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        PanelDatos = new javax.swing.JPanel();
        Datos = new javax.swing.JPanel();
        lbl_datos1 = new javax.swing.JLabel();
        cmb_Estado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmb_Temporada = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_humedad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_pH = new javax.swing.JTextField();
        btn_Costo = new javax.swing.JPanel();
        lbl_costo = new javax.swing.JLabel();
        btn_Calcular = new javax.swing.JPanel();
        lbl_Calcular = new javax.swing.JLabel();
        btn_Limpiar = new javax.swing.JPanel();
        lbl_Limpiar = new javax.swing.JLabel();
        btn_Obtener = new javax.swing.JPanel();
        lbl_Obtener = new javax.swing.JLabel();
        Pnl_Barra = new javax.swing.JPanel();
        btn_cerrar = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        btn_Regresar = new javax.swing.JPanel();
        lbl_Regresar = new javax.swing.JLabel();
        btn_Recomendaciones = new javax.swing.JPanel();
        lbl_Recomendaciones = new javax.swing.JLabel();
        PanelREsultado = new javax.swing.JPanel();
        PanelColor = new javax.swing.JPanel();
        lbl_Rcolor = new javax.swing.JLabel();
        lbl_Res = new javax.swing.JLabel();
        PanelTRes2 = new javax.swing.JPanel();
        lbl_TRes2 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLogo.setBackground(new java.awt.Color(255, 255, 255));

        lbl_logo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/150 logo.png"))); // NOI18N
        lbl_logo.setText("AgroInnove");

        javax.swing.GroupLayout PanelLogoLayout = new javax.swing.GroupLayout(PanelLogo);
        PanelLogo.setLayout(PanelLogoLayout);
        PanelLogoLayout.setHorizontalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        PanelLogoLayout.setVerticalGroup(
            PanelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_logo, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );

        PanelPrincipal.add(PanelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 320, 130));

        PanelDatos.setBackground(new java.awt.Color(153, 153, 153));

        Datos.setBackground(new java.awt.Color(255, 255, 255));

        lbl_datos1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lbl_datos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_datos1.setText("Datos");

        javax.swing.GroupLayout DatosLayout = new javax.swing.GroupLayout(Datos);
        Datos.setLayout(DatosLayout);
        DatosLayout.setHorizontalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_datos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DatosLayout.setVerticalGroup(
            DatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_datos1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );

        cmb_Estado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Coahuila", "Colima", "Distrito Federal", "Durango", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "México", "Michoacan", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Estado (Determina la región)");

        cmb_Temporada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cmb_Temporada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primavera", "Verano", "Otoño", "Invierno" }));
        cmb_Temporada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_TemporadaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Temporada");

        txt_humedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_humedadActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Humedad");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("pH del suelo");

        txt_pH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pHActionPerformed(evt);
            }
        });

        btn_Costo.setBackground(new java.awt.Color(255, 255, 255));
        btn_Costo.setForeground(new java.awt.Color(0, 153, 255));

        lbl_costo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_costo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_costo.setText("costo");
        lbl_costo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_costo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_costoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_costoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_costoMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_CostoLayout = new javax.swing.GroupLayout(btn_Costo);
        btn_Costo.setLayout(btn_CostoLayout);
        btn_CostoLayout.setHorizontalGroup(
            btn_CostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_CostoLayout.createSequentialGroup()
                .addComponent(lbl_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_CostoLayout.setVerticalGroup(
            btn_CostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_CostoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_Calcular.setBackground(new java.awt.Color(255, 255, 255));
        btn_Calcular.setForeground(new java.awt.Color(0, 153, 255));

        lbl_Calcular.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Calcular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Calcular.setText("Calcular");
        lbl_Calcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_CalcularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_CalcularMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_CalcularMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_CalcularLayout = new javax.swing.GroupLayout(btn_Calcular);
        btn_Calcular.setLayout(btn_CalcularLayout);
        btn_CalcularLayout.setHorizontalGroup(
            btn_CalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_CalcularLayout.createSequentialGroup()
                .addComponent(lbl_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_CalcularLayout.setVerticalGroup(
            btn_CalcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_CalcularLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_Limpiar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Limpiar.setForeground(new java.awt.Color(0, 153, 255));

        lbl_Limpiar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Limpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Limpiar.setText("Limpiar");
        lbl_Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_LimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_LimpiarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_LimpiarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_LimpiarLayout = new javax.swing.GroupLayout(btn_Limpiar);
        btn_Limpiar.setLayout(btn_LimpiarLayout);
        btn_LimpiarLayout.setHorizontalGroup(
            btn_LimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_LimpiarLayout.createSequentialGroup()
                .addComponent(lbl_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn_LimpiarLayout.setVerticalGroup(
            btn_LimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_LimpiarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_Obtener.setBackground(new java.awt.Color(255, 255, 255));
        btn_Obtener.setForeground(new java.awt.Color(0, 153, 255));

        lbl_Obtener.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Obtener.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Obtener.setText("Obtener Datos");
        lbl_Obtener.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Obtener.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_ObtenerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_ObtenerMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_ObtenerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_ObtenerLayout = new javax.swing.GroupLayout(btn_Obtener);
        btn_Obtener.setLayout(btn_ObtenerLayout);
        btn_ObtenerLayout.setHorizontalGroup(
            btn_ObtenerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Obtener, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        btn_ObtenerLayout.setVerticalGroup(
            btn_ObtenerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_ObtenerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Obtener, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout PanelDatosLayout = new javax.swing.GroupLayout(PanelDatos);
        PanelDatos.setLayout(PanelDatosLayout);
        PanelDatosLayout.setHorizontalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Datos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(cmb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(cmb_Temporada, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(txt_pH, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(txt_humedad, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btn_Obtener, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelDatosLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        PanelDatosLayout.setVerticalGroup(
            PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosLayout.createSequentialGroup()
                .addComponent(Datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmb_Temporada, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_humedad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Obtener, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 480, 570));

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
            .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        btn_cerrarLayout.setVerticalGroup(
            btn_cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Pnl_BarraLayout = new javax.swing.GroupLayout(Pnl_Barra);
        Pnl_Barra.setLayout(Pnl_BarraLayout);
        Pnl_BarraLayout.setHorizontalGroup(
            Pnl_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_BarraLayout.createSequentialGroup()
                .addContainerGap(1090, Short.MAX_VALUE)
                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Pnl_BarraLayout.setVerticalGroup(
            Pnl_BarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelPrincipal.add(Pnl_Barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 30));

        btn_Regresar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Regresar.setForeground(new java.awt.Color(0, 153, 255));

        lbl_Regresar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Regresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Regresar.setText("Regresar");
        lbl_Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_RegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_RegresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_RegresarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_RegresarLayout = new javax.swing.GroupLayout(btn_Regresar);
        btn_Regresar.setLayout(btn_RegresarLayout);
        btn_RegresarLayout.setHorizontalGroup(
            btn_RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Regresar, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        btn_RegresarLayout.setVerticalGroup(
            btn_RegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Regresar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        PanelPrincipal.add(btn_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 770, 480, 40));

        btn_Recomendaciones.setBackground(new java.awt.Color(255, 255, 255));
        btn_Recomendaciones.setForeground(new java.awt.Color(0, 153, 255));

        lbl_Recomendaciones.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Recomendaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Recomendaciones.setText("Recomendaciones para el cultivo");
        lbl_Recomendaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_Recomendaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_RecomendacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_RecomendacionesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_RecomendacionesMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btn_RecomendacionesLayout = new javax.swing.GroupLayout(btn_Recomendaciones);
        btn_Recomendaciones.setLayout(btn_RecomendacionesLayout);
        btn_RecomendacionesLayout.setHorizontalGroup(
            btn_RecomendacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Recomendaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        btn_RecomendacionesLayout.setVerticalGroup(
            btn_RecomendacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Recomendaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        PanelPrincipal.add(btn_Recomendaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 830, 480, -1));

        PanelREsultado.setBackground(new java.awt.Color(255, 255, 255));

        PanelColor.setBackground(new java.awt.Color(255, 255, 255));

        lbl_Rcolor.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lbl_Rcolor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelColorLayout = new javax.swing.GroupLayout(PanelColor);
        PanelColor.setLayout(PanelColorLayout);
        PanelColorLayout.setHorizontalGroup(
            PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Rcolor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelColorLayout.setVerticalGroup(
            PanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_Rcolor, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        lbl_Res.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        lbl_Res.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Res.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_Res.setMaximumSize(new java.awt.Dimension(100, 0));
        lbl_Res.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout PanelREsultadoLayout = new javax.swing.GroupLayout(PanelREsultado);
        PanelREsultado.setLayout(PanelREsultadoLayout);
        PanelREsultadoLayout.setHorizontalGroup(
            PanelREsultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbl_Res, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );
        PanelREsultadoLayout.setVerticalGroup(
            PanelREsultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelREsultadoLayout.createSequentialGroup()
                .addComponent(PanelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Res, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelREsultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        PanelTRes2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TRes2.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        lbl_TRes2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_TRes2.setText("Resultados");

        javax.swing.GroupLayout PanelTRes2Layout = new javax.swing.GroupLayout(PanelTRes2);
        PanelTRes2.setLayout(PanelTRes2Layout);
        PanelTRes2Layout.setHorizontalGroup(
            PanelTRes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTRes2Layout.createSequentialGroup()
                .addComponent(lbl_TRes2, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelTRes2Layout.setVerticalGroup(
            PanelTRes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_TRes2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PanelPrincipal.add(PanelTRes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 590, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoHojas.jpg"))); // NOI18N
        Fondo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelPrincipal.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 590, 820));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1129, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_costoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_costoMouseEntered
        btn_Costo.setBackground(verde);
    }//GEN-LAST:event_lbl_costoMouseEntered

    private void lbl_costoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_costoMouseExited
        btn_Costo.setBackground(Color.WHITE);
    }//GEN-LAST:event_lbl_costoMouseExited

    private void lbl_costoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_costoMousePressed
        lbl_Rcolor.setForeground(Color.BLACK);
        lbl_Rcolor.setText("COSTO");
        PanelColor.setBackground(Color.LIGHT_GRAY);
        lbl_Res.setText(texto.costo());
    }//GEN-LAST:event_lbl_costoMousePressed

    private void lbl_CalcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CalcularMouseEntered
        btn_Calcular.setBackground(verde);
    }//GEN-LAST:event_lbl_CalcularMouseEntered

    private void lbl_CalcularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CalcularMouseExited
        btn_Calcular.setBackground(Color.WHITE);
    }//GEN-LAST:event_lbl_CalcularMouseExited

    private void lbl_CalcularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_CalcularMousePressed
        //codigo del algoritmo
        
        
        if (txt_humedad.getText().isEmpty() && txt_pH.getText().isEmpty()) {
            lbl_Res.setText("Falta llenar los campos");
        } else if (txt_humedad.getText().isEmpty()) {
            lbl_Res.setText("Falta el valor de la humedad");
        } else if (txt_pH.getText().isEmpty()) {
            lbl_Res.setText("Falta el valor del pH");
        } else if (CompararCadenapH(txt_pH.getText())) {
            JOptionPane.showMessageDialog(null, "Verifica la entrada del pH.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (CompararCadenaHumedad(txt_humedad.getText())) {
            JOptionPane.showMessageDialog(null, "Verifica la entrada de la humedad.", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            calidad.setSuma(0);
            calidad.setED(false);
            calidad.setEPV(false);
            calidad.setEOI(false);
            
            DecimalFormat decimalFormat = new DecimalFormat("0.00");
            
            datos.setEstado(cmb_Estado.getSelectedIndex());
            datos.setTemporada(cmb_Temporada.getSelectedIndex());
            datos.setpH(Double.parseDouble(decimalFormat.format(Double.parseDouble(txt_pH.getText()))));
            datos.setHumedad(Double.parseDouble(decimalFormat.format(Double.parseDouble(txt_humedad.getText()))));

            calidad.CalidadRegion(datos);
            calidad.CalidadTemporada(datos);
            calidad.CalidadpH(datos);
            calidad.CalidadHumedad(datos);

            //String p = calidad.Calidad(datos);
            lbl_Rcolor.setText(calidad.Calidad());

            PanelColor.setBackground(Color.LIGHT_GRAY);

            Color(calidad.Calidad());

            lbl_Res.setText(this.texto.Stexto(calidad, datos));
        }
    }//GEN-LAST:event_lbl_CalcularMousePressed
    public boolean CompararCadenapH(String entrada){
        // Verificar si la cadena contiene solo números del 1 al 14
        try {
            double numero = Double.parseDouble(entrada);
            
            if (numero >= 1 && numero <= 14) {
                return false;
            } else {
                return true;
            }
        } catch (NumberFormatException e) {
            return true;
       }
    }
    
    public boolean CompararCadenaHumedad(String entrada){
        // Verificar si la cadena contiene solo números del 1 al 14
        try {
            double numero = Double.parseDouble(entrada);
            
            if (numero >= 5 && numero <= 90) {
                return false;
            } else {
                return true;
            }
        } catch (NumberFormatException e) {
            return true;
       }
    }
    
    public void Color(String texto) {

        if (texto.equals("EXCELENTE")) {
            lbl_Rcolor.setForeground(Exelente);
        } else if (texto.equals("Muy bueno")) {
            lbl_Rcolor.setForeground(MuyBueno);
        } else if (texto.equals("Bueno")) {
            lbl_Rcolor.setForeground(Bueno);
        } else if (texto.equals("Regular")) {
            lbl_Rcolor.setForeground(Regular);
        } else if (texto.equals("Malo")) {
            lbl_Rcolor.setForeground(Malo);
        }

    }
    private void Pnl_BarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pnl_BarraMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Pnl_BarraMouseDragged

    private void Pnl_BarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pnl_BarraMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Pnl_BarraMousePressed

    private void cmb_TemporadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_TemporadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_TemporadaActionPerformed

    private void txt_humedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_humedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_humedadActionPerformed

    private void txt_pHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pHActionPerformed

    private void lbl_LimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_LimpiarMouseEntered
        btn_Limpiar.setBackground(verde);
    }//GEN-LAST:event_lbl_LimpiarMouseEntered

    private void lbl_LimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_LimpiarMouseExited
        btn_Limpiar.setBackground(Color.WHITE);
    }//GEN-LAST:event_lbl_LimpiarMouseExited

    private void lbl_LimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_LimpiarMousePressed
        PanelColor.setBackground(Color.white);
        lbl_Rcolor.setText("");
        lbl_Res.setText("");
        txt_humedad.setText("");
        txt_pH.setText("");
    }//GEN-LAST:event_lbl_LimpiarMousePressed

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

    private void lbl_RegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegresarMouseEntered
        btn_Regresar.setBackground(verde2);
    }//GEN-LAST:event_lbl_RegresarMouseEntered

    private void lbl_RegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegresarMouseExited
        btn_Regresar.setBackground(Color.WHITE);
    }//GEN-LAST:event_lbl_RegresarMouseExited

    private void lbl_RegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RegresarMousePressed
        Entrada entrada = new Entrada();
        entrada.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_RegresarMousePressed

    private void lbl_ObtenerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ObtenerMouseEntered
        btn_Obtener.setBackground(verde);
    }//GEN-LAST:event_lbl_ObtenerMouseEntered

    private void lbl_ObtenerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ObtenerMouseExited
        btn_Obtener.setBackground(Color.WHITE);
    }//GEN-LAST:event_lbl_ObtenerMouseExited

    private void lbl_ObtenerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_ObtenerMousePressed
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        Random random = new Random();
        int RanEstado = random.nextInt(datos.estados.length);
        int RanTemp = random.nextInt(4);
        
        txt_pH.setText(decimalFormat.format(generateRandomNumber(4, 8)));
        txt_humedad.setText(decimalFormat.format(generateRandomNumber(67, 80)));
        cmb_Estado.setSelectedIndex(RanEstado);
        cmb_Temporada.setSelectedIndex(RanTemp);
    }//GEN-LAST:event_lbl_ObtenerMousePressed
    public static double generateRandomNumber(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }
    private void lbl_RecomendacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RecomendacionesMouseEntered
        btn_Recomendaciones.setBackground(verde2);
    }//GEN-LAST:event_lbl_RecomendacionesMouseEntered

    private void lbl_RecomendacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RecomendacionesMouseExited
        btn_Recomendaciones.setBackground(Color.WHITE);
    }//GEN-LAST:event_lbl_RecomendacionesMouseExited

    private void lbl_RecomendacionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_RecomendacionesMousePressed
        lbl_Rcolor.setForeground(Color.BLACK);
        lbl_Rcolor.setText("RECOMENDACIONES");
        PanelColor.setBackground(Color.LIGHT_GRAY);
        lbl_Res.setText(texto.Recomendacion());
    }//GEN-LAST:event_lbl_RecomendacionesMousePressed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Datos;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel PanelColor;
    private javax.swing.JPanel PanelDatos;
    private javax.swing.JPanel PanelLogo;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelREsultado;
    private javax.swing.JPanel PanelTRes2;
    private javax.swing.JPanel Pnl_Barra;
    private javax.swing.JLabel X;
    private javax.swing.JPanel btn_Calcular;
    private javax.swing.JPanel btn_Costo;
    private javax.swing.JPanel btn_Limpiar;
    private javax.swing.JPanel btn_Obtener;
    private javax.swing.JPanel btn_Recomendaciones;
    private javax.swing.JPanel btn_Regresar;
    private javax.swing.JPanel btn_cerrar;
    private javax.swing.JComboBox<String> cmb_Estado;
    private javax.swing.JComboBox<String> cmb_Temporada;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_Calcular;
    private javax.swing.JLabel lbl_Limpiar;
    private javax.swing.JLabel lbl_Obtener;
    private javax.swing.JLabel lbl_Rcolor;
    private javax.swing.JLabel lbl_Recomendaciones;
    private javax.swing.JLabel lbl_Regresar;
    private javax.swing.JLabel lbl_Res;
    private javax.swing.JLabel lbl_TRes2;
    private javax.swing.JLabel lbl_costo;
    private javax.swing.JLabel lbl_datos1;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JTextField txt_humedad;
    private javax.swing.JTextField txt_pH;
    // End of variables declaration//GEN-END:variables
}
