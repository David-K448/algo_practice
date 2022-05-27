import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;


public class Frame extends JFrame {

  BubbleSort panel1 = new BubbleSort();
  JPanel menuPanel = new JPanel();
  JPanel cardPanel = new JPanel();
  JButton bubbleButton;
  static CardLayout card = new CardLayout();; 

  public Frame() {
    this.setTitle("Algo Vizualization");
    this.getContentPane().setPreferredSize(new Dimension(1125, 600));
    this.getContentPane().add(panel1);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public BubbleSort getBubPanel() {
    return this.panel1;
  }
}
