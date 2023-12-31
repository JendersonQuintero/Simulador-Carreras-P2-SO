package interfaz;

import auxiliar.ResultIA;
import javax.swing.JOptionPane;
import main.Administrator;
import main.Enterprise;
import main.IA;

/**
 *
 * @author Norangel Marin
 */
public class Interfaz extends javax.swing.JFrame {

    public Administrator admin;
    public IA ia;
    public Enterprise enterpriseBuga;
    public Enterprise enterpriseLambo;
    
    
    public Interfaz() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        tituloPrincipal = new javax.swing.JLabel();
        btnStartSimulation = new javax.swing.JButton();
        btnStopSimulation = new javax.swing.JButton();
        panelColasBugatti = new javax.swing.JPanel();
        tituloColasBugatti = new javax.swing.JLabel();
        alta = new javax.swing.JLabel();
        baja = new javax.swing.JLabel();
        media = new javax.swing.JLabel();
        textCalidadRefuerzoBugatti = new java.awt.TextArea();
        alta1 = new javax.swing.JLabel();
        textCalidadBajaBugatti = new java.awt.TextArea();
        textCalidadMediaBugatti = new java.awt.TextArea();
        textCalidadAltaBugatti = new java.awt.TextArea();
        panelCarrera = new javax.swing.JPanel();
        titulo40 = new javax.swing.JLabel();
        titulo41 = new javax.swing.JLabel();
        textVehicleBu = new java.awt.TextArea();
        textVehicleLam = new java.awt.TextArea();
        panelColasLamborguini = new javax.swing.JPanel();
        titulo6 = new javax.swing.JLabel();
        alta2 = new javax.swing.JLabel();
        alta3 = new javax.swing.JLabel();
        media1 = new javax.swing.JLabel();
        baja1 = new javax.swing.JLabel();
        textCalidadRefuerzoLamborghini = new java.awt.TextArea();
        textCalidadBajaLamborghini = new java.awt.TextArea();
        textCalidadAltaLamborghini = new java.awt.TextArea();
        textCalidadMediaLamborghini = new java.awt.TextArea();
        panelIA = new javax.swing.JPanel();
        titulo62 = new javax.swing.JLabel();
        textStatusIA = new javax.swing.JTextField();
        titulo63 = new javax.swing.JLabel();
        panelMarcadorGanadores = new javax.swing.JPanel();
        titulo61 = new javax.swing.JLabel();
        titulo30 = new javax.swing.JLabel();
        titulo31 = new javax.swing.JLabel();
        titulo64 = new javax.swing.JLabel();
        textCounterWinB = new javax.swing.JTextField();
        textCounterWinL = new javax.swing.JTextField();
        panelTiempo = new javax.swing.JPanel();
        titulo60 = new javax.swing.JLabel();
        inputTime = new javax.swing.JTextField();
        titulo59 = new javax.swing.JLabel();
        btnChangeTime = new javax.swing.JToggleButton();
        buttonSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelResultLambo = new java.awt.Label();
        labelResultBuga = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        PanelPrincipal.setForeground(new java.awt.Color(255, 255, 204));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        tituloPrincipal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        tituloPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        tituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrincipal.setText("Simulación de Carreras");
        PanelPrincipal.add(tituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 740, 40));

        btnStartSimulation.setBackground(new java.awt.Color(0, 0, 0));
        btnStartSimulation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnStartSimulation.setForeground(new java.awt.Color(255, 255, 255));
        btnStartSimulation.setText("Iniciar Simulación");
        btnStartSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartSimulationActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnStartSimulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, 340, 30));

        btnStopSimulation.setBackground(new java.awt.Color(0, 0, 0));
        btnStopSimulation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnStopSimulation.setForeground(new java.awt.Color(255, 255, 255));
        btnStopSimulation.setText("Terminar Simulación");
        btnStopSimulation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStopSimulationMouseClicked(evt);
            }
        });
        PanelPrincipal.add(btnStopSimulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 620, 340, 30));

        panelColasBugatti.setBackground(new java.awt.Color(255, 102, 102));
        panelColasBugatti.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelColasBugatti.setForeground(new java.awt.Color(0, 0, 0));
        panelColasBugatti.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloColasBugatti.setBackground(new java.awt.Color(0, 0, 0));
        tituloColasBugatti.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tituloColasBugatti.setForeground(new java.awt.Color(0, 0, 0));
        tituloColasBugatti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloColasBugatti.setText("Colas de Calidad Bugatti");
        panelColasBugatti.add(tituloColasBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 310, 20));

        alta.setBackground(new java.awt.Color(0, 0, 0));
        alta.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        alta.setForeground(new java.awt.Color(0, 0, 0));
        alta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alta.setText("Refuerzo");
        panelColasBugatti.add(alta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 90, -1));

        baja.setBackground(new java.awt.Color(0, 0, 0));
        baja.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        baja.setForeground(new java.awt.Color(0, 0, 0));
        baja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baja.setText("Baja");
        panelColasBugatti.add(baja, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 90, -1));

        media.setBackground(new java.awt.Color(0, 0, 0));
        media.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        media.setForeground(new java.awt.Color(0, 0, 0));
        media.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        media.setText("Media");
        panelColasBugatti.add(media, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 90, -1));

        textCalidadRefuerzoBugatti.setEditable(false);
        panelColasBugatti.add(textCalidadRefuerzoBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 60, 310));

        alta1.setBackground(new java.awt.Color(0, 0, 0));
        alta1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        alta1.setForeground(new java.awt.Color(0, 0, 0));
        alta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alta1.setText("Alta");
        panelColasBugatti.add(alta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 90, -1));

        textCalidadBajaBugatti.setEditable(false);
        panelColasBugatti.add(textCalidadBajaBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, 310));

        textCalidadMediaBugatti.setEditable(false);
        panelColasBugatti.add(textCalidadMediaBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 60, 310));

        textCalidadAltaBugatti.setEditable(false);
        panelColasBugatti.add(textCalidadAltaBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 60, 310));

        PanelPrincipal.add(panelColasBugatti, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 390));

        panelCarrera.setBackground(new java.awt.Color(255, 102, 102));
        panelCarrera.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelCarrera.setForeground(new java.awt.Color(0, 0, 0));
        panelCarrera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo40.setBackground(new java.awt.Color(0, 0, 0));
        titulo40.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo40.setForeground(new java.awt.Color(0, 0, 0));
        titulo40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo40.setText("(Vehiculos en la IA)");
        panelCarrera.add(titulo40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 300, 20));

        titulo41.setBackground(new java.awt.Color(0, 0, 0));
        titulo41.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo41.setForeground(new java.awt.Color(0, 0, 0));
        titulo41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo41.setText("Carrera");
        panelCarrera.add(titulo41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 20));

        textVehicleBu.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textVehicleBu.setEditable(false);
        textVehicleBu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        panelCarrera.add(textVehicleBu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, 110));

        textVehicleLam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        panelCarrera.add(textVehicleLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 110, 110));

        PanelPrincipal.add(panelCarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 300, 190));

        panelColasLamborguini.setBackground(new java.awt.Color(255, 102, 102));
        panelColasLamborguini.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelColasLamborguini.setForeground(new java.awt.Color(0, 0, 0));
        panelColasLamborguini.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo6.setBackground(new java.awt.Color(0, 0, 0));
        titulo6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo6.setForeground(new java.awt.Color(0, 0, 0));
        titulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo6.setText("Colas de Calidad Lamborghini");
        panelColasLamborguini.add(titulo6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 310, 20));

        alta2.setBackground(new java.awt.Color(0, 0, 0));
        alta2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        alta2.setForeground(new java.awt.Color(0, 0, 0));
        alta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alta2.setText("Refuerzo");
        panelColasLamborguini.add(alta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 90, -1));

        alta3.setBackground(new java.awt.Color(0, 0, 0));
        alta3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        alta3.setForeground(new java.awt.Color(0, 0, 0));
        alta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alta3.setText("Alta");
        panelColasLamborguini.add(alta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 90, -1));

        media1.setBackground(new java.awt.Color(0, 0, 0));
        media1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        media1.setForeground(new java.awt.Color(0, 0, 0));
        media1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        media1.setText("Media");
        panelColasLamborguini.add(media1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 90, -1));

        baja1.setBackground(new java.awt.Color(0, 0, 0));
        baja1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        baja1.setForeground(new java.awt.Color(0, 0, 0));
        baja1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        baja1.setText("Baja");
        panelColasLamborguini.add(baja1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 90, -1));

        textCalidadRefuerzoLamborghini.setEditable(false);
        panelColasLamborguini.add(textCalidadRefuerzoLamborghini, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 60, 310));

        textCalidadBajaLamborghini.setEditable(false);
        panelColasLamborguini.add(textCalidadBajaLamborghini, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, 310));

        textCalidadAltaLamborghini.setEditable(false);
        panelColasLamborguini.add(textCalidadAltaLamborghini, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 60, 310));

        textCalidadMediaLamborghini.setEditable(false);
        panelColasLamborguini.add(textCalidadMediaLamborghini, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 60, 310));

        PanelPrincipal.add(panelColasLamborguini, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 310, 390));

        panelIA.setBackground(new java.awt.Color(255, 102, 102));
        panelIA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelIA.setForeground(new java.awt.Color(0, 0, 0));
        panelIA.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo62.setBackground(new java.awt.Color(0, 0, 0));
        titulo62.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo62.setForeground(new java.awt.Color(0, 0, 0));
        titulo62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo62.setText("Status IA");
        panelIA.add(titulo62, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 20));

        textStatusIA.setEditable(false);
        textStatusIA.setBackground(new java.awt.Color(255, 255, 255));
        textStatusIA.setForeground(new java.awt.Color(0, 0, 0));
        textStatusIA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textStatusIA.setToolTipText("");
        textStatusIA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelIA.add(textStatusIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 30));

        titulo63.setBackground(new java.awt.Color(0, 0, 0));
        titulo63.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo63.setForeground(new java.awt.Color(0, 0, 0));
        titulo63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo63.setText("Gestion de Trabajo");
        panelIA.add(titulo63, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 260, 20));

        PanelPrincipal.add(panelIA, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 300, 90));

        panelMarcadorGanadores.setBackground(new java.awt.Color(255, 102, 102));
        panelMarcadorGanadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelMarcadorGanadores.setForeground(new java.awt.Color(0, 0, 0));
        panelMarcadorGanadores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo61.setBackground(new java.awt.Color(0, 0, 0));
        titulo61.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo61.setForeground(new java.awt.Color(0, 0, 0));
        titulo61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo61.setText("(Conteo de carreras ganadas)");
        panelMarcadorGanadores.add(titulo61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 300, 20));

        titulo30.setBackground(new java.awt.Color(0, 0, 0));
        titulo30.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        titulo30.setForeground(new java.awt.Color(0, 0, 0));
        titulo30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo30.setText("Lamborghini");
        panelMarcadorGanadores.add(titulo30, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 110, -1));

        titulo31.setBackground(new java.awt.Color(0, 0, 0));
        titulo31.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        titulo31.setForeground(new java.awt.Color(0, 0, 0));
        titulo31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo31.setText("Bugatti");
        panelMarcadorGanadores.add(titulo31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 110, -1));

        titulo64.setBackground(new java.awt.Color(0, 0, 0));
        titulo64.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo64.setForeground(new java.awt.Color(0, 0, 0));
        titulo64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo64.setText("Marcador");
        panelMarcadorGanadores.add(titulo64, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 20));

        textCounterWinB.setEditable(false);
        textCounterWinB.setBackground(new java.awt.Color(255, 255, 255));
        textCounterWinB.setForeground(new java.awt.Color(0, 0, 0));
        textCounterWinB.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCounterWinB.setToolTipText("");
        textCounterWinB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelMarcadorGanadores.add(textCounterWinB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 110, 50));

        textCounterWinL.setEditable(false);
        textCounterWinL.setBackground(new java.awt.Color(255, 255, 255));
        textCounterWinL.setForeground(new java.awt.Color(0, 0, 0));
        textCounterWinL.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCounterWinL.setToolTipText("");
        textCounterWinL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelMarcadorGanadores.add(textCounterWinL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 110, 50));

        PanelPrincipal.add(panelMarcadorGanadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 300, 140));

        panelTiempo.setBackground(new java.awt.Color(255, 102, 102));
        panelTiempo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTiempo.setForeground(new java.awt.Color(0, 0, 0));
        panelTiempo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo60.setBackground(new java.awt.Color(0, 0, 0));
        titulo60.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo60.setForeground(new java.awt.Color(0, 0, 0));
        titulo60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo60.setText("Control de tiempo");
        panelTiempo.add(titulo60, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 20));

        inputTime.setBackground(new java.awt.Color(255, 255, 255));
        inputTime.setForeground(new java.awt.Color(0, 0, 0));
        inputTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputTime.setToolTipText("");
        inputTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTiempo.add(inputTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 30));

        titulo59.setBackground(new java.awt.Color(0, 0, 0));
        titulo59.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        titulo59.setForeground(new java.awt.Color(0, 0, 0));
        titulo59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo59.setText("Gestion de Trabajo");
        panelTiempo.add(titulo59, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 260, 20));

        btnChangeTime.setText("Cambiar");
        btnChangeTime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeTimeMouseClicked(evt);
            }
        });
        panelTiempo.add(btnChangeTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 110, 30));

        PanelPrincipal.add(panelTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 300, 90));

        buttonSalir.setBackground(new java.awt.Color(255, 0, 0));
        buttonSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonSalir.setForeground(new java.awt.Color(0, 0, 0));
        buttonSalir.setText("x");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });
        PanelPrincipal.add(buttonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 70, 40));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("2023 © Norangel Marin y Jenderson Quintero");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 1000, 30));

        labelResultLambo.setAlignment(java.awt.Label.CENTER);
        labelResultLambo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelResultLambo.setForeground(new java.awt.Color(204, 0, 0));
        PanelPrincipal.add(labelResultLambo, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 310, 70));

        labelResultBuga.setAlignment(java.awt.Label.CENTER);
        labelResultBuga.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelResultBuga.setForeground(new java.awt.Color(204, 0, 0));
        PanelPrincipal.add(labelResultBuga, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 310, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void updateDataView() {
        this.textStatusIA.setText(this.ia.getStatusIA());
        this.textCounterWinB.setText(Integer.toString(this.enterpriseBuga.getRacersWin()));
        this.textCounterWinL.setText(Integer.toString(this.enterpriseLambo.getRacersWin()));
        
        String infoBuga = "ID: " + Integer.toString(this.admin.getV1Selected().getuId()) + "\nRdm: " + Double.toString(this.admin.getV1Selected().getRenderVehicle()) + "\nPrio: " + Integer.toString(this.admin.getV1Selected().getPriorityLevel());
        String infoLambo = "ID: " + Integer.toString(this.admin.getV2Selected().getuId()) + "\nRdm: " + Double.toString(this.admin.getV2Selected().getRenderVehicle()) + "\nPrio: " + Integer.toString(this.admin.getV2Selected().getPriorityLevel());;
        
        this.textVehicleBu.setText(infoBuga);
        this.textVehicleLam.setText(infoLambo);
        
        this.textCalidadRefuerzoBugatti.setText(this.enterpriseBuga.getColaRefuerzoToPrint());
        this.textCalidadMediaBugatti.setText(this.enterpriseBuga.getColaLevel2ToPrint());
        this.textCalidadAltaBugatti.setText(this.enterpriseBuga.getColaLevel1ToPrint());
        this.textCalidadBajaBugatti.setText(this.enterpriseBuga.getColaLevel3ToPrint());
        
        this.textCalidadRefuerzoLamborghini.setText(this.enterpriseLambo.getColaRefuerzoToPrint());
        this.textCalidadMediaLamborghini.setText(this.enterpriseLambo.getColaLevel2ToPrint());
        this.textCalidadAltaLamborghini.setText(this.enterpriseLambo.getColaLevel1ToPrint());
        this.textCalidadBajaLamborghini.setText(this.enterpriseLambo.getColaLevel3ToPrint());
    }
    
    public void showResultRacer(ResultIA result) {
        switch (result.getResult()) {
            case "GANADOR" -> {
                if (result.getVehicle1().getEnterprise().equals("B")) {
                    this.labelResultBuga.setText("GANADOR");
                } else {
                    this.labelResultLambo.setText("GANADOR");
                }
            }
            case "CARRERA INVALIDA" -> {
                this.labelResultBuga.setText("INVALIDADA");
                this.labelResultLambo.setText("INVALIDADA");
            }
            case "EMPATE" -> {
                this.labelResultBuga.setText("EMPATE");
                this.labelResultLambo.setText("EMPATE");
            }
        }
    }
    
    public void cleanResultRacer() {
        this.labelResultBuga.setText("");
        this.labelResultLambo.setText("");
    }
    
    private void btnStartSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartSimulationActionPerformed
        this.enterpriseBuga = new Enterprise();
        this.enterpriseLambo = new Enterprise();
        this.ia = new IA();
        
        this.admin = new Administrator(this.enterpriseBuga, this.enterpriseLambo, this.ia, this);
        
        this.admin.loadCarsInit();
        this.admin.start();
    }//GEN-LAST:event_btnStartSimulationActionPerformed

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void btnStopSimulationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStopSimulationMouseClicked
        this.admin.stopPlant();
    }//GEN-LAST:event_btnStopSimulationMouseClicked

    private void btnChangeTimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeTimeMouseClicked
        try {
            Long newTime = Long.valueOf(this.inputTime.getText());
            if (this.admin != null) {
                this.admin.setTimeSimulation(newTime);
            } else {
                JOptionPane.showMessageDialog(null, "StartSimulación", "Inicie la simulación",0);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número inválido", "El tiempo ingresado no es un número",0);
        }
    }//GEN-LAST:event_btnChangeTimeMouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel alta;
    private javax.swing.JLabel alta1;
    private javax.swing.JLabel alta2;
    private javax.swing.JLabel alta3;
    private javax.swing.JLabel baja;
    private javax.swing.JLabel baja1;
    private javax.swing.JToggleButton btnChangeTime;
    private javax.swing.JButton btnStartSimulation;
    private javax.swing.JButton btnStopSimulation;
    private javax.swing.JButton buttonSalir;
    private javax.swing.JTextField inputTime;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label labelResultBuga;
    private java.awt.Label labelResultLambo;
    private javax.swing.JLabel media;
    private javax.swing.JLabel media1;
    private javax.swing.JPanel panelCarrera;
    private javax.swing.JPanel panelColasBugatti;
    private javax.swing.JPanel panelColasLamborguini;
    private javax.swing.JPanel panelIA;
    private javax.swing.JPanel panelMarcadorGanadores;
    private javax.swing.JPanel panelTiempo;
    private java.awt.TextArea textCalidadAltaBugatti;
    private java.awt.TextArea textCalidadAltaLamborghini;
    private java.awt.TextArea textCalidadBajaBugatti;
    private java.awt.TextArea textCalidadBajaLamborghini;
    private java.awt.TextArea textCalidadMediaBugatti;
    private java.awt.TextArea textCalidadMediaLamborghini;
    private java.awt.TextArea textCalidadRefuerzoBugatti;
    private java.awt.TextArea textCalidadRefuerzoLamborghini;
    private javax.swing.JTextField textCounterWinB;
    private javax.swing.JTextField textCounterWinL;
    private javax.swing.JTextField textStatusIA;
    private java.awt.TextArea textVehicleBu;
    private java.awt.TextArea textVehicleLam;
    private javax.swing.JLabel titulo30;
    private javax.swing.JLabel titulo31;
    private javax.swing.JLabel titulo40;
    private javax.swing.JLabel titulo41;
    private javax.swing.JLabel titulo59;
    private javax.swing.JLabel titulo6;
    private javax.swing.JLabel titulo60;
    private javax.swing.JLabel titulo61;
    private javax.swing.JLabel titulo62;
    private javax.swing.JLabel titulo63;
    private javax.swing.JLabel titulo64;
    private javax.swing.JLabel tituloColasBugatti;
    private javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
