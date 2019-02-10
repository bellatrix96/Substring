// The "remove and count the difference" method:

public class CountSubstring1 {
	public static int countSubstring(String subStr, String str){
		return (str.length() - str.replace(subStr, "").length()) / subStr.length();
	}
 
	public static void main(String[] args){
		System.out.println(countSubstring("th", "the three truths"));
		System.out.println(countSubstring("abab", "ababababab"));
		System.out.println(countSubstring("a*b", "abaabba*bbaba*bbab"));
	}
}