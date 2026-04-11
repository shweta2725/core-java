public class Q3_WordCount {
	
	public static void main(String[] args) {
	
		String str = "SunBeam Institute of Information Technology";

		str = str.trim();
		String[] words = str.split("\\s+");

		System.out.println("Number of words: " + words.length);
	}
}