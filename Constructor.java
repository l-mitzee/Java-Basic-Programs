package Basic_Java;

public class Constructor {

	int x;

public Constructor() {
	x = 5;
}

public static void main(String[] args) {
	Constructor obj = new Constructor();
	System.out.println("value of x is: " +obj.x);
}
}
