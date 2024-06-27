import java.io.*;
public class Main143{
	public static void main(String[] args) throws Exception {
		Foo1 foo = new Foo1();
		foo.setName("jason");
		foo.setAge(18);
		File f = new File("./Foo.ser");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(foo);
		oos.close();
		fos.close();
	}
}
class Foo1 implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private transient int age;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
}
