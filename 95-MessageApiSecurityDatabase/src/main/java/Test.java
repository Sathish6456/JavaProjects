import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

	public static void main(String[] args) {
		BCryptPasswordEncoder passwordencoder=new BCryptPasswordEncoder();
		System.out.println(passwordencoder.encode("zensar"));
	}

}
