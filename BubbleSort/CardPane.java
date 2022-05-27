import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.JPanel;

import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;

public class CardPane extends JPanel {
  CardLayout card;
  
  public CardPane() {
    guiSetUp();
  }

  private void guiSetUp() {
    card = new CardLayout();

    Frame f = new Frame();
    this.setLayout(card);
    this.add(f.panel1, "bubPane");
    this.add(f.menuPane, "menuPane");
  }
}
