package eagle.nest.hub.messages;

public enum Prefix {
	
	Join("�a�lJOIN");
	
	String pre;
	
	Prefix(String s){
		this.pre = s;
	}
	
	public String toString(){
		return pre;
	}
}
