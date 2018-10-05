package pack1;

public class HellowWorldBean {

	private String message;
	
	private int duration;

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public void setDuration(int duration){
		this.duration = duration;
	}

	public String getInfo() {
		return message+" "+duration;
	}

}
