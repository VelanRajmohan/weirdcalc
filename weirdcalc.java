import java.util.*;
public class weirdcalc
{
	public static void main(String[] args)
	{
		float int1,int2, sum, diff, prod, dist, max, min;
		float ave;
		Scanner userinput = new Scanner(System.in);

		{
			System.out.println("Give an Integer");
			int1 = userinput.nextInt();
			System.out.println("Give another Integer");
			int2 = userinput.nextInt();

			sum = int1+int2;
			System.out.print("Sum: ");
			System.out.printf("%15.0f\n", sum);
			diff = int1-int2;
			System.out.print("Difference: ");
			System.out.printf("%8.0f\n", diff);
			prod = int1*int2;
			System.out.print("Product: ");
			System.out.printf("%11.0f\n", prod);
			ave = ((int1+int2)/2);
			System.out.print("Average: ");
			System.out.printf("%14.2f\n", ave);
			dist = Math.abs(diff);
			System.out.print("Distance: ");
			System.out.printf("%10.0f\n", dist);
			max = Math.max(int1,int2);
			System.out.print("Maximum: ");
			System.out.printf("%11.0f\n", max);
			min = Math.min(int1,int2);
			System.out.print("Minimum: ");
			System.out.printf("%11.0f\n", min);
		}
	}
}