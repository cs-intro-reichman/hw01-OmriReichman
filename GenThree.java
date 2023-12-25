/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
	        int min, max, difference;
        double a, b, c;
        int x, y, z;
        min = Integer.parseInt(args[0]);
        max = Integer.parseInt(args[1]);
        difference = max - min;
       
        a = ((difference+1) * Math.random() + min);
         x = (int) a;
        System.out.println(x);
       
        b = ((difference + 1) * Math.random() + min);
         y = (int) b;
        System.out.println(y);
       
        c = ((difference + 1) * Math.random() + min);
         z = (int) c;
        System.out.println(z);

        if ((x<y&&x<z)|| (x==y&&x<z) || (x==z&&x<y)) {
            System.out.println("The minimal generated number was " + x);
        } else if ((y<x&&y<z)|| (y==x&&y<z) || (y==z&&y<x)) {
            System.out.println("The minimal generated number was " + y);
        }  else {
            System.out.println("The minimal generated number was " + z);
        }	
   }
}
