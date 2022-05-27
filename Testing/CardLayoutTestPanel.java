package Testing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutTestPanel extends JPanel {
   public static final String CARD_HOME = "Card Home";
   public static final String CARD_MERGE = "Card Merge";
   public static final String CARD_BUBBLE = "Card Bubble";
   public static HomePage win1;
   public static MergeSort win2;
   public static BubbleSort1 bubSort = new BubbleSort1();
   public static CardLayoutTestPanel cardLayoutTestPanel;

   private static void createAndShowGui() {
      cardLayoutTestPanel = new CardLayoutTestPanel();

      JPanel buttonPanel = new JPanel(new GridLayout(1, 0, 5, 5));
      buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
      final JButton homeButton = new JButton("Home");
      buttonPanel.add(homeButton);

      homeButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ae) {
            if(!bubSort.isRunning) {
               cardLayoutTestPanel.showCard(CARD_HOME);
            }
         }
      });

      JFrame frame = new JFrame("CardLayoutTest");
      Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
      //frame.getContentPane().setPreferredSize(new Dimension(1525, 600));
      frame.getContentPane().setPreferredSize(new Dimension(dim.width, 680));
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.getContentPane().add(cardLayoutTestPanel);
      frame.getContentPane().add(buttonPanel, BorderLayout.PAGE_START);
      frame.pack();
      frame.setLocationByPlatform(true);
      frame.setVisible(true);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGui();
         }
      });
   }

   private CardLayout cardLayout = new CardLayout(20, 20);
   private JPanel cardShowingPanel = new JPanel(cardLayout);

   public CardLayoutTestPanel() {
      /*
       * Here we be making objects of the Window Series classes so that, each
       * one of them can be added to the JPanel having CardLayout.
       */
      win1 = new HomePage();
      cardShowingPanel.add(win1, CARD_HOME);
      win2 = new MergeSort();
      cardShowingPanel.add(win2, CARD_MERGE);
      //bubSort = new BubbleSort1();
      cardShowingPanel.add(bubSort, CARD_BUBBLE);

      setLayout(new BorderLayout());

      // Adding the contentPane (JPanel) and buttonPanel to JFrame.
      add(cardShowingPanel, BorderLayout.CENTER);
      
   }

   public void nextCard() {
      cardLayout.next(cardShowingPanel);
   }

   public void previousCard() {
      cardLayout.previous(cardShowingPanel);
   }

   public void showCard(String key) {
      cardLayout.show(cardShowingPanel, key);
   }

}





