/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.sp.senac.d154.lojacalcados;

import br.sp.senac.d154.lojacalcados.dao.ClienteDAO;
import br.sp.senac.d154.lojacalcados.dao.VendasDAO;
import br.sp.senac.d154.lojacalcados.dao.ProdutoDAO;
import br.sp.senac.d154.lojacalcados.models.CadasatroCliente;
import br.sp.senac.d154.lojacalcados.models.CadastroProduto;
import br.sp.senac.d154.lojacalcados.models.Vendas;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.Validador;

/**
 *
 * @author junin
 */
public class TelaVendas extends javax.swing.JFrame {

    /**
     * Creates new form TelaVendas
     */
    public TelaVendas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        lblCliente = new javax.swing.JLabel();
        ftxtCliente = new javax.swing.JFormattedTextField();
        lblCodigoP = new javax.swing.JLabel();
        lblNomeCliente = new javax.swing.JLabel();
        lblNomeP = new javax.swing.JLabel();
        lblUnidade = new javax.swing.JLabel();
        btnFinalizar = new javax.swing.JButton();
        lblTamanho = new javax.swing.JLabel();
        btnApagar = new javax.swing.JButton();
        btnDetalhesVenda = new javax.swing.JButton();
        cbotamanho = new javax.swing.JComboBox<>();
        btnCarrinho = new javax.swing.JButton();
        lblVlrTt = new javax.swing.JLabel();
        lblpreço = new javax.swing.JLabel();
        txtbuscap = new javax.swing.JTextField();
        btnBuscarProduto = new javax.swing.JButton();
        lblNomeCliente1 = new javax.swing.JLabel();
        lblNomeCLi = new javax.swing.JLabel();
        lblbuscap = new javax.swing.JLabel();
        lblpreco = new javax.swing.JLabel();
        txtquantidade = new javax.swing.JTextField();
        lblValorTotal = new javax.swing.JLabel();
        txtNomeproduto = new javax.swing.JTextField();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mnuVendas = new javax.swing.JMenuItem();
        mnuCadastrar = new javax.swing.JMenuItem();
        mnuCliente = new javax.swing.JMenuItem();
        mnuRelatorio = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("Vendas");

        tbProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome do Produto", "Qtde", "Valor Unitario"
            }
        ));
        jScrollPane1.setViewportView(tbProdutos);

        lblCliente.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblCliente.setText("CPF Cliente");

        try {
            ftxtCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ftxtClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ftxtClienteFocusLost(evt);
            }
        });
        ftxtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtClienteActionPerformed(evt);
            }
        });

        lblCodigoP.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblCodigoP.setText("Codigo do Produto");

        lblNomeCliente.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblNomeCliente.setText("Nome do Cliente");

        lblNomeP.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblNomeP.setText("Nome do Produto");

        lblUnidade.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblUnidade.setText("Quantidade");

        btnFinalizar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        lblTamanho.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblTamanho.setText("Tamanhos");

        btnApagar.setBackground(new java.awt.Color(241, 38, 38));
        btnApagar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lixeira.png"))); // NOI18N
        btnApagar.setText("Apagar Produto");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnDetalhesVenda.setBackground(new java.awt.Color(246, 86, 86));
        btnDetalhesVenda.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnDetalhesVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lupa.png"))); // NOI18N
        btnDetalhesVenda.setText("Detalhes");
        btnDetalhesVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesVendaActionPerformed(evt);
            }
        });

        cbotamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43" }));
        cbotamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotamanhoActionPerformed(evt);
            }
        });

        btnCarrinho.setBackground(new java.awt.Color(51, 51, 255));
        btnCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Carrinho.png"))); // NOI18N
        btnCarrinho.setText("Adicionar no Carrinho");
        btnCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrinhoActionPerformed(evt);
            }
        });

        lblVlrTt.setText("Valor Total");

        lblpreço.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblpreço.setText("Preço");

        txtbuscap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscapActionPerformed(evt);
            }
        });

        btnBuscarProduto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnBuscarProduto.setText("Buscar Produto");
        btnBuscarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProdutoActionPerformed(evt);
            }
        });

        lblNomeCliente1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblNomeCliente1.setText("Data da Compra");

        lblNomeCLi.setText("NOME");

        lblbuscap.setText("0");

        lblpreco.setText("0");

        lblValorTotal.setText("0");

        txtNomeproduto.setEditable(false);

        jMenu2.setText("Vendas");

        mnuVendas.setText("Produtos");
        mnuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVendasActionPerformed(evt);
            }
        });
        jMenu2.add(mnuVendas);

        mnuCadastrar.setText("Cadastrar");
        mnuCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastrarActionPerformed(evt);
            }
        });
        jMenu2.add(mnuCadastrar);

        mnuCliente.setText("Cliente");
        mnuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuClienteActionPerformed(evt);
            }
        });
        jMenu2.add(mnuCliente);

        mnuRelatorio.setText("Relatorio");
        mnuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRelatorioActionPerformed(evt);
            }
        });
        jMenu2.add(mnuRelatorio);

        jMenuItem3.setText("Cadastro Produto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVlrTt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(163, 163, 163))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDetalhesVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblCliente)
                                .addComponent(lblCodigoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblbuscap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ftxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(lblNomeP))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtNomeproduto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(32, 32, 32)
                                        .addComponent(cbotamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(186, 186, 186)
                                        .addComponent(lblTamanho)))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 2, Short.MAX_VALUE)
                                        .addComponent(lblUnidade))
                                    .addComponent(txtquantidade))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblpreço)
                                    .addComponent(lblpreco, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(366, 366, 366))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblNomeCLi, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtbuscap, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscarProduto))
                                    .addComponent(lblNomeCliente))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeCliente1)
                                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeCliente)
                            .addComponent(lblNomeCliente1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtbuscap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscarProduto)
                        .addComponent(lblNomeCLi))
                    .addComponent(ftxtCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblpreço, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCodigoP)
                                .addComponent(lblNomeP)
                                .addComponent(lblTamanho)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbotamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblbuscap)
                                    .addComponent(lblpreco)
                                    .addComponent(txtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeproduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btnCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDetalhesVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(71, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblVlrTt)
                            .addComponent(lblValorTotal))
                        .addGap(123, 123, 123))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        
       // String cpfcliente = ftxtCliente.getText();
        String nomedoproduto= txtNomeproduto.getText();
        
        String quantidadeproduto = txtquantidade.getText();
        
        Date data =jDateChooser2.getDate();
        if (data == null) {
        JOptionPane.showMessageDialog(rootPane, "Selecione uma data antes de finalizar a venda.");
        return;  
        } 
        Vendas Vendas = new Vendas(nomedoproduto, quantidadeproduto, ABORT, data);
        
         boolean retorno = VendasDAO.salvar(Vendas);
            double valorTotal = calcularTotalCompra();
            
         if(retorno == true){
                JOptionPane.showMessageDialog(rootPane, "Sucesso!");
            }else{
                JOptionPane.showMessageDialog(rootPane, "Falha!");
            }
         
            lblbuscap.setText("");
            txtNomeproduto.setText("");
            cbotamanho.setSelectedIndex(0);
            txtquantidade.setText("");
            lblpreco.setText("");
            
       
    }//GEN-LAST:event_btnFinalizarActionPerformed


private double calcularTotalCompra() {
    double totalCompra = 0.0;
    DefaultTableModel model = (DefaultTableModel) tbProdutos.getModel();

    for (int linha = 0; linha < model.getRowCount(); linha++) {
        Object valorQuantidade = model.getValueAt(linha, 2);
        Object valorUnitario = model.getValueAt(linha, 3);

        if (valorQuantidade instanceof Number && valorUnitario instanceof Number) {
            int quantidade = ((Number) valorQuantidade).intValue();
            double valorUnitarioDouble = ((Number) valorUnitario).doubleValue();

            totalCompra += quantidade * valorUnitarioDouble;
        } else {
            try {
                int quantidade = Integer.parseInt(valorQuantidade.toString());
                double valorUnitarioDouble = Double.parseDouble(valorUnitario.toString());

                totalCompra += quantidade * valorUnitarioDouble;
            } catch (NumberFormatException e) {
                System.out.println("Erro ao converter valores para números.");
            }
        }
    }

    return totalCompra;
}
    private void btnDetalhesVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesVendaActionPerformed

          int linhaSelecionada = tbProdutos.getSelectedRow();
        
        if(linhaSelecionada >=0){
            //Exibos os detalhes da linha
            JOptionPane.showMessageDialog(rootPane, "Dados do Item: \n" +
                                            tbProdutos.getValueAt(linhaSelecionada, 0) + "\n" +
                                            tbProdutos.getValueAt(linhaSelecionada, 1) + "\n" +
                                            tbProdutos.getValueAt(linhaSelecionada, 2) + "\n" +
                                            tbProdutos.getValueAt(linhaSelecionada, 3) + "\n" +
                                            tbProdutos.getValueAt(linhaSelecionada, 4)      
                                        );
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha!");
        }
        
    }//GEN-LAST:event_btnDetalhesVendaActionPerformed

    private void mnuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVendasActionPerformed
        TelaProduto TProduto= new TelaProduto();
        TProduto.setVisible(true);
    }//GEN-LAST:event_mnuVendasActionPerformed

    private void mnuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastrarActionPerformed
TelaCadastroClientes cadCliente= new TelaCadastroClientes();
cadCliente.setVisible(true);
    }//GEN-LAST:event_mnuCadastrarActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
 int linhaSelecionada = tbProdutos.getSelectedRow();
DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();

if (linhaSelecionada >= 0) {
    // Obtém os dados da linha selecionada
    String codigoProduto = modelo.getValueAt(linhaSelecionada, 0).toString();
    String quantidadeString = modelo.getValueAt(linhaSelecionada, 2).toString();

    // Converte a quantidade para inteiro
    int quantidadeDevolver = Integer.parseInt(quantidadeString);

    // Devolve a quantidade ao estoque
    int idProduto = Integer.parseInt(codigoProduto);
    ProdutoDAO.atualizarEstoque(idProduto, quantidadeDevolver);

    // Remove a linha da tabela
    modelo.removeRow(linhaSelecionada);

    // Recalcula o valor total
    double totalCompra = calcularTotalCompra();
    lblValorTotal.setText(String.valueOf(totalCompra));
} else {
    JOptionPane.showMessageDialog(rootPane, "Selecione uma linha para remover.");
}
    }//GEN-LAST:event_btnApagarActionPerformed

    private void mnuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuClienteActionPerformed
        TelaClientes TClientes= new TelaClientes();
        TClientes.setVisible(true);
    }//GEN-LAST:event_mnuClienteActionPerformed

    private void mnuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRelatorioActionPerformed
    TelaRelatorio TRelatorio= new TelaRelatorio();
    TRelatorio.setVisible(true);
    }//GEN-LAST:event_mnuRelatorioActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    TelaCadastroProduto TCadProduto= new TelaCadastroProduto();
    TCadProduto.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrinhoActionPerformed
String cpftrocs = ftxtCliente.getText();
String nomec = lblNomeCLi.getText();
String codigoc = lblbuscap.getText();
String nomep = txtNomeproduto.getText();
String tam = cbotamanho.getSelectedItem().toString();
String uni = txtquantidade.getText();
double preco = Double.parseDouble(lblpreco.getText());

if (cpftrocs.isEmpty() || codigoc.isEmpty() || nomep.isEmpty() || tam.isEmpty() || uni.isEmpty()) {
    JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos obrigatórios antes de adicionar ao carrinho.");
} else if (cpftrocs.trim().isEmpty()) {
    JOptionPane.showMessageDialog(rootPane, "Insira um CPF.");
} else {
    Validador objValidador = new Validador();
    objValidador.ValidarTexto(ftxtCliente);

    if (objValidador.hasErro()) {
        JOptionPane.showMessageDialog(rootPane, objValidador.getMensagensErro());
    } else if (Integer.parseInt(uni) <= 0) {
        JOptionPane.showMessageDialog(rootPane, "A quantidade deve ser maior que zero.");
    } else {
        // Verifica se o CPF está cadastrado na DAO
        if (!ClienteDAO.cpfExiste(cpftrocs)) {
            JOptionPane.showMessageDialog(rootPane, "Insira um CPF válido.");
        } else {
            DefaultTableModel modelos = (DefaultTableModel) tbProdutos.getModel();

            modelos.addRow(new String[]{
                    codigoc,
                    nomep,
                    uni,
                    String.valueOf(preco)
            });
            
            int idProduto = Integer.parseInt(codigoc);
            int quantidadeRetirar = Integer.parseInt(uni);
            ProdutoDAO.atualizarQuantidadeEstoque(idProduto, quantidadeRetirar);

            double totalCompra = calcularTotalCompra();
            lblValorTotal.setText(String.valueOf(totalCompra));

            // Limpa os campos após adicionar ao carrinho
            lblbuscap.setText("");
            txtNomeproduto.setText("");
            cbotamanho.setSelectedIndex(0);
            txtquantidade.setText("");
            lblpreco.setText("");
        }
    }

}        
    }//GEN-LAST:event_btnCarrinhoActionPerformed
private boolean carrinhoEmUso() {
    return tbProdutos.getRowCount() > 0;
}
    private void btnBuscarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProdutoActionPerformed
if (txtbuscap.getText().trim().equals("")) {
    
    JOptionPane.showMessageDialog(rootPane, "Digite o Codigo do Produto");
    
    } else {
        int numeroBuscar = Integer.parseInt(txtbuscap.getText());
        ArrayList<CadastroProduto> listaRetorno = ProdutoDAO.buscarPorNumero(numeroBuscar);

        if (!listaRetorno.isEmpty()) {
            // Supondo que você tenha um único resultado, caso contrário, ajuste conforme necessário
            CadastroProduto produtoEncontrado = listaRetorno.get(0);

            // Preencher os campos de texto com os resultados
            lblbuscap.setText(String.valueOf(produtoEncontrado.getCodigoP()));
            txtNomeproduto.setText(produtoEncontrado.getNomeproduto());
            cbotamanho.setSelectedItem(produtoEncontrado.getTamanho());
            txtquantidade.setText(String.valueOf(produtoEncontrado.getQuantidade()));
            lblpreco.setText(String.valueOf(produtoEncontrado.getPreco()));
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado.");
        }
    }

    }//GEN-LAST:event_btnBuscarProdutoActionPerformed

    private void cbotamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbotamanhoActionPerformed

    private void txtbuscapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscapActionPerformed
        txtbuscap.setBackground(Color.decode("#D3D3D3"));
    }//GEN-LAST:event_txtbuscapActionPerformed

    private void ftxtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtClienteActionPerformed

    private void ftxtClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxtClienteFocusLost
       String cpfCliente = ftxtCliente.getText();
     if (cpfCliente.isEmpty()) {
    // Caso o CPF esteja vazio, exiba uma mensagem
    JOptionPane.showMessageDialog(rootPane, "Por favor, insira um CPF.");
    // Limpa os campos relacionados ao cliente
    lblNomeCLi.setText("");
    // Outras operações relacionadas ao cliente, se necessário...
    } else {
    // Verifica se o CPF está cadastrado na DAO
    if (!ClienteDAO.cpfExiste(cpfCliente)) {
        lblNomeCLi.setText("");
        JOptionPane.showMessageDialog(rootPane, "CPF não cadastrado. Insira um CPF válido.");
         
        // Outras operações relacionadas ao cliente, se necessário...
    } else {
        // Caso o CPF exista, busca os dados do cliente
        CadasatroCliente retorno = ClienteDAO.buscarPorCPF(cpfCliente);
        
        lblNomeCLi.setText(retorno.getNome());
        // Outras operações relacionadas ao cliente, se necessário...
    }
}
    }//GEN-LAST:event_ftxtClienteFocusLost

    private void ftxtClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ftxtClienteFocusGained
        ftxtCliente.setBackground(Color.decode("#D3D3D3"));
    }//GEN-LAST:event_ftxtClienteFocusGained

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
jDateChooser2.requestFocusInWindow();
    }//GEN-LAST:event_formWindowActivated

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
                if ("Windows 11".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnCarrinho;
    private javax.swing.JButton btnDetalhesVenda;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JComboBox<String> cbotamanho;
    private javax.swing.JFormattedTextField ftxtCliente;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCodigoP;
    private javax.swing.JLabel lblNomeCLi;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblNomeCliente1;
    private javax.swing.JLabel lblNomeP;
    private javax.swing.JLabel lblTamanho;
    private javax.swing.JLabel lblUnidade;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JLabel lblVlrTt;
    private javax.swing.JLabel lblbuscap;
    private javax.swing.JLabel lblpreco;
    private javax.swing.JLabel lblpreço;
    private javax.swing.JMenuItem mnuCadastrar;
    private javax.swing.JMenuItem mnuCliente;
    private javax.swing.JMenuItem mnuRelatorio;
    private javax.swing.JMenuItem mnuVendas;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField txtNomeproduto;
    private javax.swing.JTextField txtbuscap;
    private javax.swing.JTextField txtquantidade;
    // End of variables declaration//GEN-END:variables
}