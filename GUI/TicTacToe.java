import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class TicTacToe extends MyJFrame {

  JPanel jPanel;
  ArrayList<JButton> buttons = new ArrayList<JButton>();
  int ROWS = 3, COLUMNS = 3;
  String currentPlayer = "x";
  
  public TicTacToe(){
    super("Tic Tac Toe Game");

    jPanel = new JPanel();
    // jPanel.setLayout(new BorderLayout());

    // jPanel.add(new JButton("Ok")), BorderLayout.CENTER;
    // jPanel.add(new JButton("Cancel"));
    jPanel.setLayout(new GridLayout(ROWS, COLUMNS));

    Font font = new Font(Font.SANS_SERIF, Font.BOLD, 100);

    for (int i = 0; i < ROWS * COLUMNS; i++){
      JButton btn = new JButton("" );
      btn.addActionListener(event -> ButtonClicked(event));
      // SET THE FONT
      btn.setFont(font);
      buttons.add(btn);
      jPanel.add(btn);
      
    }

    setContentPane(jPanel);
    setVisible(true);
  }

  public void ButtonClicked(ActionEvent event) {

    JButton btnClicked = ((JButton)event.getSource());
    btnClicked.setText(currentPlayer);
    btnClicked.setEnabled(false);
    if (currentPlayer == "x"){
      btnClicked.setBackground(Color.GREEN);
      currentPlayer = "o";
      // do something
    } else {
      btnClicked.setBackground(Color.MAGENTA);
      currentPlayer = "x";
      // do someting else
    }
    System.out.println("Button clicked");
  }
  
  public boolean CheckWinner() {
    // first roe
    if(buttons.get(0).getText().equals(currentPlayer) && buttons.get(1).getText().equals(currentPlayer) && buttons.get(2).getText().equals(currentPlayer)){
      return true;
    }
    if(buttons.get(0).getText().equals(currentPlayer) && buttons.get(1).getText().equals(currentPlayer) && buttons.get(2).getText().equals(currentPlayer)){
      return true;
    }
    if(buttons.get(0).getText().equals(currentPlayer) && buttons.get(1).getText().equals(currentPlayer) && buttons.get(2).getText().equals(currentPlayer)){
      return true;
    }
    return false;
}
}