package model;

public class MessageUtil {
	private String message; 
	
	public MessageUtil(String message){
		this.message = message; 
	}
	public String salutationMessage(){
		return ("Hi! " + message); 
	}
	
	public String printMessage(){
		System.out.println(message);
		return message; 
	}
	public int returnMessageLength(){
		return message.length();
	}
	
	
	
}
