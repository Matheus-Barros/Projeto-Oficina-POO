/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import negocio.Cliente;
import persistencia.ClienteDAO;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import negocio.Utilitarios;


/**
 *
 * @author mathe
 */
import persistencia.IClienteDAO;
public class fmCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form fmCliente
     */
    public fmCliente() {
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

        label1 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        lbSexo = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        lbNome = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        lbData = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        lbAsNome = new javax.swing.JLabel();
        lbAsData = new javax.swing.JLabel();
        lbAsSexo = new javax.swing.JLabel();
        lbAsCpf = new javax.swing.JLabel();
        lbAsTelefone = new javax.swing.JLabel();
        lbAsEndereco = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cadastro Cliente");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/revisao-do-cliente.png"))); // NOI18N

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        label1.setText("Cadastro de Clientes");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/disquete.png"))); // NOI18N
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/saida.png"))); // NOI18N
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/dominio.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        lbTelefone.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbTelefone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ligar.png"))); // NOI18N
        lbTelefone.setText("Telefone:");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lbSexo.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbSexo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/genero.png"))); // NOI18N
        lbSexo.setText("Sexo:");

        rbMasculino.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbMasculino.setText("Masculino");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });

        rbFeminino.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbFeminino.setText("Feminino");
        rbFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemininoActionPerformed(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbNome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/nome.png"))); // NOI18N
        lbNome.setText("Nome:");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });

        lbData.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/encontro.png"))); // NOI18N
        lbData.setText("Data Nascimento:");

        lbEndereco.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbEndereco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/localizacao.png"))); // NOI18N
        lbEndereco.setText("Endereço:");

        lbCpf.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbCpf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/carteira-de-identidade.png"))); // NOI18N
        lbCpf.setText("Cpf:");

        txtEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbAsNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbAsNome.setForeground(new java.awt.Color(240, 240, 240,0));
        lbAsNome.setText("*");

        lbAsData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbAsData.setForeground(new java.awt.Color(240, 240, 240,0));
        lbAsData.setText("*");

        lbAsSexo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbAsSexo.setForeground(new java.awt.Color(240, 240, 240,0));
        lbAsSexo.setText("*");

        lbAsCpf.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbAsCpf.setForeground(new java.awt.Color(240, 240, 240,0));
        lbAsCpf.setText("*");

        lbAsTelefone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbAsTelefone.setForeground(new java.awt.Color(240, 240, 240,0));
        lbAsTelefone.setText("*");

        lbAsEndereco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbAsEndereco.setForeground(new java.awt.Color(240, 240, 240,0));
        lbAsEndereco.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAsNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbAsData, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbAsSexo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbAsCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbAsTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbAsEndereco, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbData)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbSexo)
                        .addGap(14, 14, 14)
                        .addComponent(rbMasculino)
                        .addGap(28, 28, 28)
                        .addComponent(rbFeminino))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbNome)
                        .addComponent(lbAsNome)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtData)
                    .addComponent(lbData)
                    .addComponent(lbAsData))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCpf)
                    .addComponent(lbAsCpf))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexo)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino)
                    .addComponent(lbAsSexo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTelefone)
                    .addComponent(lbAsTelefone))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbEndereco))
                    .addComponent(lbAsEndereco))
                .addGap(32, 32, 32))
        );

        btNovo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/lixeira.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btNovo)
                        .addGap(79, 79, 79)
                        .addComponent(jButton1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(btNovo))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        // TODO add your handling code here:
        rbFeminino.setSelected(false);
        
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void rbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemininoActionPerformed
        // TODO add your handling code here:
        rbMasculino.setSelected(false);
    }//GEN-LAST:event_rbFemininoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int resposta = 0;
        int valor = 1;
        
        //instrucao para campo vazio
        boolean radiof;
        boolean radiom;
        radiof =  rbFeminino.isSelected();
        radiom =  rbMasculino.isSelected();
        
        
        //Verifica se o nome está vazio
        if(txtNome.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(null, "Falha ao Salvar. Campo nome vazio.");
          lbNome.setForeground(Color.red);
          lbAsNome.setForeground(Color.red);
          resposta = 1;
        }
        //Verifica se a data de nascimento está vazio
        if(txtData.getText().equals("  /  /    ")){
          JOptionPane.showMessageDialog(null, "Falha ao Salvar. Campo data de nascimento vazio.");
          lbData.setForeground(Color.red);
          lbAsData.setForeground(Color.red);          
          resposta = 1;
        }  
        //Verifica se o cpf está vazio
        if(txtCpf.getText().equals("   .   .   -  ")){
          JOptionPane.showMessageDialog(null, "Falha ao Salvar. Campo cpf vazio.");
          lbCpf.setForeground(Color.red);
          lbAsCpf.setForeground(Color.red);          
          resposta = 1;
        }        
        
        if (radiom != true){
        resposta = 1;
            if(radiof == true){
            resposta = 0;
            }
        if(resposta == 1){
            JOptionPane.showMessageDialog(null, "Falha ao Salvar. Campo sexo masculino não selecionado");
            lbSexo.setForeground(Color.red);
            lbAsSexo.setForeground(Color.red);            
            }
        }

        if (radiof != true){
        resposta = 1;
            if(radiom == true){
            resposta = 0;
            }
        if(resposta == 1){
            JOptionPane.showMessageDialog(null, "Falha ao Salvar. Campo sexo feminino não selecionado.");
            lbSexo.setForeground(Color.red);
            lbAsSexo.setForeground(Color.red);     
            }
        }
        //Verifica se o telefone está vazio
        if(txtTelefone.getText().equals("(  )      -    ")){
          JOptionPane.showMessageDialog(null, "Falha ao Salvar. Campo telefone vazio.");
            lbTelefone.setForeground(Color.red);
            lbAsTelefone.setForeground(Color.red);           
          resposta = 1;
        }
        //Verifica se o endereço está vazio
        if(txtEndereco.getText().trim().isEmpty()){
          JOptionPane.showMessageDialog(null, "Falha ao Salvar. Campo endereço vazio.");
            lbEndereco.setForeground(Color.red);
            lbAsEndereco.setForeground(Color.red);       
          resposta = 1;
        }

        if (resposta == 0){ 
            valor =JOptionPane.showConfirmDialog(null, "Tem certeza que deseja salvar?","Sistema Oficina Mecânica",1);
        }
        if(valor==0){
            //Passando dados para o BD
            Cliente cliente = new Cliente();
            cliente.setNome(txtNome.getText());
            cliente.setCpf(txtCpf.getText());
            
            try{
            
                SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
                Calendar cal = Calendar.getInstance();
                cal.setTime(data.parse(txtData.getText()));
                cliente.setData_nascimento(cal);
                
            }   catch(ParseException e){
            
                System.out.println(e);
            }
            if(rbMasculino.isSelected())
                cliente.setSexo("M");
            else if(rbFeminino.isSelected())
                cliente.setSexo("F");
            
            cliente.setEndereco(txtEndereco.getText());
            cliente.setTelefone(txtTelefone.getText());
            

            IClienteDAO dao = new ClienteDAO();
            dao.adiciona(cliente);
            JOptionPane.showMessageDialog(null, "Os dados foram gravados.");
            //Colocando as cores normais para casos de erro
            lbNome.setForeground(Color.black);
            lbAsNome.setForeground(new Color(240, 240, 240, 0));
            lbData.setForeground(Color.black);
            lbAsData.setForeground(new Color(240, 240, 240, 0));     
            lbCpf.setForeground(Color.black);
            lbAsCpf.setForeground(new Color(240, 240, 240, 0));
            lbSexo.setForeground(Color.black);
            lbAsSexo.setForeground(new Color(240, 240, 240, 0));
            lbTelefone.setForeground(Color.black);
            lbAsTelefone.setForeground(new Color(240, 240, 240, 0));
            lbEndereco.setForeground(Color.black);
            lbAsEndereco.setForeground(new Color(240, 240, 240, 0));             
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        // TODO add your handling code here:
        
    //Limpando os dados
    txtNome.setText("");
    txtData.setText("");
    txtCpf.setText("");
    txtTelefone.setText("");
    txtEndereco.setText("");
    rbFeminino.setSelected(false);
    rbMasculino.setSelected(false);
    lbNome.setForeground(Color.black);
    lbAsNome.setForeground(new Color(240, 240, 240, 0));
    lbData.setForeground(Color.black);
    lbAsData.setForeground(new Color(240, 240, 240, 0));     
    lbCpf.setForeground(Color.black);
    lbAsCpf.setForeground(new Color(240, 240, 240, 0));
    lbSexo.setForeground(Color.black);
    lbAsSexo.setForeground(new Color(240, 240, 240, 0));
    lbTelefone.setForeground(Color.black);
    lbAsTelefone.setForeground(new Color(240, 240, 240, 0));
    lbEndereco.setForeground(Color.black);
    lbAsEndereco.setForeground(new Color(240, 240, 240, 0));   
    }//GEN-LAST:event_btNovoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNovo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private javax.swing.JLabel lbAsCpf;
    private javax.swing.JLabel lbAsData;
    private javax.swing.JLabel lbAsEndereco;
    private javax.swing.JLabel lbAsNome;
    private javax.swing.JLabel lbAsSexo;
    private javax.swing.JLabel lbAsTelefone;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables


}
