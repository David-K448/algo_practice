// matrix multiplication 
// l;kjl;kj;lkj;lkj;lj
//asdfasdfasdfasdf

public class App {
  
  public static void main(String args[]) {
    int[][] m1 = {{1,2,3}, 
                  {4,5,6}, 
                  {7,8,9}};
    for (int row = 0; row < m1.length; row++) { 
      for (int col = 0; col < m1[row].length; col++) { 
        System.out.print(m1[row][col] + "\t");
      } 
      System.out.println();
    }
  }

}