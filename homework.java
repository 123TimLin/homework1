package homework01;
import java.util.Scanner;
public class homework {
	static int pv;
	static double fv;
	static final double interest=0.05;
	static int interval;
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);	
		System.out.print("請輸入本金");
		pv=scn.nextInt();
		System.out.print("請輸入累進週期");
		interval=scn.nextInt();	
		
		fv=pv*Math.pow((1+interest), interval);
		
		System.out.println("My pv is "+pv+"and after"+interval+"year it would be"+fv);
				
				
	}

}
