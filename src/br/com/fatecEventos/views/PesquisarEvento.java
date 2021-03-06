/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatecEventos.views;

import br.com.fatecEventos.connection.ConexaoBanco;
import br.com.fatecEventos.dao.EventoDAO;
import br.com.fatecEventos.model.Evento;
//import com.mysql.jdbc.Connection;
import java.sql.Connection;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author lucas
 */
public class PesquisarEvento extends javax.swing.JDialog {

    private ArrayList<Evento> evento = new ArrayList<>();
    private Connection con;
    private ConexaoBanco conexaoBanco = new ConexaoBanco();
    private EventoDAO eventoDAO = new EventoDAO();
    //private Evento eventos = new Evento();

    /**
     * Creates new form PesquisarEvento
     */
    public PesquisarEvento() throws SQLException, IOException {
        initComponents();
        setLocationRelativeTo(null);
        String path = new File(".").getCanonicalPath();
        String nf = path.replace("dist", "");
        String arqCam = nf + "\\src\\br\\com\\fatecEventos\\images\\icone_JFrame.png";
        ImageIcon icone = new ImageIcon(arqCam);
        setIconImage(icone.getImage());
        con = conexaoBanco.conexao();
        evento = eventoDAO.PesquisarComboBox(con, "SELECT * FROM tb_evento");
        atualizarTabela(evento);
        setResultados();
        this.setModal(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tEvento = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("fatecEventos 1.0");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fatecEventos/images/Botao_Cancelar.png"))); // NOI18N
        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tEvento.setModel(new javax.swing.table.DefaultTableModel(
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
        tEvento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tEventoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tEvento);

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PESQUISAR EVENTOS");
        jLabel1.setOpaque(true);

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fatecEventos/images/Botao_Salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
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
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tEventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tEventoMouseClicked
        if (tEvento.getSelectedRow() != -1) {
            btnSalvar.setEnabled(true);
        } else {
            btnSalvar.setEnabled(false);
        }
    }//GEN-LAST:event_tEventoMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int linha = 0;
        int coluna = 0;
        if (tEvento.getSelectedRow() != -1) {
            linha = tEvento.getSelectedRow();
            coluna = tEvento.getSelectedColumn();
            setValueChanged(linha, coluna);
            //chama método que verifica se os dados da linha selecionada foram modificados
        } else {
            JOptionPane.showMessageDialog(null, "Não selecionou");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int tecla = evt.getKeyCode();
        if (tecla == KeyEvent.VK_ESCAPE) {
            try {
                this.dispose();
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formKeyPressed

    public void setValueChanged(int rowIndex, int columnIndex) {
        String modelColuna = (String) tEvento.getColumnName(columnIndex).toString();
        String codigo = (String) tEvento.getValueAt(rowIndex, 0).toString();
        String valorLinhaColuna = (String) tEvento.getValueAt(rowIndex, columnIndex).toString();
        String nmVariavelBd = "";
        if (modelColuna.equals("Nome do Evento")) {
            nmVariavelBd = "nm_evento";
        } else if (modelColuna.equals("Data do Evento")) {
            nmVariavelBd = "dt_evento";
        } else if (modelColuna.equals("Codigo do Evento")) {
        }

        if (nmVariavelBd.equals("nm_evento")) {
            String sql = "UPDATE tb_evento SET " + nmVariavelBd + " = '" + valorLinhaColuna + "' WHERE id_evento = " + codigo;
            eventoDAO.UpdateDados(con, sql);
        } else if(nmVariavelBd.equals("dt_evento")) {
            String sql = "UPDATE tb_evento SET " + nmVariavelBd + " = '" + valorLinhaColuna + "' WHERE id_evento = " + codigo;
            eventoDAO.UpdateDados(con, sql);
        }
    }
    
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
            java.util.logging.Logger.getLogger(PesquisarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PesquisarEvento().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PesquisarEvento.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(PesquisarEvento.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tEvento;
    // End of variables declaration//GEN-END:variables

    private void atualizarTabela(ArrayList<Evento> evento) {
        tEvento.setModel(new javax.swing.table.DefaultTableModel(new Object[evento.size()][evento.size()], new String[]{
            "Codigo do Evento", "Nome do Evento", "Data do Evento"}));
    }

    private void setResultados() {
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        String novaData = formatador.format(data);
        int diaAtual = Integer.parseInt(novaData.substring(0, 2));
        int mesAtual = Integer.parseInt(novaData.substring(3, 5));
        int anoAtual = Integer.parseInt(novaData.substring(6, 10));

        TableCellRenderer tcr = new AlinharCentro();
        TableColumn column = tEvento.getColumnModel().getColumn(0);
        TableColumn column2 = tEvento.getColumnModel().getColumn(1);
        TableColumn column3 = tEvento.getColumnModel().getColumn(2);
        column.setCellRenderer(tcr);
        column2.setCellRenderer(tcr);
        column3.setCellRenderer(tcr);

        int cont = 0;
        while (evento.size() > cont) {
            tEvento.setGridColor(Color.black);
            int diaBanco = Integer.parseInt(evento.get(cont).getDataEvento().substring(0, 2));
            int mesBanco = Integer.parseInt(evento.get(cont).getDataEvento().substring(3, 5));
            int anoBanco = Integer.parseInt(evento.get(cont).getDataEvento().substring(6, 10));
            if (anoAtual >= anoBanco) {
                if (mesAtual < mesBanco) {
                    tEvento.setSelectionBackground(Color.white);
                } else if (mesAtual == mesBanco) {
                    if (diaAtual <= diaBanco) {
                        tEvento.setSelectionBackground(Color.white);
                    } else {
                        tEvento.setSelectionBackground(Color.blue);
                    }
                } else if (mesAtual > mesBanco) {
                    tEvento.setSelectionBackground(Color.blue);
                }
            }
            else {
                tEvento.setSelectionBackground(Color.blue);
            }
            tEvento.setValueAt(evento.get(cont).getCodigo(), cont, 0);
            tEvento.setValueAt(evento.get(cont).getNomeEvento(), cont, 1);
            tEvento.setValueAt(evento.get(cont).getDataEvento(), cont, 2);
            cont++;
        }
    }
}

class AlinharCentro extends DefaultTableCellRenderer {

    public AlinharCentro() {
        setHorizontalAlignment(CENTER); // ou LEFT, RIGHT, etc
    }
}
