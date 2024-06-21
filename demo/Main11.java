public class Main11{
	public static void main(String []args){
		form f = new form();
		f.write();
	}
}
//界面（合約）
interface EmptyForm{
	//會自動修飾成public static final
	int a;
	//會自動修飾成public abstract void
	void write();
}
//實作界面
class form implements EmptyForm{
	@Override
	public void write(){
		System.out.println("passid:"+ EmptyForm.a);
	}
}

