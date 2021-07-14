package basics;

public class B {

	private int pass;
	private String name;

	public int getId() {
		return pass;
	}

	public B(int id, String name) {
		super();
		this.pass = id;
		this.name = name;
	}

	public void setId(int id) {
		this.pass = id;
	}

	public String getName() {
		return name;
	}

	public void  setName(String name) {
		this.name = name;
	}
public static void main(String[] args) {
	
}
}
