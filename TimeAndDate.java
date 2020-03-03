package FIRE;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeAndDate {
private String DateAndTime;

public String getDateAndTime() {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	LocalDateTime now = LocalDateTime.now();
	DateAndTime = "It is currently: " + dtf.format(now);
	return DateAndTime;
}

public void setDateAndTime(String dateAndTime) {
	DateAndTime = dateAndTime;
}
}
