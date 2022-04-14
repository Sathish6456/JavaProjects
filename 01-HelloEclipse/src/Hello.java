import java.util.HashMap;
import java.util.Map;

public class Hello {

	public static void main(String[] args) {
		Map<Integer, String> item=new HashMap<>();

		item.put(1, "Mohit");
		item.put(2, "Sathish");
		item.put(1, "Sathish");

		System.out.println(item);
	}

}
