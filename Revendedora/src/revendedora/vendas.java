/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revendedora;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 7
 */
public class vendas extends javax.swing.JFrame {

    /**
     * Creates new form vendas
     */
    public vendas() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTcodf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTnomef = new javax.swing.JTextField();
        jTcodc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTnomec = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jFTFcpfc = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTcodv = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTmodelo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTmarca = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTplaca = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTcor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jFTFdata = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        jTvalor = new javax.swing.JTextField();
        jBbuscarv = new javax.swing.JButton();
        jBvoltar = new javax.swing.JButton();
        jBlimpar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jBbuscarc = new javax.swing.JButton();
        jBbuscarf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Venda de Veículos");

        jLabel2.setText("Código do Funcionário");

        jLabel3.setText("Nome");

        jTnomef.setEnabled(false);

        jLabel4.setText("Cliente");

        jLabel5.setText("Código do Cliente");

        jLabel6.setText("Nome");

        jTnomec.setEnabled(false);

        jLabel7.setText("CPF");

        try {
            jFTFcpfc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFcpfc.setEnabled(false);

        jLabel8.setText("Veículo");

        jLabel9.setText("Funcionário");

        jLabel10.setText("Código do Veículo");

        jLabel11.setText("Modelo");

        jTmodelo.setEnabled(false);

        jLabel12.setText("Marca");

        jTmarca.setEnabled(false);

        jLabel13.setText("Placa");

        jTplaca.setEnabled(false);

        jLabel15.setText("Cor");

        jTcor.setEnabled(false);

        jLabel17.setText("Assinatura Cliente");

        jLabel18.setText("Assinatura Funcionário");

        jLabel16.setText("Data Venda");

        try {
            jFTFdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel19.setText("Valor");

        jTvalor.setEnabled(false);

        jBbuscarv.setText("Buscar");
        jBbuscarv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarvActionPerformed(evt);
            }
        });

        jBvoltar.setText("Voltar");
        jBvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvoltarActionPerformed(evt);
            }
        });

        jBlimpar.setText("Limpar");
        jBlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimparActionPerformed(evt);
            }
        });

        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBbuscarc.setText("Buscar");
        jBbuscarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarcActionPerformed(evt);
            }
        });

        jBbuscarf.setText("Buscar");
        jBbuscarf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTcodf, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTcodc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTcodv, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jBvoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBbuscarv, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jBlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jBbuscarc))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jBbuscarf)))
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)))
                            .addComponent(jLabel5)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTnomef)
                            .addComponent(jTnomec)
                            .addComponent(jFTFcpfc)
                            .addComponent(jTmodelo)
                            .addComponent(jTmarca)
                            .addComponent(jTplaca)
                            .addComponent(jTcor)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addGap(55, 55, 55)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jFTFdata, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jTvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel9)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTcodf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTnomef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jBbuscarf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTcodc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jTnomec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFTFcpfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscarc))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTcodv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jBbuscarv)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBvoltar)
                            .addComponent(jBlimpar))
                        .addGap(1, 1, 1)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTcor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jFTFdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)))
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvoltarActionPerformed
        Menu x = new Menu();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBvoltarActionPerformed

    private void jBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBlimparActionPerformed

    private void jBbuscarvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarvActionPerformed
        buscarv();
    }//GEN-LAST:event_jBbuscarvActionPerformed

    private void jBbuscarfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarfActionPerformed
        buscarf();
    }//GEN-LAST:event_jBbuscarfActionPerformed

    private void jBbuscarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarcActionPerformed
        buscarc();
    }//GEN-LAST:event_jBbuscarcActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        imprimir();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscarc;
    private javax.swing.JButton jBbuscarf;
    private javax.swing.JButton jBbuscarv;
    private javax.swing.JButton jBlimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jBvoltar;
    private javax.swing.JFormattedTextField jFTFcpfc;
    private javax.swing.JFormattedTextField jFTFdata;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTcodc;
    private javax.swing.JTextField jTcodf;
    private javax.swing.JTextField jTcodv;
    private javax.swing.JTextField jTcor;
    private javax.swing.JTextField jTmarca;
    private javax.swing.JTextField jTmodelo;
    private javax.swing.JTextField jTnomec;
    private javax.swing.JTextField jTnomef;
    private javax.swing.JTextField jTplaca;
    private javax.swing.JTextField jTvalor;
    // End of variables declaration//GEN-END:variables

  private void imprimir(){
      String nf,nc,cpfc,m,ma,c,d,v,p,s,codv;
      nf = jTnomef.getText();
      nc = jTnomec.getText();
      cpfc = jFTFcpfc.getText();
      d = jFTFdata.getText();
      m = jTmodelo.getText();
      ma = jTmarca.getText();
      c = jTcor.getText();
      v = jTvalor.getText();
      p = jTplaca.getText();
      s = "Vendido";
      codv = jTcodv.getText();
     
      if (d.equals("  /  /  ")){
        JOptionPane.showMessageDialog(null, "Informe uma Data");
         jFTFdata.requestFocus();
      }else{
        String Comando = "insert into vendass(nomef,nomec,cpfc,modelo,marca,cor,placa,valor,data) values"+"('"+nf+"','"+nc+"','"+cpfc+"','"+m+"','"+ma+"','"+c+"','"+p+"',"+v+",'"+d+"');";
        String Comando1 = "update veiculo set = '"+s+"' where codv="+codv;
        
        try{
            Conexao x = new Conexao();
            x.inserir(Comando);
            x.sair();
            
            Conexao y = new Conexao();
            y.alterar(Comando1);
            y.sair();
            
        }catch(SQLException ex){
            Logger.getLogger(vendas.class.getName()).log(Level.SEVERE,null,ex);
        }
        JOptionPane.showMessageDialog(null, "Venda Cadastrada com sucesso");
        limpar();
      }

       
  }

  private void limpar(){
    jTcor.setText("");
    jTplaca.setText("");
    jTmodelo.setText("");
    jTvalor.setText("");
    jTmarca.setText("");
    jTcodv.setText("");
    jTnomef.setText("");
    jTcodf.setText("");
    jTcodc.setText("");
    jTnomec.setText("");
    jFTFcpfc.setText("");
    jFTFdata.setText("");
    jTcodf.requestFocus();
    jTcor.setEnabled(false);
    jTplaca.setEnabled(false);
    jTmodelo.setEnabled(false);
    jTvalor.setEnabled(false);
    jTmarca.setEnabled(false);
    jTcodv.setEnabled(true);
    jTnomef.setEnabled(false);
    jTcodf.setEnabled(true);
    jTcodc.setEnabled(true);
    jTnomec.setEnabled(false);
    jFTFcpfc.setEnabled(false);         
  
 }
   private void buscarv(){
    
    String Comando3 = "";
      
    if (jTcodv.getText().length() > 0){ 
        Comando3= "select modelo, marca, valor, placa, cor from veiculo where codv=" + jTcodv.getText();}
    
    if (!Comando3.equals("")){
        try{
            Conexao x = new Conexao();
            ResultSet rs;
            rs = x.consultar(Comando3);
            
            if (rs.next()){
                jTmodelo.setText(rs.getString("modelo"));
                jTcodv.setText(rs.getString("codv"));                
                jTmarca.setText(rs.getString("marca"));
                jTplaca.setText(rs.getString("placa"));
                jTcor.setText(rs.getString("cor"));
                jTvalor.setText(rs.getString("valor"));
                jTcodv.setEnabled(false);
                
            }else
                JOptionPane.showMessageDialog(null,"Veículo não cadastrado");
             
        }
        catch(SQLException ex){
            Logger.getLogger(vendas.class.getName()).log(Level.SEVERE,null,ex);
            
        }
    }else    
      JOptionPane.showMessageDialog(null,"Digite o código do veículo");
}

   private void buscarf(){
       String Comando1 = ""; 
       
    if (jTcodf.getText().length()>0){
        Comando1 = "select nome from funcionario where cod =" + jTcodf.getText();
    } 
    if (!Comando1.equals("")){
        try{
            Conexao x = new Conexao();
            ResultSet rs;
            rs = x.consultar(Comando1);
            
            if (rs.next()){
                jTcodf.setText(rs.getString("cod"));
                jTnomef.setText(rs.getString("nome"));                
                jTcodf.setEnabled(false);
                
            }else
                JOptionPane.showMessageDialog(null,"Funcionário não cadastrado");
             
        }
        catch(SQLException ex){
            Logger.getLogger(vendas.class.getName()).log(Level.SEVERE,null,ex);
            
        }
    }else    
      JOptionPane.showMessageDialog(null,"Digite o código do Funcionário");
   }
   
   private void buscarc(){
     String Comando2 = "";
    
    if (jTcodc.getText().length() > 0){ 
        Comando2 = "select nome, cpf from clientes where codc=" +jTcodc.getText(); 
    }
    if (!Comando2.equals("")){
        try{
            Conexao x = new Conexao();
            ResultSet rs;
            rs = x.consultar(Comando2);
            
            if (rs.next()){
                jTnomec.setText(rs.getString("nome"));
                jTcodc.setText(rs.getString("codc"));
                jFTFcpfc.setText(rs.getString("cpf"));
                jTcodc.setEnabled(false);
                
            }else
                JOptionPane.showMessageDialog(null,"Cliente não cadastrado");
             
        }
        catch(SQLException ex){
            Logger.getLogger(vendas.class.getName()).log(Level.SEVERE,null,ex);
            
        }
    }else    
      JOptionPane.showMessageDialog(null,"Digite o código do cliente");
}
}



  
