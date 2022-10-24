/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;

/**
 *
 * @author 22282224
 */
public class EspecialidadesDialog extends javax.swing.JDialog {

    private Especialidade especialidade;
    private OperacaoEnum operacao;

    /**
     * Creates new form EspecialidadesDialog
     */
    public EspecialidadesDialog(
            java.awt.Frame parent,
            boolean modal,
            Especialidade e,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();
        especialidade = e;
        this.operacao = operacao;
        preencherFormulario();
        preencherTitulo();
    }

    public EspecialidadesDialog(
            java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {

        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();

    }

    private void preencherFormulario() {
        textFieldCodigo.setText(especialidade.getCodigo().toString());
        textFieldNomeEspecialidade.setText(especialidade.getNome());
        textFieldDescricaoEspecialidade.setText(especialidade.getDescricao());
    }

    private void preencherTitulo() {
        labelEspecialidadesAdicionar.setText("Especialidades - " + operacao);
        if(operacao == OperacaoEnum.EDITAR){
        labelEspecialidadesAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/editaricone.png")));
        } else {
            labelEspecialidadesAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/adicionar.png")));
        }
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
        labelEspecialidadesAdicionar = new javax.swing.JLabel();
        panelDetalhesEspecialidade = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textFieldCodigo = new javax.swing.JTextField();
        labelNomeEspecialidade = new javax.swing.JLabel();
        textFieldNomeEspecialidade = new javax.swing.JTextField();
        labelDescricaoEspecialidade = new javax.swing.JLabel();
        textFieldDescricaoEspecialidade = new javax.swing.JTextField();
        buttonCancelarEspecialidade = new javax.swing.JButton();
        buttonSalvarEspecialidade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 465));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        labelEspecialidadesAdicionar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelEspecialidadesAdicionar.setForeground(new java.awt.Color(0, 0, 0));
        labelEspecialidadesAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/plus.png"))); // NOI18N
        labelEspecialidadesAdicionar.setText("  Especialidades - ADICIONAR");
        jPanel1.add(labelEspecialidadesAdicionar);
        labelEspecialidadesAdicionar.setBounds(20, 12, 380, 40);

        panelDetalhesEspecialidade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        panelDetalhesEspecialidade.setLayout(null);

        labelCodigo.setText("Código:");
        panelDetalhesEspecialidade.add(labelCodigo);
        labelCodigo.setBounds(20, 50, 50, 16);

        textFieldCodigo.setEditable(false);
        textFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoActionPerformed(evt);
            }
        });
        panelDetalhesEspecialidade.add(textFieldCodigo);
        textFieldCodigo.setBounds(20, 70, 100, 22);

        labelNomeEspecialidade.setText("Nome da Especialidade:");
        panelDetalhesEspecialidade.add(labelNomeEspecialidade);
        labelNomeEspecialidade.setBounds(20, 100, 200, 16);
        panelDetalhesEspecialidade.add(textFieldNomeEspecialidade);
        textFieldNomeEspecialidade.setBounds(20, 120, 350, 22);

        labelDescricaoEspecialidade.setText("Descrição da Especialidade:");
        panelDetalhesEspecialidade.add(labelDescricaoEspecialidade);
        labelDescricaoEspecialidade.setBounds(20, 160, 240, 16);
        panelDetalhesEspecialidade.add(textFieldDescricaoEspecialidade);
        textFieldDescricaoEspecialidade.setBounds(20, 180, 460, 22);

        buttonCancelarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/cancelar.png"))); // NOI18N
        buttonCancelarEspecialidade.setToolTipText("Cancelar");
        buttonCancelarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarEspecialidadeActionPerformed(evt);
            }
        });
        panelDetalhesEspecialidade.add(buttonCancelarEspecialidade);
        buttonCancelarEspecialidade.setBounds(320, 253, 80, 50);

        buttonSalvarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/img/salve-.png"))); // NOI18N
        buttonSalvarEspecialidade.setToolTipText("Salvar");
        buttonSalvarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarEspecialidadeActionPerformed(evt);
            }
        });
        panelDetalhesEspecialidade.add(buttonSalvarEspecialidade);
        buttonSalvarEspecialidade.setBounds(420, 253, 80, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panelDetalhesEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(panelDetalhesEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 48, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(600, 465));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoActionPerformed

    private void buttonSalvarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarEspecialidadeActionPerformed

        if(operacao == OperacaoEnum.ADICIONAR){
            adicionar();
        }else {
            editar();
        }
    }//GEN-LAST:event_buttonSalvarEspecialidadeActionPerformed

    private void buttonCancelarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarEspecialidadeActionPerformed
       dispose();
    }//GEN-LAST:event_buttonCancelarEspecialidadeActionPerformed

    private void editar(){
        especialidade.setNome(textFieldNomeEspecialidade.getText());
        especialidade.setDescricao(textFieldDescricaoEspecialidade.getText());
        EspecialidadeDAO.atualizar(especialidade);
        
        JOptionPane.showMessageDialog(rootPane,
                "Especialidade atualizada com sucesso!",
                "Especialidades",
                JOptionPane.WARNING_MESSAGE);
        dispose();
    }
    
    private void adicionar() {
        // Criar um objeto especialidade
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(textFieldNomeEspecialidade.getText());
        novaEspecialidade.setDescricao(textFieldDescricaoEspecialidade.getText());

        // Gravar o objeto, através do Dao
        EspecialidadeDAO.gravar(novaEspecialidade);

        JOptionPane.showMessageDialog(this,
                "Especialidade gravada com sucesso",
                "Especialidades",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelarEspecialidade;
    private javax.swing.JButton buttonSalvarEspecialidade;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricaoEspecialidade;
    private javax.swing.JLabel labelEspecialidadesAdicionar;
    private javax.swing.JLabel labelNomeEspecialidade;
    private javax.swing.JPanel panelDetalhesEspecialidade;
    private javax.swing.JTextField textFieldCodigo;
    private javax.swing.JTextField textFieldDescricaoEspecialidade;
    private javax.swing.JTextField textFieldNomeEspecialidade;
    // End of variables declaration//GEN-END:variables
}
