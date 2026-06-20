package fatec.poo.view;

import fatec.poo.model.Hotel;
import fatec.poo.control.PreparaConexao;
import fatec.poo.control.DaoHotel;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Willian Kenji
 */
public class GuiCadastroHotel extends javax.swing.JFrame {

    public GuiCadastroHotel() {
        initComponents();
        limparCampos();
    }
    
    DecimalFormat df = new DecimalFormat("#,##0.00");
    
    private void limparCampos() {
        // Limpa todos os textos
        txtCodigo.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtValDiaria.setText("");
        txtFaturamento.setText("");
        
        // Bloqueia os campos para edição
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtValDiaria.setEnabled(false);
        txtFaturamento.setEnabled(false);
        
        // Desabilita dos botões
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        // Habilita o texto e foca no campo para digitar o código
        txtCodigo.setEnabled(true);
        txtCodigo.requestFocus();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblValDiaria = new javax.swing.JLabel();
        lblFaturamento = new javax.swing.JLabel();
        txtFaturamento = new javax.swing.JTextField();
        txtValDiaria = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Hotel");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCodigo.setText("Código");

        lblNome.setText("Nome");

        lblEndereco.setText("Endereço");

        lblTelefone.setText("Telefone");

        lblValDiaria.setText("Valor Diária");

        lblFaturamento.setText("Total Faturamento");

        txtFaturamento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFaturamento)
                            .addComponent(lblValDiaria)
                            .addComponent(lblTelefone)
                            .addComponent(lblEndereco)
                            .addComponent(lblNome)
                            .addComponent(lblCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addComponent(txtEndereco)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtFaturamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                        .addComponent(txtValDiaria, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValDiaria)
                    .addComponent(txtValDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFaturamento)
                    .addComponent(txtFaturamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try{
            // Valida se o campo Codigo não está vazio antes de converter
            if (txtCodigo.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Por favor, digite um código para consultar.");
                return;
            }
            
            int codigo = Integer.parseInt(txtCodigo.getText());
            Hotel objHotel = daoHotel.consultar(codigo);
            
            if (objHotel == null) {
                JOptionPane.showMessageDialog(this, "Hotel não encontrado! " +
                                                    "Os campos foram liberados para um novo cadastro.");
                // Limpa os campo caso tenham algum conteúdo
                txtNome.setText("");
                txtEndereco.setText("");
                txtTelefone.setText("");
                txtValDiaria.setText("");
                txtFaturamento.setText("");
                
                // Habilita a inserção de textos
                txtNome.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtTelefone.setEnabled(true);
                txtValDiaria.setEnabled(true);
                btnIncluir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
            } else {
                txtNome.setText(objHotel.getNome());
                txtEndereco.setText(objHotel.getEndereco());
                txtTelefone.setText(objHotel.getTelefone());
                txtValDiaria.setText(String.valueOf(objHotel.getValorDiaria()));
                txtFaturamento.setText(df.format(objHotel.getTotalFaturamento()));
                
                txtNome.setEnabled(true);
                txtEndereco.setEnabled(true);
                txtTelefone.setEnabled(true);
                txtValDiaria.setEnabled(true);
                btnIncluir.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            }
        } catch (NumberFormatException ex) {
            // Captura o erro caso o usuário digite letras no campo de código
            JOptionPane.showMessageDialog(this, "O código deve ser um número inteiro válido!");
        } catch (Exception ex) {
            // Captura qualquer outro erro
            JOptionPane.showMessageDialog(this, "Erro inesperado ao realizar consulta: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        try{
            // Validação inicial para verificar se os textos mão estão vazios
            if(txtCodigo.getText().trim().isEmpty() || txtNome.getText().trim().isEmpty() || 
                                                       txtValDiaria.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios");
                return;
            }
            objHotel = new Hotel (Integer.parseInt(txtCodigo.getText().trim()), txtNome.getText().trim());
            objHotel.setEndereco(txtEndereco.getText().trim());
            objHotel.setTelefone(txtTelefone.getText().trim());
            objHotel.setValorDiaria(Double.parseDouble(txtValDiaria.getText().trim()));

            daoHotel.inserir(objHotel);
            JOptionPane.showMessageDialog(this, "Hotel incluído com sucesso!");
            limparCampos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Erro nos dados numéricos!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao tentar salvar o hotel: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try{
            if (txtCodigo.getText().trim().isEmpty() || txtNome.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios");
                return;
            }
            Hotel objHot = new Hotel(Integer.parseInt(txtCodigo.getText().trim()), txtNome.getText().trim());
            objHot.setEndereco(txtEndereco.getText().trim());
            objHot.setTelefone(txtTelefone.getText().trim());
            objHot.setValorDiaria(Double.parseDouble(txtValDiaria.getText().trim()));

            daoHotel.alterar(objHot);
            JOptionPane.showMessageDialog(this, "Hotel alterado com sucesso!");
            limparCampos();
        } catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Erro nos dados numéricos!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao tentar salvar o hotel: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try{
            if (txtCodigo.getText().trim().isEmpty() || txtNome.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios");
                return;
            }
            Hotel objHot = new Hotel(Integer.parseInt(txtCodigo.getText()), txtNome.getText());

            daoHotel.excluir(objHot);
            JOptionPane.showMessageDialog(this, "Hotel excluído com sucesso!");
            limparCampos();
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Erro nos dados numéricos!");
        } catch (Exception ex){
            JOptionPane.showMessageDialog(this, "Erro ao tentar salvar o hotel: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        prepCon = new PreparaConexao ("FATEC_POO", "0311");
        prepCon.setConnectionString("oracle.jdbc.driver.OracleDriver");
        prepCon.setDriver("jdbc:oracle:thin:@192.168.1.6:1521:xe");
        daoHotel = new DaoHotel (prepCon.abrirConexao());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        prepCon.fecharConexao();
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblFaturamento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblValDiaria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtFaturamento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtValDiaria;
    // End of variables declaration//GEN-END:variables
    PreparaConexao prepCon;
    Hotel objHotel;
    DaoHotel daoHotel;
}