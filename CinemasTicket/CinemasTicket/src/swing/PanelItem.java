
package swing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;




public class PanelItem extends JPanel{

    public PanelItem() {
        setBackground(Color.white);
        setLayout(new WrapLayout(WrapLayout.CENTER, 10, 10));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
    
    
    
}
