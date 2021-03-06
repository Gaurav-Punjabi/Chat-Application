/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.components;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author gauravpunjabi
 */
public class ContactComponent extends javax.swing.JPanel implements ComponentConstants{

    /**
     * Creates new form Contact
     * @param contactName
     */
    public ContactComponent(final String contactName) {
        this(contactName,"",null);
    }
    public ContactComponent(final String contactName,
                   final String message)
    {
        this(contactName,message,null);
    }
    public ContactComponent(final String contactName,
                   final String message,
                   final ImageIcon dp) {
        initComponents();
        this.contactMouseEventHandling = new ContactMouseEventHandling(this);
        this.addMouseListener(contactMouseEventHandling);
        customInit(contactName,message,dp);
    }
    private void customInit(final String contactName,
                            final String message,
                            final ImageIcon dp) {
        this.jlName.setText(contactName);
        this.jlMessage.setText(message);
        this.jlDP.setIcon(dp);
    }   

    public JLabel getDPLabel() {
        return jlDP;
    }

    public JLabel getMessageLabel() {
        return jlMessage;
    }

    public JLabel getNameLabel() {
        return jlName;
    }
    @Override
    protected void paintComponent(Graphics g) {
        this.setForeground(new Color(125,125,215));
//        g.fillRect(10,this.getHeight() - 12,this.getWidth()-20,2);
        g.drawLine(0,this.getHeight(), this.getWidth(), this.getHeight());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlName = new javax.swing.JLabel();
        jlMessage = new javax.swing.JLabel();
        jlDP = new javax.swing.JLabel(){
            @Override
            protected void paintComponent(Graphics g)
            {
                g.setColor(new Color(125,125,125));
                g.drawOval(5,5,CONTACT_DP_WIDTH-10,CONTACT_DP_HEIGHT-10);
            }
        };

        setBackground(CONTACT_COLOR_BACKGROUND);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlName.setFont(new java.awt.Font("Raleway", 0, 26)); // NOI18N
        jlName.setForeground(CONTACT_COLOR_FOREGROUND);
        jlName.setText("Rohit Methwani");
        add(jlName, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 6, 316, 42));

        jlMessage.setFont(new java.awt.Font("Raleway", 0, 18)); // NOI18N
        jlMessage.setForeground(CONTACT_COLOR_FOREGROUND);
        jlMessage.setText("Kya kar rha hai???");
        add(jlMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 54, 316, 31));

        jlDP.setBackground(new java.awt.Color(215, 249, 241));
        add(jlDP, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 90, 90));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlDP;
    private javax.swing.JLabel jlMessage;
    private javax.swing.JLabel jlName;
    // End of variables declaration//GEN-END:variables
    private ContactMouseEventHandling contactMouseEventHandling;
}
