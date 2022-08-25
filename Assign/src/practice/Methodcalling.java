package practice;

public class Methodcalling {
public static void patience() {
		char z = '%';
		String practice = "time management";
		System.out.println("to achive succcess we need " + practice + " so we get 100 " + z + " result");
	}

	public void hardwork() {
		int a = 100;
		String result = "you get job";
		System.out.println(result + " result = " + a + "%");
	}

	public static void main(String[] args) {
		patience();

		Methodcalling success = new Methodcalling();
		success.hardwork();
	}

}
