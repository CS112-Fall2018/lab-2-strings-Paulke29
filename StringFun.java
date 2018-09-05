public class StringFun{
	public static void main(String[] args){
	  String s = "Helloworld";
	  String otherString = "First time to learn Java";
	  char n ='H';
	  String subString = "This is Lab 2";
	  System.out.println(s.length());
	  System.out.println(s.equals(otherString));	
	  System.out.println(s.substring(2,5));
	  System.out.println(otherString.trim());

	  int result = s.indexOf('H');
	  System.out.println(result);
	  int result2 = s.lastIndexOf('w');
	  System.out.println(result2);
	  System.out.println(s.charAt(5));
	  String result3 = s.toLowerCase();//convert the whole stirng as lowercase letter
	  System.out.println(result3);
	  String result4 = s.toUpperCase();//convert the whole stirng as lowercase 
	  System.out.println(result4);
	}
}