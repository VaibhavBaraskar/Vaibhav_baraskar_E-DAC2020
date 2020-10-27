class H1{  
 	public static void main(String... args){
	double a, b;
        System.out.println(a + "first val :" + b);
        int a1 = (int) a;
        int b1 = (int) b;
        String s1 = Integer.toString(a1);
        String s2 = Integer.toString(b1);
        int number0 = Integer.parseInt(s1, 2);
        int number1 = Integer.parseInt(s2, 2);

        int sum = number0 + number1;
        String s3 = Integer.toBinaryString(sum);

        
   
	}
}