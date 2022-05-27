package Testing;

import java.awt.event.*;
import javax.swing.*;

public class HomePage extends JPanel {
  /*
   * Here this is our first Card of CardLayout, which will be added to the
   * contentPane object of JPanel, which has the LayoutManager set to
   * CardLayout. This card consists of Two JButtons.
   */
  private ActionListener action;

  public HomePage() {
     init();
  }

  private void init() {
     final JButton bubbleButton = new JButton("Bubble Sort");
     final JButton mergeButton = new JButton("Merge Sort");

     action = new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
           if (ae.getSource() == bubbleButton) {
              CardLayoutTestPanel.cardLayoutTestPanel.showCard(CardLayoutTestPanel.CARD_BUBBLE);
           } else if (ae.getSource() == mergeButton) {
            CardLayoutTestPanel.cardLayoutTestPanel.showCard(CardLayoutTestPanel.CARD_MERGE);
           }
        }
     };

     bubbleButton.addActionListener(action);
     mergeButton.addActionListener(action);

     add(bubbleButton);
     add(mergeButton);
  }
}
