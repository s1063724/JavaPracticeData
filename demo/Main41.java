public class Main41{
	public static void main(String[]args){
		String seed = "A";
		var s = switch(seed){
			case "A", "B" -> "Hello";
			case "C", "D" -> "Hello";
			default -> {
				yield "No";
			}
		};
		System.out.println(s);
		int result = switch(seed){
			case "A":
				yield 1;
			case "B":
				yield 2;
			case "C":
				System.out.println("zzz");
				yield 0;
			default:
				System.out.println("xxx");
				yield 3;
		};
		System.out.println(result);
	}
}
