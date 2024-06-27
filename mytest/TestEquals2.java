class TestEquals2{
	public static void main(String []args){
		String str1=new String("Hello World!");
		String str2=new String("Hello World!");
		if(str1.equals(str2)){
			System.out.println("str1 == str2");
		}else{
			System.out.println("str1 != str2");
		}
	}
}
