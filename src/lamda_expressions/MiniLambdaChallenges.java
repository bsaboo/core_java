package lamda_expressions;
/*
 * import java.util.ArrayList; import java.util.Arrays; import java.util.List;
 * import java.util.Random; import java.util.function.Consumer; import
 * java.util.function.Function; import java.util.function.Supplier; import
 * java.util.function.UnaryOperator;
 * 
 * public class MiniLambdaChallenges { public static void main(String[] args) {
 * Consumer<String> printWords = sentence -> { String[] parts =
 * sentence.split(" "); for (String part : parts) { System.out.println(part); }
 * };
 * 
 * printWords.accept("Hi How are you?");
 * 
 * Consumer<String> printWordsForEach = sentence -> { String[] parts =
 * sentence.split(" "); Arrays.asList(parts).forEach(s ->
 * System.out.println(s)); };
 * 
 * printWordsForEach.accept("Hi How are you?");
 * 
 * Consumer<String> printWordsConcise = sentence ->
 * Arrays.asList(sentence.split(" ")) .forEach(s -> System.out.println(s)); ;
 * 
 * printWordsConcise.accept("Hi How are you?");
 * 
 * UnaryOperator<String> everySecondChar = source -> { StringBuilder returnVal =
 * new StringBuilder(); for (int i = 0; i < source.length(); i++) { if (i % 2 ==
 * 1) { returnVal.append(source.charAt(i)); } } return returnVal.toString(); };
 * 
 * System.out.println(everySecondChar.apply("1234567890"));
 * System.out.println(everySecondParameter(everySecondChar, "1234567890"));
 * 
 * Supplier<String> var = () -> "I Love Java"; Supplier<String> var2 = () -> {
 * return "I Love Java"; };
 * 
 * System.out.println(var.get()); System.out.println(var2.get());
 * 
 * String[] names = { "BaNsi", "PRINCE", "Bob" };
 * 
 * Arrays.setAll(names, i -> names[i].toUpperCase());
 * System.out.println(Arrays.toString(names));
 * 
 * List<String> backedByArray = Arrays.asList(names); backedByArray.replaceAll(s
 * -> s += " " + getRandomChar('A', 'D'));
 * 
 * System.out.println(Arrays.toString(names));
 * 
 * backedByArray.replaceAll(s -> s += " " + getRevered(s.split(" ")[0]));
 * Arrays.asList(names).forEach(s -> System.out.println(s));
 * 
 * List<String> newList = new ArrayList<>(List.of(names)); newList.removeIf(s ->
 * s.substring(0, s.indexOf(" ")).equals( s.substring(s.lastIndexOf(" ") +1)));
 * 
 * newList.forEach(s -> System.out.println(s));
 * 
 * }
 * 
 * public static char getRandomChar(char startChar, char endChar) { Random
 * random = new Random(); return (char) random.nextInt((int) startChar, (int)
 * endChar + 1); }
 * 
 * public static String getRevered(String firstName) { return new
 * StringBuilder(firstName).reverse().toString(); }
 * 
 * public static String everySecondParameter(Function<String, String> func,
 * String source) { return func.apply(source); }
 * 
 * public static String everySecondChar(String source) {
 * 
 * StringBuilder returnVal = new StringBuilder(); for (int i = 0; i <
 * source.length(); i++) { if (i % 2 == 1) { returnVal.append(source.charAt(i));
 * } } return returnVal.toString(); }
 * 
 * }
 */

public class MiniLambdaChallenges {
	private int i;
	private int j;

	public MiniLambdaChallenges(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public static void main(String[] args) {

		MiniLambdaChallenges m1 = new MiniLambdaChallenges(10, 20);

		MiniLambdaChallenges m2 = m1;
		m2.i = 111;
		m2.j = 222;

		System.out.println(m1.i + " " + m1.j);

	}
}