
package form;

public class MoviePage extends javax.swing.JFrame {

    String judulfilm;
    public MoviePage() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new swing.Background();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelItem1 = new swing.PanelItem();
        mv1 = new component.Item1();
        mv2 = new component.Item2();
        mv3 = new component.Item3();
        mv4 = new component.item4();
        HeaderBar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        mvn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        rate = new javax.swing.JLabel();
        duration = new javax.swing.JLabel();
        cover = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        Rating = new javax.swing.JLabel();
        Durations = new javax.swing.JLabel();
        Price = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(230, 250, 235));

        background1.setBackground(new java.awt.Color(230, 250, 235));
        background1.setOpaque(true);

        jScrollPane1.setBorder(null);

        panelItem1.setBackground(new java.awt.Color(230, 250, 235));

        mv1.setName(""); // NOI18N
        mv1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mv1MouseClicked(evt);
            }
        });
        panelItem1.add(mv1);

        mv2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mv2MouseClicked(evt);
            }
        });
        panelItem1.add(mv2);

        mv3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mv3MouseClicked(evt);
            }
        });
        panelItem1.add(mv3);

        mv4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mv4MouseClicked(evt);
            }
        });
        panelItem1.add(mv4);

        jScrollPane1.setViewportView(panelItem1);

        HeaderBar.setBackground(new java.awt.Color(0, 51, 51));
        HeaderBar.setEnabled(false);
        HeaderBar.setPreferredSize(new java.awt.Dimension(179, 84));

        jLabel3.setFont(new java.awt.Font("Edwardian Script ITC", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Infor");
        HeaderBar.add(jLabel3);

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("XXI");
        HeaderBar.add(jLabel2);

        jPanel1.setBackground(new java.awt.Color(230, 250, 235));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setEnabled(false);

        mvn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mvn.setForeground(new java.awt.Color(102, 102, 102));
        mvn.setText("Movie Name");

        jSeparator1.setForeground(new java.awt.Color(0, 51, 51));

        rate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rate.setForeground(new java.awt.Color(102, 102, 102));
        rate.setText("Rating");

        duration.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        duration.setForeground(new java.awt.Color(102, 102, 102));
        duration.setText("Duration");

        price.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        price.setForeground(new java.awt.Color(102, 102, 102));
        price.setText("Price");

        Rating.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Rating.setForeground(new java.awt.Color(102, 102, 102));
        Rating.setText("Rating        :");

        Durations.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Durations.setForeground(new java.awt.Color(102, 102, 102));
        Durations.setText("Duration    :");

        Price.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Price.setForeground(new java.awt.Color(102, 102, 102));
        Price.setText("Price           :");

        jButton2.setBackground(new java.awt.Color(0, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Buy Ticket");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(cover, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Rating, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(rate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Durations, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(duration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mvn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(cover, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mvn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Rating, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rate, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Durations, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Price)
                    .addComponent(price))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(HeaderBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addComponent(HeaderBar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                    .addGroup(background1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void mv2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mv2MouseClicked
        mvn.setText(mv2.getMvn());
        rate.setText(mv2.getRate());
        duration.setText(mv2.getDuration());
        price.setText(mv2.getPrice());
        cover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3x.jpg")));
    }//GEN-LAST:event_mv2MouseClicked

    
    private void mv4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mv4MouseClicked
        mvn.setText(mv4.getMvn());
        rate.setText(mv4.getRate());
        duration.setText(mv4.getDuration());
        price.setText(mv4.getPrice());
        cover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img5x.jpg")));
        
    }//GEN-LAST:event_mv4MouseClicked

    
    private void mv1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mv1MouseClicked
        mvn.setText(mv1.getMvn());
        rate.setText(mv1.getRate());
        duration.setText(mv1.getDuration());
        price.setText(mv1.getPrice());
        cover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img2x.jpg")));
    }//GEN-LAST:event_mv1MouseClicked

    
    private void mv3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mv3MouseClicked
        mvn.setText(mv3.getMvn());
        rate.setText(mv3.getRate());
        duration.setText(mv3.getDuration());
        price.setText(mv3.getPrice());
        cover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img6x.jpg")));
        
    }//GEN-LAST:event_mv3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        judulfilm = mvn.getText();
        Invoice FN = new Invoice(judulfilm);
        FN.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoviePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Durations;
    private javax.swing.JPanel HeaderBar;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel Rating;
    private swing.Background background1;
    private javax.swing.JLabel cover;
    private javax.swing.JLabel duration;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private component.Item1 mv1;
    private component.Item2 mv2;
    private component.Item3 mv3;
    private component.item4 mv4;
    private javax.swing.JLabel mvn;
    private swing.PanelItem panelItem1;
    private javax.swing.JLabel price;
    private javax.swing.JLabel rate;
    // End of variables declaration//GEN-END:variables
}
