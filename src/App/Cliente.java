/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package App;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font; 
import java.awt.Rectangle;
import java.awt.event.KeyEvent; 
import java.io.DataInputStream;
import java.io.DataOutputStream; 
import java.io.IOException; 
import java.net.Socket; 
import javax.swing.BoxLayout;
import javax.swing.ImageIcon; 
import javax.swing.JFrame;
import javax.swing.JLabel; 
import javax.swing.JScrollBar;
import javax.swing.SwingUtilities; 

/**
 *
 * @author 000093883
 */
public class Cliente extends javax.swing.JFrame implements Runnable {

    private String USER_NAME;

    /**
     * Creates new form App
     */
    public Cliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Wazaaaaaaaaa👻");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon("/Images/fantasma.png").getImage());
        this.panelChats.setLayout(new BoxLayout(panelChats, BoxLayout.Y_AXIS));
        loadData();
        Thread h = new Thread(this);
        h.start();
    }

    private void setValuesInComponents() {
        this.userName.setText(USER_NAME);
    }

    private void loadData() {
        this.USER_NAME = "Cliente";
        setValuesInComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        panelUsuario = new javax.swing.JPanel();
        userImage = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        panelMensajes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelChats = new javax.swing.JPanel();
        Enviar = new javax.swing.JButton();
        mensaje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        panelUsuario.setBackground(new java.awt.Color(255, 255, 255));

        userImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/usuario.png"))); // NOI18N
        userImage.setToolTipText("Imagen de usuario");

        userName.setFont(new java.awt.Font("Fira Code", 0, 16)); // NOI18N
        userName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelUsuarioLayout = new javax.swing.GroupLayout(panelUsuario);
        panelUsuario.setLayout(panelUsuarioLayout);
        panelUsuarioLayout.setHorizontalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userImage, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelUsuarioLayout.setVerticalGroup(
            panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setMaximumSize(new java.awt.Dimension(800, 400));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(800, 400));

        javax.swing.GroupLayout panelChatsLayout = new javax.swing.GroupLayout(panelChats);
        panelChats.setLayout(panelChatsLayout);
        panelChatsLayout.setHorizontalGroup(
            panelChatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        panelChatsLayout.setVerticalGroup(
            panelChatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(panelChats);

        javax.swing.GroupLayout panelMensajesLayout = new javax.swing.GroupLayout(panelMensajes);
        panelMensajes.setLayout(panelMensajesLayout);
        panelMensajesLayout.setHorizontalGroup(
            panelMensajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMensajesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelMensajesLayout.setVerticalGroup(
            panelMensajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMensajesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/avion-de-papel.png"))); // NOI18N
        Enviar.setToolTipText("Enviar Mensaje");
        Enviar.setBorderPainted(false);
        Enviar.setContentAreaFilled(false);
        Enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Enviar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Enviar.setFocusPainted(false);
        Enviar.setIconTextGap(1);
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });

        mensaje.setFont(new java.awt.Font("Fira Code", 0, 16)); // NOI18N
        mensaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mensajeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(mensaje)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Enviar)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Enviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mensaje))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed
        sendMessage();
    }//GEN-LAST:event_EnviarActionPerformed

    private void mensajeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mensajeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            sendMessage();
        }
    }//GEN-LAST:event_mensajeKeyPressed

    public void sendFileMessage(byte[] dataFile) {
        try {
            salida.write(dataFile);
            Rectangle r = this.panelChats.getBounds();
            JLabel mensajeEnviado = new JLabel(this.mensaje.getText());

            mensajeEnviado.setHorizontalAlignment(JLabel.RIGHT);  // Alinear el texto a la derecha
            mensajeEnviado.setOpaque(true);
            mensajeEnviado.setBackground(new Color(255, 255, 255));
            mensajeEnviado.setSize(r.width, 35);
            mensajeEnviado.setFont(new Font("Fira Code", Font.PLAIN, 18));
            mensajeEnviado.setMaximumSize(new Dimension(Integer.MAX_VALUE, mensajeEnviado.getPreferredSize().height));

            this.panelChats.add(mensajeEnviado);
            this.jScrollPane2.updateUI();
            this.panelChats.updateUI();
            JScrollBar vertical = jScrollPane2.getVerticalScrollBar();
            vertical.setValue(vertical.getMaximum());

            this.mensaje.setText("");
        } catch (Exception ex) {
            String m = ex.getMessage();
            System.out.println(m);
        }
    }
    
    public void sendMessage() {
        try {
            salida.writeUTF(this.mensaje.getText());
            Rectangle r = this.panelChats.getBounds();
            JLabel mensajeEnviado = new JLabel(this.mensaje.getText());

            mensajeEnviado.setHorizontalAlignment(JLabel.RIGHT);  // Alinear el texto a la derecha
            mensajeEnviado.setOpaque(true);
            mensajeEnviado.setBackground(new Color(255, 255, 255));
            mensajeEnviado.setSize(r.width, 35);
            mensajeEnviado.setFont(new Font("Fira Code", Font.PLAIN, 18));
            mensajeEnviado.setMaximumSize(new Dimension(Integer.MAX_VALUE, mensajeEnviado.getPreferredSize().height));

            this.panelChats.add(mensajeEnviado);
            this.jScrollPane2.updateUI();
            this.panelChats.updateUI();
            JScrollBar vertical = jScrollPane2.getVerticalScrollBar();
            vertical.setValue(vertical.getMaximum());

            this.mensaje.setText("");
        } catch (Exception ex) {
            String m = ex.getMessage();
            System.out.println(m);
        }
    }

    Socket s;
    DataInputStream entrada;
    DataOutputStream salida;

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Cliente().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mensaje;
    private javax.swing.JPanel panelChats;
    private javax.swing.JPanel panelMensajes;
    private javax.swing.JPanel panelUsuario;
    private javax.swing.JLabel userImage;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {

        try {
            s = new Socket("127.0.0.1", 1201);
            entrada = new DataInputStream(s.getInputStream());
            salida = new DataOutputStream(s.getOutputStream());

            while (true) {  // Bucle para seguir leyendo respuestas
                String mensajeEntrada = entrada.readUTF();

                SwingUtilities.invokeLater(() -> {
                    Rectangle r = this.panelChats.getBounds();
                    JLabel respuesta = new JLabel(mensajeEntrada);
                    respuesta.setHorizontalTextPosition(JLabel.LEADING);
                    respuesta.setSize(r.width, 35);
                    respuesta.setFont(new Font("Fira Code", Font.PLAIN, 18));
                    respuesta.setOpaque(true);
                    respuesta.setBackground(new Color(255, 188, 56));
                    respuesta.setMaximumSize(new Dimension(Integer.MAX_VALUE, respuesta.getPreferredSize().height));
                    panelChats.add(respuesta);
                    this.jScrollPane2.updateUI();
                    this.panelChats.updateUI();
                    JScrollBar vertical = jScrollPane2.getVerticalScrollBar();
                    vertical.setValue(vertical.getMaximum());
                });

            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                s.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
