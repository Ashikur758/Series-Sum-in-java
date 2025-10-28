	import java.util.Scanner;

			public class SeriesSum {
			   static int sum(int n){

			if(n==1)
			   return 1;

			return n+sum(n-1);
		}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
			System.out.print("Enter N: ");
       				 int n = scanner.nextInt();
		int sum = 0;
		    sum = sum(n);
			System.out.print("sum = "+sum);
			

        scanner.close();
    }
}