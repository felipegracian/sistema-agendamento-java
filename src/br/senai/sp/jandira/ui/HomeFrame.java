package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import java.awt.Toolkit;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/img/agenda.png")));
        initPanels();
    }

    // Atributos da classe
    PanelEspecialidades panelEspecialidades;
    PanelPlanosDeSaude panelPlanosDeSaude;
    PanelMedicos panelMedicos;

    // Constantes
    private final int POS_X = 20;
    private final int POS_Y = 160;
    private final int LARGURA = 800;
    private final int ALTURA = 350;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonSair = new javax.swing.JButton();
        buttonAgenda = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonEspecialidades = new javax.swing.JButton();
        buttonPlanoSaude = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamentos");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/hospital.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 10, 80, 60);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 30, 510, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 840, 80);

        buttonSair.setBackground(new java.awt.Color(255, 51, 51));
        buttonSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/sair.png"))); // NOI18N
        buttonSair.setToolTipText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(740, 100, 90, 40);

        buttonAgenda.setBackground(new java.awt.Color(204, 204, 204));
        buttonAgenda.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cronograma.png"))); // NOI18N
        buttonAgenda.setToolTipText("Agenda");
        getContentPane().add(buttonAgenda);
        buttonAgenda.setBounds(120, 100, 70, 50);

        buttonPacientes.setBackground(new java.awt.Color(204, 204, 204));
        buttonPacientes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/paciente.png"))); // NOI18N
        buttonPacientes.setToolTipText("Pacientes");
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(210, 100, 70, 50);

        buttonMedicos.setBackground(new java.awt.Color(204, 204, 204));
        buttonMedicos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/medico.png"))); // NOI18N
        buttonMedicos.setToolTipText("Médicos");
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(300, 100, 70, 50);

        buttonEspecialidades.setBackground(new java.awt.Color(204, 204, 204));
        buttonEspecialidades.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/estetoscopio.png"))); // NOI18N
        buttonEspecialidades.setToolTipText("Especialidades");
        buttonEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonEspecialidades);
        buttonEspecialidades.setBounds(390, 100, 70, 50);

        buttonPlanoSaude.setBackground(new java.awt.Color(204, 204, 204));
        buttonPlanoSaude.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        buttonPlanoSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plano-de-saude.png"))); // NOI18N
        buttonPlanoSaude.setToolTipText("Planos de Saúde");
        buttonPlanoSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanoSaude);
        buttonPlanoSaude.setBounds(480, 100, 70, 50);

        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setForeground(new java.awt.Color(255, 0, 0));
        panelHome.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("SISACON");
        panelHome.add(jLabel3);
        jLabel3.setBounds(30, 70, 160, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Sistema para Agendamentos de Consultas");
        panelHome.add(jLabel4);
        jLabel4.setBounds(30, 100, 280, 20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("E-mail: suporte@sisacon.com.br");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelHome.add(jLabel5);
        jLabel5.setBounds(590, 160, 200, 16);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Telefone: (11)94786-9951");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelHome.add(jLabel6);
        jLabel6.setBounds(630, 180, 160, 16);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Site: www.sisacon.com.br");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        panelHome.add(jLabel7);
        jLabel7.setBounds(620, 200, 170, 16);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Dados para Contato:");
        panelHome.add(jLabel8);
        jLabel8.setBounds(600, 130, 190, 20);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        panelHome.add(jPanel2);
        jPanel2.setBounds(30, 122, 760, 2);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Bem Vindo ao Sistema");
        panelHome.add(jLabel9);
        jLabel9.setBounds(30, 50, 160, 20);

        getContentPane().add(panelHome);
        panelHome.setBounds(20, 160, 800, 350);

        buttonHome.setBackground(new java.awt.Color(204, 204, 204));
        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/home32.png"))); // NOI18N
        buttonHome.setToolTipText("Home");
        buttonHome.setBorder(null);
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(30, 100, 70, 50);

        setSize(new java.awt.Dimension(856, 566));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        panelHome.setVisible(true);
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesActionPerformed

        panelHome.setVisible(false);
        panelEspecialidades.setVisible(true);
        panelPlanosDeSaude.setVisible(false);
        panelMedicos.setVisible(false);
    }//GEN-LAST:event_buttonEspecialidadesActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed

    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonPlanoSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoSaudeActionPerformed
        panelHome.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelPlanosDeSaude.setVisible(true);
        panelMedicos.setVisible(false);
    }//GEN-LAST:event_buttonPlanoSaudeActionPerformed

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        panelHome.setVisible(true);
        panelEspecialidades.setVisible(false);
        panelPlanosDeSaude.setVisible(false);
        panelMedicos.setVisible(false);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        panelHome.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelPlanosDeSaude.setVisible(false);
        panelMedicos.setVisible(true);
    }//GEN-LAST:event_buttonMedicosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda;
    private javax.swing.JButton buttonEspecialidades;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanoSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {

        panelEspecialidades = new PanelEspecialidades();
        panelEspecialidades.setBounds(
                POS_X,
                POS_Y,
                LARGURA,
                ALTURA);

        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(false);

        panelPlanosDeSaude = new PanelPlanosDeSaude();
        panelPlanosDeSaude.setBounds(POS_X,
                POS_Y,
                LARGURA,
                ALTURA);

        getContentPane().add(panelPlanosDeSaude);
        panelPlanosDeSaude.setVisible(false);

        panelMedicos = new PanelMedicos();
        panelMedicos.setBounds(
                POS_X,
                POS_Y,
                LARGURA,
                ALTURA);

        getContentPane().add(panelMedicos);
        panelMedicos.setVisible(false);
    }

}
