
public class demo {

	public static void main(String[] args) {
		hope object =hope.all();
		hope object1 =hope.all();
		

		//object.showmessage();
	}

}

class hope{
	private static hope obj=new hope();
	
	private hope() {
		System.out.println("Hello Pakistanwwwwwwwwwwwwwww");
	}
	
	public static hope all() {
		return obj;
	}
	public void showmessage() {
		System.out.println("Hello Pakistan");
	}
}
