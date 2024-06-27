import java.io.*;
public class Main144{
	public static void main(String[] args) throws Exception {
		File f = new File("./Foo.ser");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Foo1 foo = (Foo1) ois.readObject();
		ois.close();
		fis.close();
		System.out.println(foo.getName());
		System.out.println(foo.getAge());
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
