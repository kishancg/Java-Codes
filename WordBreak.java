package test.code.pkg;

import java.util.HashSet;
import java.util.Set;

public class WordBreak {
	public static void main(String[] args) {
		WordBreak w=new WordBreak();
		Set<String> dict= new HashSet<String>();
		dict.add("a");
		dict.add("abc");
		dict.add("b");
		dict.add("cd");
		
		System.out.println(w.wordbreakcheck("abcd", dict));
		
		
	}
	boolean wordbreakcheck(String s,Set<String> dict){
		String sub1="", sub2="";
        boolean flag=true;
        if(s.length()==1){
            if(dict.contains(s)){
                return true;
            }
            else{
                return false;
            }
            
        }
        for(int i=0;i<s.length();i++){
            sub1=s.substring(0,i);
            
            if(dict.contains(sub1)){
                s=s.substring(i,s.length());
                System.out.println(s);
                i=0;
            }else{
            	
                if(i==s.length()-1){
                	System.out.println("check: "+sub1);
                    flag=false;
                }
            }
        }
        return flag;
		
	}
}
