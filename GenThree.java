/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
        public class GenThree {
	public static void main(String[] args) {
	int min, max, range;
        double a, b, c;
        int x, y, z;
        min = Integer.parseInt(args[0]);
        max = Integer.parseInt(args[1]);
        range = max - min;
       
        a = ((range + 1) * Math.random() + min);
         x = (int) a;
        System.out.println(x);
       
        b = ((range + 1) * Math.random() + min);
         y = (int) b;
        System.out.println(y);
       
        c = ((range + 1) * Math.random() + min);
         z = (int) c;
        System.out.println(z);

       int i = Integer.min(x,y);
       int j = Integer.min(i,z);
       System.out.println("The minimal generated number was " + j);
   }
}
