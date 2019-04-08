package cn.itcast_07;

import java.io.Serializable;

public class Person  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2071565876962058344L;
	private String name;
	private transient int age;
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	

}
