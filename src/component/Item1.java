
package component;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Item1 extends javax.swing.JPanel {

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
    
    public Item1() {
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

    private String mvn = "AVATAR : THE WAY OF WATER";
    private String Rate = "6.9";
    private String Duration = "109 Minutes";
    private String Price = "Rp. 45.000";
    private String Syps = "Jake Sully lives with his newfound family formed on the planet of Pandora." 
                           + "Once a familiar threat returns to finish what was previously started, " 
                           + "Jake must work with Neytiri and the army of the Na'vi race to protect their planet.";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pic = new swing.PictureBox();
        mn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(170, 300));

        pic.setImage(new javax.swing.ImageIcon(getClass().getResource("/images/img2.jpg"))); // NOI18N

        mn.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        mn.setForeground(new java.awt.Color(102, 102, 102));
        mn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mn.setText("AVATAR : THE WAY OF WATER");

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
