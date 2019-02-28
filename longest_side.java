import java.util.*;
import java.lang.*;
/**
 * Write a description of class longest_side here.
 * Define the longest side of a shape.
 * @version (12/02/2019)
 */
public class longest_side
{
    // instance variables - replace the example below with your own
    private int x, y;
    private double length = 0;
    private double mlength = 0;
    private int count = 0;
    private int mx, my;

    /**
     * Constructor for objects of class longest_side
     */
    public longest_side()
    {
        // initialise instance points
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the x co-ordinate ");
        x = input.nextInt();
        System.out.println("Enter the y co-ordinate");
        y = input.nextInt();
    }
    public void side_length(longest_side otherPt){
        int dx = x - otherPt.getx();
        int dy = y - otherPt.gety();
        length = Math.sqrt((dx*dx)+(dy*dy));
        if(count==0){
            mlength = length;
        }
        count++;
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public void compare(){
        if(length>mlength){
            mlength = length;
        }
    }
    public void lastPt(){
        int dx = x - mx;
        int dy = y - my;
        length = Math.sqrt((dx*dx)+(dy*dy));
    }
    public void store(){
        mx = x;
        my = y;
    }
    public void display(){
        System.out.println("The largest side is "+mlength);
    }
            

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] argc)
    {
        // put your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of points");
        int no_pt = input.nextInt();
        System.out.println("Enter the first point");
        longest_side point = new longest_side();
        point.store();
        for(int i = 1; i<= no_pt; i++){
            if(i<no_pt){
                longest_side pointex = new longest_side();
                point.side_length(pointex);
                point.compare();
            }
            else{
                point.lastPt();
                point.compare();
            }
        }
        point.display();
    }
}
