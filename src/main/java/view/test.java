package view;
import java.sql.Date;
import java.sql.Time;
public class test {
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		System.out.println(now);
		
		Time time = new Time(now);
		System.out.println(time);
		System.out.println(time.getTime());
	}

}
