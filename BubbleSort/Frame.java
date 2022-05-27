import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;


public class Frame extends JFrame {
  CardPane cardPane = new CardPane();
  BubbleSort panel1 = new BubbleSort();
  Menu menuPane = new Menu();
  

  JButton bubbleButton;

  public Frame() {
    this.setTitle("Algo Vizualization");
    this.getContentPane().setPreferredSize(new Dimension(1125, 600));

    this.getContentPane().add(cardPane);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  
  public BubbleSort getBubPanel() {
    return this.panel1;
  }
}
