/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
        public class GenThree {
	public static void main(String[] args) {
	int min, max, range;
        min = Integer.parseInt(args[0]);
        max = Integer.parseInt(args[1]);
        range = max - min;
       
        int a = (int)(range * Math.random() + min);
        System.out.println(a);
       
        int b = (int)(range * Math.random() + min);
        System.out.println(b);
       
        int c = (int)(range * Math.random() + min);
        System.out.println(c);

       int i = Integer.min(a,b);
       int j = Integer.min(c,i);
       System.out.println("The minimal generated number was " + j);
   }
}
