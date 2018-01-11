package by.htp.lesson11;

public class LessonTask {

	public static String replaceOneLiteral(String text, int k, char ch) {
		String[] words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			if (k >= words[i].length()) {
				continue;
			}
			char[] tempWord = words[i].toCharArray();
			tempWord[k] = ch;
			String temp = new String(tempWord);
			words[i] = temp;
		}
		String newText = "";
		for (int i = 0; i < words.length; i++) {
			newText += words[i] + " ";
		}
		return newText;
	}

	public static String putSubString(String text, int k, String subString) {
		StringBuilder sbText = new StringBuilder(text);
		sbText.insert(k, subString);
		String newText = new String(sbText.toString());
		return newText;
	}

	public static void wordMeets(String text) {
		String[] words = text.split(" ");
		String[] wordsTemp = words.clone();
		for (int i = 0; i < words.length; i++) {
			int wordCount = 0;
			for (int j = 0; j < words.length; j++) {
				if (wordsTemp[j] != null) {
					if (wordsTemp[j].equalsIgnoreCase(words[i])) {
						wordCount++;
						wordsTemp[j] = null;
					}
				}
			}
			if (wordCount > 0) {
				System.out.println(words[i] + " " + wordCount + " times");
			}

		}
	}

	public static String subString(String text) {
		String maxSubString = "";
		char[] textChar = text.toCharArray();
		for (int i = 0; i < textChar.length; i++) {
			if (textChar[i] != ' ') {
				char[] tempSubString = new char[textChar.length];
				int charCount = 1;
				textChar[i] = Character.toLowerCase(textChar[i]);
				tempSubString[0] = textChar[i];
				for (int j = i + 1; j < textChar.length; j++) {
					if (textChar[j] != textChar[i]) {
						tempSubString[charCount] = textChar[j];
						charCount++;
					} else {
						tempSubString[charCount] = textChar[j];
						charCount++;
						break;
					}
				}
				String tempMax = new String(tempSubString);
				tempMax = tempMax.trim();
				if (tempMax.length() > maxSubString.length()) {
					maxSubString = tempMax;
				}
			}
		}
		return maxSubString;
	}

	public static char[] charGenerator(char[] charArr) {
		long startTime = System.currentTimeMillis();
		String s = "qwertyuiopasdfghjklzxcvbnm1234567890"; // 36
		char[] chSeq = s.toCharArray();
		char[] newCharArr = new char[charArr.length]; 
		for (int i = 0; i < charArr.length; i++) {
			newCharArr[i] = chSeq[(int) (Math.random() * 36)];
		}
		long finishTime = System.currentTimeMillis();
		System.out.println(finishTime - startTime);
		return newCharArr;
	}
	
	public static String concatString(char[] chArr) {
		String s ="";
		for (int i=0;i<chArr.length;i++) {
			s = s + chArr[i];
		}
		System.out.println("Chars evolve to String!");
		return s;
	}
	
	public static String concatStringBuilder(char[] chArr) {
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i=0;i<chArr.length;i++) {
			sb.append(chArr[i]);
		}
		String s = new String(sb.toString());
		System.out.println("Chars evolve to String!");
		long finish = System.currentTimeMillis();
		System.out.println(finish - start);
		return s;
	}

}
