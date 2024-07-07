package strings;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Bansi");
		sb.append("Saboo");
		System.out.println(sb);

		System.out.println(sb.charAt(0));
		sb.setCharAt(0, 'M');

		System.out.println(sb);
		sb.insert(0, "Saboo ");
		System.out.println(sb);

		sb.deleteCharAt(6);
		System.out.println(sb);
		
		sb.setCharAt(5, 'B');
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);



	}

}
