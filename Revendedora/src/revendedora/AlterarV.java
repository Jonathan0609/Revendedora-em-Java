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
public class AlterarV extends javax.swing.JFrame {

    /**
     * Creates new form AlterarV
     */
    public AlterarV() {
        initComponents();
    }
    public AlterarV(int c){
        initComponents();
        jTcodigo.setText(String.valueOf(c));
        Buscar();}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTmodelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTmarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTcodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTplaca = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTcor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jBalterar = new javax.swing.JButton();
        jBlimpar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTstatus = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Modelo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 140, 34, 14);

        jTmodelo.setEnabled(false);
        getContentPane().add(jTmodelo);
        jTmodelo.setBounds(10, 160, 178, 20);

        jLabel2.setText("Marca");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 90, 29, 14);

        jTmarca.setEnabled(false);
        jTmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTmarcaActionPerformed(evt);
            }
        });
        getContentPane().add(jTmarca);
        jTmarca.setBounds(10, 110, 178, 20);

        jLabel4.setText("Código");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(240, 40, 33, 14);

        jTcodigo.setEnabled(false);
        jTcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcodigoActionPerformed(evt);
            }
        });
        getContentPane().add(jTcodigo);
        jTcodigo.setBounds(240, 110, 76, 20);

        jLabel5.setText("BUSCAR OU ALTERAR, TODOS DADO DO VEICULO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 10, 250, 14);

        jLabel7.setText("Placa");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 40, 42, 14);

        jTplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTplacaActionPerformed(evt);
            }
        });
        getContentPane().add(jTplaca);
        jTplaca.setBounds(10, 60, 178, 20);

        jLabel9.setText("Cor");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(240, 90, 17, 14);
        getContentPane().add(jTcor);
        jTcor.setBounds(240, 60, 76, 20);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 220, 61, 23);

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(90, 220, 65, 23);

        jBalterar.setText("Alterar");
        jBalterar.setEnabled(false);
        jBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarActionPerformed(evt);
            }
        });
        getContentPane().add(jBalterar);
        jBalterar.setBounds(170, 220, 65, 23);

        jBlimpar.setText("Limpar");
        jBlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimparActionPerformed(evt);
            }
        });
        getContentPane().add(jBlimpar);
        jBlimpar.setBounds(260, 220, 63, 23);

        jLabel3.setText("Status");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 140, 31, 14);

        jTstatus.setEnabled(false);
        getContentPane().add(jTstatus);
        jTstatus.setBounds(240, 160, 80, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcodigoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Menu x = new Menu();
      x.setVisible(true);
      dispose();
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      Buscar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparActionPerformed
     Limpar();
    }//GEN-LAST:event_jBlimparActionPerformed

    private void jBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarActionPerformed
      alterar();
    }//GEN-LAST:event_jBalterarActionPerformed

    private void jTplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTplacaActionPerformed

    private void jTmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTmarcaActionPerformed

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
            java.util.logging.Logger.getLogger(AlterarV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBalterar;
    private javax.swing.JButton jBlimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTcor;
    private javax.swing.JTextField jTmarca;
    private javax.swing.JTextField jTmodelo;
    private javax.swing.JTextField jTplaca;
    private javax.swing.JTextField jTstatus;
    // End of variables declaration//GEN-END:variables
private void Buscar(){
    String Comando = "";
    
    if (jTcodigo.getText().length()>0){
        Comando = "select * from veiculo where codv=" + jTcodigo.getText();
    } else if (jTplaca.getText().length()==7){ 
        Comando = "select * from veiculo where placa = '" + jTplaca.getText() + "'" ;}
    
    if (!Comando.equals("")){
        try{
            Conexao x = new Conexao();
            ResultSet rs;
            rs = x.consultar(Comando);
            
            if (rs.next()){
                jTmodelo.setText(rs.getString("modelo"));
                jTcodigo.setText(rs.getString("codv"));
                jTcor.setText(rs.getString("cor")); 
                jTmarca.setText(rs.getString("marca"));
                jTplaca.setText(rs.getString("placa"));
                jTstatus.setText(rs.getString("status"));
                jTmodelo.setEnabled(false); 
                jTcor.setEnabled(false); 
                jBalterar.setEnabled(true);
                jTmarca.setEnabled(false);
                jTcodigo.setEnabled(true);
                jTplaca.setEnabled(true);
                jTstatus.setEnabled(false);
                
                
            }else
                JOptionPane.showMessageDialog(null,"Veículo não cadastrado");
             
        }
        catch(SQLException ex){
            Logger.getLogger(AlterarV.class.getName()).log(Level.SEVERE,null,ex);
            
        }
    }else    
      JOptionPane.showMessageDialog(null,"Digite o código ou placa do Veículo");
}    

private void alterar(){
  String C, M, MA, A, P, Cod,S;
    C = jTcor.getText();
    M = jTmodelo.getText();
    MA = jTmarca.getText();
    P = jTplaca.getText();
    Cod = jTcodigo.getText();
    S = jTstatus.getText();
 
 String Comando = "update veiculo set modelo='"+M+"', cor='"+C+"',marca='"+MA+"', placa='"+P+"',status'"+S+"' where codv="+Cod;
 
 
    try{
      Conexao x = new Conexao();
      x.alterar(Comando);
      x.sair();
       JOptionPane.showMessageDialog(null,"Alterado com sucesso");
    }catch(SQLException ex){
            Logger.getLogger(AlterarV.class.getName()).log(Level.SEVERE,null,ex);
        }
}
private void Limpar(){
    jTcor.setText("");
    jTmodelo.setText("");
    jTmarca.setText("");  
    jTplaca.setText("");
    jTmodelo.requestFocus();
    jTmodelo.setEnabled(false); 
    jTcor.setEnabled(false); 
    jBalterar.setEnabled(false);
    jTmarca.setEnabled(false);   
    jTcodigo.setEnabled(true);
    jTplaca.setEnabled(true);
    jTcodigo.setText("");
}
}