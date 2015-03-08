package test.code.pkg;

public class KeyPad {
	/* Problem Statement
	In 1-9 keypad one key is not working. If some one enters a password then not working key will not be entered. You have given expected password and entered password. Check that entered password is valid or not 
	Ex: entered 164, expected 18684 (you need to take care as when u enter 18684 and 164 only both will be taken as 164 input)
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int expected=181828;
		int given=112;
		String tempgiven=""+given;
		String temp=""+expected;
		//String output;
		Test t=new Test();
		char c=t.check(tempgiven,temp);
		//System.out.println("kishan");
		if(c!='\0'){
			System.out.println("Fault key is:"+c);
		}else{
			System.out.println("incorrect password");
		}
	}
	
	char check(String tempgiven, String temp){
		for(int i=0;i<temp.length();i++){
			StringBuffer buf = new StringBuffer(temp.length() );
			char fromtemp=temp.charAt(i);
			for(int j=0;j<temp.length();j++){
				if(fromtemp!=temp.charAt(j)){
					buf.append(temp.charAt(j));
				}
			}
			//String newstr=""+temp.remove(temp,(temp.charAt(i)+""));
			System.out.println("buffer: "+buf);
			System.out.println("tempgiven: "+tempgiven);
			System.out.println("result: "+buf.equals(tempgiven));
			if(buf.toString().equals(tempgiven)){
				System.out.println("here");
				return temp.charAt(i);
			}
		}
		return '\0';
	}
}

