import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.awt.event.*;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.Graphics;

public class Main{
  static JFrame frame;
  static JPanel panel1; 
  static int[] randArray = new int[200];
  static Random r = new Random();
  static int min = 5;
  static int max = 700;
  static int swap;
  static BubbleSort bubbleT = new BubbleSort();

  public Main() {
    prepGui();
    buildGui();
  }

  private static void prepGui() {
    for(int i = 0; i < randArray.length; i++){
      randArray[i]  = r.nextInt(max-min) + min;
    }
    
    frame = new JFrame();
    panel1 = new JPanel();//"new GridBagLayout()"
    frame.add(panel1);

    GridBagConstraints c = new GridBagConstraints();
    //c.weightx = 1;
    //c.weighty = 1;
    //c.fill = GridBagConstraints.HORIZONTAL;

    JLabel title = new JLabel("Algorithm Visualizer");
    title.setFont(new Font("Verdana", Font.PLAIN, 30));
    

    JLabel subtitle = new JLabel("Select an algorithm from below,");
    subtitle.setSize(425, 200);
    subtitle.setFont(new Font("Verdana", Font.PLAIN, 18));

    JLabel subtitle2 = new JLabel("and create a new array to begin.");
    subtitle2.setSize(425, 200);
    subtitle2.setFont(new Font("Verdana", Font.PLAIN, 18));
    
    panel1.add(title);
    panel1.add(subtitle);
    panel1.add(subtitle2);

    JButton bubble = new JButton("Bubble Sort");
    panel1.add(bubble);

    JButton newArray = new JButton("New Array");
    panel1.add(newArray);



    ////////////////////
    //Action Listeners//
    ////////////////////

    newArray.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        for(int i = 0; i < randArray.length; i++){
          randArray[i]  = r.nextInt(max-min) + min;
        }
        for(int n : randArray) {
          System.out.print(n+"\n");
        }
      }
    });

    bubble.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent evt) {
        for(int i = 0; i < (randArray.length - 1); i++) {
          for(int j = 0; j < (randArray.length - i -1); j++) {
            if(randArray[j] > randArray[j + 1]) {
              swap = randArray[j];
              randArray[j] = randArray[j + 1];
              randArray[j + 1] = swap;
            }
          }
        }
        System.out.println("\nSorted Array\n");
        
        bubbleT.start();
      }
    });
  }



  private static void buildGui() {
    frame.setSize(500, 750);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
    frame.setLocationRelativeTo(null);
  }

  public static void main(String[] args) {
   Main main = new Main();
  }
  
}