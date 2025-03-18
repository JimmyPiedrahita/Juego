package vista;
import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import modelo.Jugador;
public class Ventana extends javax.swing.JFrame {
    LineBorder borde;
    ImageIcon img_piedra,img_papel,img_tijera,img_piedra_maquina,img_papel_maquina,img_tijera_maquina;
    int[] eleccion_maquina = {1,2,3};
    int n2,cE,cVm,cDm,cDj,cVj;
    Jugador jugador = new Jugador();
    public Ventana() {
        System.out.println("Hola mundo");
        borde = new LineBorder(Color.RED,4,true);
        img_piedra = new ImageIcon("src/img/piedra.png");
        img_papel = new ImageIcon("src/img/papel.png");
        img_tijera = new ImageIcon("src/img/tijera.png");
        img_papel_maquina = new ImageIcon("src/img/papel_maquina.png");
        img_piedra_maquina = new ImageIcon("src/img/piedra_maquina.png");
        img_tijera_maquina = new ImageIcon("src/img/tijera_maquina.png");
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_play = new javax.swing.JPanel();
        btn_play_ = new javax.swing.JButton();
        eleccion_papel_ = new javax.swing.JLabel();
        eleccion_piedra_ = new javax.swing.JLabel();
        eleccion_tijera_ = new javax.swing.JLabel();
        Maquina = new javax.swing.JLabel();
        Jugador = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Victorias = new javax.swing.JLabel();
        Victorias1 = new javax.swing.JLabel();
        Victorias2 = new javax.swing.JLabel();
        lbl_derrota_jugador = new javax.swing.JLabel();
        lbl_victoria_jugador = new javax.swing.JLabel();
        lbl_empate_jugador = new javax.swing.JLabel();
        Victorias3 = new javax.swing.JLabel();
        Victorias4 = new javax.swing.JLabel();
        Victorias5 = new javax.swing.JLabel();
        lbl_derrota_maquina = new javax.swing.JLabel();
        lbl_victoria_maquina = new javax.swing.JLabel();
        lbl_empate_maquina = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(866, 628));
        setMinimumSize(new java.awt.Dimension(866, 628));
        setSize(new java.awt.Dimension(866, 628));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(866, 628));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_play.setBackground(new java.awt.Color(0, 0, 0));

        btn_play_.setBackground(new java.awt.Color(0, 204, 51));
        btn_play_.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_play_.setForeground(new java.awt.Color(255, 255, 255));
        btn_play_.setText("PLAY");
        btn_play_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_play_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_playLayout = new javax.swing.GroupLayout(panel_play);
        panel_play.setLayout(panel_playLayout);
        panel_playLayout.setHorizontalGroup(
            panel_playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_playLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(btn_play_)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        panel_playLayout.setVerticalGroup(
            panel_playLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_playLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btn_play_)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel1.add(panel_play, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 430, 180));

        eleccion_papel_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/papel.png"))); // NOI18N
        eleccion_papel_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eleccion_papel_MouseClicked(evt);
            }
        });
        jPanel1.add(eleccion_papel_, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 441, -1, -1));

        eleccion_piedra_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/piedra.png"))); // NOI18N
        eleccion_piedra_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eleccion_piedra_MouseClicked(evt);
            }
        });
        jPanel1.add(eleccion_piedra_, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 441, -1, -1));

        eleccion_tijera_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tijera.png"))); // NOI18N
        eleccion_tijera_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eleccion_tijera_MouseClicked(evt);
            }
        });
        jPanel1.add(eleccion_tijera_, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 441, -1, -1));

        Maquina.setBackground(new java.awt.Color(102, 102, 102));
        Maquina.setOpaque(true);
        jPanel1.add(Maquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 100, 100));

        Jugador.setBackground(new java.awt.Color(102, 102, 102));
        Jugador.setOpaque(true);
        jPanel1.add(Jugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(653, 214, 100, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Maquina");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 148, 40));

        Victorias.setForeground(new java.awt.Color(255, 255, 255));
        Victorias.setText("Derrotas");
        jPanel1.add(Victorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, -1, -1));

        Victorias1.setForeground(new java.awt.Color(255, 255, 255));
        Victorias1.setText("Victorias");
        jPanel1.add(Victorias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, -1, -1));

        Victorias2.setForeground(new java.awt.Color(255, 255, 255));
        Victorias2.setText("Empates");
        jPanel1.add(Victorias2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, -1, -1));

        lbl_derrota_jugador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_derrota_jugador.setForeground(new java.awt.Color(255, 0, 0));
        lbl_derrota_jugador.setText("0");
        jPanel1.add(lbl_derrota_jugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, -1, -1));

        lbl_victoria_jugador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_victoria_jugador.setForeground(new java.awt.Color(0, 255, 0));
        lbl_victoria_jugador.setText("0");
        jPanel1.add(lbl_victoria_jugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, -1, -1));

        lbl_empate_jugador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_empate_jugador.setForeground(new java.awt.Color(255, 255, 255));
        lbl_empate_jugador.setText("0");
        jPanel1.add(lbl_empate_jugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, -1, -1));

        Victorias3.setForeground(new java.awt.Color(255, 255, 255));
        Victorias3.setText("Derrotas");
        jPanel1.add(Victorias3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        Victorias4.setForeground(new java.awt.Color(255, 255, 255));
        Victorias4.setText("Victorias");
        jPanel1.add(Victorias4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        Victorias5.setForeground(new java.awt.Color(255, 255, 255));
        Victorias5.setText("Empates");
        jPanel1.add(Victorias5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        lbl_derrota_maquina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_derrota_maquina.setForeground(new java.awt.Color(255, 0, 0));
        lbl_derrota_maquina.setText("0");
        jPanel1.add(lbl_derrota_maquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        lbl_victoria_maquina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_victoria_maquina.setForeground(new java.awt.Color(0, 255, 0));
        lbl_victoria_maquina.setText("0");
        jPanel1.add(lbl_victoria_maquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        lbl_empate_maquina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_empate_maquina.setForeground(new java.awt.Color(255, 255, 255));
        lbl_empate_maquina.setText("0");
        jPanel1.add(lbl_empate_maquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("VS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 214, 148, 100));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Jugador");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 148, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 866, 628));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void eleccion_tijera_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eleccion_tijera_MouseClicked
        eleccion_tijera_.setBorder(borde);
        eleccion_papel_.setBorder(null);
        eleccion_piedra_.setBorder(null);
        Jugador.setIcon(img_tijera);
        int n1 = eleccionMaquina();
        n2 = 3;
        resultado(n2,n1);
    }//GEN-LAST:event_eleccion_tijera_MouseClicked
    private void eleccion_piedra_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eleccion_piedra_MouseClicked
        eleccion_tijera_.setBorder(null);
        eleccion_papel_.setBorder(null);
        eleccion_piedra_.setBorder(borde);
        Jugador.setIcon(img_piedra);
        int n1 = eleccionMaquina();
        n2 = 1;
        resultado(n2,n1);
    }//GEN-LAST:event_eleccion_piedra_MouseClicked
    private void eleccion_papel_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eleccion_papel_MouseClicked
        eleccion_tijera_.setBorder(null);
        eleccion_papel_.setBorder(borde);
        eleccion_piedra_.setBorder(null);
        Jugador.setIcon(img_papel);
        int n1 = eleccionMaquina();
        n2 = 2;
        resultado(n2,n1);
    }//GEN-LAST:event_eleccion_papel_MouseClicked
    private void btn_play_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_play_ActionPerformed
        panel_play.setVisible(false);
    }//GEN-LAST:event_btn_play_ActionPerformed
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ventana().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jugador;
    private javax.swing.JLabel Maquina;
    private javax.swing.JLabel Victorias;
    private javax.swing.JLabel Victorias1;
    private javax.swing.JLabel Victorias2;
    private javax.swing.JLabel Victorias3;
    private javax.swing.JLabel Victorias4;
    private javax.swing.JLabel Victorias5;
    private javax.swing.JButton btn_play_;
    private javax.swing.JLabel eleccion_papel_;
    private javax.swing.JLabel eleccion_piedra_;
    private javax.swing.JLabel eleccion_tijera_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_derrota_jugador;
    private javax.swing.JLabel lbl_derrota_maquina;
    private javax.swing.JLabel lbl_empate_jugador;
    private javax.swing.JLabel lbl_empate_maquina;
    private javax.swing.JLabel lbl_victoria_jugador;
    private javax.swing.JLabel lbl_victoria_maquina;
    private javax.swing.JPanel panel_play;
    // End of variables declaration//GEN-END:variables
    public int eleccionMaquina(){
        Random random = new Random();
        int numeroMaquina = eleccion_maquina[random.nextInt(3)];
        switch(numeroMaquina){
            case 1 -> Maquina.setIcon(img_piedra_maquina);
            case 2 -> Maquina.setIcon(img_papel_maquina);
            case 3 -> Maquina.setIcon(img_tijera_maquina);
        }
        return numeroMaquina;
    }
    public void resultado(int n2, int n1){
        if(eleccion_maquina[n1-1] == jugador.getEleccion()[n2-1]){
            cE++;
            jugador.setnEmpates(cE);
            lbl_empate_jugador.setText(String.valueOf(jugador.getnEmpates()));
            lbl_empate_maquina.setText(String.valueOf(cE));
        }else{
            //Piedra < Papel Pierde jugador
            if(n2 == 1 && eleccion_maquina[n1-1] == 2){
                cDj++;
                cVm++;
                jugador.setnDerrotas(cDj);
                lbl_derrota_jugador.setText(String.valueOf(jugador.getnDerrotas()));
                lbl_victoria_maquina.setText(String.valueOf(cVm));
                return;
            }
            //Piedra > tijera gana Jugador
            if(n2 == 1 && eleccion_maquina[n1-1] == 3){
                cVj++;
                cDm++;
                jugador.setnVictorias(cVj);
                lbl_victoria_jugador.setText(String.valueOf(jugador.getnVictorias()));
                lbl_derrota_maquina.setText(String.valueOf(cDm));
                return;
            }
            //Papel > Piedra gana Jugador
            if(n2 == 2 && eleccion_maquina[n1-1] == 1){
                cVj++;
                cDm++;
                jugador.setnVictorias(cVj);
                lbl_victoria_jugador.setText(String.valueOf(jugador.getnVictorias()));
                lbl_derrota_maquina.setText(String.valueOf(cDm));
                return;
            }
            //Papel < Tijera Pierde Jugador
            if(n2 == 2 && eleccion_maquina[n1-1] == 3){
                cDj++;
                cVm++;
                jugador.setnDerrotas(cDj);
                lbl_derrota_jugador.setText(String.valueOf(jugador.getnDerrotas()));
                lbl_victoria_maquina.setText(String.valueOf(cVm));
                return;
            }
            //Tijera < Piedra Pierde Jugador
            if(n2 == 3 && eleccion_maquina[n1-1] == 1){
                cDj++;
                cVm++;
                jugador.setnDerrotas(cDj);
                lbl_derrota_jugador.setText(String.valueOf(jugador.getnDerrotas()));
                lbl_victoria_maquina.setText(String.valueOf(cVm));
                return;
            }
            //Tijera > Papel gana Jugador
            if(n2 == 3 && eleccion_maquina[n1-1] == 2){
                cVj++;
                cDm++;
                jugador.setnVictorias(cVj);
                lbl_victoria_jugador.setText(String.valueOf(jugador.getnVictorias()));
                lbl_derrota_maquina.setText(String.valueOf(cDm));
            }
        }
    }
}