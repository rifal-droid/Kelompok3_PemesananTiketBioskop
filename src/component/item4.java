
package component;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class item4 extends javax.swing.JPanel {


    public String getPrice() {
        return Price;
    }


    public void setPrice(String Price) {
        this.Price = Price;
    }
    
    public String getDuration() {
        return Duration;
    }

    
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }
    
    
    public String getMvn() {
        return mvn;
    }

    
    public void setMvn(String mvn) {
        this.mvn = mvn;
    }


    public String getRate() {
        return Rate;
    }


    public void setRate(String Rate) {
        this.Rate = Rate;
    }

 
    public String getSyps() {
        return Syps;
    }


    public void setSyps(String Syps) {
        this.Syps = Syps;
    }
    
    
    public boolean isSelected() {
        return selected;
    }


    public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    private  boolean selected;
    
    public item4() {
        initComponents();
        setOpaque(false);
    }
    
    
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(255,255,255,255));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paint(g); 
    }

    
    private String mvn = "Ant-Man-Wasp: Quantumania";
    private String Rate = "7.0";
    private String Duration = "100 Minutes";
    private String Price = "Rp. 50.000";
    private String Syps = "Scott Lang and Hope Van Dyne, along with Hank Pym and Janet Van Dyne, " 
                           + "explore the Quantum Realm, where they interact with strange creatures and embark " 
                           + "on an adventure that goes beyond the limits of what they thought was possible.";
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic = new swing.PictureBox();
        mn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(170, 300));

        pic.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/img5.jpg"))); // NOI18N

        mn.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        mn.setForeground(new java.awt.Color(102, 102, 102));
        mn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mn.setText("ANT-MAN-WASP : QUANTUMANIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mn, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel mn;
    private swing.PictureBox pic;
    // End of variables declaration//GEN-END:variables
}
