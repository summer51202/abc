
public class HW1 {

	public static void main(String[] args) {
		String output_string = "";
		for (int i = 0; i < args.length; i++) {
			if (i != 0)
				output_string = output_string + " ";
			if (args[i].startsWith("a") || args[i].startsWith("e") || args[i].startsWith("i") || args[i].startsWith("o")
					|| args[i].startsWith("u")) {
				output_string = output_string + args[i].replaceFirst(String.valueOf(args[i].charAt(0)),
						String.valueOf(args[i].charAt(0)).toUpperCase()) + "ay";
			} else {
				output_string = output_string
						+ args[i].substring(1).replaceFirst(String.valueOf(args[i].substring(1).charAt(0)),
								String.valueOf(args[i].substring(1).charAt(0)).toUpperCase())
						+ args[i].charAt(0) + "ay";
			}
		}
		System.out.println(output_string);
	}
}
// Don't need to enter data in the process of execution by using "args".
// boolean String.starsWith(String prefix) : Tests if this string starts with
// 		the specified prefix.
// char String.charAt(int index) : Returns the char value at the specified index
// String String.toUpperCase() : Converts all of the characters in this String
// 		to upper case using the rules of the default locale.
// static String String.valueOf(char c) : Returns the string representation of
// 		the char argument.
// String String.substring(int beginIndex) : Returns a new string that is a
// 		substring of this string.
// String String.replaceFirst(String regex, String replacement) : Replaces the
// 		first substring of this string that matches the given regular expression with
// 		the given replacement.