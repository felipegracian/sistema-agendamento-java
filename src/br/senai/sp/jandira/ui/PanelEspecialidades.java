/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 22282224
 */
public class PanelEspecialidades extends javax.swing.JPanel {

    /**
     * Creates new form PanelEspecialidades
     */
    public PanelEspecialidades() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidades();
        preencherTabela();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollEspecialidades = new javax.swing.JScrollPane();
        tabelEspecialidades = new javax.swing.JTable();
        buttonExcluirEspecialidades = new javax.swing.JButton();
        buttonEditarEspecialidades = new javax.swing.JButton();
        buttonGravarEspecialidades = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Especialidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(204, 153, 255))); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 350));
        setLayout(null);

        tabelEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelEspecialidades.setToolTipText("");
        scrollEspecialidades.setViewportView(tabelEspecialidades);

        add(scrollEspecialidades);
        scrollEspecialidades.setBounds(10, 20, 780, 250);

        buttonExcluirEspecialidades.setBackground(new java.awt.Color(204, 204, 204));
        buttonExcluirEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/excluir.png"))); // NOI18N
        buttonExcluirEspecialidades.setToolTipText("Excluir a especialidade selecionada");
        buttonExcluirEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonExcluirEspecialidades);
        buttonExcluirEspecialidades.setBounds(520, 280, 80, 50);

        buttonEditarEspecialidades.setBackground(new java.awt.Color(204, 204, 204));
        buttonEditarEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editar.png"))); // NOI18N
        buttonEditarEspecialidades.setToolTipText("Editar especialidade selecionada");
        add(buttonEditarEspecialidades);
        buttonEditarEspecialidades.setBounds(610, 280, 80, 50);

        buttonGravarEspecialidades.setBackground(new java.awt.Color(204, 204, 204));
        buttonGravarEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png"))); // NOI18N
        buttonGravarEspecialidades.setToolTipText("Criar nova especialidade");
        buttonGravarEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGravarEspecialidadesActionPerformed(evt);
            }
        });
        add(buttonGravarEspecialidades);
        buttonGravarEspecialidades.setBounds(700, 280, 80, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGravarEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGravarEspecialidadesActionPerformed
        EspecialidadesDialog d = new EspecialidadesDialog(null, true);
        d.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonGravarEspecialidadesActionPerformed

    private void buttonExcluirEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadesActionPerformed
        
        int linha = tabelEspecialidades.getSelectedRow();
       
        if (linha != -1) {
            excluirEspecialidade(linha);
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Por Favor, selecione a especialidade que você deseja excluir",
                    "Atenção",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonExcluirEspecialidadesActionPerformed
    
    private void excluirEspecialidade(int linha) {
        String codigoStr = tabelEspecialidades.getValueAt(linha, 0).toString();
        Integer codigo = Integer.valueOf(codigoStr);
        
        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão?",
                "Atenção!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        EspecialidadeDAO.excluir(codigo);
        
        preencherTabela();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditarEspecialidades;
    private javax.swing.JButton buttonExcluirEspecialidades;
    private javax.swing.JButton buttonGravarEspecialidades;
    private javax.swing.JScrollPane scrollEspecialidades;
    private javax.swing.JTable tabelEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        tabelEspecialidades.setModel(EspecialidadeDAO.getTabelaEspecialidades());
        ajustarTabela();
    }

    private void ajustarTabela() {
    
        // Impedir que o usuário movimente as colunas
        tabelEspecialidades.getTableHeader().setReorderingAllowed(false);
        
        // Bloquear a edição das células da tabela
        tabelEspecialidades.setDefaultEditor(Object.class, null);
        
        // Definir a largura das colunas
        tabelEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tabelEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tabelEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(300);
        tabelEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(360);
    }
}
