Write a program to generate a square pattern of size n x n. Each row of the pattern contains numbers from 1 to n.
 Input : 5
Sample Output 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 

# Code
  import java.util.*;
  public class Demo{
    public static void main(String args [})
    {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      SquarePattern(n);
    }
    static void SquarePattern(int n )
    {
      for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=n;j++)
            
              System.out.print(j+" ");
        }
      system.out.println();
    }
  }
                              
