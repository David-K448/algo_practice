package Testing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class BubbleSort1 extends JPanel {
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
 
   public BubbleSort1() {
     setArray();
     this.arryIndex = 0;
     this.compIndex = Integer.MAX_VALUE;
 
     start.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
         try{
          isRunning = true;
          BubbleSortAnimate();
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
 
 
   public void BubbleSortAnimate() {
     compIndex = 0;
 
     Timer timer = new Timer(1, new ActionListener(){
       @Override
       public void actionPerformed(ActionEvent e) {
         if(isSorted()) {
           compIndex = Integer.MAX_VALUE;
           ((Timer)e.getSource()).stop();
           isRunning = false;
         } else {
           if(isRunning == true) {
             if(array[compIndex] > array[compIndex + 1]) {
               int temp = array[compIndex];
               array[compIndex] = array[compIndex + 1];
               array[compIndex + 1] = temp;
             }
             if ((compIndex + 1) >= (array.length - arryIndex - 1)) {
               arryIndex++;
               compIndex = 0;
             }
             else{
               compIndex++;
             }
           }
         }
         repaint();
       }
     });
     timer.start();
   }
 
   public boolean isSorted(){
     for(int i = 0; i < array.length - 1; i++) {
       if(array[i] > array[i + 1]) {
         return false;
       }
     }
     return true;
   }
 
   public void paintComponent(Graphics g) {
     super.paintComponent(g);
     this.setBackground(Color.DARK_GRAY);
     draw(g);
   }
 
   public void draw(Graphics g) {
     for(int i = 0; i < array.length; i++) {
       g.setColor(Color.white);
 
       if(i == compIndex || i == compIndex + 1) {
         g.setColor(Color.red);
       }
 
       g.drawRect(i*15, 600 - array[i], 9, array[i]);
       g.fillRect(i*15, 600 - array[i], 9, array[i]);
     }
   }
}
