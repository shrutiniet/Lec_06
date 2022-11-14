package Lec_06;
import java.util.*;
public class ARmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean b=is_Armstrong(n);
		if(b==true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
public static boolean is_Armstrong(int n)
{
	int num=n;
	int digit=0;
	int ans=0;
	while(n!=0)
	{
		digit++;
		n/=10;
	}
	n=num;
	while(n!=0)
	{
		int rem=n%10;
		ans=ans+(int)(Math.pow(rem, digit));
		n/=10;
	}
	if(num==ans)
		return true;
	else
		return false;
}
}
