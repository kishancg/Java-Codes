package test.code.pkg;

import java.util.ArrayList;
import java.util.List;

public class Colorful {
	/* Problem Statement
	 * Colorful Number: 
		A number can be broken into different sub-sequence parts. 
		Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245. 
		And this number is a colorful number, since product of every digit of a sub-sequence are different. 
		That is, 3 2 4 5 (3*2)=6 (2*4)=8 (4*5)=20 (3*2*4)= 24 (2*4*5)= 40 
		But 326 is not a colorful number as it generates 3 2 6 (3*2)=6 (2*6)=12. 
		You have to write a function that tells if the given number is a colorful number or not.
	 */
	/* Commenting main to work on with new problems
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=32745;
		Colorful c= new Colorful();
		if(c.checkColor(number)){
			System.out.println("Number is colorful");
		}else{
			System.out.println("Number is not colorful");
		}
	}
	*/
	boolean checkColor(int x){
		
		String gnum=""+x;
		//System.out.println(Integer.parseInt(gnum.charAt(1)+""));
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<gnum.length();i++){
			if(l.contains(Integer.parseInt(gnum.charAt(i)+""))){
				return false;
			}else{
				l.add(Integer.parseInt(gnum.charAt(i)+""));
			}
		}
		if(l.contains(0)||l.contains(1)){
			return false;
		}
		int prod1=0,prod2=0;
		for(int i=0;i<gnum.length()-1;i++){
			prod1=Integer.parseInt(gnum.charAt(i)+"");
			prod2=Integer.parseInt(gnum.charAt(i)+"");
			int j;
			for(j=i+1;j<gnum.length();j++){
				prod1=prod1*Integer.parseInt(gnum.charAt(j)+"");
				System.out.println("prod1: "+prod1);
				if(l.contains(prod1)){
					return false;
				}else{
					l.add(prod1);
					prod1=Integer.parseInt(gnum.charAt(i)+"");
				}
				prod2=prod2*Integer.parseInt(gnum.charAt(j)+"");
				if((j-i)>1 && (i<gnum.length()-2)&&(j<gnum.length()-1)){
					System.out.println("prod2: "+prod2);
					if(l.contains(prod2)){
						return false;
					}
					else{
						l.add(prod2);
					}
				}
			}
			System.out.println("prod2: "+prod2);
			System.out.println("i:"+i+" j: "+j);
			
			if(l.contains(prod2)&& (i<gnum.length()-2)){
				return false;
			}else{
				l.add(prod2);
			}
			
		}
		
		return true;
	}
}
