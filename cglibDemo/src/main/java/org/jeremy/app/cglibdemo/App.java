package org.jeremy.app.cglibdemo;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
	
		PersonCglibProxy proxy = new PersonCglibProxy();
		
		Person p = (Person) proxy.getProxy(Person.class);
		
		p.say();
	}
	
}
