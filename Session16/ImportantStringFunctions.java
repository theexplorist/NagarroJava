package Session16;

public class ImportantStringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str  = "Hello";
		
		//length
		System.out.println(str.length());
		
		//indexOf
		System.out.println(str.indexOf('o')); //4
		//index of duplicates - first occurance
		System.out.println(str.indexOf('l'));//2
		
		//lastIndexOf	
		System.out.println(str.lastIndexOf('l'));//3
		
		//startsWith
		System.out.println(str.startsWith("He"));//true
		System.out.println(str.startsWith("he"));//false java is case sensitive
		
		//endsWith
		System.out.println(str.endsWith("lo"));
		
		//concat/+ -> costly
		
		//str.concat("o");//hello
//		str = str.concat("o");
//		System.out.println(str);
		
		//replace() -> modify
		//str.replace('o', 'l');
		str = str.replace('o', 'l');//helll
		System.out.println(str);
		
		/*
		String s = "java";
		String a = "jav";
		System.out.println(s == a);
		a = a.concat("a");
		System.out.println(a);
		*/
		
		String name = "kartik";
		
		//extract art
		
		System.out.println(name.substring(1, 4));//[1, 4)
		System.out.println(name.substring(4, 4));//""
		
		//i to end of string
		System.out.println(name.substring(1, 6));//[si, ei)
		System.out.println(name.substring(1)); //[si]
	}

}
