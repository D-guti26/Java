import javax.swing.JFrame;

public class MyJFrame extends JFrame {

  public MyJFrame(String title){
    super(title);
    // MyJPanel panel = new MyJPanel();
    // setContentPane(panel);
    setSize(500, 500);
    setLocation(200, 200);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
  
}
