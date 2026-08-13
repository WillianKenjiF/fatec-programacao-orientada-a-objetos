package fatec.poo.view;

import fatec.poo.model.Data;
import fatec.poo.model.Hotel;
import fatec.poo.model.Reserva;
import fatec.poo.control.PreparaConexao;
import fatec.poo.control.DaoHotel;
import fatec.poo.control.DaoReserva;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Willian Kenji
 */
public class GuiCadastroReservas extends javax.swing.JFrame {

    public GuiCadastroReservas() {
        initComponents();
        limparCampos();
    }
    
    DecimalFormat df = new DecimalFormat("#,##0.00");

    private void limparCampos() {
        txtCodHotel.setText("");
        txtNomeHotel.setText("");
        txtCodReserva.setText("");
        txtNomeHospede.setText("");
        txtDataEntrada.setText("");
        txtDataSaida.setText("");
        txtQtdeDiasHosped.setText("");
        txtValHosped.setText("");

        btnCheckIn.setEnabled(false);
        btnCheckOut.setEnabled(false);

        objHotel = null;
        objReserva = null;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHotel = new javax.swing.JLabel();
        lblReserva = new javax.swing.JLabel();
        txtCodHotel = new javax.swing.JTextField();
        txtCodReserva = new javax.swing.JTextField();
        txtNomeHotel = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblNomeHospede = new javax.swing.JLabel();
        lblDataEntrada = new javax.swing.JLabel();
        txtNomeHospede = new javax.swing.JTextField();
        txtDataEntrada = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblDataEntrada1 = new javax.swing.JLabel();
        txtDataSaida = new javax.swing.JTextField();
        lblDataEntrada2 = new javax.swing.JLabel();
        txtQtdeDiasHosped = new javax.swing.JTextField();
        lblDataEntrada3 = new javax.swing.JLabel();
        txtValHosped = new javax.swing.JTextField();
        btnConsultarHotel = new javax.swing.JButton();
        btnConsultarReserva = new javax.swing.JButton();
        btnCheckIn = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Reservas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblHotel.setText("Código Hotel");

        lblReserva.setText("Código Reserva");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Check In"));

        lblNomeHospede.setText("Nome Hóspede");

        lblDataEntrada.setText("Data Entrada (dd/mm/aaaa)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeHospede)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeHospede))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDataEntrada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 327, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeHospede)
                    .addComponent(txtNomeHospede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataEntrada)
                    .addComponent(txtDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Check Out"));

        lblDataEntrada1.setText("Data Saída (dd/mm/aaaa)");

        lblDataEntrada2.setText("Qtde. de Dias Hospedados");

        txtQtdeDiasHosped.setEditable(false);

        lblDataEntrada3.setText("Valor Hospedagem");

        txtValHosped.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDataEntrada1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(txtDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDataEntrada2)
                            .addComponent(lblDataEntrada3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQtdeDiasHosped, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValHosped, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)))
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataEntrada1)
                    .addComponent(txtDataSaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataEntrada2)
                    .addComponent(txtQtdeDiasHosped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataEntrada3)
                    .addComponent(txtValHosped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnConsultarHotel.setText("Consultar Hotel");
        btnConsultarHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarHotelActionPerformed(evt);
            }
        });

        btnConsultarReserva.setText("Consultar Reserva");
        btnConsultarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarReservaActionPerformed(evt);
            }
        });

        btnCheckIn.setText("Check In");
        btnCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInActionPerformed(evt);
            }
        });

        btnCheckOut.setText("Check Out");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
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
                        .addComponent(lblHotel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNomeHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblReserva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultarHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsultarReserva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHotel)
                    .addComponent(txtCodHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReserva)
                    .addComponent(txtCodReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarHotel)
                    .addComponent(btnConsultarReserva)
                    .addComponent(btnCheckIn)
                    .addComponent(btnCheckOut)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarHotelActionPerformed
        try {
            if (txtCodHotel.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, digite o código do hotel.");
                return;
            }

            int codigo = Integer.parseInt(txtCodHotel.getText().trim());
            objHotel = daoHotel.consultar(codigo);

            if (objHotel == null) {
                JOptionPane.showMessageDialog(this, "Hotel não encontrado! Cadastre o hotel antes de reservar.");
                txtNomeHotel.setText("");
                btnCheckIn.setEnabled(false);
            } else {
                txtNomeHotel.setText(objHotel.getNome());
                btnCheckIn.setEnabled(true);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "O código do hotel deve ser um número inteiro válido!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao consultar hotel: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnConsultarHotelActionPerformed

    private void btnConsultarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarReservaActionPerformed
        try {
            if (txtCodReserva.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, digite o código da reserva.");
                return;
            }

            int codigo = Integer.parseInt(txtCodReserva.getText().trim());
            objReserva = daoReserva.consultar(codigo);

            if (objReserva == null) {
                JOptionPane.showMessageDialog(this, "Reserva não encontrada!");
                btnCheckOut.setEnabled(false);
                return;
            }

            objHotel = objReserva.getHotel();
            txtCodHotel.setText(String.valueOf(objHotel.getCodigo()));
            txtNomeHotel.setText(objHotel.getNome());
            txtNomeHospede.setText(objReserva.getNomeHosp());
            txtDataEntrada.setText(objReserva.getDataEntrada().obterData());

            if (objReserva.getDataSaida() != null) {
                // Reserva já encerrada: mostra os dados finais e bloqueia novo check-out
                txtDataSaida.setText(objReserva.getDataSaida().obterData());
                txtQtdeDiasHosped.setText(String.valueOf(
                        objReserva.getDataSaida().subtrairDatas(objReserva.getDataEntrada())));
                txtValHosped.setText(df.format(objReserva.getValorHosped()));
                btnCheckOut.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Esta reserva já foi encerrada (check-out realizado).");
            } else {
                txtDataSaida.setText("");
                txtQtdeDiasHosped.setText("");
                txtValHosped.setText("");
                btnCheckOut.setEnabled(true);
            }
            btnCheckIn.setEnabled(false);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "O código da reserva deve ser um número inteiro válido!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro inesperado ao consultar reserva: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnConsultarReservaActionPerformed

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckInActionPerformed
        try {
            if (objHotel == null) {
                JOptionPane.showMessageDialog(this, "Consulte um hotel válido antes de fazer o check-in.");
                return;
            }
            if (txtCodReserva.getText().trim().isEmpty() ||
                txtNomeHospede.getText().trim().isEmpty() ||
                txtDataEntrada.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos obrigatórios do check-in.");
                return;
            }

            Data dataEntrada = converterTexto(txtDataEntrada.getText().trim());

            objReserva = new Reserva(Integer.parseInt(txtCodReserva.getText().trim()),
                                      txtNomeHospede.getText().trim(),
                                      dataEntrada);
            objReserva.setHotel(objHotel);

            daoReserva.inserir(objReserva);
            JOptionPane.showMessageDialog(this, "Check-in realizado com sucesso!");
            limparCampos();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Erro nos dados numéricos!");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao tentar registrar o check-in: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnCheckInActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOutActionPerformed
        try {
            if (objReserva == null) {
                JOptionPane.showMessageDialog(this, "Consulte uma reserva válida antes de fazer o check-out.");
                return;
            }
            if (txtDataSaida.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, informe a data de saída.");
                return;
            }

            Data dataSaida = converterTexto(txtDataSaida.getText().trim());

            double valor = objReserva.encerrarReserva(dataSaida);

            daoReserva.encerrar(objReserva);
            daoHotel.atualizarFaturamento(objHotel.getCodigo(), objHotel.getTotalFaturamento());

            txtQtdeDiasHosped.setText(String.valueOf(dataSaida.subtrairDatas(objReserva.getDataEntrada())));
            txtValHosped.setText(df.format(valor));

            JOptionPane.showMessageDialog(this, "Check-out realizado com sucesso! Valor da hospedagem: R$ " + df.format(valor));
            btnCheckOut.setEnabled(false);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erro ao tentar registrar o check-out: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnCheckOutActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        prepCon = new PreparaConexao("fatec_poo", "0311");
        prepCon.setDriver("oracle.jdbc.driver.OracleDriver");
        prepCon.setConnectionString("jdbc:oracle:thin:@127.0.0.1:1521:xe");
        daoHotel = new DaoHotel(prepCon.abrirConexao());
        daoReserva = new DaoReserva(prepCon.abrirConexao());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        prepCon.fecharConexao();
    }//GEN-LAST:event_formWindowClosed

    // Converte um texto no formato "dd/mm/aaaa" digitado pelo usuário em um objeto Data
    private Data converterTexto(String texto) {
        try {
            String[] partes = texto.split("/");
            if (partes.length != 3) {
                throw new IllegalArgumentException("Data inválida! Use o formato dd/mm/aaaa.");
            }
            int dia = Integer.parseInt(partes[0].trim());
            int mes = Integer.parseInt(partes[1].trim());
            int ano = Integer.parseInt(partes[2].trim());
            return new Data(dia, mes, ano);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException("Data inválida! Use o formato dd/mm/aaaa.");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckIn;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnConsultarHotel;
    private javax.swing.JButton btnConsultarReserva;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDataEntrada;
    private javax.swing.JLabel lblDataEntrada1;
    private javax.swing.JLabel lblDataEntrada2;
    private javax.swing.JLabel lblDataEntrada3;
    private javax.swing.JLabel lblHotel;
    private javax.swing.JLabel lblNomeHospede;
    private javax.swing.JLabel lblReserva;
    private javax.swing.JTextField txtCodHotel;
    private javax.swing.JTextField txtCodReserva;
    private javax.swing.JTextField txtDataEntrada;
    private javax.swing.JTextField txtDataSaida;
    private javax.swing.JTextField txtNomeHospede;
    private javax.swing.JTextField txtNomeHotel;
    private javax.swing.JTextField txtQtdeDiasHosped;
    private javax.swing.JTextField txtValHosped;
    // End of variables declaration//GEN-END:variables
    PreparaConexao prepCon;
    DaoHotel daoHotel;
    DaoReserva daoReserva;
    Hotel objHotel;
    Reserva objReserva;
}
