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
