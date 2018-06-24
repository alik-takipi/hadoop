package alik.war.greeting;

public class Greeting
{
	private String message;
	
	Greeting() {
	
	}
	
	public Greeting(String name) {
		this.message = getGreeting(name);
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String name) {
		this.message = name;
	}
	
	private static String getGreeting(String name) {
		return "Hello " + name;
	}
}
