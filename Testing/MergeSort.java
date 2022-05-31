package Testing;

import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MergeSort extends JPanel implements ActionListener {
  /*
   * Here this is our second Card of CardLayout, which will be added to the
   * contentPane object of JPanel, which has the LayoutManager set to
   * CardLayout. This card consists of a JLabel and a JTextField with
   * GridLayout.
   */

  private JTextField textField;

  private Random rand = new Random();
  Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
  private int[] array = new int[dim.width/14];
  private int arryIndex;
  private int compIndex;
  boolean isRunning = false;

  JButton start = new JButton("Start");
  JButton reset = new JButton("Reset Sim");
  
  public void setArray() {
    for(int i = 0; i < array.length; i++) {
      this.array[i] = rand.nextInt(400) + 40;
    }
  }

  public int[] getArray() {
    return this.array;
  }
// constructor 
  public MergeSort() {
     setArray();
     this.arryIndex = 0;
     this.compIndex = Integer.MAX_VALUE;
 
     start.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         try{
          isRunning = true;
          MergeSortAnimate();
         } catch (Exception ex) {
           ex.printStackTrace();
         }
       }
     });

     reset.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
          setArray();
          compIndex = Integer.MAX_VALUE;
          arryIndex = 0;
          isRunning = false;
          repaint();
      }
    });
    this.add(start);
    this.add(reset);
  }

  private void MergeSortAnimate() {

  }

  

  public void actionPerformed(ActionEvent e) {
     
  }
}
