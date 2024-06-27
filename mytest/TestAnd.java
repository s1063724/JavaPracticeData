public class TestAnd{
	public static void main(String args[]){
		int i=5;
		int j=5;
		if(++i>5 & ++j>6){
			System.out.println("++i>5 & ++j>6");
		}

		System.out.println("i="+i);
		System.out.println("j="+j);
	}
}
