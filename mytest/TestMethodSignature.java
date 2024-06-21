class TestMethodSignature{
	static void fun(byte v){
		System.out.println("byte 參數");
	}
	static void fun(short v){
		System.out.println("short 參數");
	}
	static void fun(char v){
		System.out.println("char 參數");
	}
	static void fun(int v){
		System.out.println("int 參數");
	}
	static void fun(int v,int v1){
		System.out.println("int 雙參數");
	}
	static void fun(long v){
		System.out.println("long 參數");
	}
	static void fun(float v){
		System.out.println("float 參數");
	}
	static void fun(double v){
		System.out.println("double 參數");
	}
	public static void main(String []args){
		fun((byte) 5);
	}
}
