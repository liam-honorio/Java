import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Valor {
	public LocalDate date;
	public String dateToString;
	public String word; 
	public LocalTime time;
	
	public Valor(LocalDate date) {
		this.date = date;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
		String formattedString = date.format(formatter);
		this.dateToString = formattedString;
		System.out.println(dateToString);
	}
	
	public Valor(String word) {
		this.word = word;
	}
	
	public Valor(LocalTime time) {
		this.time = time;
		System.out.println(this.time);
	}
	
	
}
