/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revendedora;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 7
 */
public class CadastroV extends javax.swing.JFrame {

    /**
     * Creates new form CadastroV
     */
    public CadastroV() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTmodelo = new javax.swing.JTextField();
        jTmarca = new javax.swing.JTextField();
        jTcor = new javax.swing.JTextField();
        jBcadastrar = new javax.swing.JButton();
        jBlimpar = new javax.swing.JButton();
        jBvoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTplaca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Modelo");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 50, 34, 14);

        jLabel3.setText("Marca");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 100, 29, 14);

        jLabel6.setText("Placa");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 150, 25, 14);

        jLabel8.setText("Cor");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 200, 17, 14);
        getContentPane().add(jTmodelo);
        jTmodelo.setBounds(10, 70, 246, 20);

        jTmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTmarcaActionPerformed(evt);
            }
        });
        getContentPane().add(jTmarca);
        jTmarca.setBounds(10, 120, 246, 20);
        getContentPane().add(jTcor);
        jTcor.setBounds(10, 220, 130, 20);

        jBcadastrar.setText("Cadastrar");
        jBcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBcadastrar);
        jBcadastrar.setBounds(200, 260, 81, 23);

        jBlimpar.setText("Limpar");
        jBlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimparActionPerformed(evt);
            }
        });
        getContentPane().add(jBlimpar);
        jBlimpar.setBounds(110, 260, 63, 23);

        jBvoltar.setText("Voltar");
        jBvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBvoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jBvoltar);
        jBvoltar.setBounds(10, 260, 61, 23);

        jLabel1.setText("CADASTRAR VEICULO QUE ESTÁ ENTRANDO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 20, 217, 14);
        getContentPane().add(jTplaca);
        jTplaca.setBounds(10, 170, 70, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTmarcaActionPerformed

    private void jBvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBvoltarActionPerformed
      Menu x = new Menu();
      x.setVisible(true);
      dispose();
    }//GEN-LAST:event_jBvoltarActionPerformed

    private void jBlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparActionPerformed
     Limpar();
    }//GEN-LAST:event_jBlimparActionPerformed

    private void jBcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcadastrarActionPerformed
       Cadastrar();
    }//GEN-LAST:event_jBcadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcadastrar;
    private javax.swing.JButton jBlimpar;
    private javax.swing.JButton jBvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTcor;
    private javax.swing.JTextField jTmarca;
    private javax.swing.JTextField jTmodelo;
    private javax.swing.JTextField jTplaca;
    // End of variables declaration//GEN-END:variables
private void Limpar(){
    jTcor.setText("");
    jTmodelo.setText("");    
    jTmarca.setText("");   
    jTplaca.setText("");
    jTmodelo.requestFocus();
}
private void Cadastrar(){
    String C, M, MA, A, P, S;
    C = jTcor.getText();
    M = jTmodelo.getText();  
    MA = jTmarca.getText();      
    P = jTplaca.getText();
    S = "Adentrou";
    
    //Pegamos os dados das caixas de textos e guardamos nas variaveis
    
    if(C.length()>=40 || C.length() <=0){
    //Estamos delimitando a quantidade de caracteres escritos no campo
        JOptionPane.showMessageDialog(null,"Cor obrigatorio, maximo de 40 caracteres");
        jTcor.requestFocus();
    }else if (M.length()>=40 || M.length() <=0){
        JOptionPane.showMessageDialog(null, "Modelo obrigatório, máximo de 40 caracteres");
    }else if (P.length()>7 || P.length()<7){
        JOptionPane.showMessageDialog(null, "Placa incorreta");
    }else if (MA.length()>=40 || MA.length()<=0) {
        JOptionPane.showMessageDialog(null,"Marca obrigatória, maximo de 40 caracteres");
    }else{
        String Comando = "insert into veiculo(modelo,marca,placa,cor,status) values"+"('"+M+"','"+MA+"','"+P+"','"+C+"','"+S+"');";
    
        
        try{
            Conexao x = new Conexao();
            x.inserir(Comando);
            x.sair();
        }catch(SQLException ex){
            Logger.getLogger(CadastroV.class.getName()).log(Level.SEVERE,null,ex);
        }
        JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso");
        Limpar();
      }

}
}
