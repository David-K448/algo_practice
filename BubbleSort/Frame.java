import java.awt.*;
import javax.swing.*; 

public class Frame extends JFrame {

  private BubbleSort panel1 = new BubbleSort();
  private Menu menuPanel = new Menu();

  public Frame() {
    this.setTitle("Algo Vizualization");
    this.getContentPane().setPreferredSize(new Dimension(1125, 600));
    this.getContentPane().add(panel1);
    //this.getContentPane().add(menuPanel);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public BubbleSort getBubPanel() {
    return this.panel1;
  }

  public Menu getMenuPanel() {
    return this.menuPanel;
  }
}
