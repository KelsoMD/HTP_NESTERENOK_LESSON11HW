package by.htp.lesson11;

public class MainApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		String s = new String();
//		s = s +1;
//		s.intern();
//		String s1 = "1";
//		StringBuilder sb = new StringBuilder();
//		sb = sb.append("1");
//		
//		String s2 = new String("a");
//		String s22 = "a";
//		
//		String s3 = "b";
//		String s4 = "b";
//		
//		s2.intern();
//		String s5 = "ba";
//		
//		String s31 = "c";
//		String s32 = new String("c");
//		String s33 = "c";
//		String s41 = "d";
//		String s42 = new String("d");
//		s42.intern();
//		String s43 = "d";
//		
//		System.out.println("");
//		System.out.println("");
//		
//		// task 1variant A with String p195 
//		// task 4 with StringBuilder
//		//task 9 with String
//		//variant c task 2 with any one
//		//task 11 with any
//		String text = "Hello my friendly neighbour";
//		text.split(" ");
		

		String text = "If your strings conform to a fixed pattern you can use a regular expression to extract and handle their elements For example if strings take the form \"numberoperandnumber\" you can use a regular expression to extract and handle the string's elements Here's an example";
		//text = LessonTask.replaceOneLiteral(text, 3, '0');
		//System.out.println(text);
		//System.out.println(LessonTask.subString(text));
		char[] ch = new char[1000000];
		ch = LessonTask.charGenerator(ch);
		long start = System.currentTimeMillis();
		String s = LessonTask.concatString(ch);
		long finish = System.currentTimeMillis();
		System.out.println(finish-start);
		String s2 = LessonTask.concatStringBuilder(ch);
		System.out.println("end");
//		LessonTask.wordMeets(text);
//		text = LessonTask.putSubString(text, 3, "(sub)");
//		System.out.println(text);
	}

}
