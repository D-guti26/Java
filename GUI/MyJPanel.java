import java.awt.Graphics;

import javax.swing.JPanel;

public class MyJPanel extends JPanel {

  @Override
  protected void paintComponent(Graphics g) {
    // TODO Auto-generated method stub
    super.paintComponent(g);
    g.drawString("Hellow WORLD!", 20, 30);
  
}
}