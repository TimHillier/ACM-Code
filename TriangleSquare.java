import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class TriangleSquare {

    public static void main(String[] args) {
       // TODO Auto-generated method stub
       
       //check to see if they have matching sides.
       // then check to see if pythag works
       
       ArrayList<Integer> tri1 = new ArrayList<Integer>(3);
       ArrayList<Integer> tri2 = new ArrayList<Integer>(3);
       
       //enter triangles side lengths. 
       System.out.println("Enter triangle 1");
       int a = 0 ;
       Scanner input = new Scanner(System.in);  
       int temp2;
          while ( a<=2)
          {
             temp2 = input.nextInt();
             
             tri1.add(temp2);
           
             a++;
             
          }
          int b = 0;
       System.out.println("Enter Triangle 2");
       int temp;
       while( b<=2)
       {
          temp = input.nextInt();
          
          tri2.add(temp);

          b++;
       }
       
       
       
       if(sides(tri1,tri2))
       {
          
    	   //compare sides to make sure they are the same. and then see if they can make a triangle
          pythag(tri1,tri2);
       }
       else
       {
          System.out.println("NO");
       }
       
       
       
       
       
       
       

    }
    public static boolean sides(ArrayList<Integer> x, ArrayList<Integer> y)
    {
    	//sort arrays
       Collections.sort(x);
       Collections.sort(y);
       
       int c = 0;
       //compare side lengths
       for(int i = 0; i<2; i++){
          
          if(x.get(i) == y.get(i))
          {
             c++;
       
          }
          
          
       }
     
       
       if(c>=x.size()-1)
       {
          return true;
       }
       else
       {
          return false;
       }
       
       
       
       
    }
    

    //do pythagriam therom to see if they form a correct triangle. 
    public static void pythag(ArrayList<Integer> a, ArrayList<Integer> b)
    {
      
       
       Collections.sort(a);
       Collections.sort(b);
       
       if(Math.pow((double) a.get(0),2)+Math.pow((double) a.get(1),2)==Math.pow((double) a.get(2), 2))
{
          
          System.out.println("yes");
          
       }
       else
       {
          System.out.println("no");
       }
       
       
    }
    
    

}


