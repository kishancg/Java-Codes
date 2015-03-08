package test.code.pkg;


import java.util.HashSet;
import java.util.Set;

public class Powerset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Set<Integer>> numset = new HashSet<Set<Integer>>();
		/*
		List<Integer> givenNum= new ArrayList<Integer>();
		givenNum.add(1);
		givenNum.add(2);
		*/
		int[] givenNum = {1,2};
		Powerset p= new Powerset();
		//numset.add(null);
		//System.out.println(numset);
		//System.out.println(givenNum.length);
		/*
		for(int x:givenNum){
			System.out.println(x);
		}
		*/
		numset=p.generatePowerSet(givenNum,0,numset);
		System.out.println("Numset final:"+numset);
	}
	Set<Set<Integer>> generatePowerSet(int[] givenNum,int index,Set<Set<Integer>> numset){
		System.out.println("index:"+index);
		System.out.println("Numset:"+numset);
		if(index<givenNum.length){
			if(!numset.isEmpty()){
				Set<Set<Integer>> temp= new HashSet<Set<Integer>>();
				temp=numset;
				for(Set<Integer> x:numset){
					temp.add(x);
				}
				System.out.println("initial temp:"+temp);
				Set<Integer> n=new HashSet<Integer>();
				n.add(givenNum[index]);
				System.out.println("Numset before:"+numset);
				numset.add(n);
				System.out.println("Numset after:"+numset);
				try{
					System.out.println("Numset before:"+numset);
					for(Set<Integer> x:temp){
						try{
							x.add(givenNum[index]);
							x.add(23);
						}catch(Exception e){
							System.out.println("exceptio");
						}
						System.out.println("x:"+x);
					}
					System.out.println("Numset after:"+numset);
					System.out.println("after insert temp:"+temp);
					for(Set<Integer> x:temp){
						if(!numset.contains(x)){
							System.out.println("Numset before:"+numset);
							numset.add(x);
							System.out.println("Numset after:"+numset);
						}
					}
					
				}catch(Exception e){}
			}else{
				Set<Integer> n=new HashSet<Integer>();
				n.add(givenNum[index]);
				numset.add(n);
				System.out.println("First insert Numset:"+numset);
			}
			numset=generatePowerSet(givenNum,index+1,numset);
		}
		return numset;
	}

}
