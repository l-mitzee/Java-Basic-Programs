package Basic_Java;

public class Inheritance {

	String blogger_name = "Jimmy";
	public void blogger_status() {
		System.out.println("This blogger is active");
	}
}

 class Youtube extends Inheritance{
	private String link = "youtube.com";
	int blogger_id = 12345;
	
	public static void main(String[] args) {
		Youtube page = new Youtube();
		page.blogger_status();
		System.out.println("Blogger details: "+page.blogger_name+"  " +page.blogger_id+ "  " +page.link);
	}
}
