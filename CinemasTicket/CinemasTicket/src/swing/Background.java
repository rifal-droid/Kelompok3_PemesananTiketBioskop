
package swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;


public class Background extends JPanel{
    public Background() {
        setOpaque(false);
}

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.white);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);
        super.paint(g); 
    }
    
}
