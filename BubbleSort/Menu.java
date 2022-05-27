import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JPanel {
  JButton bubbleButton = new JButton("Bubble Sort");

  public Menu() {
    guiSetUp();
  }

  private void guiSetUp() {
    this.add(bubbleButton);

    bubbleButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        Frame f = new Frame();
        //f.card.show(f.panel1, "bubblePane");
      }
    });
  }
}
